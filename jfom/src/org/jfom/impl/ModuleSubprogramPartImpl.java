/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.jfom.impl;

import java.util.Collection;


import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;
import org.jfom.ContainsStatement;
import org.jfom.JFOMPackage;
import org.jfom.JFOMPackage;
import org.jfom.ModuleSubprogram;
import org.jfom.ModuleSubprogramPart;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Module Subprogram Part</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.jfom.impl.ModuleSubprogramPartImpl#getContainsStatement <em>Contains Statement</em>}</li>
 *   <li>{@link org.jfom.impl.ModuleSubprogramPartImpl#getModuleSubprogram <em>Module Subprogram</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ModuleSubprogramPartImpl extends StringTemplateAdapterImpl implements ModuleSubprogramPart {
	/**
	 * The cached value of the '{@link #getContainsStatement() <em>Contains Statement</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getContainsStatement()
	 * @generated
	 * @ordered
	 */
	protected ContainsStatement containsStatement;

	/**
	 * The cached value of the '{@link #getModuleSubprogram() <em>Module Subprogram</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getModuleSubprogram()
	 * @generated
	 * @ordered
	 */
	protected EList<ModuleSubprogram> moduleSubprogram;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ModuleSubprogramPartImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return JFOMPackage.Literals.MODULE_SUBPROGRAM_PART;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ContainsStatement getContainsStatement() {
		return containsStatement;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetContainsStatement(ContainsStatement newContainsStatement, NotificationChain msgs) {
		ContainsStatement oldContainsStatement = containsStatement;
		containsStatement = newContainsStatement;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, JFOMPackage.MODULE_SUBPROGRAM_PART__CONTAINS_STATEMENT, oldContainsStatement, newContainsStatement);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setContainsStatement(ContainsStatement newContainsStatement) {
		if (newContainsStatement != containsStatement) {
			NotificationChain msgs = null;
			if (containsStatement != null)
				msgs = ((InternalEObject)containsStatement).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - JFOMPackage.MODULE_SUBPROGRAM_PART__CONTAINS_STATEMENT, null, msgs);
			if (newContainsStatement != null)
				msgs = ((InternalEObject)newContainsStatement).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - JFOMPackage.MODULE_SUBPROGRAM_PART__CONTAINS_STATEMENT, null, msgs);
			msgs = basicSetContainsStatement(newContainsStatement, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, JFOMPackage.MODULE_SUBPROGRAM_PART__CONTAINS_STATEMENT, newContainsStatement, newContainsStatement));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ModuleSubprogram> getModuleSubprogram() {
		if (moduleSubprogram == null) {
			moduleSubprogram = new EObjectContainmentEList<ModuleSubprogram>(ModuleSubprogram.class, this, JFOMPackage.MODULE_SUBPROGRAM_PART__MODULE_SUBPROGRAM);
		}
		return moduleSubprogram;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case JFOMPackage.MODULE_SUBPROGRAM_PART__CONTAINS_STATEMENT:
				return basicSetContainsStatement(null, msgs);
			case JFOMPackage.MODULE_SUBPROGRAM_PART__MODULE_SUBPROGRAM:
				return ((InternalEList<?>)getModuleSubprogram()).basicRemove(otherEnd, msgs);
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
			case JFOMPackage.MODULE_SUBPROGRAM_PART__CONTAINS_STATEMENT:
				return getContainsStatement();
			case JFOMPackage.MODULE_SUBPROGRAM_PART__MODULE_SUBPROGRAM:
				return getModuleSubprogram();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case JFOMPackage.MODULE_SUBPROGRAM_PART__CONTAINS_STATEMENT:
				setContainsStatement((ContainsStatement)newValue);
				return;
			case JFOMPackage.MODULE_SUBPROGRAM_PART__MODULE_SUBPROGRAM:
				getModuleSubprogram().clear();
				getModuleSubprogram().addAll((Collection<? extends ModuleSubprogram>)newValue);
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
			case JFOMPackage.MODULE_SUBPROGRAM_PART__CONTAINS_STATEMENT:
				setContainsStatement((ContainsStatement)null);
				return;
			case JFOMPackage.MODULE_SUBPROGRAM_PART__MODULE_SUBPROGRAM:
				getModuleSubprogram().clear();
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
			case JFOMPackage.MODULE_SUBPROGRAM_PART__CONTAINS_STATEMENT:
				return containsStatement != null;
			case JFOMPackage.MODULE_SUBPROGRAM_PART__MODULE_SUBPROGRAM:
				return moduleSubprogram != null && !moduleSubprogram.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //ModuleSubprogramPartImpl
