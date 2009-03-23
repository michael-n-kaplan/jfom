/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.jfom;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see org.jfom.JFOMPackage
 * @generated
 */
public interface JFOMFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	JFOMFactory eINSTANCE = org.jfom.impl.JFOMFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>Access Statement</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Access Statement</em>'.
	 * @generated
	 */
	AccessStatement createAccessStatement();

	/**
	 * Returns a new object of class '<em>Main Program</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Main Program</em>'.
	 * @generated
	 */
	MainProgram createMainProgram();
	
	/**
	 * Returns a main program object with program statement and
	 * end program statements already in place.
	 * 
	 * @param programName
	 * @return
	 * @generated NOT
	 */
	MainProgram createMainProgram(String programName);

	/**
	 * Returns a new object of class '<em>Module</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Module</em>'.
	 * @generated
	 */
	Module createModule();
	
	/**
	 * Returns a new module object with a module statement and end module statement
	 * based on the given module name.
	 * 
	 * @param moduleName
	 * @return
	 * @generated NOT
	 */
	Module createModule(String moduleName);

	/**
	 * Returns a new object of class '<em>Specification Part</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Specification Part</em>'.
	 * @generated
	 */
	SpecificationPart createSpecificationPart();

	/**
	 * Returns a new object of class '<em>Execution Part</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Execution Part</em>'.
	 * @generated
	 */
	ExecutionPart createExecutionPart();

	/**
	 * Returns a new object of class '<em>Internal Subprogram Part</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Internal Subprogram Part</em>'.
	 * @generated
	 */
	InternalSubprogramPart createInternalSubprogramPart();

	/**
	 * Returns a new object of class '<em>Use Statement</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Use Statement</em>'.
	 * @generated
	 */
	UseStatement createUseStatement();
	
	/**
	 * Returns a UseStatement object for the given module name.
	 * 
	 * @param moduleName
	 * @return
	 * @generated NOT
	 */
	UseStatement createUseStatement(String moduleName);

	/**
	 * Returns a new object of class '<em>Implicit Part</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Implicit Part</em>'.
	 * @generated
	 */
	ImplicitPart createImplicitPart();

	/**
	 * Returns a new object of class '<em>Declaration Construct</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Declaration Construct</em>'.
	 * @generated
	 */
	DeclarationConstruct createDeclarationConstruct();

	/**
	 * Returns a new object of class '<em>Implicit Statement</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Implicit Statement</em>'.
	 * @generated
	 */
	ImplicitStatement createImplicitStatement();

	/**
	 * Returns a new object of class '<em>Intent Attr Spec</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Intent Attr Spec</em>'.
	 * @generated
	 */
	IntentAttrSpec createIntentAttrSpec();

	/**
	 * Returns a new object of class '<em>Implicit Part Statement</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Implicit Part Statement</em>'.
	 * @generated
	 */
	ImplicitPartStatement createImplicitPartStatement();

	/**
	 * Returns a new object of class '<em>Execution Part Construct</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Execution Part Construct</em>'.
	 * @generated
	 */
	ExecutionPartConstruct createExecutionPartConstruct();

	/**
	 * Returns a new object of class '<em>Do Construct</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Do Construct</em>'.
	 * @generated
	 */
	DoConstruct createDoConstruct();

	/**
	 * Returns a new object of class '<em>Arbitrary Text Construct</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Arbitrary Text Construct</em>'.
	 * @generated
	 */
	ArbitraryTextConstruct createArbitraryTextConstruct();

	/**
	 * Returns a new object of class '<em>Array Constructor</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Array Constructor</em>'.
	 * @generated
	 */
	ArrayConstructor createArrayConstructor();
	
	/**
	 * Convenience method for creating an array constructor with
	 * an explicit list of integers.
	 * 
	 * @param values
	 * @return
	 * @generated NOT
	 */
	ArrayConstructor createArrayConstructor(int[] values);

	/**
	 * Returns a new object of class '<em>Program Statement</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Program Statement</em>'.
	 * @generated
	 */
	ProgramStatement createProgramStatement();

	/**
	 * Returns a new object of class '<em>Save Attr Spec</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Save Attr Spec</em>'.
	 * @generated
	 */
	SaveAttrSpec createSaveAttrSpec();

	/**
	 * Returns a new object of class '<em>Type Declaration Statement</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Type Declaration Statement</em>'.
	 * @generated
	 */
	TypeDeclarationStatement createTypeDeclarationStatement();
	
	/**
	 * Convenience method for creating a type declaration for a derived type
	 * with the given name for the given entity.
	 * 
	 * @param typeName
	 * @param entityName
	 * @return
	 * @generated NOT
	 */
	TypeDeclarationStatement createTypeDeclarationStatement(String typeName, String entityName);
	
	/**
	 * Convenience method for creating a type declaration for an intrinsic type.
	 * 
	 * @param type
	 * @param entityName
	 * @return
	 * @generated NOT
	 */
	TypeDeclarationStatement createTypeDeclarationStatement(IntrinsicType type, String entityName);

	/**
	 * Returns a new object of class '<em>Intrinsic Type Spec</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Intrinsic Type Spec</em>'.
	 * @generated
	 */
	IntrinsicTypeSpec createIntrinsicTypeSpec();

	/**
	 * Returns a new object of class '<em>Literal Constant</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Literal Constant</em>'.
	 * @generated
	 */
	LiteralConstant createLiteralConstant();

	/**
	 * Convenience method for creating a literal constant from a String.
	 * @param s
	 * @return
	 * @generated NOT
	 */
	LiteralConstant createLiteralConstant(String s);
	
	/**
	 * Convenience method for creating a literal constant from an int.
	 * @param i
	 * @return
	 * @generated NOT
	 */
	LiteralConstant createLiteralConstant(int i);
	
	/**
	 * Returns a new object of class '<em>Derived Type Spec</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Derived Type Spec</em>'.
	 * @generated
	 */
	DerivedTypeSpec createDerivedTypeSpec();
	

	/**
	 * Returns a new object of class '<em>Call Statement</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Call Statement</em>'.
	 * @generated
	 */
	CallStatement createCallStatement();
	
	/**
	 * 
	 * @param subroutineName
	 * @return
	 * @generated NOT
	 */
	CallStatement createCallStatement(String subroutineName);

	/**
	 * Returns a new object of class '<em>Actual Argument Spec</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Actual Argument Spec</em>'.
	 * @generated
	 */
	ActualArgumentSpec createActualArgumentSpec();

	/**
	 * Returns a new object of class '<em>If Statement</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>If Statement</em>'.
	 * @generated
	 */
	IfStatement createIfStatement();

	/**
	 * Returns a new object of class '<em>Function Reference</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Function Reference</em>'.
	 * @generated
	 */
	FunctionReference createFunctionReference();
	
	/**
	 * 
	 * @param functionName
	 * @return
	 * @generated NOT
	 */
	FunctionReference createFunctionReference(String functionName);

	/**
	 * Returns a new object of class '<em>End Program Statement</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>End Program Statement</em>'.
	 * @generated
	 */
	EndProgramStatement createEndProgramStatement();

	/**
	 * Returns a new object of class '<em>Assignment Statement</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Assignment Statement</em>'.
	 * @generated
	 */
	AssignmentStatement createAssignmentStatement();
	
	/**
	 * Returns a new object of class '<em>Spacer</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Spacer</em>'.
	 * @generated
	 */
	_Spacer create_Spacer();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	JFOMPackage getJFOMPackage();

	/**
	 * Returns a new object of class '<em>Print Statement</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Print Statement</em>'.
	 * @generated
	 */
	PrintStatement createPrintStatement();

	/**
	 * Returns a new object of class '<em>Module Statement</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Module Statement</em>'.
	 * @generated
	 */
	ModuleStatement createModuleStatement();

	/**
	 * Returns a new object of class '<em>End Module Statement</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>End Module Statement</em>'.
	 * @generated
	 */
	EndModuleStatement createEndModuleStatement();

	/**
	 * Returns a new object of class '<em>Module Subprogram Part</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Module Subprogram Part</em>'.
	 * @generated
	 */
	ModuleSubprogramPart createModuleSubprogramPart();

	/**
	 * Returns a new object of class '<em>Named Constant</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Named Constant</em>'.
	 * @generated
	 */
	NamedConstant createNamedConstant();

	/**
	 * Returns a new object of class '<em>Contains Statement</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Contains Statement</em>'.
	 * @generated
	 */
	ContainsStatement createContainsStatement();

	/**
	 * Returns a new object of class '<em>Function Subprogram</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Function Subprogram</em>'.
	 * @generated
	 */
	FunctionSubprogram createFunctionSubprogram();

	/**
	 * Returns a new object of class '<em>Subroutine Subprogram</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Subroutine Subprogram</em>'.
	 * @generated
	 */
	SubroutineSubprogram createSubroutineSubprogram();
	
	/**
	 * Returns a SubroutineSubprogram with SubroutineStatement and
	 * EndSubroutineStatement already set up with the given subroutineName.
	 * @param subroutineName
	 * @return
	 * @generated NOT
	 */
	SubroutineSubprogram createSubroutineSubprogram(String subroutineName);

	/**
	 * Returns a new object of class '<em>Subroutine Statement</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Subroutine Statement</em>'.
	 * @generated
	 */
	SubroutineStatement createSubroutineStatement();

	/**
	 * Returns a new object of class '<em>End Subroutine Statement</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>End Subroutine Statement</em>'.
	 * @generated
	 */
	EndSubroutineStatement createEndSubroutineStatement();

	/**
	 * 
	 * @param variable
	 * @param expr
	 * @return
	 * @generated NOT
	 */
	AssignmentStatement createAssignmentStatement(String variable, Expression expr);

	/**
	 * 
	 * @param variable
	 * @param name
	 * @return
	 * @generated NOT
	 */
	AssignmentStatement createAssignmentStatementWithNamedConstant(String variable, String name);
	
	/**
	 * 
	 * @param variable
	 * @param literal
	 * @return
	 * @generated NOT
	 */
	AssignmentStatement createAssignmentStatementWithLiteral(String variable, String literal);
	
	/**
	 * 
	 * @param keyword
	 * @param name
	 * @return
	 * @generated NOT
	 */
	public ActualArgumentSpec createActualArgumentSpecWithNamedConstant(String keyword, String name);
	
	/**
	 * 
	 * @param name
	 * @return
	 * @generated NOT
	 */
	public ActualArgumentSpec createActualArgumentSpecWithNamedConstant(String name);
	
	/**
	 * 
	 * @param keyword
	 * @param expr
	 * @return
	 * @generated NOT
	 */
	public ActualArgumentSpec createActualArgumentSpecWithExpression(String keyword, Expression expr);

	

} //JFOMFactory
