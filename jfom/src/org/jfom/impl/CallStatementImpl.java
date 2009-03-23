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
import org.jfom.CallStatement;
import org.jfom.JFOMPackage;
import org.jfom.JFOMFactory;
import org.jfom.JFOMPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Call Statement</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.jfom.impl.CallStatementImpl#getSubroutineName <em>Subroutine Name</em>}</li>
 *   <li>{@link org.jfom.impl.CallStatementImpl#getActualArgument <em>Actual Argument</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class CallStatementImpl extends ActionStatementImpl implements CallStatement {
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
	protected CallStatementImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return JFOMPackage.Literals.CALL_STATEMENT;
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
			eNotify(new ENotificationImpl(this, Notification.SET, JFOMPackage.CALL_STATEMENT__SUBROUTINE_NAME, oldSubroutineName, subroutineName));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ActualArgumentSpec> getActualArgument() {
		if (actualArgument == null) {
			actualArgument = new EObjectContainmentEList<ActualArgumentSpec>(ActualArgumentSpec.class, this, JFOMPackage.CALL_STATEMENT__ACTUAL_ARGUMENT);
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
			case JFOMPackage.CALL_STATEMENT__ACTUAL_ARGUMENT:
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
			case JFOMPackage.CALL_STATEMENT__SUBROUTINE_NAME:
				return getSubroutineName();
			case JFOMPackage.CALL_STATEMENT__ACTUAL_ARGUMENT:
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
			case JFOMPackage.CALL_STATEMENT__SUBROUTINE_NAME:
				setSubroutineName((String)newValue);
				return;
			case JFOMPackage.CALL_STATEMENT__ACTUAL_ARGUMENT:
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
			case JFOMPackage.CALL_STATEMENT__SUBROUTINE_NAME:
				setSubroutineName(SUBROUTINE_NAME_EDEFAULT);
				return;
			case JFOMPackage.CALL_STATEMENT__ACTUAL_ARGUMENT:
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
			case JFOMPackage.CALL_STATEMENT__SUBROUTINE_NAME:
				return SUBROUTINE_NAME_EDEFAULT == null ? subroutineName != null : !SUBROUTINE_NAME_EDEFAULT.equals(subroutineName);
			case JFOMPackage.CALL_STATEMENT__ACTUAL_ARGUMENT:
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
		result.append(" (subroutineName: ");
		result.append(subroutineName);
		result.append(')');
		return result.toString();
	}

	/**
	 * @generated NOT
	 */
	@Override
	public void addActualArgumentWithNamedConstant(String keyword, String argument) {
		getActualArgument().add(JFOMFactory.eINSTANCE.createActualArgumentSpecWithNamedConstant(keyword, argument));		
	}

} //CallStatementImpl
