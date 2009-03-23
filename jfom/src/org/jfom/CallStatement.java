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
 * A representation of the model object '<em><b>Call Statement</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.jfom.CallStatement#getSubroutineName <em>Subroutine Name</em>}</li>
 *   <li>{@link org.jfom.CallStatement#getActualArgument <em>Actual Argument</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.jfom.JFOMPackage#getCallStatement()
 * @model
 * @generated
 */
public interface CallStatement extends ActionStatement {
	/**
	 * Returns the value of the '<em><b>Subroutine Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Subroutine Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Subroutine Name</em>' attribute.
	 * @see #setSubroutineName(String)
	 * @see org.jfom.JFOMPackage#getCallStatement_SubroutineName()
	 * @model required="true"
	 * @generated
	 */
	String getSubroutineName();

	/**
	 * Sets the value of the '{@link org.jfom.CallStatement#getSubroutineName <em>Subroutine Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Subroutine Name</em>' attribute.
	 * @see #getSubroutineName()
	 * @generated
	 */
	void setSubroutineName(String value);

	/**
	 * Returns the value of the '<em><b>Actual Argument</b></em>' containment reference list.
	 * The list contents are of type {@link org.jfom.ActualArgumentSpec}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Actual Argument</em>' attribute list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Actual Argument</em>' containment reference list.
	 * @see org.jfom.JFOMPackage#getCallStatement_ActualArgument()
	 * @model containment="true"
	 * @generated
	 */
	EList<ActualArgumentSpec> getActualArgument();
	
	/**
	 * 
	 * @param keyword
	 * @param argument
	 * @generated NOT
	 */
	void addActualArgumentWithNamedConstant(String keyword, String argument);

} // CallStatement
