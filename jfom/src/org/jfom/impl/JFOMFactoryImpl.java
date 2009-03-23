/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.jfom.impl;


import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;
import org.jfom.*;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class JFOMFactoryImpl extends EFactoryImpl implements JFOMFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static JFOMFactory init() {
		try {
			JFOMFactory theJFOMFactory = (JFOMFactory)EPackage.Registry.INSTANCE.getEFactory("http://www.earthsystemcurator.org/jfom"); 
			if (theJFOMFactory != null) {
				return theJFOMFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new JFOMFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public JFOMFactoryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EObject create(EClass eClass) {
		switch (eClass.getClassifierID()) {
			case JFOMPackage.ACCESS_STATEMENT: return createAccessStatement();
			case JFOMPackage.ACTUAL_ARGUMENT_SPEC: return createActualArgumentSpec();
			case JFOMPackage.ARBITRARY_TEXT_CONSTRUCT: return createArbitraryTextConstruct();
			case JFOMPackage.ARRAY_CONSTRUCTOR: return createArrayConstructor();
			case JFOMPackage.ASSIGNMENT_STATEMENT: return createAssignmentStatement();
			case JFOMPackage.CALL_STATEMENT: return createCallStatement();
			case JFOMPackage.CONTAINS_STATEMENT: return createContainsStatement();
			case JFOMPackage.DECLARATION_CONSTRUCT: return createDeclarationConstruct();
			case JFOMPackage.DERIVED_TYPE_SPEC: return createDerivedTypeSpec();
			case JFOMPackage.DO_CONSTRUCT: return createDoConstruct();
			case JFOMPackage.END_MODULE_STATEMENT: return createEndModuleStatement();
			case JFOMPackage.END_PROGRAM_STATEMENT: return createEndProgramStatement();
			case JFOMPackage.END_SUBROUTINE_STATEMENT: return createEndSubroutineStatement();
			case JFOMPackage.EXECUTION_PART: return createExecutionPart();
			case JFOMPackage.EXECUTION_PART_CONSTRUCT: return createExecutionPartConstruct();
			case JFOMPackage.FUNCTION_REFERENCE: return createFunctionReference();
			case JFOMPackage.FUNCTION_SUBPROGRAM: return createFunctionSubprogram();
			case JFOMPackage.IF_STATEMENT: return createIfStatement();
			case JFOMPackage.IMPLICIT_PART: return createImplicitPart();
			case JFOMPackage.IMPLICIT_PART_STATEMENT: return createImplicitPartStatement();
			case JFOMPackage.IMPLICIT_STATEMENT: return createImplicitStatement();
			case JFOMPackage.INTENT_ATTR_SPEC: return createIntentAttrSpec();
			case JFOMPackage.INTERNAL_SUBPROGRAM_PART: return createInternalSubprogramPart();
			case JFOMPackage.INTRINSIC_TYPE_SPEC: return createIntrinsicTypeSpec();
			case JFOMPackage.LITERAL_CONSTANT: return createLiteralConstant();
			case JFOMPackage.MAIN_PROGRAM: return createMainProgram();
			case JFOMPackage.MODULE: return createModule();
			case JFOMPackage.MODULE_STATEMENT: return createModuleStatement();
			case JFOMPackage.MODULE_SUBPROGRAM_PART: return createModuleSubprogramPart();
			case JFOMPackage.NAMED_CONSTANT: return createNamedConstant();
			case JFOMPackage.PRINT_STATEMENT: return createPrintStatement();
			case JFOMPackage.PROGRAM_STATEMENT: return createProgramStatement();
			case JFOMPackage.SAVE_ATTR_SPEC: return createSaveAttrSpec();
			case JFOMPackage.SPECIFICATION_PART: return createSpecificationPart();
			case JFOMPackage.SUBROUTINE_STATEMENT: return createSubroutineStatement();
			case JFOMPackage.SUBROUTINE_SUBPROGRAM: return createSubroutineSubprogram();
			case JFOMPackage.TYPE_DECLARATION_STATEMENT: return createTypeDeclarationStatement();
			case JFOMPackage.USE_STATEMENT: return createUseStatement();
			case JFOMPackage._SPACER: return create_Spacer();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object createFromString(EDataType eDataType, String initialValue) {
		switch (eDataType.getClassifierID()) {
			case JFOMPackage.ACCESS_SPEC:
				return createAccessSpecFromString(eDataType, initialValue);
			case JFOMPackage.INTENT_SPEC:
				return createIntentSpecFromString(eDataType, initialValue);
			case JFOMPackage.INTRINSIC_TYPE:
				return createIntrinsicTypeFromString(eDataType, initialValue);
			default:
				throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String convertToString(EDataType eDataType, Object instanceValue) {
		switch (eDataType.getClassifierID()) {
			case JFOMPackage.ACCESS_SPEC:
				return convertAccessSpecToString(eDataType, instanceValue);
			case JFOMPackage.INTENT_SPEC:
				return convertIntentSpecToString(eDataType, instanceValue);
			case JFOMPackage.INTRINSIC_TYPE:
				return convertIntrinsicTypeToString(eDataType, instanceValue);
			default:
				throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AccessStatement createAccessStatement() {
		AccessStatementImpl accessStatement = new AccessStatementImpl();
		return accessStatement;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MainProgram createMainProgram() {
		MainProgramImpl mainProgram = new MainProgramImpl();
		return mainProgram;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Module createModule() {
		ModuleImpl module = new ModuleImpl();
		return module;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SpecificationPart createSpecificationPart() {
		SpecificationPartImpl specificationPart = new SpecificationPartImpl();
		return specificationPart;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ExecutionPart createExecutionPart() {
		ExecutionPartImpl executionPart = new ExecutionPartImpl();
		return executionPart;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public InternalSubprogramPart createInternalSubprogramPart() {
		InternalSubprogramPartImpl internalSubprogramPart = new InternalSubprogramPartImpl();
		return internalSubprogramPart;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public UseStatement createUseStatement() {
		UseStatementImpl useStatement = new UseStatementImpl();
		return useStatement;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ImplicitPart createImplicitPart() {
		ImplicitPartImpl implicitPart = new ImplicitPartImpl();
		return implicitPart;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DeclarationConstruct createDeclarationConstruct() {
		DeclarationConstructImpl declarationConstruct = new DeclarationConstructImpl();
		return declarationConstruct;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ImplicitStatement createImplicitStatement() {
		ImplicitStatementImpl implicitStatement = new ImplicitStatementImpl();
		return implicitStatement;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IntentAttrSpec createIntentAttrSpec() {
		IntentAttrSpecImpl intentAttrSpec = new IntentAttrSpecImpl();
		return intentAttrSpec;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ImplicitPartStatement createImplicitPartStatement() {
		ImplicitPartStatementImpl implicitPartStatement = new ImplicitPartStatementImpl();
		return implicitPartStatement;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ExecutionPartConstruct createExecutionPartConstruct() {
		ExecutionPartConstructImpl executionPartConstruct = new ExecutionPartConstructImpl();
		return executionPartConstruct;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DoConstruct createDoConstruct() {
		DoConstructImpl doConstruct = new DoConstructImpl();
		return doConstruct;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ArbitraryTextConstruct createArbitraryTextConstruct() {
		ArbitraryTextConstructImpl arbitraryTextConstruct = new ArbitraryTextConstructImpl();
		return arbitraryTextConstruct;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ArrayConstructor createArrayConstructor() {
		ArrayConstructorImpl arrayConstructor = new ArrayConstructorImpl();
		return arrayConstructor;
	}

	/**
	 * {@inheritDoc}
	 * @generated NOT
	 */
	@Override
	public ArrayConstructor createArrayConstructor(int[] values) {
		ArrayConstructor arrayConstructor = createArrayConstructor();		
		for (int i : values) {
			LiteralConstant lc = this.createLiteralConstant(i);
			arrayConstructor.getArrayConstructorValue().add(lc);
		}		
		return arrayConstructor;
	}
 	
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ProgramStatement createProgramStatement() {
		ProgramStatementImpl programStatement = new ProgramStatementImpl();
		return programStatement;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SaveAttrSpec createSaveAttrSpec() {
		SaveAttrSpecImpl saveAttrSpec = new SaveAttrSpecImpl();
		return saveAttrSpec;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TypeDeclarationStatement createTypeDeclarationStatement() {
		TypeDeclarationStatementImpl typeDeclarationStatement = new TypeDeclarationStatementImpl();
		return typeDeclarationStatement;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IntrinsicTypeSpec createIntrinsicTypeSpec() {
		IntrinsicTypeSpecImpl intrinsicTypeSpec = new IntrinsicTypeSpecImpl();
		return intrinsicTypeSpec;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LiteralConstant createLiteralConstant() {
		LiteralConstantImpl literalConstant = new LiteralConstantImpl();
		return literalConstant;
	}
	
	/**
	 * {@inheritDoc}
	 * @generated NOT
	 */
	public LiteralConstant createLiteralConstant(String s) {
		LiteralConstant literalConstant = createLiteralConstant();
		literalConstant.setLiteral(s);
		return literalConstant;
	}
	
	/**
	 * {@inheritDoc}
	 * @generated NOT
	 */
	public LiteralConstant createLiteralConstant(int i) {
		LiteralConstant literalConstant = createLiteralConstant();
		literalConstant.setLiteral(String.valueOf(i));
		return literalConstant;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DerivedTypeSpec createDerivedTypeSpec() {
		DerivedTypeSpecImpl derivedTypeSpec = new DerivedTypeSpecImpl();
		return derivedTypeSpec;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CallStatement createCallStatement() {
		CallStatementImpl callStatement = new CallStatementImpl();
		return callStatement;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ActualArgumentSpec createActualArgumentSpec() {
		ActualArgumentSpecImpl actualArgumentSpec = new ActualArgumentSpecImpl();
		return actualArgumentSpec;
	}
	
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IfStatement createIfStatement() {
		IfStatementImpl ifStatement = new IfStatementImpl();
		return ifStatement;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FunctionReference createFunctionReference() {
		FunctionReferenceImpl functionReference = new FunctionReferenceImpl();
		return functionReference;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EndProgramStatement createEndProgramStatement() {
		EndProgramStatementImpl endProgramStatement = new EndProgramStatementImpl();
		return endProgramStatement;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AssignmentStatement createAssignmentStatement() {
		AssignmentStatementImpl assignmentStatement = new AssignmentStatementImpl();
		return assignmentStatement;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public _Spacer create_Spacer() {
		_SpacerImpl _Spacer = new _SpacerImpl();
		return _Spacer;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AccessSpec createAccessSpecFromString(EDataType eDataType, String initialValue) {
		AccessSpec result = AccessSpec.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertAccessSpecToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IntentSpec createIntentSpecFromString(EDataType eDataType, String initialValue) {
		IntentSpec result = IntentSpec.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertIntentSpecToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PrintStatement createPrintStatement() {
		PrintStatementImpl printStatement = new PrintStatementImpl();
		return printStatement;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ModuleStatement createModuleStatement() {
		ModuleStatementImpl moduleStatement = new ModuleStatementImpl();
		return moduleStatement;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EndModuleStatement createEndModuleStatement() {
		EndModuleStatementImpl endModuleStatement = new EndModuleStatementImpl();
		return endModuleStatement;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ModuleSubprogramPart createModuleSubprogramPart() {
		ModuleSubprogramPartImpl moduleSubprogramPart = new ModuleSubprogramPartImpl();
		return moduleSubprogramPart;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NamedConstant createNamedConstant() {
		NamedConstantImpl namedConstant = new NamedConstantImpl();
		return namedConstant;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ContainsStatement createContainsStatement() {
		ContainsStatementImpl containsStatement = new ContainsStatementImpl();
		return containsStatement;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FunctionSubprogram createFunctionSubprogram() {
		FunctionSubprogramImpl functionSubprogram = new FunctionSubprogramImpl();
		return functionSubprogram;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SubroutineSubprogram createSubroutineSubprogram() {
		SubroutineSubprogramImpl subroutineSubprogram = new SubroutineSubprogramImpl();
		return subroutineSubprogram;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SubroutineStatement createSubroutineStatement() {
		SubroutineStatementImpl subroutineStatement = new SubroutineStatementImpl();
		return subroutineStatement;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EndSubroutineStatement createEndSubroutineStatement() {
		EndSubroutineStatementImpl endSubroutineStatement = new EndSubroutineStatementImpl();
		return endSubroutineStatement;
	}

	/**
	 * 
	 * @param keyword
	 * @param arg
	 * @return
	 * @generated NOT
	 */
	@Override
	public ActualArgumentSpec createActualArgumentSpecWithNamedConstant(String keyword, String name) {
		NamedConstant nc = createNamedConstant();
		nc.setName(name);
		return createActualArgumentSpecWithExpression(keyword, nc);		
	}
	
	/**
	 * {@inheritDoc}
	 * @generated NOT
	 */
	@Override
	public ActualArgumentSpec createActualArgumentSpecWithExpression(String keyword, Expression expr) {
		ActualArgumentSpec actualArgumentSpec = createActualArgumentSpec();
		actualArgumentSpec.setKeyword(keyword);
		actualArgumentSpec.setArgument(expr);
		return actualArgumentSpec;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IntrinsicType createIntrinsicTypeFromString(EDataType eDataType, String initialValue) {
		IntrinsicType result = IntrinsicType.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertIntrinsicTypeToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public JFOMPackage getJFOMPackage() {
		return (JFOMPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static JFOMPackage getPackage() {
		return JFOMPackage.eINSTANCE;
	}

	/**
	 * {@inheritDoc}
	 * @generated NOT
	 */
	@Override
	public TypeDeclarationStatement createTypeDeclarationStatement(
			String typeName, String entityName) {
		
		TypeDeclarationStatement tds = createTypeDeclarationStatement();
		tds.getEntityDeclaration().add(entityName);
		
		DerivedTypeSpec dts = createDerivedTypeSpec();
		dts.setType(typeName);
		tds.setTypeSpec(dts);
		
		return tds;
	}

	
	/**
	 * {@inheritDoc}
	 * @generated NOT
	 */
	@Override
	public TypeDeclarationStatement createTypeDeclarationStatement(
			IntrinsicType type, String entityName) {
		
		TypeDeclarationStatement tds = createTypeDeclarationStatement();
		tds.getEntityDeclaration().add(entityName);
		
		IntrinsicTypeSpec its = createIntrinsicTypeSpec();
		its.setType(type);
		tds.setTypeSpec(its);
		
		return tds;
		
	}

	/**
	 * {@inheritDoc}
	 * @generated NOT
	 */
	@Override
	public ActualArgumentSpec createActualArgumentSpecWithNamedConstant(String name) {
		return createActualArgumentSpecWithNamedConstant(null, name);
	}

	/**
	 * {@inheritDoc}
	 * @generated NOT
	 */
	@Override
	public CallStatement createCallStatement(String subroutineName) {
		CallStatement cs = createCallStatement();
		cs.setSubroutineName(subroutineName);
		return cs;
	}

	/**
	 * {@inheritDoc}
	 * @generated NOT
	 */
	@Override
	public FunctionReference createFunctionReference(String functionName) {
		FunctionReference fr = createFunctionReference();
		fr.setFunctionName(functionName);
		return fr;
	}

	/**
	 * {@inheritDoc}
	 * @generated NOT
	 */
	@Override
	public AssignmentStatement createAssignmentStatement(String variable,
			Expression expr) {
		AssignmentStatement as = createAssignmentStatement();
		as.setVariable(variable);
		as.setExpression(expr);
		return as;
	}

	/**
	 * {@inheritDoc}
	 * @generated NOT
	 */
	@Override
	public Module createModule(String moduleName) {
		Module m = createModule();
		
		ModuleStatement ms = createModuleStatement();
		ms.setModuleName(moduleName);
		m.setModuleStatement(ms);
		
		EndModuleStatement ems = createEndModuleStatement();
		ems.setModuleName(moduleName);
		m.setEndModuleStatement(ems);
		
		return m;
	}

	/**
	 * {@inheritDoc}
	 * @generated NOT
	 */
	@Override
	public MainProgram createMainProgram(String programName) {		
		MainProgram mp = createMainProgram();
		
		ProgramStatement ps = createProgramStatement();
		ps.setProgramName(programName);
		mp.setProgramStatement(ps);
		
		EndProgramStatement eps = createEndProgramStatement();
		eps.setProgramName(programName);
		mp.setEndProgramStatement(eps);
		
		return mp;
	}

	/**
	 * {@inheritDoc}
	 * @generated NOT
	 */
	@Override
	public UseStatement createUseStatement(String moduleName) {
		UseStatement us = createUseStatement();
		us.setModuleName(moduleName);
		return us;
	}

	/**
	 * {@inheritDoc}
	 * @generated NOT
	 */
	@Override
	public SubroutineSubprogram createSubroutineSubprogram(String subroutineName) {
		SubroutineSubprogram ss = createSubroutineSubprogram();
		
		SubroutineStatement sst = createSubroutineStatement();
		sst.setSubroutineName(subroutineName);
		ss.setSubroutineStatement(sst);
		
		EndSubroutineStatement est = createEndSubroutineStatement();
		est.setSubroutineName(subroutineName);
		ss.setEndSubroutineStatement(est);
		
		return ss;
	}

	/**
	 * {@inheritDoc}
	 * @generated NOT
	 */
	@Override
	public AssignmentStatement createAssignmentStatementWithLiteral(String variable, String literal) {	
		AssignmentStatement as = createAssignmentStatement();
		as.setVariable(variable);		
		LiteralConstant lc = createLiteralConstant();
		lc.setLiteral(literal);
		as.setExpression(lc);
		return as;
	}

	/**
	 * {@inheritDoc}
	 * @generated NOT
	 */
	@Override
	public AssignmentStatement createAssignmentStatementWithNamedConstant(String variable, String name) {
		AssignmentStatement as = createAssignmentStatement();
		as.setVariable(variable);		
		NamedConstant nc = createNamedConstant();
		nc.setName(name);
		as.setExpression(nc);
		return as;
	}


	

} //JFOMFactoryImpl
