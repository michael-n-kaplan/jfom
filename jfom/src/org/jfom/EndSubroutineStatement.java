/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.jfom;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>End Subroutine Statement</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.jfom.EndSubroutineStatement#getSubroutineName <em>Subroutine Name</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.jfom.JFOMPackage#getEndSubroutineStatement()
 * @model
 * @generated
 */
public interface EndSubroutineStatement extends StringTemplateAdapter {
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
	 * @see org.jfom.JFOMPackage#getEndSubroutineStatement_SubroutineName()
	 * @model
	 * @generated
	 */
	String getSubroutineName();

	/**
	 * Sets the value of the '{@link org.jfom.EndSubroutineStatement#getSubroutineName <em>Subroutine Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Subroutine Name</em>' attribute.
	 * @see #getSubroutineName()
	 * @generated
	 */
	void setSubroutineName(String value);

} // EndSubroutineStatement
