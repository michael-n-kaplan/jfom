/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.jfom.impl;


import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.jfom.EndSubroutineStatement;
import org.jfom.JFOMPackage;
import org.jfom.JFOMPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>End Subroutine Statement</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.jfom.impl.EndSubroutineStatementImpl#getSubroutineName <em>Subroutine Name</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class EndSubroutineStatementImpl extends StringTemplateAdapterImpl implements EndSubroutineStatement {
	/**
	 * The default value of the '{@link #getSubroutineName() <em>Subroutine Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSubroutineName()
	 * @generated
	 * @ordered
	 */
	protected static final String SUBROUTINE_NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getSubroutineName() <em>Subroutine Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSubroutineName()
	 * @generated
	 * @ordered
	 */
	protected String subroutineName = SUBROUTINE_NAME_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EndSubroutineStatementImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return JFOMPackage.Literals.END_SUBROUTINE_STATEMENT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getSubroutineName() {
		return subroutineName;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSubroutineName(String newSubroutineName) {
		String oldSubroutineName = subroutineName;
		subroutineName = newSubroutineName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, JFOMPackage.END_SUBROUTINE_STATEMENT__SUBROUTINE_NAME, oldSubroutineName, subroutineName));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case JFOMPackage.END_SUBROUTINE_STATEMENT__SUBROUTINE_NAME:
				return getSubroutineName();
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
			case JFOMPackage.END_SUBROUTINE_STATEMENT__SUBROUTINE_NAME:
				setSubroutineName((String)newValue);
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
			case JFOMPackage.END_SUBROUTINE_STATEMENT__SUBROUTINE_NAME:
				setSubroutineName(SUBROUTINE_NAME_EDEFAULT);
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
			case JFOMPackage.END_SUBROUTINE_STATEMENT__SUBROUTINE_NAME:
				return SUBROUTINE_NAME_EDEFAULT == null ? subroutineName != null : !SUBROUTINE_NAME_EDEFAULT.equals(subroutineName);
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
		result.append(" (subroutineName: ");
		result.append(subroutineName);
		result.append(')');
		return result.toString();
	}

} //EndSubroutineStatementImpl
