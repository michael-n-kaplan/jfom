/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.jfom;

import org.eclipse.emf.common.util.EList;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Print Statement</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.jfom.PrintStatement#getFormat <em>Format</em>}</li>
 *   <li>{@link org.jfom.PrintStatement#getOutputItem <em>Output Item</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.jfom.JFOMPackage#getPrintStatement()
 * @model
 * @generated
 */
public interface PrintStatement extends ActionStatement {
	/**
	 * Returns the value of the '<em><b>Format</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Format</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Format</em>' attribute.
	 * @see #setFormat(String)
	 * @see org.jfom.JFOMPackage#getPrintStatement_Format()
	 * @model required="true"
	 * @generated
	 */
	String getFormat();

	/**
	 * Sets the value of the '{@link org.jfom.PrintStatement#getFormat <em>Format</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Format</em>' attribute.
	 * @see #getFormat()
	 * @generated
	 */
	void setFormat(String value);

	/**
	 * Returns the value of the '<em><b>Output Item</b></em>' attribute list.
	 * The list contents are of type {@link java.lang.String}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Output Item</em>' attribute list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Output Item</em>' attribute list.
	 * @see org.jfom.JFOMPackage#getPrintStatement_OutputItem()
	 * @model
	 * @generated
	 */
	EList<String> getOutputItem();

} // PrintStatement
