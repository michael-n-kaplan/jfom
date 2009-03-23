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
import org.jfom.PrintStatement;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Print Statement</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.jfom.impl.PrintStatementImpl#getFormat <em>Format</em>}</li>
 *   <li>{@link org.jfom.impl.PrintStatementImpl#getOutputItem <em>Output Item</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class PrintStatementImpl extends ActionStatementImpl implements PrintStatement {
	/**
	 * The default value of the '{@link #getFormat() <em>Format</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFormat()
	 * @generated
	 * @ordered
	 */
	protected static final String FORMAT_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getFormat() <em>Format</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFormat()
	 * @generated
	 * @ordered
	 */
	protected String format = FORMAT_EDEFAULT;

	/**
	 * The cached value of the '{@link #getOutputItem() <em>Output Item</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOutputItem()
	 * @generated
	 * @ordered
	 */
	protected EList<String> outputItem;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected PrintStatementImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return JFOMPackage.Literals.PRINT_STATEMENT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getFormat() {
		return format;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setFormat(String newFormat) {
		String oldFormat = format;
		format = newFormat;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, JFOMPackage.PRINT_STATEMENT__FORMAT, oldFormat, format));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<String> getOutputItem() {
		if (outputItem == null) {
			outputItem = new EDataTypeUniqueEList<String>(String.class, this, JFOMPackage.PRINT_STATEMENT__OUTPUT_ITEM);
		}
		return outputItem;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case JFOMPackage.PRINT_STATEMENT__FORMAT:
				return getFormat();
			case JFOMPackage.PRINT_STATEMENT__OUTPUT_ITEM:
				return getOutputItem();
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
			case JFOMPackage.PRINT_STATEMENT__FORMAT:
				setFormat((String)newValue);
				return;
			case JFOMPackage.PRINT_STATEMENT__OUTPUT_ITEM:
				getOutputItem().clear();
				getOutputItem().addAll((Collection<? extends String>)newValue);
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
			case JFOMPackage.PRINT_STATEMENT__FORMAT:
				setFormat(FORMAT_EDEFAULT);
				return;
			case JFOMPackage.PRINT_STATEMENT__OUTPUT_ITEM:
				getOutputItem().clear();
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
			case JFOMPackage.PRINT_STATEMENT__FORMAT:
				return FORMAT_EDEFAULT == null ? format != null : !FORMAT_EDEFAULT.equals(format);
			case JFOMPackage.PRINT_STATEMENT__OUTPUT_ITEM:
				return outputItem != null && !outputItem.isEmpty();
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
		result.append(" (format: ");
		result.append(format);
		result.append(", outputItem: ");
		result.append(outputItem);
		result.append(')');
		return result.toString();
	}

} //PrintStatementImpl
