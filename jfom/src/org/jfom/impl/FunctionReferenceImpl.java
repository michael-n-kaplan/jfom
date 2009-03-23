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
import org.jfom.ActualArgumentSpec;
import org.jfom.Expression;
import org.jfom.JFOMFactory;
import org.jfom.JFOMPackage;
import org.jfom.FunctionReference;
import org.jfom.JFOMPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Function Reference</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.jfom.impl.FunctionReferenceImpl#getFunctionName <em>Function Name</em>}</li>
 *   <li>{@link org.jfom.impl.FunctionReferenceImpl#getActualArgument <em>Actual Argument</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class FunctionReferenceImpl extends ExpressionImpl implements FunctionReference {
	/**
	 * The default value of the '{@link #getFunctionName() <em>Function Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFunctionName()
	 * @generated
	 * @ordered
	 */
	protected static final String FUNCTION_NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getFunctionName() <em>Function Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFunctionName()
	 * @generated
	 * @ordered
	 */
	protected String functionName = FUNCTION_NAME_EDEFAULT;

	/**
	 * The cached value of the '{@link #getActualArgument() <em>Actual Argument</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getActualArgument()
	 * @generated
	 * @ordered
	 */
	protected EList<ActualArgumentSpec> actualArgument;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected FunctionReferenceImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return JFOMPackage.Literals.FUNCTION_REFERENCE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getFunctionName() {
		return functionName;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setFunctionName(String newFunctionName) {
		String oldFunctionName = functionName;
		functionName = newFunctionName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, JFOMPackage.FUNCTION_REFERENCE__FUNCTION_NAME, oldFunctionName, functionName));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ActualArgumentSpec> getActualArgument() {
		if (actualArgument == null) {
			actualArgument = new EObjectContainmentEList<ActualArgumentSpec>(ActualArgumentSpec.class, this, JFOMPackage.FUNCTION_REFERENCE__ACTUAL_ARGUMENT);
		}
		return actualArgument;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case JFOMPackage.FUNCTION_REFERENCE__ACTUAL_ARGUMENT:
				return ((InternalEList<?>)getActualArgument()).basicRemove(otherEnd, msgs);
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
			case JFOMPackage.FUNCTION_REFERENCE__FUNCTION_NAME:
				return getFunctionName();
			case JFOMPackage.FUNCTION_REFERENCE__ACTUAL_ARGUMENT:
				return getActualArgument();
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
			case JFOMPackage.FUNCTION_REFERENCE__FUNCTION_NAME:
				setFunctionName((String)newValue);
				return;
			case JFOMPackage.FUNCTION_REFERENCE__ACTUAL_ARGUMENT:
				getActualArgument().clear();
				getActualArgument().addAll((Collection<? extends ActualArgumentSpec>)newValue);
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
			case JFOMPackage.FUNCTION_REFERENCE__FUNCTION_NAME:
				setFunctionName(FUNCTION_NAME_EDEFAULT);
				return;
			case JFOMPackage.FUNCTION_REFERENCE__ACTUAL_ARGUMENT:
				getActualArgument().clear();
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
			case JFOMPackage.FUNCTION_REFERENCE__FUNCTION_NAME:
				return FUNCTION_NAME_EDEFAULT == null ? functionName != null : !FUNCTION_NAME_EDEFAULT.equals(functionName);
			case JFOMPackage.FUNCTION_REFERENCE__ACTUAL_ARGUMENT:
				return actualArgument != null && !actualArgument.isEmpty();
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
		result.append(" (functionName: ");
		result.append(functionName);
		result.append(')');
		return result.toString();
	}

	/**
	 * 
	 * @param keyword
	 * @param argument
	 * @generated NOT
	 */
	@Override
	public void addActualArgumentWithNamedConstant(String keyword, String name) {
		getActualArgument().add(JFOMFactory.eINSTANCE.createActualArgumentSpecWithNamedConstant(keyword, name));		
	}
	
	/**
	 * 
	 * @param keyword
	 * @param argument
	 * @generated NOT
	 */
	@Override
	public void addActualArgumentWithExpression(String keyword, Expression expr) {
		getActualArgument().add(JFOMFactory.eINSTANCE.createActualArgumentSpecWithExpression(keyword, expr));		
	}
	

} //FunctionReferenceImpl
