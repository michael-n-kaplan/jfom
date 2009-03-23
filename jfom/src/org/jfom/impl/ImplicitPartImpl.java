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
import org.jfom.JFOMPackage;
import org.jfom.ImplicitPart;
import org.jfom.ImplicitPartStatement;
import org.jfom.JFOMPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Implicit Part</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.jfom.impl.ImplicitPartImpl#getImplicitPartStatement <em>Implicit Part Statement</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ImplicitPartImpl extends StringTemplateAdapterImpl implements ImplicitPart {
	/**
	 * The cached value of the '{@link #getImplicitPartStatement() <em>Implicit Part Statement</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getImplicitPartStatement()
	 * @generated
	 * @ordered
	 */
	protected EList<ImplicitPartStatement> implicitPartStatement;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ImplicitPartImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return JFOMPackage.Literals.IMPLICIT_PART;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ImplicitPartStatement> getImplicitPartStatement() {
		if (implicitPartStatement == null) {
			implicitPartStatement = new EObjectContainmentEList<ImplicitPartStatement>(ImplicitPartStatement.class, this, JFOMPackage.IMPLICIT_PART__IMPLICIT_PART_STATEMENT);
		}
		return implicitPartStatement;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case JFOMPackage.IMPLICIT_PART__IMPLICIT_PART_STATEMENT:
				return ((InternalEList<?>)getImplicitPartStatement()).basicRemove(otherEnd, msgs);
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
			case JFOMPackage.IMPLICIT_PART__IMPLICIT_PART_STATEMENT:
				return getImplicitPartStatement();
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
			case JFOMPackage.IMPLICIT_PART__IMPLICIT_PART_STATEMENT:
				getImplicitPartStatement().clear();
				getImplicitPartStatement().addAll((Collection<? extends ImplicitPartStatement>)newValue);
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
			case JFOMPackage.IMPLICIT_PART__IMPLICIT_PART_STATEMENT:
				getImplicitPartStatement().clear();
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
			case JFOMPackage.IMPLICIT_PART__IMPLICIT_PART_STATEMENT:
				return implicitPartStatement != null && !implicitPartStatement.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //ImplicitPartImpl
