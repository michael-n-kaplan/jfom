/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.jfom;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Literal Constant</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.jfom.LiteralConstant#getLiteral <em>Literal</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.jfom.JFOMPackage#getLiteralConstant()
 * @model
 * @generated
 */
public interface LiteralConstant extends Constant {
	/**
	 * Returns the value of the '<em><b>Literal</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Literal</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Literal</em>' attribute.
	 * @see #setLiteral(String)
	 * @see org.jfom.JFOMPackage#getLiteralConstant_Literal()
	 * @model required="true"
	 * @generated
	 */
	String getLiteral();

	/**
	 * Sets the value of the '{@link org.jfom.LiteralConstant#getLiteral <em>Literal</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Literal</em>' attribute.
	 * @see #getLiteral()
	 * @generated
	 */
	void setLiteral(String value);

} // LiteralConstant
