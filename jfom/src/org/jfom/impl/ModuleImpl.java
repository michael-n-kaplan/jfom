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
import org.jfom.EndModuleStatement;
import org.jfom.JFOMPackage;
import org.jfom.JFOMPackage;
import org.jfom.Module;
import org.jfom.ModuleStatement;
import org.jfom.ModuleSubprogramPart;
import org.jfom.SpecificationPart;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Module</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.jfom.impl.ModuleImpl#getModuleStatement <em>Module Statement</em>}</li>
 *   <li>{@link org.jfom.impl.ModuleImpl#getSpecificationPart <em>Specification Part</em>}</li>
 *   <li>{@link org.jfom.impl.ModuleImpl#getModuleSubprogramPart <em>Module Subprogram Part</em>}</li>
 *   <li>{@link org.jfom.impl.ModuleImpl#getEndModuleStatement <em>End Module Statement</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ModuleImpl extends ProgramUnitImpl implements Module {
	/**
	 * The cached value of the '{@link #getModuleStatement() <em>Module Statement</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getModuleStatement()
	 * @generated
	 * @ordered
	 */
	protected ModuleStatement moduleStatement;
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
	 * The cached value of the '{@link #getModuleSubprogramPart() <em>Module Subprogram Part</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getModuleSubprogramPart()
	 * @generated
	 * @ordered
	 */
	protected ModuleSubprogramPart moduleSubprogramPart;
	/**
	 * The cached value of the '{@link #getEndModuleStatement() <em>End Module Statement</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEndModuleStatement()
	 * @generated
	 * @ordered
	 */
	protected EndModuleStatement endModuleStatement;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ModuleImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return JFOMPackage.Literals.MODULE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ModuleStatement getModuleStatement() {
		return moduleStatement;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetModuleStatement(ModuleStatement newModuleStatement, NotificationChain msgs) {
		ModuleStatement oldModuleStatement = moduleStatement;
		moduleStatement = newModuleStatement;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, JFOMPackage.MODULE__MODULE_STATEMENT, oldModuleStatement, newModuleStatement);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setModuleStatement(ModuleStatement newModuleStatement) {
		if (newModuleStatement != moduleStatement) {
			NotificationChain msgs = null;
			if (moduleStatement != null)
				msgs = ((InternalEObject)moduleStatement).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - JFOMPackage.MODULE__MODULE_STATEMENT, null, msgs);
			if (newModuleStatement != null)
				msgs = ((InternalEObject)newModuleStatement).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - JFOMPackage.MODULE__MODULE_STATEMENT, null, msgs);
			msgs = basicSetModuleStatement(newModuleStatement, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, JFOMPackage.MODULE__MODULE_STATEMENT, newModuleStatement, newModuleStatement));
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, JFOMPackage.MODULE__SPECIFICATION_PART, oldSpecificationPart, newSpecificationPart);
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
				msgs = ((InternalEObject)specificationPart).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - JFOMPackage.MODULE__SPECIFICATION_PART, null, msgs);
			if (newSpecificationPart != null)
				msgs = ((InternalEObject)newSpecificationPart).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - JFOMPackage.MODULE__SPECIFICATION_PART, null, msgs);
			msgs = basicSetSpecificationPart(newSpecificationPart, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, JFOMPackage.MODULE__SPECIFICATION_PART, newSpecificationPart, newSpecificationPart));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ModuleSubprogramPart getModuleSubprogramPart() {
		return moduleSubprogramPart;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetModuleSubprogramPart(ModuleSubprogramPart newModuleSubprogramPart, NotificationChain msgs) {
		ModuleSubprogramPart oldModuleSubprogramPart = moduleSubprogramPart;
		moduleSubprogramPart = newModuleSubprogramPart;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, JFOMPackage.MODULE__MODULE_SUBPROGRAM_PART, oldModuleSubprogramPart, newModuleSubprogramPart);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setModuleSubprogramPart(ModuleSubprogramPart newModuleSubprogramPart) {
		if (newModuleSubprogramPart != moduleSubprogramPart) {
			NotificationChain msgs = null;
			if (moduleSubprogramPart != null)
				msgs = ((InternalEObject)moduleSubprogramPart).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - JFOMPackage.MODULE__MODULE_SUBPROGRAM_PART, null, msgs);
			if (newModuleSubprogramPart != null)
				msgs = ((InternalEObject)newModuleSubprogramPart).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - JFOMPackage.MODULE__MODULE_SUBPROGRAM_PART, null, msgs);
			msgs = basicSetModuleSubprogramPart(newModuleSubprogramPart, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, JFOMPackage.MODULE__MODULE_SUBPROGRAM_PART, newModuleSubprogramPart, newModuleSubprogramPart));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EndModuleStatement getEndModuleStatement() {
		return endModuleStatement;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetEndModuleStatement(EndModuleStatement newEndModuleStatement, NotificationChain msgs) {
		EndModuleStatement oldEndModuleStatement = endModuleStatement;
		endModuleStatement = newEndModuleStatement;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, JFOMPackage.MODULE__END_MODULE_STATEMENT, oldEndModuleStatement, newEndModuleStatement);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setEndModuleStatement(EndModuleStatement newEndModuleStatement) {
		if (newEndModuleStatement != endModuleStatement) {
			NotificationChain msgs = null;
			if (endModuleStatement != null)
				msgs = ((InternalEObject)endModuleStatement).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - JFOMPackage.MODULE__END_MODULE_STATEMENT, null, msgs);
			if (newEndModuleStatement != null)
				msgs = ((InternalEObject)newEndModuleStatement).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - JFOMPackage.MODULE__END_MODULE_STATEMENT, null, msgs);
			msgs = basicSetEndModuleStatement(newEndModuleStatement, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, JFOMPackage.MODULE__END_MODULE_STATEMENT, newEndModuleStatement, newEndModuleStatement));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case JFOMPackage.MODULE__MODULE_STATEMENT:
				return basicSetModuleStatement(null, msgs);
			case JFOMPackage.MODULE__SPECIFICATION_PART:
				return basicSetSpecificationPart(null, msgs);
			case JFOMPackage.MODULE__MODULE_SUBPROGRAM_PART:
				return basicSetModuleSubprogramPart(null, msgs);
			case JFOMPackage.MODULE__END_MODULE_STATEMENT:
				return basicSetEndModuleStatement(null, msgs);
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
			case JFOMPackage.MODULE__MODULE_STATEMENT:
				return getModuleStatement();
			case JFOMPackage.MODULE__SPECIFICATION_PART:
				return getSpecificationPart();
			case JFOMPackage.MODULE__MODULE_SUBPROGRAM_PART:
				return getModuleSubprogramPart();
			case JFOMPackage.MODULE__END_MODULE_STATEMENT:
				return getEndModuleStatement();
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
			case JFOMPackage.MODULE__MODULE_STATEMENT:
				setModuleStatement((ModuleStatement)newValue);
				return;
			case JFOMPackage.MODULE__SPECIFICATION_PART:
				setSpecificationPart((SpecificationPart)newValue);
				return;
			case JFOMPackage.MODULE__MODULE_SUBPROGRAM_PART:
				setModuleSubprogramPart((ModuleSubprogramPart)newValue);
				return;
			case JFOMPackage.MODULE__END_MODULE_STATEMENT:
				setEndModuleStatement((EndModuleStatement)newValue);
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
			case JFOMPackage.MODULE__MODULE_STATEMENT:
				setModuleStatement((ModuleStatement)null);
				return;
			case JFOMPackage.MODULE__SPECIFICATION_PART:
				setSpecificationPart((SpecificationPart)null);
				return;
			case JFOMPackage.MODULE__MODULE_SUBPROGRAM_PART:
				setModuleSubprogramPart((ModuleSubprogramPart)null);
				return;
			case JFOMPackage.MODULE__END_MODULE_STATEMENT:
				setEndModuleStatement((EndModuleStatement)null);
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
			case JFOMPackage.MODULE__MODULE_STATEMENT:
				return moduleStatement != null;
			case JFOMPackage.MODULE__SPECIFICATION_PART:
				return specificationPart != null;
			case JFOMPackage.MODULE__MODULE_SUBPROGRAM_PART:
				return moduleSubprogramPart != null;
			case JFOMPackage.MODULE__END_MODULE_STATEMENT:
				return endModuleStatement != null;
		}
		return super.eIsSet(featureID);
	}

} //ModuleImpl
