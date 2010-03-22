module heated_plate

  implicit none
    
  public init, run, finish
  
  real :: deltax, deltat, tfinal, xfinal
  integer :: timeStep, tmax, xmax, outfreq
  real :: initbottom, inittop, initleft, initright, initinterior
  real :: alpha, Fo

  ! data array
  real, pointer :: farray(:,:)

  ! previous timestep
  real, pointer :: farrayOld(:,:)

  parameter (deltax=.04, deltat=.001, xfinal=.5, tfinal=3.0)
  parameter (initbottom=100.0, inittop=100.0, initleft=100.0, initright=100.0, initinterior=20.0)
  parameter (alpha=.01)
  parameter (outfreq=100)
    
  contains

  subroutine init()

    ! Local variables
    character(len=5) :: fileno
    integer :: i, j

    ! initialize time
    timeStep = 1
    tmax = ceiling(tfinal / deltat) + 1
    xmax = ceiling(xfinal / deltax) + 1
    Fo = alpha * deltat / (deltax * deltax)

    if (Fo .GT. 0.25) then
    	print *, "STABILITY ERROR"
		return
    endif
    
   ! allocate space
   allocate(farray(1:xmax, 1:xmax))
   allocate(farrayOld(1:xmax, 1:xmax))

	! type(ESMF_DistGrid)   :: distgrid
	!  distgrid = ESMF_DistGridCreate(minIndex=(/1,1/), maxIndex=(/xmax,xmax/), regDecomp=(/1,1/), rc=rc)

   ! set up initial and boundary conditions
   do i=1,xmax
      do j=1,xmax
         if (j==1) then
            farray(i,j) = initbottom
         else if (j==xmax) then
            farray(i,j) = inittop
         else if (i==1) then
            farray(i,j) = initleft
         else if (i==xmax) then
            farray(i,j) = initright
         else
            farray(i,j) = initinterior
         endif
      enddo
   enddo

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


  end subroutine init


 
  subroutine run()

    ! Local variables
    integer               :: i, j
    character(len=5) :: fileno
    
    do while (timeStep <= tmax)

    	! increment time
    	timeStep = timeStep + 1
  
    	! print *, "Comp1 - run (", timeStep, ")"

    	! make a copy of the old one so we don't lose it
	    farrayOld(:,:) = farray(:,:)

	    do i = 1, xmax
	       do j = 1, xmax

	          ! do not alter the boudary conditions
	          if (.NOT.(i==1 .OR. i==xmax .OR. j==1 .OR. j==xmax)) then
	             farray(i,j) = &
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

	    if (mod(timeStep,outfreq) == 0) then
	   		write(fileno,61) timeStep
	        open(11, file="/home/rocky/eclipse/runtime-New_configuration/esmfapp/native/data"//fileno//".dat", status="new")
	        do i=1,xmax
	        	write(11,60) (farray(i,j),j=1,xmax)
	        enddo
	        close(11)
	    endif

	end do

 !   print *, "comp1 run returning"

60  format(10000F10.5)
61  format(I5.5)          

  end subroutine run

  subroutine finish()
  	deallocate(farray)
  	deallocate(farrayOld)
  end subroutine finish


end module heated_plate


  

