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
import org.jfom.JFOMPackage;
import org.jfom.JFOMPackage;
import org.jfom.SubroutineStatement;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Subroutine Statement</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.jfom.impl.SubroutineStatementImpl#getSubroutineName <em>Subroutine Name</em>}</li>
 *   <li>{@link org.jfom.impl.SubroutineStatementImpl#getFormalArgument <em>Formal Argument</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class SubroutineStatementImpl extends StringTemplateAdapterImpl implements SubroutineStatement {
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
	 * The cached value of the '{@link #getFormalArgument() <em>Formal Argument</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFormalArgument()
	 * @generated
	 * @ordered
	 */
	protected EList<String> formalArgument;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SubroutineStatementImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return JFOMPackage.Literals.SUBROUTINE_STATEMENT;
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
			eNotify(new ENotificationImpl(this, Notification.SET, JFOMPackage.SUBROUTINE_STATEMENT__SUBROUTINE_NAME, oldSubroutineName, subroutineName));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<String> getFormalArgument() {
		if (formalArgument == null) {
			formalArgument = new EDataTypeUniqueEList<String>(String.class, this, JFOMPackage.SUBROUTINE_STATEMENT__FORMAL_ARGUMENT);
		}
		return formalArgument;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case JFOMPackage.SUBROUTINE_STATEMENT__SUBROUTINE_NAME:
				return getSubroutineName();
			case JFOMPackage.SUBROUTINE_STATEMENT__FORMAL_ARGUMENT:
				return getFormalArgument();
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
			case JFOMPackage.SUBROUTINE_STATEMENT__SUBROUTINE_NAME:
				setSubroutineName((String)newValue);
				return;
			case JFOMPackage.SUBROUTINE_STATEMENT__FORMAL_ARGUMENT:
				getFormalArgument().clear();
				getFormalArgument().addAll((Collection<? extends String>)newValue);
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
			case JFOMPackage.SUBROUTINE_STATEMENT__SUBROUTINE_NAME:
				setSubroutineName(SUBROUTINE_NAME_EDEFAULT);
				return;
			case JFOMPackage.SUBROUTINE_STATEMENT__FORMAL_ARGUMENT:
				getFormalArgument().clear();
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
			case JFOMPackage.SUBROUTINE_STATEMENT__SUBROUTINE_NAME:
				return SUBROUTINE_NAME_EDEFAULT == null ? subroutineName != null : !SUBROUTINE_NAME_EDEFAULT.equals(subroutineName);
			case JFOMPackage.SUBROUTINE_STATEMENT__FORMAL_ARGUMENT:
				return formalArgument != null && !formalArgument.isEmpty();
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
		result.append(", formalArgument: ");
		result.append(formalArgument);
		result.append(')');
		return result.toString();
	}

} //SubroutineStatementImpl
