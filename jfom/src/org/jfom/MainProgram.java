/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.jfom;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Main Program</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.jfom.MainProgram#getProgramStatement <em>Program Statement</em>}</li>
 *   <li>{@link org.jfom.MainProgram#getSpecificationPart <em>Specification Part</em>}</li>
 *   <li>{@link org.jfom.MainProgram#getExecutionPart <em>Execution Part</em>}</li>
 *   <li>{@link org.jfom.MainProgram#getInternalSubprogramPart <em>Internal Subprogram Part</em>}</li>
 *   <li>{@link org.jfom.MainProgram#getEndProgramStatement <em>End Program Statement</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.jfom.JFOMPackage#getMainProgram()
 * @model
 * @generated
 */
public interface MainProgram extends ProgramUnit {
	/**
	 * Returns the value of the '<em><b>Program Statement</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Program Statement</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Program Statement</em>' containment reference.
	 * @see #setProgramStatement(ProgramStatement)
	 * @see org.jfom.JFOMPackage#getMainProgram_ProgramStatement()
	 * @model containment="true" required="true"
	 * @generated
	 */
	ProgramStatement getProgramStatement();

	/**
	 * Sets the value of the '{@link org.jfom.MainProgram#getProgramStatement <em>Program Statement</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Program Statement</em>' containment reference.
	 * @see #getProgramStatement()
	 * @generated
	 */
	void setProgramStatement(ProgramStatement value);

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
	 * @see org.jfom.JFOMPackage#getMainProgram_SpecificationPart()
	 * @model containment="true"
	 * @generated
	 */
	SpecificationPart getSpecificationPart();

	/**
	 * Sets the value of the '{@link org.jfom.MainProgram#getSpecificationPart <em>Specification Part</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Specification Part</em>' containment reference.
	 * @see #getSpecificationPart()
	 * @generated
	 */
	void setSpecificationPart(SpecificationPart value);

	/**
	 * Returns the value of the '<em><b>Execution Part</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Execution Part</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Execution Part</em>' containment reference.
	 * @see #setExecutionPart(ExecutionPart)
	 * @see org.jfom.JFOMPackage#getMainProgram_ExecutionPart()
	 * @model containment="true"
	 * @generated
	 */
	ExecutionPart getExecutionPart();

	/**
	 * Sets the value of the '{@link org.jfom.MainProgram#getExecutionPart <em>Execution Part</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Execution Part</em>' containment reference.
	 * @see #getExecutionPart()
	 * @generated
	 */
	void setExecutionPart(ExecutionPart value);
	
	/**
	 * Convenience method for adding an executable statement.
	 * @param epc
	 * @generated NOT
	 */
	void addExecutionPartConstruct(ExecutionPartConstruct epc);
	
	/**
	 * Add a newline to make code more readable.
	 * @generated NOT
	 */
	void addExecutionPartSpacer();

	/**
	 * Returns the value of the '<em><b>Internal Subprogram Part</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Internal Subprogram Part</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Internal Subprogram Part</em>' reference.
	 * @see #setInternalSubprogramPart(InternalSubprogramPart)
	 * @see org.jfom.JFOMPackage#getMainProgram_InternalSubprogramPart()
	 * @model
	 * @generated
	 */
	InternalSubprogramPart getInternalSubprogramPart();

	
	/**
	 * Sets the value of the '{@link org.jfom.MainProgram#getInternalSubprogramPart <em>Internal Subprogram Part</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Internal Subprogram Part</em>' reference.
	 * @see #getInternalSubprogramPart()
	 * @generated
	 */
	void setInternalSubprogramPart(InternalSubprogramPart value);

	/**
	 * Returns the value of the '<em><b>End Program Statement</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>End Program Statement</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>End Program Statement</em>' containment reference.
	 * @see #setEndProgramStatement(EndProgramStatement)
	 * @see org.jfom.JFOMPackage#getMainProgram_EndProgramStatement()
	 * @model containment="true" required="true"
	 * @generated
	 */
	EndProgramStatement getEndProgramStatement();

	/**
	 * Sets the value of the '{@link org.jfom.MainProgram#getEndProgramStatement <em>End Program Statement</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>End Program Statement</em>' containment reference.
	 * @see #getEndProgramStatement()
	 * @generated
	 */
	void setEndProgramStatement(EndProgramStatement value);

} // MainProgram
