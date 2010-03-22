module heated_plate

  ! ESMF Framework module
  use ESMF_Mod

  implicit none
    
  public userm1_setvm, userm1_register
  
  real :: deltax, deltat, tfinal, xfinal
  integer :: timeStep, tmax, xmax, outfreq
  real :: initbottom, inittop, initleft, initright, initinterior
  real :: alpha, Fo
    
  contains


  subroutine user_init()

    !integer, intent(out) :: rc

    ! Local variables
    type(ESMF_Config)     :: config
    character(len=5) :: fileno
    
    real, pointer :: farrayPtr(:,:)
    real, pointer :: farrayAll(:,:)
    real, pointer :: farrayLoc(:,:)
    integer, dimension(2,1) :: elb, eub, clb, cub
    integer :: i, j


    ! load parameters from configuration file
    ! MOVE THESE TO PARAMETER STATEMENTS
	call ESMF_Initialize()
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


    ! initialize time
    timeStep = 1
    tmax = ceiling(tfinal / deltat) + 1
    xmax = ceiling(xfinal / deltax) + 1
    Fo = alpha * deltat / (deltax * deltax)

    if (Fo .GT. 0.25) then
    	print *, "STABILITY ERROR"
		return
    endif
    
    ! Create the source Array and add it to the export State
   ! call ESMF_ArraySpecSet(arrayspec, typekind=ESMF_TYPEKIND_R8, rank=2, rc=rc)

  !  distgrid = ESMF_DistGridCreate(minIndex=(/1,1/), maxIndex=(/xmax,xmax/), &
  !    regDecomp=(/1,1/), rc=rc)

    !array = ESMF_ArrayCreate(arrayspec=arrayspec, distgrid=distgrid, indexflag=ESMF_INDEX_GLOBAL, rc=rc)

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
 !   if (localPet==0) then
 !      allocate(farrayAll(xmax,xmax))
 !   endif
    
 !   call ESMF_ArrayGather(array, farray=farrayAll, rootPet=0, rc=rc)
    
    ! output data to file
 !   if (localPet==0) then
 !      write(fileno,61) 1
 !      open(11, file="/home/rocky/esmf4/esmf/application/data_"//fileno//".dat", status="new")
 !      do i=1,xmax
 !         write(11,60) (farrayAll(i,j),j=1,xmax)
 !      enddo
 !      close(11)
 !      deallocate(farrayAll)
 !   endif
    


60  format(10000F10.5)
61  format(I5.5)   


  end subroutine user_init


 
  subroutine user_run()

    ! Local variables
    real    :: pi
    real, pointer :: farrayPtr(:,:)
    real, pointer :: farrayOld(:,:)
    real, pointer :: farrayAll(:,:)
    integer               :: i, j
    integer               :: localPet
    character(len=5) :: fileno
    
    integer, dimension(2,1) :: elb, eub, clb, cub

    ! increment time
    timeStep = timeStep + 1
  
    ! print *, "Comp1 - run (", timeStep, ")"
   

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

!             if (localPet==10 .AND. (timeStep==2 .OR. timeStep==3) .AND. i > 7 .AND. j > 5) then
!                print *, "timeStep=", timeStep," i=", i, " j=", j
!                print *, "farrayPtr(i+1,j)=", farrayOld(i+1,j)
!                print *, "farrayPtr(i-1,j)=", farrayOld(i-1,j)
!                print *, "farrayPtr(i,j+1)=", farrayOld(i,j+1)
!                print *, "farrayPtr(i,j-1)=", farrayOld(i,j-1)
!                print *, "farrayPtr(i,j)=", farrayOld(i,j)
!             endif
!
!
!             if (farrayPtr(i,j) .GT. 100.0 .AND. 0 == 1) then
!                print *, "GT 1000! (",localPet,") i=",i," j=",j," timeStep=",timeStep
!                print *, "i,j: ", farrayOld(i,j)
!                print *, "i+1,j: ", farrayOld(i+1,j)
!                print *, "i-1,j: ", farrayOld(i-1,j)
!                print *, "i,j+1: ", farrayOld(i,j+1)
!                print *, "i,j-1: ", farrayOld(i,j-1)
!                return
!             end if

          endif
       enddo
    enddo

    deallocate(farrayOld)

    
    if (mod(timeStep,outfreq) == 0) then
       ! gather all data on PET 0
     !  if (localPet==0) then
     !     allocate(farrayAll(xmax,xmax))
     !  endif
       
     !  call ESMF_ArrayGather(array, farray=farrayAll, rootPet=0, rc=rc)
       
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


end module heated_plate


  

