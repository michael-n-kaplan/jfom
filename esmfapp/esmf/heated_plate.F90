module heated_plate

  ! ESMF Framework module
  use ESMF_Mod

  implicit none
    
  public userm1_setvm, userm1_register
  
  real(ESMF_KIND_R8) :: deltax, deltat, tfinal, xfinal
  integer :: timeStep, tmax, xmax, outfreq
  real(ESMF_KIND_R8) :: initbottom, inittop, initleft, initright, initinterior
  real(ESMF_KIND_R8) :: alpha, Fo
    
  contains

!-------------------------------------------------------------------------
!   !  The Register routine sets the subroutines to be called
!   !   as the init, run, and finalize routines.  Note that these are
!   !   private to the module.
 
  subroutine userm1_setvm(comp, rc)
    type(ESMF_GridComp) :: comp
    integer, intent(out) :: rc


    ! Initialize return code
    rc = ESMF_SUCCESS
  end subroutine

  subroutine userm1_register(comp, rc)
    type(ESMF_GridComp) :: comp
    integer, intent(out) :: rc

    ! Initialize return code
    rc = ESMF_SUCCESS

    ! print *, "User Comp1 Register starting"

    ! Register the callback routines.

    call ESMF_GridCompSetEntryPoint(comp, ESMF_SETINIT, userRoutine=user_init, &
      rc=rc)
    if (rc/=ESMF_SUCCESS) return ! bail out
    call ESMF_GridCompSetEntryPoint(comp, ESMF_SETRUN, userRoutine=user_run, &
      rc=rc)
    if (rc/=ESMF_SUCCESS) return ! bail out
    call ESMF_GridCompSetEntryPoint(comp, ESMF_SETFINAL, userRoutine=user_final, &
      rc=rc)
    if (rc/=ESMF_SUCCESS) return ! bail out

    ! print *, "Registered Initialize, Run, and Finalize routines"
    ! print *, "User Comp1 Register returning"
    
  end subroutine

!-------------------------------------------------------------------------
!   !  User Comp Component created by higher level calls, here is the
!   !   Initialization routine.
     
  subroutine user_init(comp, importState, exportState, clock, rc)
    type(ESMF_GridComp) :: comp
    type(ESMF_State) :: importState, exportState
    type(ESMF_Clock) :: clock
    integer, intent(out) :: rc

    ! Local variables
    type(ESMF_ArraySpec)  :: arrayspec
    type(ESMF_DistGrid)   :: distgrid
    type(ESMF_Array)      :: array
    type(ESMF_VM)         :: vm
    type(ESMF_Config)     :: config
    integer               :: petCount, localPet
    character(len=5) :: fileno
    
    real(ESMF_KIND_R8), pointer :: farrayPtr(:,:)
    real(ESMF_KIND_R8), pointer :: farrayAll(:,:)
    real(ESMF_KIND_R8), pointer :: farrayLoc(:,:)
    integer, dimension(2,1) :: elb, eub, clb, cub
    integer :: i, j


    ! Initialize return code
    rc = ESMF_SUCCESS

    ! load parameters from configuration file
    config = ESMF_ConfigCreate(rc)
    call ESMF_ConfigLoadFile(config, "/home/rocky/esmf4/esmf/application/params.rc", rc=rc)
    call ESMF_ConfigGetAttribute(config, deltax, label="deltax:", rc=rc)
    call ESMF_ConfigGetAttribute(config, deltat, label="deltat:", rc=rc)
    call ESMF_ConfigGetAttribute(config, xfinal, label="xfinal:", rc=rc)
    call ESMF_ConfigGetAttribute(config, tfinal, label="tfinal:", rc=rc)
    call ESMF_ConfigGetAttribute(config, initbottom, label="initbottom:", rc=rc)
    call ESMF_ConfigGetAttribute(config, inittop, label="inittop:", rc=rc)
    call ESMF_ConfigGetAttribute(config, initleft, label="initleft:", rc=rc)
    call ESMF_ConfigGetAttribute(config, initright, label="initright:", rc=rc)
    call ESMF_ConfigGetAttribute(config, initinterior, label="initinterior:", rc=rc)
    call ESMF_ConfigGetAttribute(config, alpha, label="alpha:", rc=rc)
    call ESMF_ConfigGetAttribute(config, outfreq, label="outfreq:", rc=rc)


    ! print *, "User Comp1 Init starting"
    ! initialize time
    timeStep = 1
    tmax = ceiling(tfinal / deltat) + 1
    xmax = ceiling(xfinal / deltax) + 1
    Fo = alpha * deltat / (deltax * deltax)

    if (Fo .GT. 0.25) then
       print *, "STABILITY ERROR"
       call ESMF_Finalize()
    endif


    ! Determine petCount
    call ESMF_GridCompGet(comp, vm=vm, rc=rc)
    if (rc/=ESMF_SUCCESS) return ! bail out
    call ESMF_VMGet(vm, localPet=localPet, petCount=petCount, rc=rc)
    if (rc/=ESMF_SUCCESS) return ! bail out
    
    ! Create the source Array and add it to the export State
    call ESMF_ArraySpecSet(arrayspec, typekind=ESMF_TYPEKIND_R8, rank=2, rc=rc)
    if (rc/=ESMF_SUCCESS) return ! bail out

    distgrid = ESMF_DistGridCreate(minIndex=(/1,1/), maxIndex=(/xmax,xmax/), &
      regDecomp=(/1,1/), rc=rc)
    if (rc/=ESMF_SUCCESS) return ! bail out

!    array = ESMF_ArrayCreate(arrayspec=arrayspec, distgrid=distgrid, &
!         computationalLWidth=(/1,1/), computationalUWidth=(/1,1/), &
!         undistLBound=(/1/), undistUBound=(/tmax/), &
!         indexflag=ESMF_INDEX_GLOBAL, rc=rc)
    array = ESMF_ArrayCreate(arrayspec=arrayspec, distgrid=distgrid, &
 !        computationalLWidth=(/1,1/), computationalUWidth=(/1,1/), &
 !        totalLWidth=(/1,1/), totalUWidth=(/1,1/), &
         indexflag=ESMF_INDEX_GLOBAL, rc=rc)
    if (rc/=ESMF_SUCCESS) return ! bail out


    if (localPet==0) then
       allocate(farrayLoc(1:xmax,1:xmax))
    
       ! create the initial array locally
       do i=1,xmax
          do j=1,xmax
             if (j==1) then
                farrayLoc(i,j) = initbottom          
             else if (j==xmax) then
                farrayLoc(i,j) = inittop         
             else if (i==1) then
                farrayLoc(i,j) = initleft
             else if (i==xmax) then
                farrayLoc(i,j) = initright
             else
                farrayLoc(i,j) = initinterior          
             endif
          enddo
       enddo      
          
    endif

    call ESMF_ArrayScatter(array, farray=farrayLoc, rootPet=0, rc=rc) 
    if (rc/=ESMF_SUCCESS) then
       print *, "ERROR ARRAY SCATTERING rc=", rc
       call ESMF_Finalize()
       return
    endif

    if (localPet==0) then
       deallocate(farrayLoc)
    endif

    ! initialize array

  !  call ESMF_ArrayGet(array, localDe=0, farrayPtr=farrayPtr, rc=rc)
  !  if (rc/=ESMF_SUCCESS) return ! bail out

 !   call ESMF_ArrayGet(array, exclusiveLBound=elb, exclusiveUBound=eub, & 
 !        computationalLBound=clb, computationalUBound=cub, rc=rc)
 !   if (rc/=ESMF_SUCCESS) return ! bail out
   
    ! initial conditions and boundary conditions
 !   do i = elb(1,1), eub(1,1)
 !      do j = elb(2,1), eub(2,1)
 !         if (j==1) then
 !            farrayPtr(i,j) = initbottom          
 !         else if (j==xmax) then
 !            farrayPtr(i,j) = inittop         
 !         else if (i==1) then
 !            farrayPtr(i,j) = initleft
 !         else if (i==xmax) then
 !            farrayPtr(i,j) = initright
 !         else
 !            farrayPtr(i,j) = initinterior          
 !         endif
 !      enddo
 !   enddo

    ! gather and output initial conditions
    if (localPet==0) then
       allocate(farrayAll(xmax,xmax))
    endif
    
    call ESMF_ArrayGather(array, farray=farrayAll, rootPet=0, rc=rc)
    
    ! output data to file
    if (localPet==0) then
       write(fileno,61) 1
       open(11, file="/home/rocky/esmf4/esmf/application/data_"//fileno//".dat", status="new")
       do i=1,xmax
          write(11,60) (farrayAll(i,j),j=1,xmax)
       enddo
       close(11)
       deallocate(farrayAll)
    endif
    

    call ESMF_ArraySet(array, name="array data", rc=rc)
    if (rc/=ESMF_SUCCESS) return ! bail out

    call ESMF_StateAdd(exportState, array, rc=rc)
    if (rc/=ESMF_SUCCESS) return ! bail out

    call ESMF_StateAdd(importState, array, rc=rc)
    if (rc/=ESMF_SUCCESS) return ! bail out

60  format(10000F10.5)
61  format(I5.5)   


  !  print *, "User Comp1 Init returning"

  end subroutine user_init


!-------------------------------------------------------------------------
!   !  The Run routine where data is computed.
!   !
 
  subroutine user_run(comp, importState, exportState, clock, rc)
    type(ESMF_GridComp) :: comp
    type(ESMF_State) :: importState, exportState
    type(ESMF_Clock) :: clock
    type(ESMF_VM)    :: vm
    integer, intent(out) :: rc

    ! Local variables
    real(ESMF_KIND_R8)    :: pi
    type(ESMF_Array)      :: array
    real(ESMF_KIND_R8), pointer :: farrayPtr(:,:)
    real(ESMF_KIND_R8), pointer :: farrayOld(:,:)
    real(ESMF_KIND_R8), pointer :: farrayAll(:,:)
    integer               :: i, j
    integer               :: localPet
    character(len=5) :: fileno
    
    integer, dimension(2,1) :: elb, eub, clb, cub

    ! Initialize return code
    rc = ESMF_SUCCESS

    ! increment time
    timeStep = timeStep + 1
  
    ! print *, "Comp1 - run (", timeStep, ")"

    call ESMF_GridCompGet(comp, vm=vm)
    call ESMF_VMGet(vm, localPet=localPet, rc=rc)
   
    ! Get the source Array from the export State
    call ESMF_StateGet(importState, "array data", array, rc=rc)
    if (rc/=ESMF_SUCCESS) return ! bail out   
    
    ! Gain access to actual data via F90 array pointer
    call ESMF_ArrayGet(array, localDe=0, farrayPtr=farrayPtr, rc=rc)
    if (rc/=ESMF_SUCCESS) return ! bail out

    call ESMF_ArrayGet(array, exclusiveLBound=elb, exclusiveUBound=eub, & 
         computationalLBound=clb, computationalUBound=cub, rc=rc)
    if (rc/=ESMF_SUCCESS) return ! bail out

    if (timeStep==2) then
       print *, "[", localPet, "] exclusiveLBound: ", elb(1,1), ", ", elb(2,1)
       print *, "[", localPet, "] exclusiveUBound: ", eub(1,1), ", ", eub(2,1)
       print *, "[", localPet, "] computationalLBound: ", clb(1,1), ", ", clb(2,1)
       print *, "[", localPet, "] computationalUBound: ", cub(1,1), ", ", cub(2,1)
       !print *, "[", localPet, "] lbounds(farrayPtr): ", lbound(farrayPtr,1), ", ", lbound(farrayPtr, 2)
       !print *, "[", localPet, "] ubounds(farrayPtr): ", ubound(farrayPtr,1), ", ", ubound(farrayPtr, 2)
   endif


    ! make a copy of the old one so we don't lose it
    allocate(farrayOld(clb(1,1):cub(1,1), clb(2,1):cub(2,1)))
    do i = clb(1,1), cub(1,1)
       do j = clb(2,1), cub(2,1)
          farrayOld(i,j)=farrayPtr(i,j)
          if (farrayOld(i,j) < .05) then
             farrayOld(i,j) = initinterior
          endif
       enddo
    enddo
    
    do i = elb(1,1), eub(1,1)
       do j = elb(2,1), eub(2,1)
          
          ! do not alter the boudary conditions
          if (.NOT.(i==1 .OR. i==xmax .OR. j==1 .OR. j==xmax)) then                                 
             farrayPtr(i,j) = &
               Fo * (farrayOld(i+1,j) + &
                     farrayOld(i-1,j) + &
                     farrayOld(i,j+1) + &
                     farrayOld(i,j-1)) + &
               (1.0-4.0*Fo)*farrayOld(i,j)

             if (localPet==10 .AND. (timeStep==2 .OR. timeStep==3) .AND. i > 7 .AND. j > 5) then
                print *, "timeStep=", timeStep," i=", i, " j=", j
                print *, "farrayPtr(i+1,j)=", farrayOld(i+1,j)
                print *, "farrayPtr(i-1,j)=", farrayOld(i-1,j)
                print *, "farrayPtr(i,j+1)=", farrayOld(i,j+1)
                print *, "farrayPtr(i,j-1)=", farrayOld(i,j-1)
                print *, "farrayPtr(i,j)=", farrayOld(i,j)                
             endif


             if (farrayPtr(i,j) .GT. 100.0 .AND. 0 == 1) then
                print *, "GT 1000! (",localPet,") i=",i," j=",j," timeStep=",timeStep
                print *, "i,j: ", farrayOld(i,j)
                print *, "i+1,j: ", farrayOld(i+1,j)
                print *, "i-1,j: ", farrayOld(i-1,j)
                print *, "i,j+1: ", farrayOld(i,j+1)
                print *, "i,j-1: ", farrayOld(i,j-1)       
                return
             end if

          endif
       enddo
    enddo

    deallocate(farrayOld)

    ! hack because halos not supported
    ! gather all data on PET 0
!    if (localPet==0) then
!       allocate(farrayAll(xmax,xmax,tmax))
!    endif

!    call ESMF_ArrayGather(array, farray=farrayAll, rootPet=0, rc=rc)
!    if (rc/=ESMF_SUCCESS) then
!       print *, "ESMF_ArrayGather failed, rc=", rc
!    endif
    
!    call ESMF_ArrayScatter(array, farray=farrayAll, rootPet=0, rc=rc)
!    if (rc/=ESMF_SUCCESS) then
!       print *, "ESMF_ArrayScatter failed, rc=", rc
!   endif

!    if (localPet==0) then
!       deallocate(farrayAll)
!    endif 

    if (mod(timeStep,outfreq) == 0) then
       ! gather all data on PET 0
       if (localPet==0) then
          allocate(farrayAll(xmax,xmax))
       endif
       
       call ESMF_ArrayGather(array, farray=farrayAll, rootPet=0, rc=rc)
       
       ! output data to file
       if (localPet==0) then
          write(fileno,61) timeStep
          open(11, file="/home/rocky/esmf4/esmf/application/data_"//fileno//".dat", status="new")
          do i=1,xmax
             write(11,60) (farrayAll(i,j),j=1,xmax)
          enddo
          close(11)
          deallocate(farrayAll)
       endif
    endif

 !   print *, "comp1 run returning"

60  format(10000F10.5)
61  format(I5.5)          

  end subroutine user_run


!-------------------------------------------------------------------------
!   !  The Finalization routine where things are deleted and cleaned up.
!   !
 
  subroutine user_final(comp, importState, exportState, clock, rc)
    type(ESMF_GridComp) :: comp
    type(ESMF_State) :: importState, exportState
    type(ESMF_Clock) :: clock
    type(ESMF_VM)    :: vm
    integer, intent(out) :: rc
    integer :: localPet

    ! Local variables
    type(ESMF_DistGrid) :: distgrid
    type(ESMF_Array) :: array

    ! Initialize return code
    rc = ESMF_SUCCESS

    call ESMF_GridCompGet(comp, vm=vm)
    call ESMF_VMGet(vm, localPet=localPet, rc=rc)

    ! print *, "User Comp1 Final starting"

    call ESMF_StateGet(importState, "array data", array, rc=rc)
    if (rc/=ESMF_SUCCESS) return ! bail out
    call ESMF_ArrayGet(array, distgrid=distgrid, rc=rc)
    if (rc/=ESMF_SUCCESS) return ! bail out
    
    ! clean up

    call ESMF_ArrayDestroy(array, rc=rc)
    if (rc/=ESMF_SUCCESS) return ! bail out
    call ESMF_DistGridDestroy(distgrid, rc=rc)
    if (rc/=ESMF_SUCCESS) return ! bail out

    ! print *, "User Comp1 Final returning"

  end subroutine user_final


end module heated_plate


  

