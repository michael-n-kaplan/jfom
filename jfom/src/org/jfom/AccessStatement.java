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
 * A representation of the model object '<em><b>Access Statement</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.jfom.AccessStatement#getAccessSpec <em>Access Spec</em>}</li>
 *   <li>{@link org.jfom.AccessStatement#getAccessIdentifier <em>Access Identifier</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.jfom.JFOMPackage#getAccessStatement()
 * @model
 * @generated
 */
public interface AccessStatement extends SpecificationStatement {
	/**
	 * Returns the value of the '<em><b>Access Spec</b></em>' attribute.
	 * The literals are from the enumeration {@link org.jfom.AccessSpec}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Access Spec</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Access Spec</em>' attribute.
	 * @see org.jfom.AccessSpec
	 * @see #setAccessSpec(AccessSpec)
	 * @see org.jfom.JFOMPackage#getAccessStatement_AccessSpec()
	 * @model required="true"
	 * @generated
	 */
	AccessSpec getAccessSpec();

	/**
	 * Sets the value of the '{@link org.jfom.AccessStatement#getAccessSpec <em>Access Spec</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Access Spec</em>' attribute.
	 * @see org.jfom.AccessSpec
	 * @see #getAccessSpec()
	 * @generated
	 */
	void setAccessSpec(AccessSpec value);

	/**
	 * Returns the value of the '<em><b>Access Identifier</b></em>' attribute list.
	 * The list contents are of type {@link java.lang.String}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Access Identifier</em>' attribute list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Access Identifier</em>' attribute list.
	 * @see org.jfom.JFOMPackage#getAccessStatement_AccessIdentifier()
	 * @model required="true"
	 * @generated
	 */
	EList<String> getAccessIdentifier();

} // AccessStatement
