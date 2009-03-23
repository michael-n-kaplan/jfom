/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.jfom;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Module</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.jfom.Module#getModuleStatement <em>Module Statement</em>}</li>
 *   <li>{@link org.jfom.Module#getSpecificationPart <em>Specification Part</em>}</li>
 *   <li>{@link org.jfom.Module#getModuleSubprogramPart <em>Module Subprogram Part</em>}</li>
 *   <li>{@link org.jfom.Module#getEndModuleStatement <em>End Module Statement</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.jfom.JFOMPackage#getModule()
 * @model
 * @generated
 */
public interface Module extends ProgramUnit {

	/**
	 * Returns the value of the '<em><b>Module Statement</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Module Statement</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Module Statement</em>' containment reference.
	 * @see #setModuleStatement(ModuleStatement)
	 * @see org.jfom.JFOMPackage#getModule_ModuleStatement()
	 * @model containment="true" required="true"
	 * @generated
	 */
	ModuleStatement getModuleStatement();

	/**
	 * Sets the value of the '{@link org.jfom.Module#getModuleStatement <em>Module Statement</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Module Statement</em>' containment reference.
	 * @see #getModuleStatement()
	 * @generated
	 */
	void setModuleStatement(ModuleStatement value);

	/**
	 * Returns the value of the '<em><b>Specification Part</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Specification Part</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Specification Part</em>' containment reference.
	 * @see #setSpecificationPart(SpecificationPart)
	 * @see org.jfom.JFOMPackage#getModule_SpecificationPart()
	 * @model containment="true"
	 * @generated
	 */
	SpecificationPart getSpecificationPart();

	/**
	 * Sets the value of the '{@link org.jfom.Module#getSpecificationPart <em>Specification Part</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Specification Part</em>' containment reference.
	 * @see #getSpecificationPart()
	 * @generated
	 */
	void setSpecificationPart(SpecificationPart value);

	/**
	 * Returns the value of the '<em><b>Module Subprogram Part</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Module Subprogram Part</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Module Subprogram Part</em>' containment reference.
	 * @see #setModuleSubprogramPart(ModuleSubprogramPart)
	 * @see org.jfom.JFOMPackage#getModule_ModuleSubprogramPart()
	 * @model containment="true" required="true"
	 * @generated
	 */
	ModuleSubprogramPart getModuleSubprogramPart();

	/**
	 * Sets the value of the '{@link org.jfom.Module#getModuleSubprogramPart <em>Module Subprogram Part</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Module Subprogram Part</em>' containment reference.
	 * @see #getModuleSubprogramPart()
	 * @generated
	 */
	void setModuleSubprogramPart(ModuleSubprogramPart value);

	/**
	 * Returns the value of the '<em><b>End Module Statement</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>End Module Statement</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>End Module Statement</em>' containment reference.
	 * @see #setEndModuleStatement(EndModuleStatement)
	 * @see org.jfom.JFOMPackage#getModule_EndModuleStatement()
	 * @model containment="true" required="true"
	 * @generated
	 */
	EndModuleStatement getEndModuleStatement();

	/**
	 * Sets the value of the '{@link org.jfom.Module#getEndModuleStatement <em>End Module Statement</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>End Module Statement</em>' containment reference.
	 * @see #getEndModuleStatement()
	 * @generated
	 */
	void setEndModuleStatement(EndModuleStatement value);
} // Module
