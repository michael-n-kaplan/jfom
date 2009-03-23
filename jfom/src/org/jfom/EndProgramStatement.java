/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.jfom;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>End Program Statement</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.jfom.EndProgramStatement#getProgramName <em>Program Name</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.jfom.JFOMPackage#getEndProgramStatement()
 * @model
 * @generated
 */
public interface EndProgramStatement extends StringTemplateAdapter {
	/**
	 * Returns the value of the '<em><b>Program Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Program Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Program Name</em>' attribute.
	 * @see #setProgramName(String)
	 * @see org.jfom.JFOMPackage#getEndProgramStatement_ProgramName()
	 * @model
	 * @generated
	 */
	String getProgramName();

	/**
	 * Sets the value of the '{@link org.jfom.EndProgramStatement#getProgramName <em>Program Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Program Name</em>' attribute.
	 * @see #getProgramName()
	 * @generated
	 */
	void setProgramName(String value);

} // EndProgramStatement
