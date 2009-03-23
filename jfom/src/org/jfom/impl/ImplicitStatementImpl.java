/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.jfom.impl;


import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.jfom.JFOMPackage;
import org.jfom.ImplicitStatement;
import org.jfom.JFOMPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Implicit Statement</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.jfom.impl.ImplicitStatementImpl#getImplicitSpecList <em>Implicit Spec List</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ImplicitStatementImpl extends ImplicitPartStatementImpl implements ImplicitStatement {
	/**
	 * The cached value of the '{@link #getImplicitSpecList() <em>Implicit Spec List</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getImplicitSpecList()
	 * @generated
	 * @ordered
	 */
	protected EList<EObject> implicitSpecList;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ImplicitStatementImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return JFOMPackage.Literals.IMPLICIT_STATEMENT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<EObject> getImplicitSpecList() {
		return implicitSpecList;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setImplicitSpecList(EList<EObject> newImplicitSpecList) {
		EList<EObject> oldImplicitSpecList = implicitSpecList;
		implicitSpecList = newImplicitSpecList;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, JFOMPackage.IMPLICIT_STATEMENT__IMPLICIT_SPEC_LIST, oldImplicitSpecList, implicitSpecList));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public boolean isNone() {
		return getImplicitSpecList() == null || getImplicitSpecList().isEmpty();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case JFOMPackage.IMPLICIT_STATEMENT__IMPLICIT_SPEC_LIST:
				return getImplicitSpecList();
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
			case JFOMPackage.IMPLICIT_STATEMENT__IMPLICIT_SPEC_LIST:
				setImplicitSpecList((EList<EObject>)newValue);
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
			case JFOMPackage.IMPLICIT_STATEMENT__IMPLICIT_SPEC_LIST:
				setImplicitSpecList((EList<EObject>)null);
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
			case JFOMPackage.IMPLICIT_STATEMENT__IMPLICIT_SPEC_LIST:
				return implicitSpecList != null;
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuffer result = new StringBuffer(super.toString());
		result.append(" (implicitSpecList: ");
		result.append(implicitSpecList);
		result.append(')');
		return result.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	/*
	@Override
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuffer result = new StringBuffer(super.toString());
		result.append(" (implicitSpecList: ");
		result.append(implicitSpecList);
		result.append(')');
		return result.toString();
	}
	*/

} //ImplicitStatementImpl
