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
 * A representation of the model object '<em><b>Module Subprogram Part</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.jfom.ModuleSubprogramPart#getContainsStatement <em>Contains Statement</em>}</li>
 *   <li>{@link org.jfom.ModuleSubprogramPart#getModuleSubprogram <em>Module Subprogram</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.jfom.JFOMPackage#getModuleSubprogramPart()
 * @model
 * @generated
 */
public interface ModuleSubprogramPart extends StringTemplateAdapter {
	/**
	 * Returns the value of the '<em><b>Contains Statement</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Contains Statement</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Contains Statement</em>' containment reference.
	 * @see #setContainsStatement(ContainsStatement)
	 * @see org.jfom.JFOMPackage#getModuleSubprogramPart_ContainsStatement()
	 * @model containment="true" required="true"
	 * @generated
	 */
	ContainsStatement getContainsStatement();

	/**
	 * Sets the value of the '{@link org.jfom.ModuleSubprogramPart#getContainsStatement <em>Contains Statement</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Contains Statement</em>' containment reference.
	 * @see #getContainsStatement()
	 * @generated
	 */
	void setContainsStatement(ContainsStatement value);

	/**
	 * Returns the value of the '<em><b>Module Subprogram</b></em>' containment reference list.
	 * The list contents are of type {@link org.jfom.ModuleSubprogram}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Module Subprogram</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Module Subprogram</em>' containment reference list.
	 * @see org.jfom.JFOMPackage#getModuleSubprogramPart_ModuleSubprogram()
	 * @model containment="true" required="true" derived="true"
	 * @generated
	 */
	EList<ModuleSubprogram> getModuleSubprogram();

} // ModuleSubprogramPart
