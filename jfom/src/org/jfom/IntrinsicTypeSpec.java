/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.jfom;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Intrinsic Type Spec</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.jfom.IntrinsicTypeSpec#getType <em>Type</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.jfom.JFOMPackage#getIntrinsicTypeSpec()
 * @model
 * @generated
 */
public interface IntrinsicTypeSpec extends TypeSpec {
	/**
	 * Returns the value of the '<em><b>Type</b></em>' attribute.
	 * The literals are from the enumeration {@link org.jfom.IntrinsicType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Type</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Type</em>' attribute.
	 * @see org.jfom.IntrinsicType
	 * @see #setType(IntrinsicType)
	 * @see org.jfom.JFOMPackage#getIntrinsicTypeSpec_Type()
	 * @model required="true"
	 * @generated
	 */
	IntrinsicType getType();

	/**
	 * Sets the value of the '{@link org.jfom.IntrinsicTypeSpec#getType <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Type</em>' attribute.
	 * @see org.jfom.IntrinsicType
	 * @see #getType()
	 * @generated
	 */
	void setType(IntrinsicType value);

} // IntrinsicTypeSpec
