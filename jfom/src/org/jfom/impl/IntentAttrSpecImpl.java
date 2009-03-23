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
import org.jfom.JFOMPackage;
import org.jfom.IntentAttrSpec;
import org.jfom.IntentSpec;
import org.jfom.JFOMPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Intent Attr Spec</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.jfom.impl.IntentAttrSpecImpl#getIntentSpec <em>Intent Spec</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class IntentAttrSpecImpl extends AttrSpecImpl implements IntentAttrSpec {
	/**
	 * The default value of the '{@link #getIntentSpec() <em>Intent Spec</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIntentSpec()
	 * @generated
	 * @ordered
	 */
	protected static final IntentSpec INTENT_SPEC_EDEFAULT = IntentSpec.IN;

	/**
	 * The cached value of the '{@link #getIntentSpec() <em>Intent Spec</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIntentSpec()
	 * @generated
	 * @ordered
	 */
	protected IntentSpec intentSpec = INTENT_SPEC_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected IntentAttrSpecImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return JFOMPackage.Literals.INTENT_ATTR_SPEC;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IntentSpec getIntentSpec() {
		return intentSpec;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIntentSpec(IntentSpec newIntentSpec) {
		IntentSpec oldIntentSpec = intentSpec;
		intentSpec = newIntentSpec == null ? INTENT_SPEC_EDEFAULT : newIntentSpec;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, JFOMPackage.INTENT_ATTR_SPEC__INTENT_SPEC, oldIntentSpec, intentSpec));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case JFOMPackage.INTENT_ATTR_SPEC__INTENT_SPEC:
				return getIntentSpec();
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
			case JFOMPackage.INTENT_ATTR_SPEC__INTENT_SPEC:
				setIntentSpec((IntentSpec)newValue);
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
			case JFOMPackage.INTENT_ATTR_SPEC__INTENT_SPEC:
				setIntentSpec(INTENT_SPEC_EDEFAULT);
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
			case JFOMPackage.INTENT_ATTR_SPEC__INTENT_SPEC:
				return intentSpec != INTENT_SPEC_EDEFAULT;
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
		result.append(" (intentSpec: ");
		result.append(intentSpec);
		result.append(')');
		return result.toString();
	}

} //IntentAttrSpecImpl
