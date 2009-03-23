/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.jfom.impl;

import java.util.Collection;


import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;
import org.jfom.ArrayConstructor;
import org.jfom.ArrayConstructorValue;
import org.jfom.JFOMPackage;
import org.jfom.JFOMPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Array Constructor</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.jfom.impl.ArrayConstructorImpl#getArrayConstructorValue <em>Array Constructor Value</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ArrayConstructorImpl extends ExpressionImpl implements ArrayConstructor {
	/**
	 * The cached value of the '{@link #getArrayConstructorValue() <em>Array Constructor Value</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getArrayConstructorValue()
	 * @generated
	 * @ordered
	 */
	protected EList<ArrayConstructorValue> arrayConstructorValue;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ArrayConstructorImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return JFOMPackage.Literals.ARRAY_CONSTRUCTOR;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ArrayConstructorValue> getArrayConstructorValue() {
		if (arrayConstructorValue == null) {
			arrayConstructorValue = new EObjectContainmentEList<ArrayConstructorValue>(ArrayConstructorValue.class, this, JFOMPackage.ARRAY_CONSTRUCTOR__ARRAY_CONSTRUCTOR_VALUE);
		}
		return arrayConstructorValue;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case JFOMPackage.ARRAY_CONSTRUCTOR__ARRAY_CONSTRUCTOR_VALUE:
				return ((InternalEList<?>)getArrayConstructorValue()).basicRemove(otherEnd, msgs);
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
			case JFOMPackage.ARRAY_CONSTRUCTOR__ARRAY_CONSTRUCTOR_VALUE:
				return getArrayConstructorValue();
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
			case JFOMPackage.ARRAY_CONSTRUCTOR__ARRAY_CONSTRUCTOR_VALUE:
				getArrayConstructorValue().clear();
				getArrayConstructorValue().addAll((Collection<? extends ArrayConstructorValue>)newValue);
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
			case JFOMPackage.ARRAY_CONSTRUCTOR__ARRAY_CONSTRUCTOR_VALUE:
				getArrayConstructorValue().clear();
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
			case JFOMPackage.ARRAY_CONSTRUCTOR__ARRAY_CONSTRUCTOR_VALUE:
				return arrayConstructorValue != null && !arrayConstructorValue.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //ArrayConstructorImpl
