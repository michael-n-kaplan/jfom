module user_coupler

  use ESMF_Mod
    
  implicit none
   
  public usercpl_setvm, usercpl_register
        
  ! global data
  type(ESMF_RouteHandle), save :: routehandle1to2
  type(ESMF_RouteHandle), save :: routehandle2to1

  contains

!-------------------------------------------------------------------------
!   !  The Register routine sets the subroutines to be called
!   !   as the init, run, and finalize routines.  Note that these are
!   !   private to the module.
 
  subroutine usercpl_setvm(comp, rc)
    type(ESMF_CplComp) :: comp
    integer, intent(out) :: rc

    ! Initialize return code
    rc = ESMF_SUCCESS
  end subroutine

  subroutine usercpl_register(comp, rc)
    type(ESMF_CplComp) :: comp
    integer, intent(out) :: rc

    ! Initialize return code
    rc = ESMF_SUCCESS

    ! print *, "User Coupler Register starting"
    
    ! Register the callback routines.
    call ESMF_CplCompSetEntryPoint(comp, ESMF_SETINIT, userRoutine=user_init1, &
      phase=1, rc=rc)
    call ESMF_CplCompSetEntryPoint(comp, ESMF_SETINIT, userRoutine=user_init2, &
      phase=2, rc=rc)
    if (rc/=ESMF_SUCCESS) return ! bail out
    

    call ESMF_CplCompSetEntryPoint(comp, ESMF_SETRUN, userRoutine=user_run1, &
      phase=1, rc=rc)
    if (rc/=ESMF_SUCCESS) return ! bail out
    call ESMF_CplCompSetEntryPoint(comp, ESMF_SETRUN, userRoutine=user_run2, &
      phase=2, rc=rc)
    if (rc/=ESMF_SUCCESS) return ! bail out
    

    
    call ESMF_CplCompSetEntryPoint(comp, ESMF_SETFINAL, userRoutine=user_final, &
      rc=rc)
    if (rc/=ESMF_SUCCESS) return ! bail out

    !print *, "Registered Initialize, Run, and Finalize routines"
    !print *, "User Coupler Register returning"

  end subroutine

!-------------------------------------------------------------------------
!   !User Comp Component created by higher level calls, here is the
!   ! Initialization routine.
    
  subroutine user_init1(comp, importState, exportState, clock, rc)
    type(ESMF_CplComp) :: comp
    type(ESMF_State) :: importState, exportState
    type(ESMF_Clock) :: clock
    integer, intent(out) :: rc

    ! Local variables
    integer :: itemcount
    type(ESMF_Array) :: srcArray, dstArray
    type(ESMF_VM) :: vm
    integer :: localPet

    ! Initialize return code
    rc = ESMF_SUCCESS    

    call ESMF_StateGet(importState, itemcount=itemcount, rc=rc)
    if (rc/=ESMF_SUCCESS) return ! bail out
    !print *, "Import State contains ", itemcount, " items."

    call ESMF_StateGet(exportState, itemcount=itemcount, rc=rc)
    print *, "Export state contains ", itemcount, " items."

    ! Need to reconcile import and export states
    call ESMF_CplCompGet(comp, vm=vm, rc=rc)    
    call ESMF_VMGet(vm, localPet=localPet, rc=rc)
    
    call ESMF_StateReconcile(importState, vm, rc=rc)
    if (rc/=ESMF_SUCCESS) then 
       print *, "could not reconcile 1"
       return
    endif

    call ESMF_StateReconcile(exportState, vm, rc=rc)
    if (rc/=ESMF_SUCCESS) then 
       print *, "could not reconcile 2"
       return
    endif

    ! Get source Array out of import state
    call ESMF_StateGet(importState, "array data", srcArray, rc=rc)
    if (rc/=ESMF_SUCCESS) then
       print *, "stateget2 rc=", rc
       return
    endif

    ! Get destination Array out of export state
    call ESMF_StateGet(exportState, "array data", dstArray, rc=rc)
    if (rc/=ESMF_SUCCESS) then
       print *, "stateget2 rc=", rc
       return
    endif
    
    ! Precompute and store an ArrayRedist operation
    call ESMF_ArrayRedistStore(srcArray=srcArray, dstArray=dstArray, &
         routehandle=routehandle1to2, factor=1.0, rc=rc)    
    if (rc/=ESMF_SUCCESS) then 
       print *, "could not store redist"
       return
    endif
  
   print *, "User Coupler Init (1) returning, rc=", rc
   
  end subroutine user_init1


  
  subroutine user_init2(comp, importState, exportState, clock, rc)
    type(ESMF_CplComp) :: comp
    type(ESMF_State) :: importState, exportState
    type(ESMF_Clock) :: clock
    integer, intent(out) :: rc

    ! Local variables
    integer :: itemcount
    type(ESMF_Array) :: srcArray, dstArray
    type(ESMF_VM) :: vm
    integer :: localPet

    ! Initialize return code
    rc = ESMF_SUCCESS    

    call ESMF_StateGet(importState, itemcount=itemcount, rc=rc)
    if (rc/=ESMF_SUCCESS) return ! bail out
    !print *, "Import State contains ", itemcount, " items."

    call ESMF_StateGet(exportState, itemcount=itemcount, rc=rc)
    print *, "Export state contains ", itemcount, " items."

    ! Need to reconcile import and export states
    call ESMF_CplCompGet(comp, vm=vm, rc=rc)    
    call ESMF_VMGet(vm, localPet=localPet, rc=rc)
    
    call ESMF_StateReconcile(importState, vm, rc=rc)
    if (rc/=ESMF_SUCCESS) then 
       print *, "could not reconcile 1"
       return
    endif

    call ESMF_StateReconcile(exportState, vm, rc=rc)
    if (rc/=ESMF_SUCCESS) then 
       print *, "could not reconcile 2"
       return
    endif

    ! Get source Array out of import state
    call ESMF_StateGet(importState, "array data", srcArray, rc=rc)
    if (rc/=ESMF_SUCCESS) then
       print *, "stateget2 rc=", rc
       return
    endif

    ! Get destination Array out of export state
    call ESMF_StateGet(exportState, "array data", dstArray, rc=rc)
    if (rc/=ESMF_SUCCESS) then
       print *, "stateget2 rc=", rc
       return
    endif
    
    ! Precompute and store an ArrayRedist operation
    call ESMF_ArrayRedistStore(srcArray=srcArray, dstArray=dstArray, &
         routehandle=routehandle2to1, factor=1.0, rc=rc)    
    if (rc/=ESMF_SUCCESS) then 
       print *, "could not store redist"
       return
    endif
  
   print *, "User Coupler Init (2) returning, rc=", rc
  
  end subroutine user_init2





!-------------------------------------------------------------------------
!   !  The Run routine where data is coupled.
!   !
 
  subroutine user_run1(comp, importState, exportState, clock, rc)
    type(ESMF_CplComp) :: comp
    type(ESMF_State) :: importState, exportState
    type(ESMF_Clock) :: clock
    integer, intent(out) :: rc

    ! Local variables
    type(ESMF_Array) :: srcArray, dstArray

    ! Initialize return code
    rc = ESMF_SUCCESS

   ! print *, "User Coupler Run starting"

    ! Get source Array out of import state
    call ESMF_StateGet(importState, "array data", srcArray, rc=rc)
    if (rc/=ESMF_SUCCESS) then
       print *, "stateget1 rc=", rc
       return
    endif
    
    ! Get destination Array out of export state
    call ESMF_StateGet(exportState, "array data", dstArray, rc=rc)    
    if (rc/=ESMF_SUCCESS) then
       print *, "stateget2 rc=", rc
       return
    endif


    ! Use ArrayRedist() to take data from srcArray to dstArray
    call ESMF_ArrayRedist(srcArray=srcArray, dstArray=dstArray, &
      routehandle=routehandle1to2, rc=rc)
    if (rc/=ESMF_SUCCESS) then
       print *, "arrayredist rc=", rc
       return
    endif
  
   ! print *, "User Coupler Run returning"

  end subroutine user_run1

  subroutine user_run2(comp, importState, exportState, clock, rc)
    type(ESMF_CplComp) :: comp
    type(ESMF_State) :: importState, exportState
    type(ESMF_Clock) :: clock
    integer, intent(out) :: rc

     ! Local variables
    type(ESMF_Array) :: srcArray, dstArray

    ! Initialize return code
    rc = ESMF_SUCCESS

    ! Get source Array out of import state
    call ESMF_StateGet(importState, "array data", srcArray, rc=rc)
    call ESMF_StateGet(exportState, "array data", dstArray, rc=rc)    
    call ESMF_ArrayRedist(srcArray=srcArray, dstArray=dstArray, &
      routehandle=routehandle2to1, rc=rc)
  
  end subroutine user_run2


!-------------------------------------------------------------------------
!   !  The Finalization routine where things are deleted and cleaned up.
!   !
 
  subroutine user_final(comp, importState, exportState, clock, rc)
    type(ESMF_CplComp) :: comp
    type(ESMF_State) :: importState, exportState
    type(ESMF_Clock) :: clock
    integer, intent(out) :: rc

    ! Initialize return code
    rc = ESMF_SUCCESS

    !print *, "User Coupler Final starting"
  
    ! Release resources stored for the ArrayRedist.
    call ESMF_ArrayRedistRelease(routehandle=routehandle1to2, rc=rc)
    if (rc/=ESMF_SUCCESS) return ! bail out

    call ESMF_ArrayRedistRelease(routehandle=routehandle2to1, rc=rc)
    if (rc/=ESMF_SUCCESS) return ! bail out

    !print *, "User Coupler Final returning"
  
  end subroutine user_final


end module user_coupler

