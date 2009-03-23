/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.jfom.impl;

import java.util.HashMap;
import java.util.Map;


import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.jfom.JFOMPackage;
import org.eclipse.emf.ecore.impl.EObjectImpl;
import org.jfom.JFOMPackage;
import org.jfom.UseStatement;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Use Statement</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.jfom.impl.UseStatementImpl#getModuleName <em>Module Name</em>}</li>
 *   <li>{@link org.jfom.impl.UseStatementImpl#getRenameList <em>Rename List</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class UseStatementImpl extends StringTemplateAdapterImpl implements UseStatement {
	/**
	 * The default value of the '{@link #getModuleName() <em>Module Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getModuleName()
	 * @generated
	 * @ordered
	 */
	protected static final String MODULE_NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getModuleName() <em>Module Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getModuleName()
	 * @generated
	 * @ordered
	 */
	protected String moduleName = MODULE_NAME_EDEFAULT;

	/**
	 * The cached value of the '{@link #getRenameList() <em>Rename List</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRenameList()
	 * @generated
	 * @ordered
	 */
	protected Map<String, String> renameList;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	protected UseStatementImpl() {
		super();
		renameList = new HashMap<String, String>();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return JFOMPackage.Literals.USE_STATEMENT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getModuleName() {
		return moduleName;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setModuleName(String newModuleName) {
		String oldModuleName = moduleName;
		moduleName = newModuleName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, JFOMPackage.USE_STATEMENT__MODULE_NAME, oldModuleName, moduleName));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Map<String, String> getRenameList() {
		return renameList;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRenameList(Map<String, String> newRenameList) {
		Map<String, String> oldRenameList = renameList;
		renameList = newRenameList;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, JFOMPackage.USE_STATEMENT__RENAME_LIST, oldRenameList, renameList));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case JFOMPackage.USE_STATEMENT__MODULE_NAME:
				return getModuleName();
			case JFOMPackage.USE_STATEMENT__RENAME_LIST:
				return getRenameList();
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
			case JFOMPackage.USE_STATEMENT__MODULE_NAME:
				setModuleName((String)newValue);
				return;
			case JFOMPackage.USE_STATEMENT__RENAME_LIST:
				setRenameList((Map<String, String>)newValue);
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
			case JFOMPackage.USE_STATEMENT__MODULE_NAME:
				setModuleName(MODULE_NAME_EDEFAULT);
				return;
			case JFOMPackage.USE_STATEMENT__RENAME_LIST:
				setRenameList((Map<String, String>)null);
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
			case JFOMPackage.USE_STATEMENT__MODULE_NAME:
				return MODULE_NAME_EDEFAULT == null ? moduleName != null : !MODULE_NAME_EDEFAULT.equals(moduleName);
			case JFOMPackage.USE_STATEMENT__RENAME_LIST:
				return renameList != null;
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
		result.append(" (moduleName: ");
		result.append(moduleName);
		result.append(", renameList: ");
		result.append(renameList);
		result.append(')');
		return result.toString();
	}

} //UseStatementImpl
