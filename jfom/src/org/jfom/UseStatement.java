/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.jfom;

import java.util.Map;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Use Statement</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.jfom.UseStatement#getModuleName <em>Module Name</em>}</li>
 *   <li>{@link org.jfom.UseStatement#getRenameList <em>Rename List</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.jfom.JFOMPackage#getUseStatement()
 * @model
 * @generated
 */
public interface UseStatement extends StringTemplateAdapter {
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
	 * @see org.jfom.JFOMPackage#getUseStatement_ModuleName()
	 * @model required="true"
	 * @generated
	 */
	String getModuleName();

	/**
	 * Sets the value of the '{@link org.jfom.UseStatement#getModuleName <em>Module Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Module Name</em>' attribute.
	 * @see #getModuleName()
	 * @generated
	 */
	void setModuleName(String value);

	/**
	 * Returns the value of the '<em><b>Rename List</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Rename List</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Rename List</em>' attribute.
	 * @see #setRenameList(Map)
	 * @see org.jfom.JFOMPackage#getUseStatement_RenameList()
	 * @model required="true" transient="true"
	 * @generated
	 */
	Map<String, String> getRenameList();

	/**
	 * Sets the value of the '{@link org.jfom.UseStatement#getRenameList <em>Rename List</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Rename List</em>' attribute.
	 * @see #getRenameList()
	 * @generated
	 */
	void setRenameList(Map<String, String> value);

} // UseStatement
