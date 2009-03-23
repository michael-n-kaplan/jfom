/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.jfom;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Actual Argument Spec</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.jfom.ActualArgumentSpec#getKeyword <em>Keyword</em>}</li>
 *   <li>{@link org.jfom.ActualArgumentSpec#getArgument <em>Argument</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.jfom.JFOMPackage#getActualArgumentSpec()
 * @model
 * @generated
 */
public interface ActualArgumentSpec extends StringTemplateAdapter {
	/**
	 * Returns the value of the '<em><b>Keyword</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Keyword</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Keyword</em>' attribute.
	 * @see #setKeyword(String)
	 * @see org.jfom.JFOMPackage#getActualArgumentSpec_Keyword()
	 * @model
	 * @generated
	 */
	String getKeyword();

	/**
	 * Sets the value of the '{@link org.jfom.ActualArgumentSpec#getKeyword <em>Keyword</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Keyword</em>' attribute.
	 * @see #getKeyword()
	 * @generated
	 */
	void setKeyword(String value);

	/**
	 * Returns the value of the '<em><b>Argument</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Argument</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Argument</em>' containment reference.
	 * @see #setArgument(Expression)
	 * @see org.jfom.JFOMPackage#getActualArgumentSpec_Argument()
	 * @model containment="true" required="true"
	 * @generated
	 */
	Expression getArgument();

	/**
	 * Sets the value of the '{@link org.jfom.ActualArgumentSpec#getArgument <em>Argument</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Argument</em>' containment reference.
	 * @see #getArgument()
	 * @generated
	 */
	void setArgument(Expression value);

} // ActualArgumentSpec
