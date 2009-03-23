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
 * A representation of the model object '<em><b>Subroutine Statement</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.jfom.SubroutineStatement#getSubroutineName <em>Subroutine Name</em>}</li>
 *   <li>{@link org.jfom.SubroutineStatement#getFormalArgument <em>Formal Argument</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.jfom.JFOMPackage#getSubroutineStatement()
 * @model
 * @generated
 */
public interface SubroutineStatement extends StringTemplateAdapter {
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
	 * @see org.jfom.JFOMPackage#getSubroutineStatement_SubroutineName()
	 * @model required="true"
	 * @generated
	 */
	String getSubroutineName();

	/**
	 * Sets the value of the '{@link org.jfom.SubroutineStatement#getSubroutineName <em>Subroutine Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Subroutine Name</em>' attribute.
	 * @see #getSubroutineName()
	 * @generated
	 */
	void setSubroutineName(String value);

	/**
	 * Returns the value of the '<em><b>Formal Argument</b></em>' attribute list.
	 * The list contents are of type {@link java.lang.String}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Formal Argument</em>' attribute list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Formal Argument</em>' attribute list.
	 * @see org.jfom.JFOMPackage#getSubroutineStatement_FormalArgument()
	 * @model
	 * @generated
	 */
	EList<String> getFormalArgument();

} // SubroutineStatement
