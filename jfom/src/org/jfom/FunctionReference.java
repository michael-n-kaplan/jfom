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
 * A representation of the model object '<em><b>Function Reference</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.jfom.FunctionReference#getFunctionName <em>Function Name</em>}</li>
 *   <li>{@link org.jfom.FunctionReference#getActualArgument <em>Actual Argument</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.jfom.JFOMPackage#getFunctionReference()
 * @model
 * @generated
 */
public interface FunctionReference extends Expression {
	/**
	 * Returns the value of the '<em><b>Function Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Function Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Function Name</em>' attribute.
	 * @see #setFunctionName(String)
	 * @see org.jfom.JFOMPackage#getFunctionReference_FunctionName()
	 * @model required="true"
	 * @generated
	 */
	String getFunctionName();

	/**
	 * Sets the value of the '{@link org.jfom.FunctionReference#getFunctionName <em>Function Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Function Name</em>' attribute.
	 * @see #getFunctionName()
	 * @generated
	 */
	void setFunctionName(String value);

	/**
	 * Returns the value of the '<em><b>Actual Argument</b></em>' containment reference list.
	 * The list contents are of type {@link org.jfom.ActualArgumentSpec}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Actual Argument</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Actual Argument</em>' containment reference list.
	 * @see org.jfom.JFOMPackage#getFunctionReference_ActualArgument()
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
	void addActualArgumentWithNamedConstant(String keyword, String name);
	
	/**
	 * 
	 * @param keyword
	 * @param expr
	 * @generated NOT
	 */
	void addActualArgumentWithExpression(String keyword, Expression expr);

} // FunctionReference
