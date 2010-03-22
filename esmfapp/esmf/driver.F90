program HeatedPlate

  use ESMF_Mod
  use heated_plate, only : userm1_setvm, userm1_register
  use heat_sinks, only : userm2_setvm, userm2_register
  use coupler, only : usercpl_setvm, usercpl_register

  implicit none
    
  ! Local variables
  integer :: localPet, petCount, localrc, rc=ESMF_SUCCESS
  character(len=ESMF_MAXSTR) :: cname1, cname2, cplname
  type(ESMF_VM):: vm
  type(ESMF_State) :: c1imp, c1exp, c2imp, c2exp
  type(ESMF_GridComp) :: comp1, comp2
  type(ESMF_CplComp) :: cpl
  type(ESMF_Config)  :: config
  
  real :: deltax, deltat, xfinal, tfinal
  real :: alpha, Fo
  integer :: timeStep, tmax, xmax
  

!-------------------------------------------------------------------------
!-------------------------------------------------------------------------
! Create section
!-------------------------------------------------------------------------
!-------------------------------------------------------------------------
!
  ! Initialize framework and get back default global VM
  call ESMF_Initialize(vm=vm, defaultlogfilename="ArrayRedistSTest.Log", &
                        defaultlogtype=ESMF_LOG_MULTI, rc=localrc)

  ! Get number of PETs we are running with
  call ESMF_VMGet(vm, petCount=petCount, localPet=localPet, rc=localrc)

 
  ! load parameters from configuration file
  config = ESMF_ConfigCreate(rc)
  call ESMF_ConfigLoadFile(config, "/home/rocky/esmf4/esmf/application/params.rc", rc=rc)
  call ESMF_ConfigGetAttribute(config, deltax, label="deltax:", rc=rc)
  call ESMF_ConfigGetAttribute(config, deltat, label="deltat:", rc=rc)
  call ESMF_ConfigGetAttribute(config, xfinal, label="xfinal:", rc=rc)
  call ESMF_ConfigGetAttribute(config, tfinal, label="tfinal:", rc=rc)
  call ESMF_ConfigGetAttribute(config, alpha, label="alpha:", rc=rc)

  xmax = ceiling(xfinal / deltax) + 1
  tmax = ceiling(tfinal / deltat) + 1
  Fo = alpha * deltat / (deltax * deltax)

  if (localPet==0) then
     print *, "PARAMETERS:"
     print *, "========================="
     print *, "deltax = ", deltax
     print *, "deltat = ", deltat
     print *, "xfinal = ", xfinal
     print *, "tfinal = ", tfinal
     print *, "alpha = ", alpha
     print *, "xmax = ", xmax
     print *, "tmax = ", tmax
     print *, "Fo = ", Fo
     print *, "========================="
  endif

  ! Create the 2 model components and coupler
  cname1 = "user model 1"
  comp1 = ESMF_GridCompCreate(name=cname1, petList=(/0/), rc=localrc)

  cname2 = "user model 2"
  comp2 = ESMF_GridCompCreate(name=cname2, petList=(/1/), rc=localrc)

  cplname = "user one-way coupler"
  cpl = ESMF_CplCompCreate(name=cplname, rc=localrc)


!-------------------------------------------------------------------------
!-------------------------------------------------------------------------
! Register section
!-------------------------------------------------------------------------
!-------------------------------------------------------------------------

  call ESMF_GridCompSetVM(comp1, userRoutine=userm1_setvm, rc=localrc)
  call ESMF_GridCompSetServices(comp1, userRoutine=userm1_register, rc=localrc)

  call ESMF_GridCompSetVM(comp2, userRoutine=userm2_setvm, rc=localrc)
  call ESMF_GridCompSetServices(comp2, userRoutine=userm2_register, rc=localrc)

  call ESMF_CplCompSetVM(cpl, userRoutine=usercpl_setvm, rc=localrc)
  call ESMF_CplCompSetServices(cpl, userRoutine=usercpl_register, rc=localrc)

!-------------------------------------------------------------------------
!-------------------------------------------------------------------------
! Init section
!-------------------------------------------------------------------------
!-------------------------------------------------------------------------
 
  c1imp = ESMF_StateCreate("c1import", ESMF_STATE_IMPORT, rc=localrc)
  c1exp = ESMF_StateCreate("c1export", ESMF_STATE_EXPORT, rc=localrc)
  call ESMF_GridCompInitialize(comp1, importState=c1imp, exportState=c1exp, rc=localrc)
  
  c2imp = ESMF_StateCreate("c2import", ESMF_STATE_IMPORT, rc=localrc)
  c2exp = ESMF_StateCreate("c2export", ESMF_STATE_EXPORT, rc=localrc)
  call ESMF_GridCompInitialize(comp2, importState=c2imp, exportState=c2exp, rc=localrc)
  
  call ESMF_CplCompInitialize(cpl, c1exp, c2imp, phase=1, rc=localrc)
  call ESMF_CplCompInitialize(cpl, c2exp, c1imp, phase=2, rc=localrc)

  print *, "DONE INITIALIZING ALL"

!-------------------------------------------------------------------------
!-------------------------------------------------------------------------
! Run section
!-------------------------------------------------------------------------
!-------------------------------------------------------------------------

  do timeStep=2,tmax
     !print *, "main run loop timeStep=", timeStep
     call ESMF_GridCompRun(comp1, importState=c1imp, exportState=c1exp, rc=localrc)

     call ESMF_CplCompRun(cpl, c1exp, c2imp, phase=1, rc=localrc)

     call ESMF_GridCompRun(comp2, importState=c2imp, exportState=c2exp, rc=localrc)

     call ESMF_CplCompRun(cpl, c2exp, c1imp, phase=2, rc=localrc)
  enddo
 
!-------------------------------------------------------------------------
!-------------------------------------------------------------------------
! Finalize section
!-------------------------------------------------------------------------
!-------------------------------------------------------------------------

  call ESMF_CplCompFinalize(cpl, c1exp, c2imp, rc=localrc)
  call ESMF_GridCompFinalize(comp1, exportState=c1exp, rc=localrc)
  call ESMF_GridCompFinalize(comp2, importState=c2imp, rc=localrc)

!-------------------------------------------------------------------------
!-------------------------------------------------------------------------
! Destroy section
!-------------------------------------------------------------------------
!-------------------------------------------------------------------------

  call ESMF_GridCompDestroy(comp1, rc=localrc)
  call ESMF_GridCompDestroy(comp2, rc=localrc)
  call ESMF_CplCompDestroy(cpl, rc=localrc)

  call ESMF_StateDestroy(c1exp, rc=localrc)
  call ESMF_StateDestroy(c2imp, rc=localrc)
  call ESMF_StateDestroy(c1imp, rc=localrc)
  call ESMF_StateDestroy(c2exp, rc=localrc)

  call ESMF_Finalize()

end program HeatedPlate
