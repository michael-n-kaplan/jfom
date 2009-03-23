/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.jfom.impl;

import java.util.Collection;


import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EDataTypeUniqueEList;
import org.jfom.AccessSpec;
import org.jfom.AccessStatement;
import org.jfom.JFOMPackage;
import org.jfom.JFOMPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Access Statement</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.jfom.impl.AccessStatementImpl#getAccessSpec <em>Access Spec</em>}</li>
 *   <li>{@link org.jfom.impl.AccessStatementImpl#getAccessIdentifier <em>Access Identifier</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class AccessStatementImpl extends SpecificationStatementImpl implements AccessStatement {
	/**
	 * The default value of the '{@link #getAccessSpec() <em>Access Spec</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAccessSpec()
	 * @generated
	 * @ordered
	 */
	protected static final AccessSpec ACCESS_SPEC_EDEFAULT = AccessSpec.PUBLIC;

	/**
	 * The cached value of the '{@link #getAccessSpec() <em>Access Spec</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAccessSpec()
	 * @generated
	 * @ordered
	 */
	protected AccessSpec accessSpec = ACCESS_SPEC_EDEFAULT;

	/**
	 * The cached value of the '{@link #getAccessIdentifier() <em>Access Identifier</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAccessIdentifier()
	 * @generated
	 * @ordered
	 */
	protected EList<String> accessIdentifier;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected AccessStatementImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return JFOMPackage.Literals.ACCESS_STATEMENT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AccessSpec getAccessSpec() {
		return accessSpec;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAccessSpec(AccessSpec newAccessSpec) {
		AccessSpec oldAccessSpec = accessSpec;
		accessSpec = newAccessSpec == null ? ACCESS_SPEC_EDEFAULT : newAccessSpec;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, JFOMPackage.ACCESS_STATEMENT__ACCESS_SPEC, oldAccessSpec, accessSpec));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<String> getAccessIdentifier() {
		if (accessIdentifier == null) {
			accessIdentifier = new EDataTypeUniqueEList<String>(String.class, this, JFOMPackage.ACCESS_STATEMENT__ACCESS_IDENTIFIER);
		}
		return accessIdentifier;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case JFOMPackage.ACCESS_STATEMENT__ACCESS_SPEC:
				return getAccessSpec();
			case JFOMPackage.ACCESS_STATEMENT__ACCESS_IDENTIFIER:
				return getAccessIdentifier();
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
			case JFOMPackage.ACCESS_STATEMENT__ACCESS_SPEC:
				setAccessSpec((AccessSpec)newValue);
				return;
			case JFOMPackage.ACCESS_STATEMENT__ACCESS_IDENTIFIER:
				getAccessIdentifier().clear();
				getAccessIdentifier().addAll((Collection<? extends String>)newValue);
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
			case JFOMPackage.ACCESS_STATEMENT__ACCESS_SPEC:
				setAccessSpec(ACCESS_SPEC_EDEFAULT);
				return;
			case JFOMPackage.ACCESS_STATEMENT__ACCESS_IDENTIFIER:
				getAccessIdentifier().clear();
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
			case JFOMPackage.ACCESS_STATEMENT__ACCESS_SPEC:
				return accessSpec != ACCESS_SPEC_EDEFAULT;
			case JFOMPackage.ACCESS_STATEMENT__ACCESS_IDENTIFIER:
				return accessIdentifier != null && !accessIdentifier.isEmpty();
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
		result.append(" (accessSpec: ");
		result.append(accessSpec);
		result.append(", accessIdentifier: ");
		result.append(accessIdentifier);
		result.append(')');
		return result.toString();
	}

} //AccessStatementImpl
