/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.jfom;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Module Statement</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.jfom.ModuleStatement#getModuleName <em>Module Name</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.jfom.JFOMPackage#getModuleStatement()
 * @model
 * @generated
 */
public interface ModuleStatement extends StringTemplateAdapter {
	/**
	 * Returns the value of the '<em><b>Module Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Module Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Module Name</em>' attribute.
	 * @see #setModuleName(String)
	 * @see org.jfom.JFOMPackage#getModuleStatement_ModuleName()
	 * @model required="true"
	 * @generated
	 */
	String getModuleName();

	/**
	 * Sets the value of the '{@link org.jfom.ModuleStatement#getModuleName <em>Module Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Module Name</em>' attribute.
	 * @see #getModuleName()
	 * @generated
	 */
	void setModuleName(String value);

} // ModuleStatement
