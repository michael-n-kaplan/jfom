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
import org.jfom.EndProgramStatement;
import org.jfom.JFOMPackage;
import org.jfom.JFOMPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>End Program Statement</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.jfom.impl.EndProgramStatementImpl#getProgramName <em>Program Name</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class EndProgramStatementImpl extends StringTemplateAdapterImpl implements EndProgramStatement {
	/**
	 * The default value of the '{@link #getProgramName() <em>Program Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getProgramName()
	 * @generated
	 * @ordered
	 */
	protected static final String PROGRAM_NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getProgramName() <em>Program Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getProgramName()
	 * @generated
	 * @ordered
	 */
	protected String programName = PROGRAM_NAME_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EndProgramStatementImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return JFOMPackage.Literals.END_PROGRAM_STATEMENT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getProgramName() {
		return programName;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setProgramName(String newProgramName) {
		String oldProgramName = programName;
		programName = newProgramName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, JFOMPackage.END_PROGRAM_STATEMENT__PROGRAM_NAME, oldProgramName, programName));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case JFOMPackage.END_PROGRAM_STATEMENT__PROGRAM_NAME:
				return getProgramName();
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
			case JFOMPackage.END_PROGRAM_STATEMENT__PROGRAM_NAME:
				setProgramName((String)newValue);
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
			case JFOMPackage.END_PROGRAM_STATEMENT__PROGRAM_NAME:
				setProgramName(PROGRAM_NAME_EDEFAULT);
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
			case JFOMPackage.END_PROGRAM_STATEMENT__PROGRAM_NAME:
				return PROGRAM_NAME_EDEFAULT == null ? programName != null : !PROGRAM_NAME_EDEFAULT.equals(programName);
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
		result.append(" (programName: ");
		result.append(programName);
		result.append(')');
		return result.toString();
	}

} //EndProgramStatementImpl
