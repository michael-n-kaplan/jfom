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

import org.eclipse.emf.ecore.impl.EObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;
import org.jfom.ExecutionPart;
import org.jfom.ExecutionPartConstruct;
import org.jfom.JFOMPackage;
import org.jfom.JFOMPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Execution Part</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.jfom.impl.ExecutionPartImpl#getExecutionPartConstruct <em>Execution Part Construct</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ExecutionPartImpl extends StringTemplateAdapterImpl implements ExecutionPart {
	/**
	 * The cached value of the '{@link #getExecutionPartConstruct() <em>Execution Part Construct</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getExecutionPartConstruct()
	 * @generated
	 * @ordered
	 */
	protected EList<ExecutionPartConstruct> executionPartConstruct;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ExecutionPartImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return JFOMPackage.Literals.EXECUTION_PART;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ExecutionPartConstruct> getExecutionPartConstruct() {
		if (executionPartConstruct == null) {
			executionPartConstruct = new EObjectContainmentEList<ExecutionPartConstruct>(ExecutionPartConstruct.class, this, JFOMPackage.EXECUTION_PART__EXECUTION_PART_CONSTRUCT);
		}
		return executionPartConstruct;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case JFOMPackage.EXECUTION_PART__EXECUTION_PART_CONSTRUCT:
				return ((InternalEList<?>)getExecutionPartConstruct()).basicRemove(otherEnd, msgs);
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
			case JFOMPackage.EXECUTION_PART__EXECUTION_PART_CONSTRUCT:
				return getExecutionPartConstruct();
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
			case JFOMPackage.EXECUTION_PART__EXECUTION_PART_CONSTRUCT:
				getExecutionPartConstruct().clear();
				getExecutionPartConstruct().addAll((Collection<? extends ExecutionPartConstruct>)newValue);
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
			case JFOMPackage.EXECUTION_PART__EXECUTION_PART_CONSTRUCT:
				getExecutionPartConstruct().clear();
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
			case JFOMPackage.EXECUTION_PART__EXECUTION_PART_CONSTRUCT:
				return executionPartConstruct != null && !executionPartConstruct.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //ExecutionPartImpl
