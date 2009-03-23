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
import org.jfom.EndSubroutineStatement;
import org.jfom.ExecutionPart;
import org.jfom.ExecutionPartConstruct;
import org.jfom.JFOMFactory;
import org.jfom.JFOMPackage;
import org.jfom.IntentAttrSpec;
import org.jfom.IntentSpec;
import org.jfom.InternalSubprogramPart;
import org.jfom.JFOMPackage;
import org.jfom.IntrinsicType;
import org.jfom.SpecificationPart;
import org.jfom.SubroutineStatement;
import org.jfom.SubroutineSubprogram;
import org.jfom.TypeDeclarationStatement;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Subroutine Subprogram</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.jfom.impl.SubroutineSubprogramImpl#getSubroutineStatement <em>Subroutine Statement</em>}</li>
 *   <li>{@link org.jfom.impl.SubroutineSubprogramImpl#getSpecificationPart <em>Specification Part</em>}</li>
 *   <li>{@link org.jfom.impl.SubroutineSubprogramImpl#getExecutionPart <em>Execution Part</em>}</li>
 *   <li>{@link org.jfom.impl.SubroutineSubprogramImpl#getInternalSubprogramPart <em>Internal Subprogram Part</em>}</li>
 *   <li>{@link org.jfom.impl.SubroutineSubprogramImpl#getEndSubroutineStatement <em>End Subroutine Statement</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class SubroutineSubprogramImpl extends ModuleSubprogramImpl implements SubroutineSubprogram {
	/**
	 * The cached value of the '{@link #getSubroutineStatement() <em>Subroutine Statement</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSubroutineStatement()
	 * @generated
	 * @ordered
	 */
	protected SubroutineStatement subroutineStatement;

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
	 * The cached value of the '{@link #getEndSubroutineStatement() <em>End Subroutine Statement</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEndSubroutineStatement()
	 * @generated
	 * @ordered
	 */
	protected EndSubroutineStatement endSubroutineStatement;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SubroutineSubprogramImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return JFOMPackage.Literals.SUBROUTINE_SUBPROGRAM;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SubroutineStatement getSubroutineStatement() {
		return subroutineStatement;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetSubroutineStatement(SubroutineStatement newSubroutineStatement, NotificationChain msgs) {
		SubroutineStatement oldSubroutineStatement = subroutineStatement;
		subroutineStatement = newSubroutineStatement;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, JFOMPackage.SUBROUTINE_SUBPROGRAM__SUBROUTINE_STATEMENT, oldSubroutineStatement, newSubroutineStatement);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSubroutineStatement(SubroutineStatement newSubroutineStatement) {
		if (newSubroutineStatement != subroutineStatement) {
			NotificationChain msgs = null;
			if (subroutineStatement != null)
				msgs = ((InternalEObject)subroutineStatement).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - JFOMPackage.SUBROUTINE_SUBPROGRAM__SUBROUTINE_STATEMENT, null, msgs);
			if (newSubroutineStatement != null)
				msgs = ((InternalEObject)newSubroutineStatement).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - JFOMPackage.SUBROUTINE_SUBPROGRAM__SUBROUTINE_STATEMENT, null, msgs);
			msgs = basicSetSubroutineStatement(newSubroutineStatement, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, JFOMPackage.SUBROUTINE_SUBPROGRAM__SUBROUTINE_STATEMENT, newSubroutineStatement, newSubroutineStatement));
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, JFOMPackage.SUBROUTINE_SUBPROGRAM__SPECIFICATION_PART, oldSpecificationPart, newSpecificationPart);
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
				msgs = ((InternalEObject)specificationPart).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - JFOMPackage.SUBROUTINE_SUBPROGRAM__SPECIFICATION_PART, null, msgs);
			if (newSpecificationPart != null)
				msgs = ((InternalEObject)newSpecificationPart).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - JFOMPackage.SUBROUTINE_SUBPROGRAM__SPECIFICATION_PART, null, msgs);
			msgs = basicSetSpecificationPart(newSpecificationPart, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, JFOMPackage.SUBROUTINE_SUBPROGRAM__SPECIFICATION_PART, newSpecificationPart, newSpecificationPart));
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, JFOMPackage.SUBROUTINE_SUBPROGRAM__EXECUTION_PART, oldExecutionPart, newExecutionPart);
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
				msgs = ((InternalEObject)executionPart).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - JFOMPackage.SUBROUTINE_SUBPROGRAM__EXECUTION_PART, null, msgs);
			if (newExecutionPart != null)
				msgs = ((InternalEObject)newExecutionPart).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - JFOMPackage.SUBROUTINE_SUBPROGRAM__EXECUTION_PART, null, msgs);
			msgs = basicSetExecutionPart(newExecutionPart, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, JFOMPackage.SUBROUTINE_SUBPROGRAM__EXECUTION_PART, newExecutionPart, newExecutionPart));
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
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, JFOMPackage.SUBROUTINE_SUBPROGRAM__INTERNAL_SUBPROGRAM_PART, oldInternalSubprogramPart, internalSubprogramPart));
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
			eNotify(new ENotificationImpl(this, Notification.SET, JFOMPackage.SUBROUTINE_SUBPROGRAM__INTERNAL_SUBPROGRAM_PART, oldInternalSubprogramPart, internalSubprogramPart));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EndSubroutineStatement getEndSubroutineStatement() {
		return endSubroutineStatement;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetEndSubroutineStatement(EndSubroutineStatement newEndSubroutineStatement, NotificationChain msgs) {
		EndSubroutineStatement oldEndSubroutineStatement = endSubroutineStatement;
		endSubroutineStatement = newEndSubroutineStatement;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, JFOMPackage.SUBROUTINE_SUBPROGRAM__END_SUBROUTINE_STATEMENT, oldEndSubroutineStatement, newEndSubroutineStatement);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setEndSubroutineStatement(EndSubroutineStatement newEndSubroutineStatement) {
		if (newEndSubroutineStatement != endSubroutineStatement) {
			NotificationChain msgs = null;
			if (endSubroutineStatement != null)
				msgs = ((InternalEObject)endSubroutineStatement).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - JFOMPackage.SUBROUTINE_SUBPROGRAM__END_SUBROUTINE_STATEMENT, null, msgs);
			if (newEndSubroutineStatement != null)
				msgs = ((InternalEObject)newEndSubroutineStatement).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - JFOMPackage.SUBROUTINE_SUBPROGRAM__END_SUBROUTINE_STATEMENT, null, msgs);
			msgs = basicSetEndSubroutineStatement(newEndSubroutineStatement, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, JFOMPackage.SUBROUTINE_SUBPROGRAM__END_SUBROUTINE_STATEMENT, newEndSubroutineStatement, newEndSubroutineStatement));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case JFOMPackage.SUBROUTINE_SUBPROGRAM__SUBROUTINE_STATEMENT:
				return basicSetSubroutineStatement(null, msgs);
			case JFOMPackage.SUBROUTINE_SUBPROGRAM__SPECIFICATION_PART:
				return basicSetSpecificationPart(null, msgs);
			case JFOMPackage.SUBROUTINE_SUBPROGRAM__EXECUTION_PART:
				return basicSetExecutionPart(null, msgs);
			case JFOMPackage.SUBROUTINE_SUBPROGRAM__END_SUBROUTINE_STATEMENT:
				return basicSetEndSubroutineStatement(null, msgs);
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
			case JFOMPackage.SUBROUTINE_SUBPROGRAM__SUBROUTINE_STATEMENT:
				return getSubroutineStatement();
			case JFOMPackage.SUBROUTINE_SUBPROGRAM__SPECIFICATION_PART:
				return getSpecificationPart();
			case JFOMPackage.SUBROUTINE_SUBPROGRAM__EXECUTION_PART:
				return getExecutionPart();
			case JFOMPackage.SUBROUTINE_SUBPROGRAM__INTERNAL_SUBPROGRAM_PART:
				if (resolve) return getInternalSubprogramPart();
				return basicGetInternalSubprogramPart();
			case JFOMPackage.SUBROUTINE_SUBPROGRAM__END_SUBROUTINE_STATEMENT:
				return getEndSubroutineStatement();
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
			case JFOMPackage.SUBROUTINE_SUBPROGRAM__SUBROUTINE_STATEMENT:
				setSubroutineStatement((SubroutineStatement)newValue);
				return;
			case JFOMPackage.SUBROUTINE_SUBPROGRAM__SPECIFICATION_PART:
				setSpecificationPart((SpecificationPart)newValue);
				return;
			case JFOMPackage.SUBROUTINE_SUBPROGRAM__EXECUTION_PART:
				setExecutionPart((ExecutionPart)newValue);
				return;
			case JFOMPackage.SUBROUTINE_SUBPROGRAM__INTERNAL_SUBPROGRAM_PART:
				setInternalSubprogramPart((InternalSubprogramPart)newValue);
				return;
			case JFOMPackage.SUBROUTINE_SUBPROGRAM__END_SUBROUTINE_STATEMENT:
				setEndSubroutineStatement((EndSubroutineStatement)newValue);
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
			case JFOMPackage.SUBROUTINE_SUBPROGRAM__SUBROUTINE_STATEMENT:
				setSubroutineStatement((SubroutineStatement)null);
				return;
			case JFOMPackage.SUBROUTINE_SUBPROGRAM__SPECIFICATION_PART:
				setSpecificationPart((SpecificationPart)null);
				return;
			case JFOMPackage.SUBROUTINE_SUBPROGRAM__EXECUTION_PART:
				setExecutionPart((ExecutionPart)null);
				return;
			case JFOMPackage.SUBROUTINE_SUBPROGRAM__INTERNAL_SUBPROGRAM_PART:
				setInternalSubprogramPart((InternalSubprogramPart)null);
				return;
			case JFOMPackage.SUBROUTINE_SUBPROGRAM__END_SUBROUTINE_STATEMENT:
				setEndSubroutineStatement((EndSubroutineStatement)null);
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
			case JFOMPackage.SUBROUTINE_SUBPROGRAM__SUBROUTINE_STATEMENT:
				return subroutineStatement != null;
			case JFOMPackage.SUBROUTINE_SUBPROGRAM__SPECIFICATION_PART:
				return specificationPart != null;
			case JFOMPackage.SUBROUTINE_SUBPROGRAM__EXECUTION_PART:
				return executionPart != null;
			case JFOMPackage.SUBROUTINE_SUBPROGRAM__INTERNAL_SUBPROGRAM_PART:
				return internalSubprogramPart != null;
			case JFOMPackage.SUBROUTINE_SUBPROGRAM__END_SUBROUTINE_STATEMENT:
				return endSubroutineStatement != null;
		}
		return super.eIsSet(featureID);
	}

	/**
	 * {@inheritDoc}
	 * @generated NOT
	 */
	@Override
	public void addFormalArgument(String typeName, String argName) {
		getSubroutineStatement().getFormalArgument().add(argName);
		
		TypeDeclarationStatement tds = JFOMFactory.eINSTANCE.createTypeDeclarationStatement(typeName, argName);
		getSpecificationPart().getDeclarationConstruct().add(tds);
	}

	/**
	 * {@inheritDoc}
	 * @generated NOT
	 */
	@Override
	public void addFormalArgument(IntrinsicType type, String argName, IntentSpec intent) {
		getSubroutineStatement().getFormalArgument().add(argName);		
		
		TypeDeclarationStatement tds = JFOMFactory.eINSTANCE.createTypeDeclarationStatement(IntrinsicType.INTEGER, argName);
		IntentAttrSpec ias = JFOMFactory.eINSTANCE.createIntentAttrSpec();
		ias.setIntentSpec(intent);
		tds.getAttrSpec().add(ias);
		getSpecificationPart().getDeclarationConstruct().add(tds);		
	}

	/**
	 * {@inheritDoc}
	 * @generated NOT
	 */
	@Override
	public void addExecutionPartConstruct(ExecutionPartConstruct epc) {
		getExecutionPart().getExecutionPartConstruct().add(epc);
	}

} //SubroutineSubprogramImpl
