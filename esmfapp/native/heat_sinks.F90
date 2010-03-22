module user_model2

  use ESMF_Mod

  implicit none
    
  public userm2_setvm, userm2_register
  
  real(ESMF_KIND_R8) :: deltax, deltat, tfinal, xfinal
  integer :: timeStep, tmax, xmax, outfreq
  real(ESMF_KIND_R8) :: initbottom, inittop, initleft, initright, initinterior
  real(ESMF_KIND_R8) :: alpha, Fo, r
  integer :: sinki(10)
  integer :: sinkj(10)
  real :: sinkz(10)
    
  contains

!-------------------------------------------------------------------------
!   !  The Register routine sets the subroutines to be called
!   !   as the init, run, and finalize routines.  Note that these are
!   !   private to the module.
 
  subroutine userm2_setvm(comp, rc)
    type(ESMF_GridComp) :: comp
    integer, intent(out) :: rc


    ! Initialize return code
    rc = ESMF_SUCCESS
  end subroutine

  subroutine userm2_register(comp, rc)
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
    
    real(ESMF_KIND_R8), pointer :: farrayPtr(:,:,:)   ! matching F90 array pointer
    real(ESMF_KIND_R8), pointer :: farrayAll(:,:,:)
    integer, dimension(2,1) :: elb, eub, clb, cub
    integer :: i, j, k


    ! Initialize return code
    rc = ESMF_SUCCESS

   ! print *, "comp2 user_init starting"

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

    call init_random_seed()
    do k=1,10
       ! choose 10 random sinks
       call random_number(r)
       sinki(k) = (r * (xmax-5)) + 5
       call random_number(r)
       sinkj(k) = (r * (xmax-5)) + 5
       call random_number(r)
       sinkz(k) = (r * .5)
       !print *, "sinkz = ", sinkz(k)
    enddo


!    call random_number(r)
!    if (r < .01) then
!       
!       if (sinkState == .FALSE.) then
!          sinkState = .TRUE.
!          
!          call random_number(r)
!          sinki = (r * (eub(1,1)-elb(1,1))) + elb(1,1)
!          call random_number(r)
!          sinkj = (r * (eub(2,1)-elb(2,1))) + elb(2,1)
!          
!       else
!         sinkState = .FALSE.
!       endif

       
!    endif
    
!    if (sinkState == .TRUE.) then
!       farrayPtr(sinki,sinkj) = .10 * farrayPtr(i,j)       
!    endif
    

    
 !   if (Fo .GT. 0.25) then
 !      print *, "STABILITY ERROR"
 !      call ESMF_Finalize()
 !   endif


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
         computationalLWidth=(/1,1/), computationalUWidth=(/1,1/), &
         indexflag=ESMF_INDEX_GLOBAL, rc=rc)
    if (rc/=ESMF_SUCCESS) return ! bail out


    ! initialize array

!    call ESMF_ArrayGet(array, localDe=0, farrayPtr=farrayPtr, rc=rc)
!    if (rc/=ESMF_SUCCESS) return ! bail out

!    call ESMF_ArrayGet(array, exclusiveLBound=elb, exclusiveUBound=eub, & 
!         computationalLBound=clb, computationalUBound=cub, rc=rc)
!    if (rc/=ESMF_SUCCESS) return ! bail out
   
  
    call ESMF_ArraySet(array, name="array data", rc=rc)
    if (rc/=ESMF_SUCCESS) return ! bail out

    call ESMF_StateAdd(importState, array, rc=rc)
    if (rc/=ESMF_SUCCESS) return ! bail out

    call ESMF_StateAdd(exportState, array, rc=rc)
    if (rc/=ESMF_SUCCESS) return


   ! print *, "User Comp2 Init returning, rc=", rc

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
    real(ESMF_KIND_R8)    :: r
    logical :: sinkState
    type(ESMF_Array)      :: array
    real(ESMF_KIND_R8), pointer :: farrayPtr(:,:)   ! matching F90 array pointer
    integer               :: i, j, k
    integer               :: localPet
    
    integer, dimension(2,1) :: elb, eub, clb, cub

    ! Initialize return code
    rc = ESMF_SUCCESS

    ! increment time
    timeStep = timeStep + 1
  
    ! print *, "Comp2 - run (", timeStep, ")"

    call ESMF_GridCompGet(comp, vm=vm)
    call ESMF_VMGet(vm, localPet=localPet, rc=rc)
   
    print *, "Comp2[", localPet, "]"

    ! Get the source Array from the export State
    call ESMF_StateGet(exportState, "array data", array, rc=rc)
    if (rc/=ESMF_SUCCESS) return ! bail out   
    
    ! Gain access to actual data via F90 array pointer
    call ESMF_ArrayGet(array, localDe=0, farrayPtr=farrayPtr, rc=rc)
    if (rc/=ESMF_SUCCESS) return ! bail out

    call ESMF_ArrayGet(array, exclusiveLBound=elb, exclusiveUBound=eub, & 
         computationalLBound=clb, computationalUBound=cub, rc=rc)
    if (rc/=ESMF_SUCCESS) return ! bail out

     
 !   if (timeStep==2) then
 !      print *, "coupler bounds: ", elb(1,1), ":", eub(1,1), ", ", elb(2,1), ":", eub(2,1)
 !   endif

    ! randomly decide if there will be a sink
!!$    call random_number(r)
!!$    if (r < .01) then
!!$       
!!$       if (sinkState == .FALSE.) then
!!$          sinkState = .TRUE.
!!$          
!!$          call random_number(r)
!!$          sinki = (r * (eub(1,1)-elb(1,1))) + elb(1,1)
!!$          call random_number(r)
!!$          sinkj = (r * (eub(2,1)-elb(2,1))) + elb(2,1)
!!$          
!!$       else
!!$          sinkState = .FALSE.
!!$       endif
!!$
!!$       
!!$    endif
!!$    

    ! introduce heat sinks
    do k=1,10
       farrayPtr(sinki(k),sinkj(k)) = sinkz(k) * farrayPtr(sinki(k),sinkj(k))

       farrayPtr(sinki(k)-1,sinkj(k)-1) = sinkz(k) * farrayPtr(sinki(k)-1,sinkj(k)-1)
       farrayPtr(sinki(k)+1,sinkj(k)+1) = sinkz(k) * farrayPtr(sinki(k)+1,sinkj(k)+1)
       farrayPtr(sinki(k)-1,sinkj(k)+1) = sinkz(k) * farrayPtr(sinki(k)-1,sinkj(k)+1)
       farrayPtr(sinki(k)+1,sinkj(k)-1) = sinkz(k) * farrayPtr(sinki(k)+1,sinkj(k)-1)
       
       farrayPtr(sinki(k),sinkj(k)-1) = sinkz(k) * farrayPtr(sinki(k),sinkj(k)-1)
       farrayPtr(sinki(k),sinkj(k)+1) = sinkz(k) * farrayPtr(sinki(k),sinkj(k)+1)
       farrayPtr(sinki(k)-1,sinkj(k)) = sinkz(k) * farrayPtr(sinki(k)-1,sinkj(k))
       farrayPtr(sinki(k)+1,sinkj(k)) = sinkz(k) * farrayPtr(sinki(k)+1,sinkj(k))       
    enddo
    


!    do i = elb(1,1), eub(1,1)
!       do j = elb(2,1), eub(2,1)
!          
!          if (i==10 .AND. j==10) then
!             farrayPtr(i,j) = 0.10 * farrayPtr(i,j)
!          endif
!          
!       enddo
!    enddo
    
    ! print *, "Comp2 - run exiting"

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
    real(ESMF_KIND_R8), pointer :: farrayAll(:,:)
    integer :: i,j,k
    character(len=5) :: fileno

    ! Initialize return code
    rc = ESMF_SUCCESS

    call ESMF_GridCompGet(comp, vm=vm)
    call ESMF_VMGet(vm, localPet=localPet, rc=rc)

    ! print *, "User Comp1 Final starting"

    call ESMF_StateGet(exportState, "array data", array, rc=rc)
    if (rc/=ESMF_SUCCESS) return ! bail out
    call ESMF_ArrayGet(array, distgrid=distgrid, rc=rc)
    if (rc/=ESMF_SUCCESS) return ! bail out
    

    ! gather all data on PET 0
   ! if (localPet==0) then
   !    allocate(farrayAll(xmax,xmax,tmax))
   ! endif

   ! call ESMF_ArrayGather(array, farray=farrayAll, rootPet=0, rc=rc)
    !print *, "ArrayGather rc=", rc
    
    ! output data to file
   ! if (localPet==0) then
   !    do k=1,tmax
   !       if (mod(k,outfreq)==0) then
   !          write(fileno,61) k
   !          open(11, file="/home/rocky/esmf4/esmf/application/data"//fileno//".dat", status="new")       
   !          do i=1,xmax
   !             write(11,60) (farrayAll(i,j,k),j=1,xmax)
   !          enddo
   !          close(11)
   !       endif
   !    enddo
   !    !print *, "(10,20,20) = ", farrayAll(10,20,20)
   !    deallocate(farrayAll)
   ! endif

!60  format(10000F10.5)
!61  format(I5.5)

    ! clean up

    call ESMF_ArrayDestroy(array, rc=rc)
    if (rc/=ESMF_SUCCESS) return ! bail out
    call ESMF_DistGridDestroy(distgrid, rc=rc)
    if (rc/=ESMF_SUCCESS) return ! bail out

    ! print *, "User Comp1 Final returning"

  end subroutine user_final

  SUBROUTINE init_random_seed()
    INTEGER :: i, n, clock
    INTEGER, DIMENSION(:), ALLOCATABLE :: seed
    
    CALL RANDOM_SEED(size = n)
    ALLOCATE(seed(n))
    
    CALL SYSTEM_CLOCK(COUNT=clock)
    
    seed = clock + 37 * (/ (i - 1, i = 1, n) /)
    CALL RANDOM_SEED(PUT = seed)
    
    DEALLOCATE(seed)
  END SUBROUTINE init_random_seed
  


end module user_model2
   
