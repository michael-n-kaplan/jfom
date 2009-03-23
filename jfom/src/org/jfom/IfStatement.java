/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.jfom;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>If Statement</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.jfom.IfStatement#getTest <em>Test</em>}</li>
 *   <li>{@link org.jfom.IfStatement#getAction <em>Action</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.jfom.JFOMPackage#getIfStatement()
 * @model
 * @generated
 */
public interface IfStatement extends ActionStatement {
	/**
	 * Returns the value of the '<em><b>Test</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Test</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Test</em>' containment reference.
	 * @see #setTest(Expression)
	 * @see org.jfom.JFOMPackage#getIfStatement_Test()
	 * @model containment="true" required="true"
	 * @generated
	 */
	Expression getTest();

	/**
	 * Sets the value of the '{@link org.jfom.IfStatement#getTest <em>Test</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Test</em>' containment reference.
	 * @see #getTest()
	 * @generated
	 */
	void setTest(Expression value);

	/**
	 * Returns the value of the '<em><b>Action</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Action</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Action</em>' containment reference.
	 * @see #setAction(ActionStatement)
	 * @see org.jfom.JFOMPackage#getIfStatement_Action()
	 * @model containment="true" required="true"
	 * @generated
	 */
	ActionStatement getAction();

	/**
	 * Sets the value of the '{@link org.jfom.IfStatement#getAction <em>Action</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Action</em>' containment reference.
	 * @see #getAction()
	 * @generated
	 */
	void setAction(ActionStatement value);

} // IfStatement
