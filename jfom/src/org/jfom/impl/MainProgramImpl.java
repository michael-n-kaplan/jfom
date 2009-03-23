/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.jfom.impl;


import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.jfom.EndProgramStatement;
import org.jfom.ExecutionPart;
import org.jfom.ExecutionPartConstruct;
import org.jfom.JFOMFactory;
import org.jfom.JFOMPackage;
import org.jfom.InternalSubprogramPart;
import org.jfom.JFOMPackage;
import org.jfom.MainProgram;
import org.jfom.ProgramStatement;
import org.jfom.SpecificationPart;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Main Program</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.jfom.impl.MainProgramImpl#getProgramStatement <em>Program Statement</em>}</li>
 *   <li>{@link org.jfom.impl.MainProgramImpl#getSpecificationPart <em>Specification Part</em>}</li>
 *   <li>{@link org.jfom.impl.MainProgramImpl#getExecutionPart <em>Execution Part</em>}</li>
 *   <li>{@link org.jfom.impl.MainProgramImpl#getInternalSubprogramPart <em>Internal Subprogram Part</em>}</li>
 *   <li>{@link org.jfom.impl.MainProgramImpl#getEndProgramStatement <em>End Program Statement</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class MainProgramImpl extends ProgramUnitImpl implements MainProgram {
	/**
	 * The cached value of the '{@link #getProgramStatement() <em>Program Statement</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getProgramStatement()
	 * @generated
	 * @ordered
	 */
	protected ProgramStatement programStatement;

	/**
	 * The cached value of the '{@link #getSpecificationPart() <em>Specification Part</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSpecificationPart()
	 * @generated
	 * @ordered
	 */
	protected SpecificationPart specificationPart;

	/**
	 * The cached value of the '{@link #getExecutionPart() <em>Execution Part</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getExecutionPart()
	 * @generated
	 * @ordered
	 */
	protected ExecutionPart executionPart;

	/**
	 * The cached value of the '{@link #getInternalSubprogramPart() <em>Internal Subprogram Part</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInternalSubprogramPart()
	 * @generated
	 * @ordered
	 */
	protected InternalSubprogramPart internalSubprogramPart;

	/**
	 * The cached value of the '{@link #getEndProgramStatement() <em>End Program Statement</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEndProgramStatement()
	 * @generated
	 * @ordered
	 */
	protected EndProgramStatement endProgramStatement;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	protected MainProgramImpl() {
		super();
		this.programStatement = JFOMFactory.eINSTANCE.createProgramStatement();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return JFOMPackage.Literals.MAIN_PROGRAM;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ProgramStatement getProgramStatement() {
		return programStatement;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetProgramStatement(ProgramStatement newProgramStatement, NotificationChain msgs) {
		ProgramStatement oldProgramStatement = programStatement;
		programStatement = newProgramStatement;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, JFOMPackage.MAIN_PROGRAM__PROGRAM_STATEMENT, oldProgramStatement, newProgramStatement);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setProgramStatement(ProgramStatement newProgramStatement) {
		if (newProgramStatement != programStatement) {
			NotificationChain msgs = null;
			if (programStatement != null)
				msgs = ((InternalEObject)programStatement).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - JFOMPackage.MAIN_PROGRAM__PROGRAM_STATEMENT, null, msgs);
			if (newProgramStatement != null)
				msgs = ((InternalEObject)newProgramStatement).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - JFOMPackage.MAIN_PROGRAM__PROGRAM_STATEMENT, null, msgs);
			msgs = basicSetProgramStatement(newProgramStatement, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, JFOMPackage.MAIN_PROGRAM__PROGRAM_STATEMENT, newProgramStatement, newProgramStatement));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SpecificationPart getSpecificationPart() {
		return specificationPart;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetSpecificationPart(SpecificationPart newSpecificationPart, NotificationChain msgs) {
		SpecificationPart oldSpecificationPart = specificationPart;
		specificationPart = newSpecificationPart;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, JFOMPackage.MAIN_PROGRAM__SPECIFICATION_PART, oldSpecificationPart, newSpecificationPart);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSpecificationPart(SpecificationPart newSpecificationPart) {
		if (newSpecificationPart != specificationPart) {
			NotificationChain msgs = null;
			if (specificationPart != null)
				msgs = ((InternalEObject)specificationPart).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - JFOMPackage.MAIN_PROGRAM__SPECIFICATION_PART, null, msgs);
			if (newSpecificationPart != null)
				msgs = ((InternalEObject)newSpecificationPart).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - JFOMPackage.MAIN_PROGRAM__SPECIFICATION_PART, null, msgs);
			msgs = basicSetSpecificationPart(newSpecificationPart, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, JFOMPackage.MAIN_PROGRAM__SPECIFICATION_PART, newSpecificationPart, newSpecificationPart));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ExecutionPart getExecutionPart() {
		return executionPart;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetExecutionPart(ExecutionPart newExecutionPart, NotificationChain msgs) {
		ExecutionPart oldExecutionPart = executionPart;
		executionPart = newExecutionPart;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, JFOMPackage.MAIN_PROGRAM__EXECUTION_PART, oldExecutionPart, newExecutionPart);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setExecutionPart(ExecutionPart newExecutionPart) {
		if (newExecutionPart != executionPart) {
			NotificationChain msgs = null;
			if (executionPart != null)
				msgs = ((InternalEObject)executionPart).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - JFOMPackage.MAIN_PROGRAM__EXECUTION_PART, null, msgs);
			if (newExecutionPart != null)
				msgs = ((InternalEObject)newExecutionPart).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - JFOMPackage.MAIN_PROGRAM__EXECUTION_PART, null, msgs);
			msgs = basicSetExecutionPart(newExecutionPart, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, JFOMPackage.MAIN_PROGRAM__EXECUTION_PART, newExecutionPart, newExecutionPart));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public InternalSubprogramPart getInternalSubprogramPart() {
		if (internalSubprogramPart != null && internalSubprogramPart.eIsProxy()) {
			InternalEObject oldInternalSubprogramPart = (InternalEObject)internalSubprogramPart;
			internalSubprogramPart = (InternalSubprogramPart)eResolveProxy(oldInternalSubprogramPart);
			if (internalSubprogramPart != oldInternalSubprogramPart) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, JFOMPackage.MAIN_PROGRAM__INTERNAL_SUBPROGRAM_PART, oldInternalSubprogramPart, internalSubprogramPart));
			}
		}
		return internalSubprogramPart;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public InternalSubprogramPart basicGetInternalSubprogramPart() {
		return internalSubprogramPart;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setInternalSubprogramPart(InternalSubprogramPart newInternalSubprogramPart) {
		InternalSubprogramPart oldInternalSubprogramPart = internalSubprogramPart;
		internalSubprogramPart = newInternalSubprogramPart;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, JFOMPackage.MAIN_PROGRAM__INTERNAL_SUBPROGRAM_PART, oldInternalSubprogramPart, internalSubprogramPart));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EndProgramStatement getEndProgramStatement() {
		return endProgramStatement;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetEndProgramStatement(EndProgramStatement newEndProgramStatement, NotificationChain msgs) {
		EndProgramStatement oldEndProgramStatement = endProgramStatement;
		endProgramStatement = newEndProgramStatement;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, JFOMPackage.MAIN_PROGRAM__END_PROGRAM_STATEMENT, oldEndProgramStatement, newEndProgramStatement);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setEndProgramStatement(EndProgramStatement newEndProgramStatement) {
		if (newEndProgramStatement != endProgramStatement) {
			NotificationChain msgs = null;
			if (endProgramStatement != null)
				msgs = ((InternalEObject)endProgramStatement).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - JFOMPackage.MAIN_PROGRAM__END_PROGRAM_STATEMENT, null, msgs);
			if (newEndProgramStatement != null)
				msgs = ((InternalEObject)newEndProgramStatement).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - JFOMPackage.MAIN_PROGRAM__END_PROGRAM_STATEMENT, null, msgs);
			msgs = basicSetEndProgramStatement(newEndProgramStatement, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, JFOMPackage.MAIN_PROGRAM__END_PROGRAM_STATEMENT, newEndProgramStatement, newEndProgramStatement));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case JFOMPackage.MAIN_PROGRAM__PROGRAM_STATEMENT:
				return basicSetProgramStatement(null, msgs);
			case JFOMPackage.MAIN_PROGRAM__SPECIFICATION_PART:
				return basicSetSpecificationPart(null, msgs);
			case JFOMPackage.MAIN_PROGRAM__EXECUTION_PART:
				return basicSetExecutionPart(null, msgs);
			case JFOMPackage.MAIN_PROGRAM__END_PROGRAM_STATEMENT:
				return basicSetEndProgramStatement(null, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case JFOMPackage.MAIN_PROGRAM__PROGRAM_STATEMENT:
				return getProgramStatement();
			case JFOMPackage.MAIN_PROGRAM__SPECIFICATION_PART:
				return getSpecificationPart();
			case JFOMPackage.MAIN_PROGRAM__EXECUTION_PART:
				return getExecutionPart();
			case JFOMPackage.MAIN_PROGRAM__INTERNAL_SUBPROGRAM_PART:
				if (resolve) return getInternalSubprogramPart();
				return basicGetInternalSubprogramPart();
			case JFOMPackage.MAIN_PROGRAM__END_PROGRAM_STATEMENT:
				return getEndProgramStatement();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case JFOMPackage.MAIN_PROGRAM__PROGRAM_STATEMENT:
				setProgramStatement((ProgramStatement)newValue);
				return;
			case JFOMPackage.MAIN_PROGRAM__SPECIFICATION_PART:
				setSpecificationPart((SpecificationPart)newValue);
				return;
			case JFOMPackage.MAIN_PROGRAM__EXECUTION_PART:
				setExecutionPart((ExecutionPart)newValue);
				return;
			case JFOMPackage.MAIN_PROGRAM__INTERNAL_SUBPROGRAM_PART:
				setInternalSubprogramPart((InternalSubprogramPart)newValue);
				return;
			case JFOMPackage.MAIN_PROGRAM__END_PROGRAM_STATEMENT:
				setEndProgramStatement((EndProgramStatement)newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
			case JFOMPackage.MAIN_PROGRAM__PROGRAM_STATEMENT:
				setProgramStatement((ProgramStatement)null);
				return;
			case JFOMPackage.MAIN_PROGRAM__SPECIFICATION_PART:
				setSpecificationPart((SpecificationPart)null);
				return;
			case JFOMPackage.MAIN_PROGRAM__EXECUTION_PART:
				setExecutionPart((ExecutionPart)null);
				return;
			case JFOMPackage.MAIN_PROGRAM__INTERNAL_SUBPROGRAM_PART:
				setInternalSubprogramPart((InternalSubprogramPart)null);
				return;
			case JFOMPackage.MAIN_PROGRAM__END_PROGRAM_STATEMENT:
				setEndProgramStatement((EndProgramStatement)null);
				return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case JFOMPackage.MAIN_PROGRAM__PROGRAM_STATEMENT:
				return programStatement != null;
			case JFOMPackage.MAIN_PROGRAM__SPECIFICATION_PART:
				return specificationPart != null;
			case JFOMPackage.MAIN_PROGRAM__EXECUTION_PART:
				return executionPart != null;
			case JFOMPackage.MAIN_PROGRAM__INTERNAL_SUBPROGRAM_PART:
				return internalSubprogramPart != null;
			case JFOMPackage.MAIN_PROGRAM__END_PROGRAM_STATEMENT:
				return endProgramStatement != null;
		}
		return super.eIsSet(featureID);
	}

	/**
	 * @generated NOT
	 */
	@Override
	public void addExecutionPartConstruct(ExecutionPartConstruct epc) {
		getExecutionPart().getExecutionPartConstruct().add(epc);		
	}

	/**
	 * @generated NOT
	 */
	@Override
	public void addExecutionPartSpacer() {
		addExecutionPartConstruct(JFOMFactory.eINSTANCE.create_Spacer());		
	}

} //MainProgramImpl
