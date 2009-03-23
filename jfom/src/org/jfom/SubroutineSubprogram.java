/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.jfom;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Subroutine Subprogram</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.jfom.SubroutineSubprogram#getSubroutineStatement <em>Subroutine Statement</em>}</li>
 *   <li>{@link org.jfom.SubroutineSubprogram#getSpecificationPart <em>Specification Part</em>}</li>
 *   <li>{@link org.jfom.SubroutineSubprogram#getExecutionPart <em>Execution Part</em>}</li>
 *   <li>{@link org.jfom.SubroutineSubprogram#getInternalSubprogramPart <em>Internal Subprogram Part</em>}</li>
 *   <li>{@link org.jfom.SubroutineSubprogram#getEndSubroutineStatement <em>End Subroutine Statement</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.jfom.JFOMPackage#getSubroutineSubprogram()
 * @model
 * @generated
 */
public interface SubroutineSubprogram extends ModuleSubprogram {
	/**
	 * Returns the value of the '<em><b>Subroutine Statement</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Subroutine Statement</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Subroutine Statement</em>' containment reference.
	 * @see #setSubroutineStatement(SubroutineStatement)
	 * @see org.jfom.JFOMPackage#getSubroutineSubprogram_SubroutineStatement()
	 * @model containment="true" required="true"
	 * @generated
	 */
	SubroutineStatement getSubroutineStatement();

	/**
	 * Sets the value of the '{@link org.jfom.SubroutineSubprogram#getSubroutineStatement <em>Subroutine Statement</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Subroutine Statement</em>' containment reference.
	 * @see #getSubroutineStatement()
	 * @generated
	 */
	void setSubroutineStatement(SubroutineStatement value);

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
	 * @see org.jfom.JFOMPackage#getSubroutineSubprogram_SpecificationPart()
	 * @model containment="true"
	 * @generated
	 */
	SpecificationPart getSpecificationPart();

	/**
	 * Sets the value of the '{@link org.jfom.SubroutineSubprogram#getSpecificationPart <em>Specification Part</em>}' containment reference.
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
	 * @see org.jfom.JFOMPackage#getSubroutineSubprogram_ExecutionPart()
	 * @model containment="true"
	 * @generated
	 */
	ExecutionPart getExecutionPart();

	/**
	 * Sets the value of the '{@link org.jfom.SubroutineSubprogram#getExecutionPart <em>Execution Part</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Execution Part</em>' containment reference.
	 * @see #getExecutionPart()
	 * @generated
	 */
	void setExecutionPart(ExecutionPart value);

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
	 * @see org.jfom.JFOMPackage#getSubroutineSubprogram_InternalSubprogramPart()
	 * @model
	 * @generated
	 */
	InternalSubprogramPart getInternalSubprogramPart();

	/**
	 * Sets the value of the '{@link org.jfom.SubroutineSubprogram#getInternalSubprogramPart <em>Internal Subprogram Part</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Internal Subprogram Part</em>' reference.
	 * @see #getInternalSubprogramPart()
	 * @generated
	 */
	void setInternalSubprogramPart(InternalSubprogramPart value);

	/**
	 * Returns the value of the '<em><b>End Subroutine Statement</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>End Subroutine Statement</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>End Subroutine Statement</em>' containment reference.
	 * @see #setEndSubroutineStatement(EndSubroutineStatement)
	 * @see org.jfom.JFOMPackage#getSubroutineSubprogram_EndSubroutineStatement()
	 * @model containment="true" required="true"
	 * @generated
	 */
	EndSubroutineStatement getEndSubroutineStatement();

	/**
	 * Sets the value of the '{@link org.jfom.SubroutineSubprogram#getEndSubroutineStatement <em>End Subroutine Statement</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>End Subroutine Statement</em>' containment reference.
	 * @see #getEndSubroutineStatement()
	 * @generated
	 */
	void setEndSubroutineStatement(EndSubroutineStatement value);
	
	/**
	 * Convenience method for adding a formal argument to the subroutine.
	 * @generated NOT
	 */
	void addFormalArgument(String typeName, String argName);
	
	/**
	 * Convenience method for adding a formal argument to the subroutine.
	 * @generated NOT
	 */
	void addFormalArgument(IntrinsicType type, String argName, IntentSpec intent);
	
	/**
	 * Convenience method for adding an executable statement.
	 * @param epc
	 * @generated NOT
	 */
	void addExecutionPartConstruct(ExecutionPartConstruct epc);

} // SubroutineSubprogram
