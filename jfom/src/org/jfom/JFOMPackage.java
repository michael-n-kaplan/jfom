/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.jfom;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.EcorePackage;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see org.jfom.JFOMFactory
 * @model kind="package"
 * @generated
 */
public interface JFOMPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "jfom";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://www.earthsystemcurator.org/jfom";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "jfom";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	JFOMPackage eINSTANCE = org.jfom.impl.JFOMPackageImpl.init();

	/**
	 * The meta object id for the '{@link org.jfom.impl.ProgramUnitImpl <em>Program Unit</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.jfom.impl.ProgramUnitImpl
	 * @see org.jfom.impl.JFOMPackageImpl#getProgramUnit()
	 * @generated
	 */
	int PROGRAM_UNIT = 39;

	/**
	 * The meta object id for the '{@link org.jfom.impl.MainProgramImpl <em>Main Program</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.jfom.impl.MainProgramImpl
	 * @see org.jfom.impl.JFOMPackageImpl#getMainProgram()
	 * @generated
	 */
	int MAIN_PROGRAM = 32;

	/**
	 * The meta object id for the '{@link org.jfom.impl.ModuleImpl <em>Module</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.jfom.impl.ModuleImpl
	 * @see org.jfom.impl.JFOMPackageImpl#getModule()
	 * @generated
	 */
	int MODULE = 33;

	/**
	 * The meta object id for the '{@link org.jfom.impl.SpecificationPartImpl <em>Specification Part</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.jfom.impl.SpecificationPartImpl
	 * @see org.jfom.impl.JFOMPackageImpl#getSpecificationPart()
	 * @generated
	 */
	int SPECIFICATION_PART = 42;

	/**
	 * The meta object id for the '{@link org.jfom.impl.ExecutionPartImpl <em>Execution Part</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.jfom.impl.ExecutionPartImpl
	 * @see org.jfom.impl.JFOMPackageImpl#getExecutionPart()
	 * @generated
	 */
	int EXECUTION_PART = 19;

	/**
	 * The meta object id for the '{@link org.jfom.impl.InternalSubprogramPartImpl <em>Internal Subprogram Part</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.jfom.impl.InternalSubprogramPartImpl
	 * @see org.jfom.impl.JFOMPackageImpl#getInternalSubprogramPart()
	 * @generated
	 */
	int INTERNAL_SUBPROGRAM_PART = 29;

	/**
	 * The meta object id for the '{@link org.jfom.impl.UseStatementImpl <em>Use Statement</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.jfom.impl.UseStatementImpl
	 * @see org.jfom.impl.JFOMPackageImpl#getUseStatement()
	 * @generated
	 */
	int USE_STATEMENT = 49;

	/**
	 * The meta object id for the '{@link org.jfom.impl.ImplicitPartImpl <em>Implicit Part</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.jfom.impl.ImplicitPartImpl
	 * @see org.jfom.impl.JFOMPackageImpl#getImplicitPart()
	 * @generated
	 */
	int IMPLICIT_PART = 25;

	/**
	 * The meta object id for the '{@link org.jfom.impl.DeclarationConstructImpl <em>Declaration Construct</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.jfom.impl.DeclarationConstructImpl
	 * @see org.jfom.impl.JFOMPackageImpl#getDeclarationConstruct()
	 * @generated
	 */
	int DECLARATION_CONSTRUCT = 11;

	/**
	 * The meta object id for the '{@link org.jfom.impl.ImplicitPartStatementImpl <em>Implicit Part Statement</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.jfom.impl.ImplicitPartStatementImpl
	 * @see org.jfom.impl.JFOMPackageImpl#getImplicitPartStatement()
	 * @generated
	 */
	int IMPLICIT_PART_STATEMENT = 26;

	/**
	 * The meta object id for the '{@link org.jfom.impl.ImplicitStatementImpl <em>Implicit Statement</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.jfom.impl.ImplicitStatementImpl
	 * @see org.jfom.impl.JFOMPackageImpl#getImplicitStatement()
	 * @generated
	 */
	int IMPLICIT_STATEMENT = 27;

	/**
	 * The meta object id for the '{@link org.jfom.impl.ExecutionPartConstructImpl <em>Execution Part Construct</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.jfom.impl.ExecutionPartConstructImpl
	 * @see org.jfom.impl.JFOMPackageImpl#getExecutionPartConstruct()
	 * @generated
	 */
	int EXECUTION_PART_CONSTRUCT = 20;

	/**
	 * The meta object id for the '{@link org.jfom.impl.ExecutableConstructImpl <em>Executable Construct</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.jfom.impl.ExecutableConstructImpl
	 * @see org.jfom.impl.JFOMPackageImpl#getExecutableConstruct()
	 * @generated
	 */
	int EXECUTABLE_CONSTRUCT = 18;

	/**
	 * The meta object id for the '{@link org.jfom.impl.DoConstructImpl <em>Do Construct</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.jfom.impl.DoConstructImpl
	 * @see org.jfom.impl.JFOMPackageImpl#getDoConstruct()
	 * @generated
	 */
	int DO_CONSTRUCT = 13;

	/**
	 * The meta object id for the '{@link org.jfom.impl.StringTemplateAdapterImpl <em>String Template Adapter</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.jfom.impl.StringTemplateAdapterImpl
	 * @see org.jfom.impl.JFOMPackageImpl#getStringTemplateAdapter()
	 * @generated
	 */
	int STRING_TEMPLATE_ADAPTER = 44;

	/**
	 * The feature id for the '<em><b>String Template</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRING_TEMPLATE_ADAPTER__STRING_TEMPLATE = 0;

	/**
	 * The number of structural features of the '<em>String Template Adapter</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRING_TEMPLATE_ADAPTER_FEATURE_COUNT = 1;

	/**
	 * The feature id for the '<em><b>String Template</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DECLARATION_CONSTRUCT__STRING_TEMPLATE = STRING_TEMPLATE_ADAPTER__STRING_TEMPLATE;

	/**
	 * The number of structural features of the '<em>Declaration Construct</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DECLARATION_CONSTRUCT_FEATURE_COUNT = STRING_TEMPLATE_ADAPTER_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.jfom.impl.SpecificationStatementImpl <em>Specification Statement</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.jfom.impl.SpecificationStatementImpl
	 * @see org.jfom.impl.JFOMPackageImpl#getSpecificationStatement()
	 * @generated
	 */
	int SPECIFICATION_STATEMENT = 43;

	/**
	 * The feature id for the '<em><b>String Template</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPECIFICATION_STATEMENT__STRING_TEMPLATE = DECLARATION_CONSTRUCT__STRING_TEMPLATE;

	/**
	 * The number of structural features of the '<em>Specification Statement</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPECIFICATION_STATEMENT_FEATURE_COUNT = DECLARATION_CONSTRUCT_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.jfom.impl.AccessStatementImpl <em>Access Statement</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.jfom.impl.AccessStatementImpl
	 * @see org.jfom.impl.JFOMPackageImpl#getAccessStatement()
	 * @generated
	 */
	int ACCESS_STATEMENT = 0;

	/**
	 * The feature id for the '<em><b>String Template</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACCESS_STATEMENT__STRING_TEMPLATE = SPECIFICATION_STATEMENT__STRING_TEMPLATE;

	/**
	 * The feature id for the '<em><b>Access Spec</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACCESS_STATEMENT__ACCESS_SPEC = SPECIFICATION_STATEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Access Identifier</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACCESS_STATEMENT__ACCESS_IDENTIFIER = SPECIFICATION_STATEMENT_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Access Statement</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACCESS_STATEMENT_FEATURE_COUNT = SPECIFICATION_STATEMENT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>String Template</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXECUTION_PART_CONSTRUCT__STRING_TEMPLATE = STRING_TEMPLATE_ADAPTER__STRING_TEMPLATE;

	/**
	 * The number of structural features of the '<em>Execution Part Construct</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXECUTION_PART_CONSTRUCT_FEATURE_COUNT = STRING_TEMPLATE_ADAPTER_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>String Template</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXECUTABLE_CONSTRUCT__STRING_TEMPLATE = EXECUTION_PART_CONSTRUCT__STRING_TEMPLATE;

	/**
	 * The number of structural features of the '<em>Executable Construct</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXECUTABLE_CONSTRUCT_FEATURE_COUNT = EXECUTION_PART_CONSTRUCT_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.antlr.stringtemplate.StringTemplate <em>EString Template</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.antlr.stringtemplate.StringTemplate
	 * @see org.jfom.impl.JFOMPackageImpl#getEStringTemplate()
	 * @generated
	 */
	int ESTRING_TEMPLATE = 17;

	/**
	 * The meta object id for the '{@link org.jfom.impl.ArbitraryTextConstructImpl <em>Arbitrary Text Construct</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.jfom.impl.ArbitraryTextConstructImpl
	 * @see org.jfom.impl.JFOMPackageImpl#getArbitraryTextConstruct()
	 * @generated
	 */
	int ARBITRARY_TEXT_CONSTRUCT = 3;

	/**
	 * The meta object id for the '{@link org.jfom.impl.ProgramStatementImpl <em>Program Statement</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.jfom.impl.ProgramStatementImpl
	 * @see org.jfom.impl.JFOMPackageImpl#getProgramStatement()
	 * @generated
	 */
	int PROGRAM_STATEMENT = 40;

	/**
	 * The meta object id for the '{@link org.jfom.impl.TypeDeclarationStatementImpl <em>Type Declaration Statement</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.jfom.impl.TypeDeclarationStatementImpl
	 * @see org.jfom.impl.JFOMPackageImpl#getTypeDeclarationStatement()
	 * @generated
	 */
	int TYPE_DECLARATION_STATEMENT = 47;

	/**
	 * The meta object id for the '{@link org.jfom.impl.TypeSpecImpl <em>Type Spec</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.jfom.impl.TypeSpecImpl
	 * @see org.jfom.impl.JFOMPackageImpl#getTypeSpec()
	 * @generated
	 */
	int TYPE_SPEC = 48;

	/**
	 * The meta object id for the '{@link org.jfom.impl.IntrinsicTypeSpecImpl <em>Intrinsic Type Spec</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.jfom.impl.IntrinsicTypeSpecImpl
	 * @see org.jfom.impl.JFOMPackageImpl#getIntrinsicTypeSpec()
	 * @generated
	 */
	int INTRINSIC_TYPE_SPEC = 30;

	/**
	 * The meta object id for the '{@link org.jfom.impl.DerivedTypeSpecImpl <em>Derived Type Spec</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.jfom.impl.DerivedTypeSpecImpl
	 * @see org.jfom.impl.JFOMPackageImpl#getDerivedTypeSpec()
	 * @generated
	 */
	int DERIVED_TYPE_SPEC = 12;

	/**
	 * The meta object id for the '{@link org.jfom.impl.ActionStatementImpl <em>Action Statement</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.jfom.impl.ActionStatementImpl
	 * @see org.jfom.impl.JFOMPackageImpl#getActionStatement()
	 * @generated
	 */
	int ACTION_STATEMENT = 1;

	/**
	 * The feature id for the '<em><b>String Template</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTION_STATEMENT__STRING_TEMPLATE = EXECUTABLE_CONSTRUCT__STRING_TEMPLATE;

	/**
	 * The number of structural features of the '<em>Action Statement</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTION_STATEMENT_FEATURE_COUNT = EXECUTABLE_CONSTRUCT_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.jfom.impl.CallStatementImpl <em>Call Statement</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.jfom.impl.CallStatementImpl
	 * @see org.jfom.impl.JFOMPackageImpl#getCallStatement()
	 * @generated
	 */
	int CALL_STATEMENT = 8;

	/**
	 * The meta object id for the '{@link org.jfom.impl.ActualArgumentSpecImpl <em>Actual Argument Spec</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.jfom.impl.ActualArgumentSpecImpl
	 * @see org.jfom.impl.JFOMPackageImpl#getActualArgumentSpec()
	 * @generated
	 */
	int ACTUAL_ARGUMENT_SPEC = 2;

	/**
	 * The feature id for the '<em><b>String Template</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTUAL_ARGUMENT_SPEC__STRING_TEMPLATE = STRING_TEMPLATE_ADAPTER__STRING_TEMPLATE;

	/**
	 * The feature id for the '<em><b>Keyword</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTUAL_ARGUMENT_SPEC__KEYWORD = STRING_TEMPLATE_ADAPTER_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Argument</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTUAL_ARGUMENT_SPEC__ARGUMENT = STRING_TEMPLATE_ADAPTER_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Actual Argument Spec</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTUAL_ARGUMENT_SPEC_FEATURE_COUNT = STRING_TEMPLATE_ADAPTER_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>String Template</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARBITRARY_TEXT_CONSTRUCT__STRING_TEMPLATE = EXECUTABLE_CONSTRUCT__STRING_TEMPLATE;

	/**
	 * The feature id for the '<em><b>Text</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARBITRARY_TEXT_CONSTRUCT__TEXT = EXECUTABLE_CONSTRUCT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Arbitrary Text Construct</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARBITRARY_TEXT_CONSTRUCT_FEATURE_COUNT = EXECUTABLE_CONSTRUCT_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link org.jfom.ArrayConstructorValue <em>Array Constructor Value</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.jfom.ArrayConstructorValue
	 * @see org.jfom.impl.JFOMPackageImpl#getArrayConstructorValue()
	 * @generated
	 */
	int ARRAY_CONSTRUCTOR_VALUE = 5;

	/**
	 * The feature id for the '<em><b>String Template</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARRAY_CONSTRUCTOR_VALUE__STRING_TEMPLATE = STRING_TEMPLATE_ADAPTER__STRING_TEMPLATE;

	/**
	 * The number of structural features of the '<em>Array Constructor Value</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARRAY_CONSTRUCTOR_VALUE_FEATURE_COUNT = STRING_TEMPLATE_ADAPTER_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.jfom.impl.IfStatementImpl <em>If Statement</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.jfom.impl.IfStatementImpl
	 * @see org.jfom.impl.JFOMPackageImpl#getIfStatement()
	 * @generated
	 */
	int IF_STATEMENT = 24;

	/**
	 * The meta object id for the '{@link org.jfom.impl.ExpressionImpl <em>Expression</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.jfom.impl.ExpressionImpl
	 * @see org.jfom.impl.JFOMPackageImpl#getExpression()
	 * @generated
	 */
	int EXPRESSION = 21;

	/**
	 * The meta object id for the '{@link org.jfom.impl.FunctionReferenceImpl <em>Function Reference</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.jfom.impl.FunctionReferenceImpl
	 * @see org.jfom.impl.JFOMPackageImpl#getFunctionReference()
	 * @generated
	 */
	int FUNCTION_REFERENCE = 22;

	/**
	 * The meta object id for the '{@link org.jfom.impl.EndProgramStatementImpl <em>End Program Statement</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.jfom.impl.EndProgramStatementImpl
	 * @see org.jfom.impl.JFOMPackageImpl#getEndProgramStatement()
	 * @generated
	 */
	int END_PROGRAM_STATEMENT = 15;

	/**
	 * The meta object id for the '{@link org.jfom.impl.AssignmentStatementImpl <em>Assignment Statement</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.jfom.impl.AssignmentStatementImpl
	 * @see org.jfom.impl.JFOMPackageImpl#getAssignmentStatement()
	 * @generated
	 */
	int ASSIGNMENT_STATEMENT = 6;

	/**
	 * The meta object id for the '{@link org.jfom.impl.AttrSpecImpl <em>Attr Spec</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.jfom.impl.AttrSpecImpl
	 * @see org.jfom.impl.JFOMPackageImpl#getAttrSpec()
	 * @generated
	 */
	int ATTR_SPEC = 7;

	/**
	 * The meta object id for the '{@link org.jfom.impl._SpacerImpl <em>Spacer</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.jfom.impl._SpacerImpl
	 * @see org.jfom.impl.JFOMPackageImpl#get_Spacer()
	 * @generated
	 */
	int _SPACER = 50;

	/**
	 * The meta object id for the '{@link org.jfom.AccessSpec <em>Access Spec</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.jfom.AccessSpec
	 * @see org.jfom.impl.JFOMPackageImpl#getAccessSpec()
	 * @generated
	 */
	int ACCESS_SPEC = 51;

	/**
	 * The meta object id for the '{@link org.jfom.IntentSpec <em>Intent Spec</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.jfom.IntentSpec
	 * @see org.jfom.impl.JFOMPackageImpl#getIntentSpec()
	 * @generated
	 */
	int INTENT_SPEC = 52;

	/**
	 * The meta object id for the '{@link org.jfom.impl.PrintStatementImpl <em>Print Statement</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.jfom.impl.PrintStatementImpl
	 * @see org.jfom.impl.JFOMPackageImpl#getPrintStatement()
	 * @generated
	 */
	int PRINT_STATEMENT = 38;

	/**
	 * The meta object id for the '{@link org.jfom.impl.ModuleStatementImpl <em>Module Statement</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.jfom.impl.ModuleStatementImpl
	 * @see org.jfom.impl.JFOMPackageImpl#getModuleStatement()
	 * @generated
	 */
	int MODULE_STATEMENT = 34;

	/**
	 * The meta object id for the '{@link org.jfom.impl.EndModuleStatementImpl <em>End Module Statement</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.jfom.impl.EndModuleStatementImpl
	 * @see org.jfom.impl.JFOMPackageImpl#getEndModuleStatement()
	 * @generated
	 */
	int END_MODULE_STATEMENT = 14;

	/**
	 * The meta object id for the '{@link org.jfom.impl.ModuleSubprogramPartImpl <em>Module Subprogram Part</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.jfom.impl.ModuleSubprogramPartImpl
	 * @see org.jfom.impl.JFOMPackageImpl#getModuleSubprogramPart()
	 * @generated
	 */
	int MODULE_SUBPROGRAM_PART = 36;

	/**
	 * The meta object id for the '{@link org.jfom.impl.ContainsStatementImpl <em>Contains Statement</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.jfom.impl.ContainsStatementImpl
	 * @see org.jfom.impl.JFOMPackageImpl#getContainsStatement()
	 * @generated
	 */
	int CONTAINS_STATEMENT = 10;

	/**
	 * The meta object id for the '{@link org.jfom.impl.ModuleSubprogramImpl <em>Module Subprogram</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.jfom.impl.ModuleSubprogramImpl
	 * @see org.jfom.impl.JFOMPackageImpl#getModuleSubprogram()
	 * @generated
	 */
	int MODULE_SUBPROGRAM = 35;

	/**
	 * The meta object id for the '{@link org.jfom.impl.FunctionSubprogramImpl <em>Function Subprogram</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.jfom.impl.FunctionSubprogramImpl
	 * @see org.jfom.impl.JFOMPackageImpl#getFunctionSubprogram()
	 * @generated
	 */
	int FUNCTION_SUBPROGRAM = 23;

	/**
	 * The meta object id for the '{@link org.jfom.impl.SubroutineSubprogramImpl <em>Subroutine Subprogram</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.jfom.impl.SubroutineSubprogramImpl
	 * @see org.jfom.impl.JFOMPackageImpl#getSubroutineSubprogram()
	 * @generated
	 */
	int SUBROUTINE_SUBPROGRAM = 46;

	/**
	 * The meta object id for the '{@link org.jfom.impl.SubroutineStatementImpl <em>Subroutine Statement</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.jfom.impl.SubroutineStatementImpl
	 * @see org.jfom.impl.JFOMPackageImpl#getSubroutineStatement()
	 * @generated
	 */
	int SUBROUTINE_STATEMENT = 45;

	/**
	 * The meta object id for the '{@link org.jfom.impl.EndSubroutineStatementImpl <em>End Subroutine Statement</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.jfom.impl.EndSubroutineStatementImpl
	 * @see org.jfom.impl.JFOMPackageImpl#getEndSubroutineStatement()
	 * @generated
	 */
	int END_SUBROUTINE_STATEMENT = 16;

	/**
	 * The feature id for the '<em><b>String Template</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXPRESSION__STRING_TEMPLATE = ARRAY_CONSTRUCTOR_VALUE__STRING_TEMPLATE;

	/**
	 * The number of structural features of the '<em>Expression</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXPRESSION_FEATURE_COUNT = ARRAY_CONSTRUCTOR_VALUE_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.jfom.impl.ArrayConstructorImpl <em>Array Constructor</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.jfom.impl.ArrayConstructorImpl
	 * @see org.jfom.impl.JFOMPackageImpl#getArrayConstructor()
	 * @generated
	 */
	int ARRAY_CONSTRUCTOR = 4;

	/**
	 * The feature id for the '<em><b>String Template</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARRAY_CONSTRUCTOR__STRING_TEMPLATE = EXPRESSION__STRING_TEMPLATE;

	/**
	 * The feature id for the '<em><b>Array Constructor Value</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARRAY_CONSTRUCTOR__ARRAY_CONSTRUCTOR_VALUE = EXPRESSION_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Array Constructor</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARRAY_CONSTRUCTOR_FEATURE_COUNT = EXPRESSION_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>String Template</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSIGNMENT_STATEMENT__STRING_TEMPLATE = ACTION_STATEMENT__STRING_TEMPLATE;

	/**
	 * The feature id for the '<em><b>Variable</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSIGNMENT_STATEMENT__VARIABLE = ACTION_STATEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Expression</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSIGNMENT_STATEMENT__EXPRESSION = ACTION_STATEMENT_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Assignment Statement</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSIGNMENT_STATEMENT_FEATURE_COUNT = ACTION_STATEMENT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>String Template</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTR_SPEC__STRING_TEMPLATE = STRING_TEMPLATE_ADAPTER__STRING_TEMPLATE;

	/**
	 * The number of structural features of the '<em>Attr Spec</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTR_SPEC_FEATURE_COUNT = STRING_TEMPLATE_ADAPTER_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>String Template</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALL_STATEMENT__STRING_TEMPLATE = ACTION_STATEMENT__STRING_TEMPLATE;

	/**
	 * The feature id for the '<em><b>Subroutine Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALL_STATEMENT__SUBROUTINE_NAME = ACTION_STATEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Actual Argument</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALL_STATEMENT__ACTUAL_ARGUMENT = ACTION_STATEMENT_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Call Statement</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALL_STATEMENT_FEATURE_COUNT = ACTION_STATEMENT_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link org.jfom.impl.ConstantImpl <em>Constant</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.jfom.impl.ConstantImpl
	 * @see org.jfom.impl.JFOMPackageImpl#getConstant()
	 * @generated
	 */
	int CONSTANT = 9;

	/**
	 * The feature id for the '<em><b>String Template</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONSTANT__STRING_TEMPLATE = EXPRESSION__STRING_TEMPLATE;

	/**
	 * The number of structural features of the '<em>Constant</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONSTANT_FEATURE_COUNT = EXPRESSION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>String Template</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTAINS_STATEMENT__STRING_TEMPLATE = STRING_TEMPLATE_ADAPTER__STRING_TEMPLATE;

	/**
	 * The number of structural features of the '<em>Contains Statement</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTAINS_STATEMENT_FEATURE_COUNT = STRING_TEMPLATE_ADAPTER_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>String Template</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TYPE_SPEC__STRING_TEMPLATE = STRING_TEMPLATE_ADAPTER__STRING_TEMPLATE;

	/**
	 * The number of structural features of the '<em>Type Spec</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TYPE_SPEC_FEATURE_COUNT = STRING_TEMPLATE_ADAPTER_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>String Template</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DERIVED_TYPE_SPEC__STRING_TEMPLATE = TYPE_SPEC__STRING_TEMPLATE;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DERIVED_TYPE_SPEC__TYPE = TYPE_SPEC_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Derived Type Spec</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DERIVED_TYPE_SPEC_FEATURE_COUNT = TYPE_SPEC_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>String Template</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DO_CONSTRUCT__STRING_TEMPLATE = EXECUTABLE_CONSTRUCT__STRING_TEMPLATE;

	/**
	 * The feature id for the '<em><b>Do Variable</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DO_CONSTRUCT__DO_VARIABLE = EXECUTABLE_CONSTRUCT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Start</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DO_CONSTRUCT__START = EXECUTABLE_CONSTRUCT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>End</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DO_CONSTRUCT__END = EXECUTABLE_CONSTRUCT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Execution Part Construct</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DO_CONSTRUCT__EXECUTION_PART_CONSTRUCT = EXECUTABLE_CONSTRUCT_FEATURE_COUNT + 3;

	/**
	 * The number of structural features of the '<em>Do Construct</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DO_CONSTRUCT_FEATURE_COUNT = EXECUTABLE_CONSTRUCT_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>String Template</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int END_MODULE_STATEMENT__STRING_TEMPLATE = STRING_TEMPLATE_ADAPTER__STRING_TEMPLATE;

	/**
	 * The feature id for the '<em><b>Module Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int END_MODULE_STATEMENT__MODULE_NAME = STRING_TEMPLATE_ADAPTER_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>End Module Statement</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int END_MODULE_STATEMENT_FEATURE_COUNT = STRING_TEMPLATE_ADAPTER_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>String Template</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int END_PROGRAM_STATEMENT__STRING_TEMPLATE = STRING_TEMPLATE_ADAPTER__STRING_TEMPLATE;

	/**
	 * The feature id for the '<em><b>Program Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int END_PROGRAM_STATEMENT__PROGRAM_NAME = STRING_TEMPLATE_ADAPTER_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>End Program Statement</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int END_PROGRAM_STATEMENT_FEATURE_COUNT = STRING_TEMPLATE_ADAPTER_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>String Template</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int END_SUBROUTINE_STATEMENT__STRING_TEMPLATE = STRING_TEMPLATE_ADAPTER__STRING_TEMPLATE;

	/**
	 * The feature id for the '<em><b>Subroutine Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int END_SUBROUTINE_STATEMENT__SUBROUTINE_NAME = STRING_TEMPLATE_ADAPTER_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>End Subroutine Statement</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int END_SUBROUTINE_STATEMENT_FEATURE_COUNT = STRING_TEMPLATE_ADAPTER_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>EAnnotations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ESTRING_TEMPLATE__EANNOTATIONS = EcorePackage.EDATA_TYPE__EANNOTATIONS;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ESTRING_TEMPLATE__NAME = EcorePackage.EDATA_TYPE__NAME;

	/**
	 * The feature id for the '<em><b>Instance Class Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ESTRING_TEMPLATE__INSTANCE_CLASS_NAME = EcorePackage.EDATA_TYPE__INSTANCE_CLASS_NAME;

	/**
	 * The feature id for the '<em><b>Instance Class</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ESTRING_TEMPLATE__INSTANCE_CLASS = EcorePackage.EDATA_TYPE__INSTANCE_CLASS;

	/**
	 * The feature id for the '<em><b>Default Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ESTRING_TEMPLATE__DEFAULT_VALUE = EcorePackage.EDATA_TYPE__DEFAULT_VALUE;

	/**
	 * The feature id for the '<em><b>Instance Type Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ESTRING_TEMPLATE__INSTANCE_TYPE_NAME = EcorePackage.EDATA_TYPE__INSTANCE_TYPE_NAME;

	/**
	 * The feature id for the '<em><b>EPackage</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ESTRING_TEMPLATE__EPACKAGE = EcorePackage.EDATA_TYPE__EPACKAGE;

	/**
	 * The feature id for the '<em><b>EType Parameters</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ESTRING_TEMPLATE__ETYPE_PARAMETERS = EcorePackage.EDATA_TYPE__ETYPE_PARAMETERS;

	/**
	 * The feature id for the '<em><b>Serializable</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ESTRING_TEMPLATE__SERIALIZABLE = EcorePackage.EDATA_TYPE__SERIALIZABLE;

	/**
	 * The number of structural features of the '<em>EString Template</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ESTRING_TEMPLATE_FEATURE_COUNT = EcorePackage.EDATA_TYPE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>String Template</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXECUTION_PART__STRING_TEMPLATE = STRING_TEMPLATE_ADAPTER__STRING_TEMPLATE;

	/**
	 * The feature id for the '<em><b>Execution Part Construct</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXECUTION_PART__EXECUTION_PART_CONSTRUCT = STRING_TEMPLATE_ADAPTER_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Execution Part</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXECUTION_PART_FEATURE_COUNT = STRING_TEMPLATE_ADAPTER_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>String Template</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUNCTION_REFERENCE__STRING_TEMPLATE = EXPRESSION__STRING_TEMPLATE;

	/**
	 * The feature id for the '<em><b>Function Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUNCTION_REFERENCE__FUNCTION_NAME = EXPRESSION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Actual Argument</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUNCTION_REFERENCE__ACTUAL_ARGUMENT = EXPRESSION_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Function Reference</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUNCTION_REFERENCE_FEATURE_COUNT = EXPRESSION_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>String Template</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODULE_SUBPROGRAM__STRING_TEMPLATE = STRING_TEMPLATE_ADAPTER__STRING_TEMPLATE;

	/**
	 * The number of structural features of the '<em>Module Subprogram</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODULE_SUBPROGRAM_FEATURE_COUNT = STRING_TEMPLATE_ADAPTER_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>String Template</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUNCTION_SUBPROGRAM__STRING_TEMPLATE = MODULE_SUBPROGRAM__STRING_TEMPLATE;

	/**
	 * The number of structural features of the '<em>Function Subprogram</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUNCTION_SUBPROGRAM_FEATURE_COUNT = MODULE_SUBPROGRAM_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>String Template</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IF_STATEMENT__STRING_TEMPLATE = ACTION_STATEMENT__STRING_TEMPLATE;

	/**
	 * The feature id for the '<em><b>Test</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IF_STATEMENT__TEST = ACTION_STATEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Action</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IF_STATEMENT__ACTION = ACTION_STATEMENT_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>If Statement</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IF_STATEMENT_FEATURE_COUNT = ACTION_STATEMENT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>String Template</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMPLICIT_PART__STRING_TEMPLATE = STRING_TEMPLATE_ADAPTER__STRING_TEMPLATE;

	/**
	 * The feature id for the '<em><b>Implicit Part Statement</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMPLICIT_PART__IMPLICIT_PART_STATEMENT = STRING_TEMPLATE_ADAPTER_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Implicit Part</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMPLICIT_PART_FEATURE_COUNT = STRING_TEMPLATE_ADAPTER_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>String Template</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMPLICIT_PART_STATEMENT__STRING_TEMPLATE = STRING_TEMPLATE_ADAPTER__STRING_TEMPLATE;

	/**
	 * The number of structural features of the '<em>Implicit Part Statement</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMPLICIT_PART_STATEMENT_FEATURE_COUNT = STRING_TEMPLATE_ADAPTER_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>String Template</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMPLICIT_STATEMENT__STRING_TEMPLATE = IMPLICIT_PART_STATEMENT__STRING_TEMPLATE;

	/**
	 * The feature id for the '<em><b>Implicit Spec List</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMPLICIT_STATEMENT__IMPLICIT_SPEC_LIST = IMPLICIT_PART_STATEMENT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Implicit Statement</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMPLICIT_STATEMENT_FEATURE_COUNT = IMPLICIT_PART_STATEMENT_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link org.jfom.impl.IntentAttrSpecImpl <em>Intent Attr Spec</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.jfom.impl.IntentAttrSpecImpl
	 * @see org.jfom.impl.JFOMPackageImpl#getIntentAttrSpec()
	 * @generated
	 */
	int INTENT_ATTR_SPEC = 28;

	/**
	 * The feature id for the '<em><b>String Template</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTENT_ATTR_SPEC__STRING_TEMPLATE = ATTR_SPEC__STRING_TEMPLATE;

	/**
	 * The feature id for the '<em><b>Intent Spec</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTENT_ATTR_SPEC__INTENT_SPEC = ATTR_SPEC_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Intent Attr Spec</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTENT_ATTR_SPEC_FEATURE_COUNT = ATTR_SPEC_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Internal Subprogram Part</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERNAL_SUBPROGRAM_PART_FEATURE_COUNT = 0;

	/**
	 * The feature id for the '<em><b>String Template</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTRINSIC_TYPE_SPEC__STRING_TEMPLATE = TYPE_SPEC__STRING_TEMPLATE;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTRINSIC_TYPE_SPEC__TYPE = TYPE_SPEC_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Intrinsic Type Spec</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTRINSIC_TYPE_SPEC_FEATURE_COUNT = TYPE_SPEC_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link org.jfom.impl.LiteralConstantImpl <em>Literal Constant</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.jfom.impl.LiteralConstantImpl
	 * @see org.jfom.impl.JFOMPackageImpl#getLiteralConstant()
	 * @generated
	 */
	int LITERAL_CONSTANT = 31;

	/**
	 * The feature id for the '<em><b>String Template</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LITERAL_CONSTANT__STRING_TEMPLATE = CONSTANT__STRING_TEMPLATE;

	/**
	 * The feature id for the '<em><b>Literal</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LITERAL_CONSTANT__LITERAL = CONSTANT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Literal Constant</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LITERAL_CONSTANT_FEATURE_COUNT = CONSTANT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>String Template</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROGRAM_UNIT__STRING_TEMPLATE = STRING_TEMPLATE_ADAPTER__STRING_TEMPLATE;

	/**
	 * The number of structural features of the '<em>Program Unit</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROGRAM_UNIT_FEATURE_COUNT = STRING_TEMPLATE_ADAPTER_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>String Template</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAIN_PROGRAM__STRING_TEMPLATE = PROGRAM_UNIT__STRING_TEMPLATE;

	/**
	 * The feature id for the '<em><b>Program Statement</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAIN_PROGRAM__PROGRAM_STATEMENT = PROGRAM_UNIT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Specification Part</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAIN_PROGRAM__SPECIFICATION_PART = PROGRAM_UNIT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Execution Part</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAIN_PROGRAM__EXECUTION_PART = PROGRAM_UNIT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Internal Subprogram Part</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAIN_PROGRAM__INTERNAL_SUBPROGRAM_PART = PROGRAM_UNIT_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>End Program Statement</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAIN_PROGRAM__END_PROGRAM_STATEMENT = PROGRAM_UNIT_FEATURE_COUNT + 4;

	/**
	 * The number of structural features of the '<em>Main Program</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAIN_PROGRAM_FEATURE_COUNT = PROGRAM_UNIT_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>String Template</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODULE__STRING_TEMPLATE = PROGRAM_UNIT__STRING_TEMPLATE;

	/**
	 * The feature id for the '<em><b>Module Statement</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODULE__MODULE_STATEMENT = PROGRAM_UNIT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Specification Part</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODULE__SPECIFICATION_PART = PROGRAM_UNIT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Module Subprogram Part</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODULE__MODULE_SUBPROGRAM_PART = PROGRAM_UNIT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>End Module Statement</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODULE__END_MODULE_STATEMENT = PROGRAM_UNIT_FEATURE_COUNT + 3;

	/**
	 * The number of structural features of the '<em>Module</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODULE_FEATURE_COUNT = PROGRAM_UNIT_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>String Template</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODULE_STATEMENT__STRING_TEMPLATE = STRING_TEMPLATE_ADAPTER__STRING_TEMPLATE;

	/**
	 * The feature id for the '<em><b>Module Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODULE_STATEMENT__MODULE_NAME = STRING_TEMPLATE_ADAPTER_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Module Statement</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODULE_STATEMENT_FEATURE_COUNT = STRING_TEMPLATE_ADAPTER_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>String Template</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODULE_SUBPROGRAM_PART__STRING_TEMPLATE = STRING_TEMPLATE_ADAPTER__STRING_TEMPLATE;

	/**
	 * The feature id for the '<em><b>Contains Statement</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODULE_SUBPROGRAM_PART__CONTAINS_STATEMENT = STRING_TEMPLATE_ADAPTER_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Module Subprogram</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODULE_SUBPROGRAM_PART__MODULE_SUBPROGRAM = STRING_TEMPLATE_ADAPTER_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Module Subprogram Part</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODULE_SUBPROGRAM_PART_FEATURE_COUNT = STRING_TEMPLATE_ADAPTER_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link org.jfom.impl.NamedConstantImpl <em>Named Constant</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.jfom.impl.NamedConstantImpl
	 * @see org.jfom.impl.JFOMPackageImpl#getNamedConstant()
	 * @generated
	 */
	int NAMED_CONSTANT = 37;

	/**
	 * The feature id for the '<em><b>String Template</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NAMED_CONSTANT__STRING_TEMPLATE = CONSTANT__STRING_TEMPLATE;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NAMED_CONSTANT__NAME = CONSTANT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Named Constant</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NAMED_CONSTANT_FEATURE_COUNT = CONSTANT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>String Template</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRINT_STATEMENT__STRING_TEMPLATE = ACTION_STATEMENT__STRING_TEMPLATE;

	/**
	 * The feature id for the '<em><b>Format</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRINT_STATEMENT__FORMAT = ACTION_STATEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Output Item</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRINT_STATEMENT__OUTPUT_ITEM = ACTION_STATEMENT_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Print Statement</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRINT_STATEMENT_FEATURE_COUNT = ACTION_STATEMENT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>String Template</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROGRAM_STATEMENT__STRING_TEMPLATE = STRING_TEMPLATE_ADAPTER__STRING_TEMPLATE;

	/**
	 * The feature id for the '<em><b>Program Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROGRAM_STATEMENT__PROGRAM_NAME = STRING_TEMPLATE_ADAPTER_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Program Statement</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROGRAM_STATEMENT_FEATURE_COUNT = STRING_TEMPLATE_ADAPTER_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link org.jfom.impl.SaveAttrSpecImpl <em>Save Attr Spec</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.jfom.impl.SaveAttrSpecImpl
	 * @see org.jfom.impl.JFOMPackageImpl#getSaveAttrSpec()
	 * @generated
	 */
	int SAVE_ATTR_SPEC = 41;

	/**
	 * The feature id for the '<em><b>String Template</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SAVE_ATTR_SPEC__STRING_TEMPLATE = ATTR_SPEC__STRING_TEMPLATE;

	/**
	 * The number of structural features of the '<em>Save Attr Spec</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SAVE_ATTR_SPEC_FEATURE_COUNT = ATTR_SPEC_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>String Template</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPECIFICATION_PART__STRING_TEMPLATE = STRING_TEMPLATE_ADAPTER__STRING_TEMPLATE;

	/**
	 * The feature id for the '<em><b>Use Statement</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPECIFICATION_PART__USE_STATEMENT = STRING_TEMPLATE_ADAPTER_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Implicit Part</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPECIFICATION_PART__IMPLICIT_PART = STRING_TEMPLATE_ADAPTER_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Declaration Construct</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPECIFICATION_PART__DECLARATION_CONSTRUCT = STRING_TEMPLATE_ADAPTER_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Specification Part</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPECIFICATION_PART_FEATURE_COUNT = STRING_TEMPLATE_ADAPTER_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>String Template</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUBROUTINE_STATEMENT__STRING_TEMPLATE = STRING_TEMPLATE_ADAPTER__STRING_TEMPLATE;

	/**
	 * The feature id for the '<em><b>Subroutine Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUBROUTINE_STATEMENT__SUBROUTINE_NAME = STRING_TEMPLATE_ADAPTER_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Formal Argument</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUBROUTINE_STATEMENT__FORMAL_ARGUMENT = STRING_TEMPLATE_ADAPTER_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Subroutine Statement</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUBROUTINE_STATEMENT_FEATURE_COUNT = STRING_TEMPLATE_ADAPTER_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>String Template</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUBROUTINE_SUBPROGRAM__STRING_TEMPLATE = MODULE_SUBPROGRAM__STRING_TEMPLATE;

	/**
	 * The feature id for the '<em><b>Subroutine Statement</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUBROUTINE_SUBPROGRAM__SUBROUTINE_STATEMENT = MODULE_SUBPROGRAM_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Specification Part</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUBROUTINE_SUBPROGRAM__SPECIFICATION_PART = MODULE_SUBPROGRAM_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Execution Part</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUBROUTINE_SUBPROGRAM__EXECUTION_PART = MODULE_SUBPROGRAM_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Internal Subprogram Part</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUBROUTINE_SUBPROGRAM__INTERNAL_SUBPROGRAM_PART = MODULE_SUBPROGRAM_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>End Subroutine Statement</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUBROUTINE_SUBPROGRAM__END_SUBROUTINE_STATEMENT = MODULE_SUBPROGRAM_FEATURE_COUNT + 4;

	/**
	 * The number of structural features of the '<em>Subroutine Subprogram</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUBROUTINE_SUBPROGRAM_FEATURE_COUNT = MODULE_SUBPROGRAM_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>String Template</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TYPE_DECLARATION_STATEMENT__STRING_TEMPLATE = DECLARATION_CONSTRUCT__STRING_TEMPLATE;

	/**
	 * The feature id for the '<em><b>Type Spec</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TYPE_DECLARATION_STATEMENT__TYPE_SPEC = DECLARATION_CONSTRUCT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Attr Spec</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TYPE_DECLARATION_STATEMENT__ATTR_SPEC = DECLARATION_CONSTRUCT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Entity Declaration</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TYPE_DECLARATION_STATEMENT__ENTITY_DECLARATION = DECLARATION_CONSTRUCT_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Type Declaration Statement</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TYPE_DECLARATION_STATEMENT_FEATURE_COUNT = DECLARATION_CONSTRUCT_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>String Template</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USE_STATEMENT__STRING_TEMPLATE = STRING_TEMPLATE_ADAPTER__STRING_TEMPLATE;

	/**
	 * The feature id for the '<em><b>Module Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USE_STATEMENT__MODULE_NAME = STRING_TEMPLATE_ADAPTER_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Rename List</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USE_STATEMENT__RENAME_LIST = STRING_TEMPLATE_ADAPTER_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Use Statement</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USE_STATEMENT_FEATURE_COUNT = STRING_TEMPLATE_ADAPTER_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>String Template</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int _SPACER__STRING_TEMPLATE = EXECUTION_PART_CONSTRUCT__STRING_TEMPLATE;

	/**
	 * The number of structural features of the '<em>Spacer</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int _SPACER_FEATURE_COUNT = EXECUTION_PART_CONSTRUCT_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.jfom.IntrinsicType <em>Intrinsic Type</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.jfom.IntrinsicType
	 * @see org.jfom.impl.JFOMPackageImpl#getIntrinsicType()
	 * @generated
	 */
	int INTRINSIC_TYPE = 53;


	/**
	 * Returns the meta object for class '{@link org.jfom.AccessStatement <em>Access Statement</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Access Statement</em>'.
	 * @see org.jfom.AccessStatement
	 * @generated
	 */
	EClass getAccessStatement();

	/**
	 * Returns the meta object for the attribute '{@link org.jfom.AccessStatement#getAccessSpec <em>Access Spec</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Access Spec</em>'.
	 * @see org.jfom.AccessStatement#getAccessSpec()
	 * @see #getAccessStatement()
	 * @generated
	 */
	EAttribute getAccessStatement_AccessSpec();

	/**
	 * Returns the meta object for the attribute list '{@link org.jfom.AccessStatement#getAccessIdentifier <em>Access Identifier</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Access Identifier</em>'.
	 * @see org.jfom.AccessStatement#getAccessIdentifier()
	 * @see #getAccessStatement()
	 * @generated
	 */
	EAttribute getAccessStatement_AccessIdentifier();

	/**
	 * Returns the meta object for class '{@link org.jfom.ProgramUnit <em>Program Unit</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Program Unit</em>'.
	 * @see org.jfom.ProgramUnit
	 * @generated
	 */
	EClass getProgramUnit();

	/**
	 * Returns the meta object for class '{@link org.jfom.MainProgram <em>Main Program</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Main Program</em>'.
	 * @see org.jfom.MainProgram
	 * @generated
	 */
	EClass getMainProgram();

	/**
	 * Returns the meta object for the containment reference '{@link org.jfom.MainProgram#getProgramStatement <em>Program Statement</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Program Statement</em>'.
	 * @see org.jfom.MainProgram#getProgramStatement()
	 * @see #getMainProgram()
	 * @generated
	 */
	EReference getMainProgram_ProgramStatement();

	/**
	 * Returns the meta object for the containment reference '{@link org.jfom.MainProgram#getSpecificationPart <em>Specification Part</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Specification Part</em>'.
	 * @see org.jfom.MainProgram#getSpecificationPart()
	 * @see #getMainProgram()
	 * @generated
	 */
	EReference getMainProgram_SpecificationPart();

	/**
	 * Returns the meta object for the containment reference '{@link org.jfom.MainProgram#getExecutionPart <em>Execution Part</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Execution Part</em>'.
	 * @see org.jfom.MainProgram#getExecutionPart()
	 * @see #getMainProgram()
	 * @generated
	 */
	EReference getMainProgram_ExecutionPart();

	/**
	 * Returns the meta object for the reference '{@link org.jfom.MainProgram#getInternalSubprogramPart <em>Internal Subprogram Part</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Internal Subprogram Part</em>'.
	 * @see org.jfom.MainProgram#getInternalSubprogramPart()
	 * @see #getMainProgram()
	 * @generated
	 */
	EReference getMainProgram_InternalSubprogramPart();

	/**
	 * Returns the meta object for the containment reference '{@link org.jfom.MainProgram#getEndProgramStatement <em>End Program Statement</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>End Program Statement</em>'.
	 * @see org.jfom.MainProgram#getEndProgramStatement()
	 * @see #getMainProgram()
	 * @generated
	 */
	EReference getMainProgram_EndProgramStatement();

	/**
	 * Returns the meta object for class '{@link org.jfom.Module <em>Module</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Module</em>'.
	 * @see org.jfom.Module
	 * @generated
	 */
	EClass getModule();

	/**
	 * Returns the meta object for the containment reference '{@link org.jfom.Module#getModuleStatement <em>Module Statement</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Module Statement</em>'.
	 * @see org.jfom.Module#getModuleStatement()
	 * @see #getModule()
	 * @generated
	 */
	EReference getModule_ModuleStatement();

	/**
	 * Returns the meta object for the containment reference '{@link org.jfom.Module#getSpecificationPart <em>Specification Part</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Specification Part</em>'.
	 * @see org.jfom.Module#getSpecificationPart()
	 * @see #getModule()
	 * @generated
	 */
	EReference getModule_SpecificationPart();

	/**
	 * Returns the meta object for the containment reference '{@link org.jfom.Module#getModuleSubprogramPart <em>Module Subprogram Part</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Module Subprogram Part</em>'.
	 * @see org.jfom.Module#getModuleSubprogramPart()
	 * @see #getModule()
	 * @generated
	 */
	EReference getModule_ModuleSubprogramPart();

	/**
	 * Returns the meta object for the containment reference '{@link org.jfom.Module#getEndModuleStatement <em>End Module Statement</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>End Module Statement</em>'.
	 * @see org.jfom.Module#getEndModuleStatement()
	 * @see #getModule()
	 * @generated
	 */
	EReference getModule_EndModuleStatement();

	/**
	 * Returns the meta object for class '{@link org.jfom.SpecificationPart <em>Specification Part</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Specification Part</em>'.
	 * @see org.jfom.SpecificationPart
	 * @generated
	 */
	EClass getSpecificationPart();

	/**
	 * Returns the meta object for the containment reference list '{@link org.jfom.SpecificationPart#getUseStatement <em>Use Statement</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Use Statement</em>'.
	 * @see org.jfom.SpecificationPart#getUseStatement()
	 * @see #getSpecificationPart()
	 * @generated
	 */
	EReference getSpecificationPart_UseStatement();

	/**
	 * Returns the meta object for the containment reference '{@link org.jfom.SpecificationPart#getImplicitPart <em>Implicit Part</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Implicit Part</em>'.
	 * @see org.jfom.SpecificationPart#getImplicitPart()
	 * @see #getSpecificationPart()
	 * @generated
	 */
	EReference getSpecificationPart_ImplicitPart();

	/**
	 * Returns the meta object for the containment reference list '{@link org.jfom.SpecificationPart#getDeclarationConstruct <em>Declaration Construct</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Declaration Construct</em>'.
	 * @see org.jfom.SpecificationPart#getDeclarationConstruct()
	 * @see #getSpecificationPart()
	 * @generated
	 */
	EReference getSpecificationPart_DeclarationConstruct();

	/**
	 * Returns the meta object for class '{@link org.jfom.SpecificationStatement <em>Specification Statement</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Specification Statement</em>'.
	 * @see org.jfom.SpecificationStatement
	 * @generated
	 */
	EClass getSpecificationStatement();

	/**
	 * Returns the meta object for class '{@link org.jfom.ExecutionPart <em>Execution Part</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Execution Part</em>'.
	 * @see org.jfom.ExecutionPart
	 * @generated
	 */
	EClass getExecutionPart();

	/**
	 * Returns the meta object for the containment reference list '{@link org.jfom.ExecutionPart#getExecutionPartConstruct <em>Execution Part Construct</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Execution Part Construct</em>'.
	 * @see org.jfom.ExecutionPart#getExecutionPartConstruct()
	 * @see #getExecutionPart()
	 * @generated
	 */
	EReference getExecutionPart_ExecutionPartConstruct();

	/**
	 * Returns the meta object for class '{@link org.jfom.InternalSubprogramPart <em>Internal Subprogram Part</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Internal Subprogram Part</em>'.
	 * @see org.jfom.InternalSubprogramPart
	 * @generated
	 */
	EClass getInternalSubprogramPart();

	/**
	 * Returns the meta object for class '{@link org.jfom.UseStatement <em>Use Statement</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Use Statement</em>'.
	 * @see org.jfom.UseStatement
	 * @generated
	 */
	EClass getUseStatement();

	/**
	 * Returns the meta object for the attribute '{@link org.jfom.UseStatement#getModuleName <em>Module Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Module Name</em>'.
	 * @see org.jfom.UseStatement#getModuleName()
	 * @see #getUseStatement()
	 * @generated
	 */
	EAttribute getUseStatement_ModuleName();

	/**
	 * Returns the meta object for the attribute '{@link org.jfom.UseStatement#getRenameList <em>Rename List</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Rename List</em>'.
	 * @see org.jfom.UseStatement#getRenameList()
	 * @see #getUseStatement()
	 * @generated
	 */
	EAttribute getUseStatement_RenameList();

	/**
	 * Returns the meta object for class '{@link org.jfom.ImplicitPart <em>Implicit Part</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Implicit Part</em>'.
	 * @see org.jfom.ImplicitPart
	 * @generated
	 */
	EClass getImplicitPart();

	/**
	 * Returns the meta object for the containment reference list '{@link org.jfom.ImplicitPart#getImplicitPartStatement <em>Implicit Part Statement</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Implicit Part Statement</em>'.
	 * @see org.jfom.ImplicitPart#getImplicitPartStatement()
	 * @see #getImplicitPart()
	 * @generated
	 */
	EReference getImplicitPart_ImplicitPartStatement();

	/**
	 * Returns the meta object for class '{@link org.jfom.DeclarationConstruct <em>Declaration Construct</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Declaration Construct</em>'.
	 * @see org.jfom.DeclarationConstruct
	 * @generated
	 */
	EClass getDeclarationConstruct();

	/**
	 * Returns the meta object for class '{@link org.jfom.ImplicitStatement <em>Implicit Statement</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Implicit Statement</em>'.
	 * @see org.jfom.ImplicitStatement
	 * @generated
	 */
	EClass getImplicitStatement();

	/**
	 * Returns the meta object for the attribute '{@link org.jfom.ImplicitStatement#getImplicitSpecList <em>Implicit Spec List</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Implicit Spec List</em>'.
	 * @see org.jfom.ImplicitStatement#getImplicitSpecList()
	 * @see #getImplicitStatement()
	 * @generated
	 */
	EAttribute getImplicitStatement_ImplicitSpecList();

	/**
	 * Returns the meta object for class '{@link org.jfom.IntentAttrSpec <em>Intent Attr Spec</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Intent Attr Spec</em>'.
	 * @see org.jfom.IntentAttrSpec
	 * @generated
	 */
	EClass getIntentAttrSpec();

	/**
	 * Returns the meta object for the attribute '{@link org.jfom.IntentAttrSpec#getIntentSpec <em>Intent Spec</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Intent Spec</em>'.
	 * @see org.jfom.IntentAttrSpec#getIntentSpec()
	 * @see #getIntentAttrSpec()
	 * @generated
	 */
	EAttribute getIntentAttrSpec_IntentSpec();

	/**
	 * Returns the meta object for class '{@link org.jfom.ImplicitPartStatement <em>Implicit Part Statement</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Implicit Part Statement</em>'.
	 * @see org.jfom.ImplicitPartStatement
	 * @generated
	 */
	EClass getImplicitPartStatement();

	/**
	 * Returns the meta object for class '{@link org.jfom.ExecutionPartConstruct <em>Execution Part Construct</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Execution Part Construct</em>'.
	 * @see org.jfom.ExecutionPartConstruct
	 * @generated
	 */
	EClass getExecutionPartConstruct();

	/**
	 * Returns the meta object for class '{@link org.jfom.ExecutableConstruct <em>Executable Construct</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Executable Construct</em>'.
	 * @see org.jfom.ExecutableConstruct
	 * @generated
	 */
	EClass getExecutableConstruct();

	/**
	 * Returns the meta object for class '{@link org.jfom.DoConstruct <em>Do Construct</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Do Construct</em>'.
	 * @see org.jfom.DoConstruct
	 * @generated
	 */
	EClass getDoConstruct();

	/**
	 * Returns the meta object for the attribute '{@link org.jfom.DoConstruct#getDoVariable <em>Do Variable</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Do Variable</em>'.
	 * @see org.jfom.DoConstruct#getDoVariable()
	 * @see #getDoConstruct()
	 * @generated
	 */
	EAttribute getDoConstruct_DoVariable();

	/**
	 * Returns the meta object for the attribute '{@link org.jfom.DoConstruct#getStart <em>Start</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Start</em>'.
	 * @see org.jfom.DoConstruct#getStart()
	 * @see #getDoConstruct()
	 * @generated
	 */
	EAttribute getDoConstruct_Start();

	/**
	 * Returns the meta object for the attribute '{@link org.jfom.DoConstruct#getEnd <em>End</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>End</em>'.
	 * @see org.jfom.DoConstruct#getEnd()
	 * @see #getDoConstruct()
	 * @generated
	 */
	EAttribute getDoConstruct_End();

	/**
	 * Returns the meta object for the containment reference list '{@link org.jfom.DoConstruct#getExecutionPartConstruct <em>Execution Part Construct</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Execution Part Construct</em>'.
	 * @see org.jfom.DoConstruct#getExecutionPartConstruct()
	 * @see #getDoConstruct()
	 * @generated
	 */
	EReference getDoConstruct_ExecutionPartConstruct();

	/**
	 * Returns the meta object for class '{@link org.jfom.StringTemplateAdapter <em>String Template Adapter</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>String Template Adapter</em>'.
	 * @see org.jfom.StringTemplateAdapter
	 * @generated
	 */
	EClass getStringTemplateAdapter();

	/**
	 * Returns the meta object for the containment reference '{@link org.jfom.StringTemplateAdapter#getStringTemplate <em>String Template</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>String Template</em>'.
	 * @see org.jfom.StringTemplateAdapter#getStringTemplate()
	 * @see #getStringTemplateAdapter()
	 * @generated
	 */
	EReference getStringTemplateAdapter_StringTemplate();

	/**
	 * Returns the meta object for class '{@link org.jfom.EndProgramStatement <em>End Program Statement</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>End Program Statement</em>'.
	 * @see org.jfom.EndProgramStatement
	 * @generated
	 */
	EClass getEndProgramStatement();

	/**
	 * Returns the meta object for the attribute '{@link org.jfom.EndProgramStatement#getProgramName <em>Program Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Program Name</em>'.
	 * @see org.jfom.EndProgramStatement#getProgramName()
	 * @see #getEndProgramStatement()
	 * @generated
	 */
	EAttribute getEndProgramStatement_ProgramName();

	/**
	 * Returns the meta object for class '{@link org.jfom.AssignmentStatement <em>Assignment Statement</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Assignment Statement</em>'.
	 * @see org.jfom.AssignmentStatement
	 * @generated
	 */
	EClass getAssignmentStatement();

	/**
	 * Returns the meta object for the attribute '{@link org.jfom.AssignmentStatement#getVariable <em>Variable</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Variable</em>'.
	 * @see org.jfom.AssignmentStatement#getVariable()
	 * @see #getAssignmentStatement()
	 * @generated
	 */
	EAttribute getAssignmentStatement_Variable();

	/**
	 * Returns the meta object for the containment reference '{@link org.jfom.AssignmentStatement#getExpression <em>Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Expression</em>'.
	 * @see org.jfom.AssignmentStatement#getExpression()
	 * @see #getAssignmentStatement()
	 * @generated
	 */
	EReference getAssignmentStatement_Expression();

	/**
	 * Returns the meta object for class '{@link org.jfom.AttrSpec <em>Attr Spec</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Attr Spec</em>'.
	 * @see org.jfom.AttrSpec
	 * @generated
	 */
	EClass getAttrSpec();

	/**
	 * Returns the meta object for class '{@link org.jfom._Spacer <em>Spacer</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Spacer</em>'.
	 * @see org.jfom._Spacer
	 * @generated
	 */
	EClass get_Spacer();

	/**
	 * Returns the meta object for enum '{@link org.jfom.AccessSpec <em>Access Spec</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Access Spec</em>'.
	 * @see org.jfom.AccessSpec
	 * @generated
	 */
	EEnum getAccessSpec();

	/**
	 * Returns the meta object for enum '{@link org.jfom.IntentSpec <em>Intent Spec</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Intent Spec</em>'.
	 * @see org.jfom.IntentSpec
	 * @generated
	 */
	EEnum getIntentSpec();

	/**
	 * Returns the meta object for class '{@link org.jfom.PrintStatement <em>Print Statement</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Print Statement</em>'.
	 * @see org.jfom.PrintStatement
	 * @generated
	 */
	EClass getPrintStatement();

	/**
	 * Returns the meta object for the attribute '{@link org.jfom.PrintStatement#getFormat <em>Format</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Format</em>'.
	 * @see org.jfom.PrintStatement#getFormat()
	 * @see #getPrintStatement()
	 * @generated
	 */
	EAttribute getPrintStatement_Format();

	/**
	 * Returns the meta object for the attribute list '{@link org.jfom.PrintStatement#getOutputItem <em>Output Item</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Output Item</em>'.
	 * @see org.jfom.PrintStatement#getOutputItem()
	 * @see #getPrintStatement()
	 * @generated
	 */
	EAttribute getPrintStatement_OutputItem();

	/**
	 * Returns the meta object for class '{@link org.jfom.ModuleStatement <em>Module Statement</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Module Statement</em>'.
	 * @see org.jfom.ModuleStatement
	 * @generated
	 */
	EClass getModuleStatement();

	/**
	 * Returns the meta object for the attribute '{@link org.jfom.ModuleStatement#getModuleName <em>Module Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Module Name</em>'.
	 * @see org.jfom.ModuleStatement#getModuleName()
	 * @see #getModuleStatement()
	 * @generated
	 */
	EAttribute getModuleStatement_ModuleName();

	/**
	 * Returns the meta object for class '{@link org.jfom.EndModuleStatement <em>End Module Statement</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>End Module Statement</em>'.
	 * @see org.jfom.EndModuleStatement
	 * @generated
	 */
	EClass getEndModuleStatement();

	/**
	 * Returns the meta object for the attribute '{@link org.jfom.EndModuleStatement#getModuleName <em>Module Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Module Name</em>'.
	 * @see org.jfom.EndModuleStatement#getModuleName()
	 * @see #getEndModuleStatement()
	 * @generated
	 */
	EAttribute getEndModuleStatement_ModuleName();

	/**
	 * Returns the meta object for class '{@link org.jfom.ModuleSubprogramPart <em>Module Subprogram Part</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Module Subprogram Part</em>'.
	 * @see org.jfom.ModuleSubprogramPart
	 * @generated
	 */
	EClass getModuleSubprogramPart();

	/**
	 * Returns the meta object for the containment reference '{@link org.jfom.ModuleSubprogramPart#getContainsStatement <em>Contains Statement</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Contains Statement</em>'.
	 * @see org.jfom.ModuleSubprogramPart#getContainsStatement()
	 * @see #getModuleSubprogramPart()
	 * @generated
	 */
	EReference getModuleSubprogramPart_ContainsStatement();

	/**
	 * Returns the meta object for the containment reference list '{@link org.jfom.ModuleSubprogramPart#getModuleSubprogram <em>Module Subprogram</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Module Subprogram</em>'.
	 * @see org.jfom.ModuleSubprogramPart#getModuleSubprogram()
	 * @see #getModuleSubprogramPart()
	 * @generated
	 */
	EReference getModuleSubprogramPart_ModuleSubprogram();

	/**
	 * Returns the meta object for class '{@link org.jfom.NamedConstant <em>Named Constant</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Named Constant</em>'.
	 * @see org.jfom.NamedConstant
	 * @generated
	 */
	EClass getNamedConstant();

	/**
	 * Returns the meta object for the attribute '{@link org.jfom.NamedConstant#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see org.jfom.NamedConstant#getName()
	 * @see #getNamedConstant()
	 * @generated
	 */
	EAttribute getNamedConstant_Name();

	/**
	 * Returns the meta object for class '{@link org.jfom.ContainsStatement <em>Contains Statement</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Contains Statement</em>'.
	 * @see org.jfom.ContainsStatement
	 * @generated
	 */
	EClass getContainsStatement();

	/**
	 * Returns the meta object for class '{@link org.jfom.ModuleSubprogram <em>Module Subprogram</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Module Subprogram</em>'.
	 * @see org.jfom.ModuleSubprogram
	 * @generated
	 */
	EClass getModuleSubprogram();

	/**
	 * Returns the meta object for class '{@link org.jfom.FunctionSubprogram <em>Function Subprogram</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Function Subprogram</em>'.
	 * @see org.jfom.FunctionSubprogram
	 * @generated
	 */
	EClass getFunctionSubprogram();

	/**
	 * Returns the meta object for class '{@link org.jfom.SubroutineSubprogram <em>Subroutine Subprogram</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Subroutine Subprogram</em>'.
	 * @see org.jfom.SubroutineSubprogram
	 * @generated
	 */
	EClass getSubroutineSubprogram();

	/**
	 * Returns the meta object for the containment reference '{@link org.jfom.SubroutineSubprogram#getSubroutineStatement <em>Subroutine Statement</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Subroutine Statement</em>'.
	 * @see org.jfom.SubroutineSubprogram#getSubroutineStatement()
	 * @see #getSubroutineSubprogram()
	 * @generated
	 */
	EReference getSubroutineSubprogram_SubroutineStatement();

	/**
	 * Returns the meta object for the containment reference '{@link org.jfom.SubroutineSubprogram#getSpecificationPart <em>Specification Part</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Specification Part</em>'.
	 * @see org.jfom.SubroutineSubprogram#getSpecificationPart()
	 * @see #getSubroutineSubprogram()
	 * @generated
	 */
	EReference getSubroutineSubprogram_SpecificationPart();

	/**
	 * Returns the meta object for the containment reference '{@link org.jfom.SubroutineSubprogram#getExecutionPart <em>Execution Part</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Execution Part</em>'.
	 * @see org.jfom.SubroutineSubprogram#getExecutionPart()
	 * @see #getSubroutineSubprogram()
	 * @generated
	 */
	EReference getSubroutineSubprogram_ExecutionPart();

	/**
	 * Returns the meta object for the reference '{@link org.jfom.SubroutineSubprogram#getInternalSubprogramPart <em>Internal Subprogram Part</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Internal Subprogram Part</em>'.
	 * @see org.jfom.SubroutineSubprogram#getInternalSubprogramPart()
	 * @see #getSubroutineSubprogram()
	 * @generated
	 */
	EReference getSubroutineSubprogram_InternalSubprogramPart();

	/**
	 * Returns the meta object for the containment reference '{@link org.jfom.SubroutineSubprogram#getEndSubroutineStatement <em>End Subroutine Statement</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>End Subroutine Statement</em>'.
	 * @see org.jfom.SubroutineSubprogram#getEndSubroutineStatement()
	 * @see #getSubroutineSubprogram()
	 * @generated
	 */
	EReference getSubroutineSubprogram_EndSubroutineStatement();

	/**
	 * Returns the meta object for class '{@link org.jfom.SubroutineStatement <em>Subroutine Statement</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Subroutine Statement</em>'.
	 * @see org.jfom.SubroutineStatement
	 * @generated
	 */
	EClass getSubroutineStatement();

	/**
	 * Returns the meta object for the attribute '{@link org.jfom.SubroutineStatement#getSubroutineName <em>Subroutine Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Subroutine Name</em>'.
	 * @see org.jfom.SubroutineStatement#getSubroutineName()
	 * @see #getSubroutineStatement()
	 * @generated
	 */
	EAttribute getSubroutineStatement_SubroutineName();

	/**
	 * Returns the meta object for the attribute list '{@link org.jfom.SubroutineStatement#getFormalArgument <em>Formal Argument</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Formal Argument</em>'.
	 * @see org.jfom.SubroutineStatement#getFormalArgument()
	 * @see #getSubroutineStatement()
	 * @generated
	 */
	EAttribute getSubroutineStatement_FormalArgument();

	/**
	 * Returns the meta object for class '{@link org.jfom.EndSubroutineStatement <em>End Subroutine Statement</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>End Subroutine Statement</em>'.
	 * @see org.jfom.EndSubroutineStatement
	 * @generated
	 */
	EClass getEndSubroutineStatement();

	/**
	 * Returns the meta object for the attribute '{@link org.jfom.EndSubroutineStatement#getSubroutineName <em>Subroutine Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Subroutine Name</em>'.
	 * @see org.jfom.EndSubroutineStatement#getSubroutineName()
	 * @see #getEndSubroutineStatement()
	 * @generated
	 */
	EAttribute getEndSubroutineStatement_SubroutineName();

	/**
	 * Returns the meta object for class '{@link org.antlr.stringtemplate.StringTemplate <em>EString Template</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>EString Template</em>'.
	 * @see org.antlr.stringtemplate.StringTemplate
	 * @model instanceClass="org.antlr.stringtemplate.StringTemplate"
	 * @generated
	 */
	EClass getEStringTemplate();

	/**
	 * Returns the meta object for class '{@link org.jfom.ArbitraryTextConstruct <em>Arbitrary Text Construct</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Arbitrary Text Construct</em>'.
	 * @see org.jfom.ArbitraryTextConstruct
	 * @generated
	 */
	EClass getArbitraryTextConstruct();

	/**
	 * Returns the meta object for the attribute '{@link org.jfom.ArbitraryTextConstruct#getText <em>Text</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Text</em>'.
	 * @see org.jfom.ArbitraryTextConstruct#getText()
	 * @see #getArbitraryTextConstruct()
	 * @generated
	 */
	EAttribute getArbitraryTextConstruct_Text();

	/**
	 * Returns the meta object for class '{@link org.jfom.ArrayConstructor <em>Array Constructor</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Array Constructor</em>'.
	 * @see org.jfom.ArrayConstructor
	 * @generated
	 */
	EClass getArrayConstructor();

	/**
	 * Returns the meta object for the containment reference list '{@link org.jfom.ArrayConstructor#getArrayConstructorValue <em>Array Constructor Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Array Constructor Value</em>'.
	 * @see org.jfom.ArrayConstructor#getArrayConstructorValue()
	 * @see #getArrayConstructor()
	 * @generated
	 */
	EReference getArrayConstructor_ArrayConstructorValue();

	/**
	 * Returns the meta object for class '{@link org.jfom.ArrayConstructorValue <em>Array Constructor Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Array Constructor Value</em>'.
	 * @see org.jfom.ArrayConstructorValue
	 * @generated
	 */
	EClass getArrayConstructorValue();

	/**
	 * Returns the meta object for class '{@link org.jfom.ProgramStatement <em>Program Statement</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Program Statement</em>'.
	 * @see org.jfom.ProgramStatement
	 * @generated
	 */
	EClass getProgramStatement();

	/**
	 * Returns the meta object for the attribute '{@link org.jfom.ProgramStatement#getProgramName <em>Program Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Program Name</em>'.
	 * @see org.jfom.ProgramStatement#getProgramName()
	 * @see #getProgramStatement()
	 * @generated
	 */
	EAttribute getProgramStatement_ProgramName();

	/**
	 * Returns the meta object for class '{@link org.jfom.SaveAttrSpec <em>Save Attr Spec</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Save Attr Spec</em>'.
	 * @see org.jfom.SaveAttrSpec
	 * @generated
	 */
	EClass getSaveAttrSpec();

	/**
	 * Returns the meta object for class '{@link org.jfom.TypeDeclarationStatement <em>Type Declaration Statement</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Type Declaration Statement</em>'.
	 * @see org.jfom.TypeDeclarationStatement
	 * @generated
	 */
	EClass getTypeDeclarationStatement();

	/**
	 * Returns the meta object for the containment reference '{@link org.jfom.TypeDeclarationStatement#getTypeSpec <em>Type Spec</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Type Spec</em>'.
	 * @see org.jfom.TypeDeclarationStatement#getTypeSpec()
	 * @see #getTypeDeclarationStatement()
	 * @generated
	 */
	EReference getTypeDeclarationStatement_TypeSpec();

	/**
	 * Returns the meta object for the containment reference list '{@link org.jfom.TypeDeclarationStatement#getAttrSpec <em>Attr Spec</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Attr Spec</em>'.
	 * @see org.jfom.TypeDeclarationStatement#getAttrSpec()
	 * @see #getTypeDeclarationStatement()
	 * @generated
	 */
	EReference getTypeDeclarationStatement_AttrSpec();

	/**
	 * Returns the meta object for the attribute list '{@link org.jfom.TypeDeclarationStatement#getEntityDeclaration <em>Entity Declaration</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Entity Declaration</em>'.
	 * @see org.jfom.TypeDeclarationStatement#getEntityDeclaration()
	 * @see #getTypeDeclarationStatement()
	 * @generated
	 */
	EAttribute getTypeDeclarationStatement_EntityDeclaration();

	/**
	 * Returns the meta object for class '{@link org.jfom.TypeSpec <em>Type Spec</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Type Spec</em>'.
	 * @see org.jfom.TypeSpec
	 * @generated
	 */
	EClass getTypeSpec();

	/**
	 * Returns the meta object for class '{@link org.jfom.IntrinsicTypeSpec <em>Intrinsic Type Spec</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Intrinsic Type Spec</em>'.
	 * @see org.jfom.IntrinsicTypeSpec
	 * @generated
	 */
	EClass getIntrinsicTypeSpec();

	/**
	 * Returns the meta object for the attribute '{@link org.jfom.IntrinsicTypeSpec#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Type</em>'.
	 * @see org.jfom.IntrinsicTypeSpec#getType()
	 * @see #getIntrinsicTypeSpec()
	 * @generated
	 */
	EAttribute getIntrinsicTypeSpec_Type();

	/**
	 * Returns the meta object for class '{@link org.jfom.LiteralConstant <em>Literal Constant</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Literal Constant</em>'.
	 * @see org.jfom.LiteralConstant
	 * @generated
	 */
	EClass getLiteralConstant();

	/**
	 * Returns the meta object for the attribute '{@link org.jfom.LiteralConstant#getLiteral <em>Literal</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Literal</em>'.
	 * @see org.jfom.LiteralConstant#getLiteral()
	 * @see #getLiteralConstant()
	 * @generated
	 */
	EAttribute getLiteralConstant_Literal();

	/**
	 * Returns the meta object for class '{@link org.jfom.DerivedTypeSpec <em>Derived Type Spec</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Derived Type Spec</em>'.
	 * @see org.jfom.DerivedTypeSpec
	 * @generated
	 */
	EClass getDerivedTypeSpec();

	/**
	 * Returns the meta object for the attribute '{@link org.jfom.DerivedTypeSpec#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Type</em>'.
	 * @see org.jfom.DerivedTypeSpec#getType()
	 * @see #getDerivedTypeSpec()
	 * @generated
	 */
	EAttribute getDerivedTypeSpec_Type();

	/**
	 * Returns the meta object for class '{@link org.jfom.ActionStatement <em>Action Statement</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Action Statement</em>'.
	 * @see org.jfom.ActionStatement
	 * @generated
	 */
	EClass getActionStatement();

	/**
	 * Returns the meta object for class '{@link org.jfom.CallStatement <em>Call Statement</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Call Statement</em>'.
	 * @see org.jfom.CallStatement
	 * @generated
	 */
	EClass getCallStatement();

	/**
	 * Returns the meta object for the attribute '{@link org.jfom.CallStatement#getSubroutineName <em>Subroutine Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Subroutine Name</em>'.
	 * @see org.jfom.CallStatement#getSubroutineName()
	 * @see #getCallStatement()
	 * @generated
	 */
	EAttribute getCallStatement_SubroutineName();

	/**
	 * Returns the meta object for the containment reference list '{@link org.jfom.CallStatement#getActualArgument <em>Actual Argument</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Actual Argument</em>'.
	 * @see org.jfom.CallStatement#getActualArgument()
	 * @see #getCallStatement()
	 * @generated
	 */
	EReference getCallStatement_ActualArgument();

	/**
	 * Returns the meta object for class '{@link org.jfom.Constant <em>Constant</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Constant</em>'.
	 * @see org.jfom.Constant
	 * @generated
	 */
	EClass getConstant();

	/**
	 * Returns the meta object for class '{@link org.jfom.ActualArgumentSpec <em>Actual Argument Spec</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Actual Argument Spec</em>'.
	 * @see org.jfom.ActualArgumentSpec
	 * @generated
	 */
	EClass getActualArgumentSpec();

	/**
	 * Returns the meta object for the attribute '{@link org.jfom.ActualArgumentSpec#getKeyword <em>Keyword</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Keyword</em>'.
	 * @see org.jfom.ActualArgumentSpec#getKeyword()
	 * @see #getActualArgumentSpec()
	 * @generated
	 */
	EAttribute getActualArgumentSpec_Keyword();

	/**
	 * Returns the meta object for the containment reference '{@link org.jfom.ActualArgumentSpec#getArgument <em>Argument</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Argument</em>'.
	 * @see org.jfom.ActualArgumentSpec#getArgument()
	 * @see #getActualArgumentSpec()
	 * @generated
	 */
	EReference getActualArgumentSpec_Argument();

	/**
	 * Returns the meta object for class '{@link org.jfom.IfStatement <em>If Statement</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>If Statement</em>'.
	 * @see org.jfom.IfStatement
	 * @generated
	 */
	EClass getIfStatement();

	/**
	 * Returns the meta object for the containment reference '{@link org.jfom.IfStatement#getTest <em>Test</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Test</em>'.
	 * @see org.jfom.IfStatement#getTest()
	 * @see #getIfStatement()
	 * @generated
	 */
	EReference getIfStatement_Test();

	/**
	 * Returns the meta object for the containment reference '{@link org.jfom.IfStatement#getAction <em>Action</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Action</em>'.
	 * @see org.jfom.IfStatement#getAction()
	 * @see #getIfStatement()
	 * @generated
	 */
	EReference getIfStatement_Action();

	/**
	 * Returns the meta object for class '{@link org.jfom.Expression <em>Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Expression</em>'.
	 * @see org.jfom.Expression
	 * @generated
	 */
	EClass getExpression();

	/**
	 * Returns the meta object for class '{@link org.jfom.FunctionReference <em>Function Reference</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Function Reference</em>'.
	 * @see org.jfom.FunctionReference
	 * @generated
	 */
	EClass getFunctionReference();

	/**
	 * Returns the meta object for the attribute '{@link org.jfom.FunctionReference#getFunctionName <em>Function Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Function Name</em>'.
	 * @see org.jfom.FunctionReference#getFunctionName()
	 * @see #getFunctionReference()
	 * @generated
	 */
	EAttribute getFunctionReference_FunctionName();

	/**
	 * Returns the meta object for the containment reference list '{@link org.jfom.FunctionReference#getActualArgument <em>Actual Argument</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Actual Argument</em>'.
	 * @see org.jfom.FunctionReference#getActualArgument()
	 * @see #getFunctionReference()
	 * @generated
	 */
	EReference getFunctionReference_ActualArgument();

	/**
	 * Returns the meta object for enum '{@link org.jfom.IntrinsicType <em>Intrinsic Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Intrinsic Type</em>'.
	 * @see org.jfom.IntrinsicType
	 * @generated
	 */
	EEnum getIntrinsicType();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	JFOMFactory getJFOMFactory();

	/**
	 * <!-- begin-user-doc -->
	 * Defines literals for the meta objects that represent
	 * <ul>
	 *   <li>each class,</li>
	 *   <li>each feature of each class,</li>
	 *   <li>each enum,</li>
	 *   <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
	 * @generated
	 */
	interface Literals {
		/**
		 * The meta object literal for the '{@link org.jfom.impl.AccessStatementImpl <em>Access Statement</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.jfom.impl.AccessStatementImpl
		 * @see org.jfom.impl.JFOMPackageImpl#getAccessStatement()
		 * @generated
		 */
		EClass ACCESS_STATEMENT = eINSTANCE.getAccessStatement();

		/**
		 * The meta object literal for the '<em><b>Access Spec</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ACCESS_STATEMENT__ACCESS_SPEC = eINSTANCE.getAccessStatement_AccessSpec();

		/**
		 * The meta object literal for the '<em><b>Access Identifier</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ACCESS_STATEMENT__ACCESS_IDENTIFIER = eINSTANCE.getAccessStatement_AccessIdentifier();

		/**
		 * The meta object literal for the '{@link org.jfom.impl.ProgramUnitImpl <em>Program Unit</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.jfom.impl.ProgramUnitImpl
		 * @see org.jfom.impl.JFOMPackageImpl#getProgramUnit()
		 * @generated
		 */
		EClass PROGRAM_UNIT = eINSTANCE.getProgramUnit();

		/**
		 * The meta object literal for the '{@link org.jfom.impl.MainProgramImpl <em>Main Program</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.jfom.impl.MainProgramImpl
		 * @see org.jfom.impl.JFOMPackageImpl#getMainProgram()
		 * @generated
		 */
		EClass MAIN_PROGRAM = eINSTANCE.getMainProgram();

		/**
		 * The meta object literal for the '<em><b>Program Statement</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MAIN_PROGRAM__PROGRAM_STATEMENT = eINSTANCE.getMainProgram_ProgramStatement();

		/**
		 * The meta object literal for the '<em><b>Specification Part</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MAIN_PROGRAM__SPECIFICATION_PART = eINSTANCE.getMainProgram_SpecificationPart();

		/**
		 * The meta object literal for the '<em><b>Execution Part</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MAIN_PROGRAM__EXECUTION_PART = eINSTANCE.getMainProgram_ExecutionPart();

		/**
		 * The meta object literal for the '<em><b>Internal Subprogram Part</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MAIN_PROGRAM__INTERNAL_SUBPROGRAM_PART = eINSTANCE.getMainProgram_InternalSubprogramPart();

		/**
		 * The meta object literal for the '<em><b>End Program Statement</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MAIN_PROGRAM__END_PROGRAM_STATEMENT = eINSTANCE.getMainProgram_EndProgramStatement();

		/**
		 * The meta object literal for the '{@link org.jfom.impl.ModuleImpl <em>Module</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.jfom.impl.ModuleImpl
		 * @see org.jfom.impl.JFOMPackageImpl#getModule()
		 * @generated
		 */
		EClass MODULE = eINSTANCE.getModule();

		/**
		 * The meta object literal for the '<em><b>Module Statement</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MODULE__MODULE_STATEMENT = eINSTANCE.getModule_ModuleStatement();

		/**
		 * The meta object literal for the '<em><b>Specification Part</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MODULE__SPECIFICATION_PART = eINSTANCE.getModule_SpecificationPart();

		/**
		 * The meta object literal for the '<em><b>Module Subprogram Part</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MODULE__MODULE_SUBPROGRAM_PART = eINSTANCE.getModule_ModuleSubprogramPart();

		/**
		 * The meta object literal for the '<em><b>End Module Statement</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MODULE__END_MODULE_STATEMENT = eINSTANCE.getModule_EndModuleStatement();

		/**
		 * The meta object literal for the '{@link org.jfom.impl.SpecificationPartImpl <em>Specification Part</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.jfom.impl.SpecificationPartImpl
		 * @see org.jfom.impl.JFOMPackageImpl#getSpecificationPart()
		 * @generated
		 */
		EClass SPECIFICATION_PART = eINSTANCE.getSpecificationPart();

		/**
		 * The meta object literal for the '<em><b>Use Statement</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SPECIFICATION_PART__USE_STATEMENT = eINSTANCE.getSpecificationPart_UseStatement();

		/**
		 * The meta object literal for the '<em><b>Implicit Part</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SPECIFICATION_PART__IMPLICIT_PART = eINSTANCE.getSpecificationPart_ImplicitPart();

		/**
		 * The meta object literal for the '<em><b>Declaration Construct</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SPECIFICATION_PART__DECLARATION_CONSTRUCT = eINSTANCE.getSpecificationPart_DeclarationConstruct();

		/**
		 * The meta object literal for the '{@link org.jfom.impl.SpecificationStatementImpl <em>Specification Statement</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.jfom.impl.SpecificationStatementImpl
		 * @see org.jfom.impl.JFOMPackageImpl#getSpecificationStatement()
		 * @generated
		 */
		EClass SPECIFICATION_STATEMENT = eINSTANCE.getSpecificationStatement();

		/**
		 * The meta object literal for the '{@link org.jfom.impl.ExecutionPartImpl <em>Execution Part</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.jfom.impl.ExecutionPartImpl
		 * @see org.jfom.impl.JFOMPackageImpl#getExecutionPart()
		 * @generated
		 */
		EClass EXECUTION_PART = eINSTANCE.getExecutionPart();

		/**
		 * The meta object literal for the '<em><b>Execution Part Construct</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference EXECUTION_PART__EXECUTION_PART_CONSTRUCT = eINSTANCE.getExecutionPart_ExecutionPartConstruct();

		/**
		 * The meta object literal for the '{@link org.jfom.impl.InternalSubprogramPartImpl <em>Internal Subprogram Part</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.jfom.impl.InternalSubprogramPartImpl
		 * @see org.jfom.impl.JFOMPackageImpl#getInternalSubprogramPart()
		 * @generated
		 */
		EClass INTERNAL_SUBPROGRAM_PART = eINSTANCE.getInternalSubprogramPart();

		/**
		 * The meta object literal for the '{@link org.jfom.impl.UseStatementImpl <em>Use Statement</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.jfom.impl.UseStatementImpl
		 * @see org.jfom.impl.JFOMPackageImpl#getUseStatement()
		 * @generated
		 */
		EClass USE_STATEMENT = eINSTANCE.getUseStatement();

		/**
		 * The meta object literal for the '<em><b>Module Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute USE_STATEMENT__MODULE_NAME = eINSTANCE.getUseStatement_ModuleName();

		/**
		 * The meta object literal for the '<em><b>Rename List</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute USE_STATEMENT__RENAME_LIST = eINSTANCE.getUseStatement_RenameList();

		/**
		 * The meta object literal for the '{@link org.jfom.impl.ImplicitPartImpl <em>Implicit Part</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.jfom.impl.ImplicitPartImpl
		 * @see org.jfom.impl.JFOMPackageImpl#getImplicitPart()
		 * @generated
		 */
		EClass IMPLICIT_PART = eINSTANCE.getImplicitPart();

		/**
		 * The meta object literal for the '<em><b>Implicit Part Statement</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference IMPLICIT_PART__IMPLICIT_PART_STATEMENT = eINSTANCE.getImplicitPart_ImplicitPartStatement();

		/**
		 * The meta object literal for the '{@link org.jfom.impl.DeclarationConstructImpl <em>Declaration Construct</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.jfom.impl.DeclarationConstructImpl
		 * @see org.jfom.impl.JFOMPackageImpl#getDeclarationConstruct()
		 * @generated
		 */
		EClass DECLARATION_CONSTRUCT = eINSTANCE.getDeclarationConstruct();

		/**
		 * The meta object literal for the '{@link org.jfom.impl.ImplicitStatementImpl <em>Implicit Statement</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.jfom.impl.ImplicitStatementImpl
		 * @see org.jfom.impl.JFOMPackageImpl#getImplicitStatement()
		 * @generated
		 */
		EClass IMPLICIT_STATEMENT = eINSTANCE.getImplicitStatement();

		/**
		 * The meta object literal for the '<em><b>Implicit Spec List</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute IMPLICIT_STATEMENT__IMPLICIT_SPEC_LIST = eINSTANCE.getImplicitStatement_ImplicitSpecList();

		/**
		 * The meta object literal for the '{@link org.jfom.impl.IntentAttrSpecImpl <em>Intent Attr Spec</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.jfom.impl.IntentAttrSpecImpl
		 * @see org.jfom.impl.JFOMPackageImpl#getIntentAttrSpec()
		 * @generated
		 */
		EClass INTENT_ATTR_SPEC = eINSTANCE.getIntentAttrSpec();

		/**
		 * The meta object literal for the '<em><b>Intent Spec</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute INTENT_ATTR_SPEC__INTENT_SPEC = eINSTANCE.getIntentAttrSpec_IntentSpec();

		/**
		 * The meta object literal for the '{@link org.jfom.impl.ImplicitPartStatementImpl <em>Implicit Part Statement</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.jfom.impl.ImplicitPartStatementImpl
		 * @see org.jfom.impl.JFOMPackageImpl#getImplicitPartStatement()
		 * @generated
		 */
		EClass IMPLICIT_PART_STATEMENT = eINSTANCE.getImplicitPartStatement();

		/**
		 * The meta object literal for the '{@link org.jfom.impl.ExecutionPartConstructImpl <em>Execution Part Construct</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.jfom.impl.ExecutionPartConstructImpl
		 * @see org.jfom.impl.JFOMPackageImpl#getExecutionPartConstruct()
		 * @generated
		 */
		EClass EXECUTION_PART_CONSTRUCT = eINSTANCE.getExecutionPartConstruct();

		/**
		 * The meta object literal for the '{@link org.jfom.impl.ExecutableConstructImpl <em>Executable Construct</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.jfom.impl.ExecutableConstructImpl
		 * @see org.jfom.impl.JFOMPackageImpl#getExecutableConstruct()
		 * @generated
		 */
		EClass EXECUTABLE_CONSTRUCT = eINSTANCE.getExecutableConstruct();

		/**
		 * The meta object literal for the '{@link org.jfom.impl.DoConstructImpl <em>Do Construct</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.jfom.impl.DoConstructImpl
		 * @see org.jfom.impl.JFOMPackageImpl#getDoConstruct()
		 * @generated
		 */
		EClass DO_CONSTRUCT = eINSTANCE.getDoConstruct();

		/**
		 * The meta object literal for the '<em><b>Do Variable</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DO_CONSTRUCT__DO_VARIABLE = eINSTANCE.getDoConstruct_DoVariable();

		/**
		 * The meta object literal for the '<em><b>Start</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DO_CONSTRUCT__START = eINSTANCE.getDoConstruct_Start();

		/**
		 * The meta object literal for the '<em><b>End</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DO_CONSTRUCT__END = eINSTANCE.getDoConstruct_End();

		/**
		 * The meta object literal for the '<em><b>Execution Part Construct</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DO_CONSTRUCT__EXECUTION_PART_CONSTRUCT = eINSTANCE.getDoConstruct_ExecutionPartConstruct();

		/**
		 * The meta object literal for the '{@link org.jfom.impl.StringTemplateAdapterImpl <em>String Template Adapter</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.jfom.impl.StringTemplateAdapterImpl
		 * @see org.jfom.impl.JFOMPackageImpl#getStringTemplateAdapter()
		 * @generated
		 */
		EClass STRING_TEMPLATE_ADAPTER = eINSTANCE.getStringTemplateAdapter();

		/**
		 * The meta object literal for the '<em><b>String Template</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference STRING_TEMPLATE_ADAPTER__STRING_TEMPLATE = eINSTANCE.getStringTemplateAdapter_StringTemplate();

		/**
		 * The meta object literal for the '{@link org.jfom.impl.EndProgramStatementImpl <em>End Program Statement</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.jfom.impl.EndProgramStatementImpl
		 * @see org.jfom.impl.JFOMPackageImpl#getEndProgramStatement()
		 * @generated
		 */
		EClass END_PROGRAM_STATEMENT = eINSTANCE.getEndProgramStatement();

		/**
		 * The meta object literal for the '<em><b>Program Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute END_PROGRAM_STATEMENT__PROGRAM_NAME = eINSTANCE.getEndProgramStatement_ProgramName();

		/**
		 * The meta object literal for the '{@link org.jfom.impl.AssignmentStatementImpl <em>Assignment Statement</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.jfom.impl.AssignmentStatementImpl
		 * @see org.jfom.impl.JFOMPackageImpl#getAssignmentStatement()
		 * @generated
		 */
		EClass ASSIGNMENT_STATEMENT = eINSTANCE.getAssignmentStatement();

		/**
		 * The meta object literal for the '<em><b>Variable</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ASSIGNMENT_STATEMENT__VARIABLE = eINSTANCE.getAssignmentStatement_Variable();

		/**
		 * The meta object literal for the '<em><b>Expression</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ASSIGNMENT_STATEMENT__EXPRESSION = eINSTANCE.getAssignmentStatement_Expression();

		/**
		 * The meta object literal for the '{@link org.jfom.impl.AttrSpecImpl <em>Attr Spec</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.jfom.impl.AttrSpecImpl
		 * @see org.jfom.impl.JFOMPackageImpl#getAttrSpec()
		 * @generated
		 */
		EClass ATTR_SPEC = eINSTANCE.getAttrSpec();

		/**
		 * The meta object literal for the '{@link org.jfom.impl._SpacerImpl <em>Spacer</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.jfom.impl._SpacerImpl
		 * @see org.jfom.impl.JFOMPackageImpl#get_Spacer()
		 * @generated
		 */
		EClass _SPACER = eINSTANCE.get_Spacer();

		/**
		 * The meta object literal for the '{@link org.jfom.AccessSpec <em>Access Spec</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.jfom.AccessSpec
		 * @see org.jfom.impl.JFOMPackageImpl#getAccessSpec()
		 * @generated
		 */
		EEnum ACCESS_SPEC = eINSTANCE.getAccessSpec();

		/**
		 * The meta object literal for the '{@link org.jfom.IntentSpec <em>Intent Spec</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.jfom.IntentSpec
		 * @see org.jfom.impl.JFOMPackageImpl#getIntentSpec()
		 * @generated
		 */
		EEnum INTENT_SPEC = eINSTANCE.getIntentSpec();

		/**
		 * The meta object literal for the '{@link org.jfom.impl.PrintStatementImpl <em>Print Statement</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.jfom.impl.PrintStatementImpl
		 * @see org.jfom.impl.JFOMPackageImpl#getPrintStatement()
		 * @generated
		 */
		EClass PRINT_STATEMENT = eINSTANCE.getPrintStatement();

		/**
		 * The meta object literal for the '<em><b>Format</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PRINT_STATEMENT__FORMAT = eINSTANCE.getPrintStatement_Format();

		/**
		 * The meta object literal for the '<em><b>Output Item</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PRINT_STATEMENT__OUTPUT_ITEM = eINSTANCE.getPrintStatement_OutputItem();

		/**
		 * The meta object literal for the '{@link org.jfom.impl.ModuleStatementImpl <em>Module Statement</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.jfom.impl.ModuleStatementImpl
		 * @see org.jfom.impl.JFOMPackageImpl#getModuleStatement()
		 * @generated
		 */
		EClass MODULE_STATEMENT = eINSTANCE.getModuleStatement();

		/**
		 * The meta object literal for the '<em><b>Module Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MODULE_STATEMENT__MODULE_NAME = eINSTANCE.getModuleStatement_ModuleName();

		/**
		 * The meta object literal for the '{@link org.jfom.impl.EndModuleStatementImpl <em>End Module Statement</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.jfom.impl.EndModuleStatementImpl
		 * @see org.jfom.impl.JFOMPackageImpl#getEndModuleStatement()
		 * @generated
		 */
		EClass END_MODULE_STATEMENT = eINSTANCE.getEndModuleStatement();

		/**
		 * The meta object literal for the '<em><b>Module Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute END_MODULE_STATEMENT__MODULE_NAME = eINSTANCE.getEndModuleStatement_ModuleName();

		/**
		 * The meta object literal for the '{@link org.jfom.impl.ModuleSubprogramPartImpl <em>Module Subprogram Part</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.jfom.impl.ModuleSubprogramPartImpl
		 * @see org.jfom.impl.JFOMPackageImpl#getModuleSubprogramPart()
		 * @generated
		 */
		EClass MODULE_SUBPROGRAM_PART = eINSTANCE.getModuleSubprogramPart();

		/**
		 * The meta object literal for the '<em><b>Contains Statement</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MODULE_SUBPROGRAM_PART__CONTAINS_STATEMENT = eINSTANCE.getModuleSubprogramPart_ContainsStatement();

		/**
		 * The meta object literal for the '<em><b>Module Subprogram</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MODULE_SUBPROGRAM_PART__MODULE_SUBPROGRAM = eINSTANCE.getModuleSubprogramPart_ModuleSubprogram();

		/**
		 * The meta object literal for the '{@link org.jfom.impl.NamedConstantImpl <em>Named Constant</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.jfom.impl.NamedConstantImpl
		 * @see org.jfom.impl.JFOMPackageImpl#getNamedConstant()
		 * @generated
		 */
		EClass NAMED_CONSTANT = eINSTANCE.getNamedConstant();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute NAMED_CONSTANT__NAME = eINSTANCE.getNamedConstant_Name();

		/**
		 * The meta object literal for the '{@link org.jfom.impl.ContainsStatementImpl <em>Contains Statement</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.jfom.impl.ContainsStatementImpl
		 * @see org.jfom.impl.JFOMPackageImpl#getContainsStatement()
		 * @generated
		 */
		EClass CONTAINS_STATEMENT = eINSTANCE.getContainsStatement();

		/**
		 * The meta object literal for the '{@link org.jfom.impl.ModuleSubprogramImpl <em>Module Subprogram</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.jfom.impl.ModuleSubprogramImpl
		 * @see org.jfom.impl.JFOMPackageImpl#getModuleSubprogram()
		 * @generated
		 */
		EClass MODULE_SUBPROGRAM = eINSTANCE.getModuleSubprogram();

		/**
		 * The meta object literal for the '{@link org.jfom.impl.FunctionSubprogramImpl <em>Function Subprogram</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.jfom.impl.FunctionSubprogramImpl
		 * @see org.jfom.impl.JFOMPackageImpl#getFunctionSubprogram()
		 * @generated
		 */
		EClass FUNCTION_SUBPROGRAM = eINSTANCE.getFunctionSubprogram();

		/**
		 * The meta object literal for the '{@link org.jfom.impl.SubroutineSubprogramImpl <em>Subroutine Subprogram</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.jfom.impl.SubroutineSubprogramImpl
		 * @see org.jfom.impl.JFOMPackageImpl#getSubroutineSubprogram()
		 * @generated
		 */
		EClass SUBROUTINE_SUBPROGRAM = eINSTANCE.getSubroutineSubprogram();

		/**
		 * The meta object literal for the '<em><b>Subroutine Statement</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SUBROUTINE_SUBPROGRAM__SUBROUTINE_STATEMENT = eINSTANCE.getSubroutineSubprogram_SubroutineStatement();

		/**
		 * The meta object literal for the '<em><b>Specification Part</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SUBROUTINE_SUBPROGRAM__SPECIFICATION_PART = eINSTANCE.getSubroutineSubprogram_SpecificationPart();

		/**
		 * The meta object literal for the '<em><b>Execution Part</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SUBROUTINE_SUBPROGRAM__EXECUTION_PART = eINSTANCE.getSubroutineSubprogram_ExecutionPart();

		/**
		 * The meta object literal for the '<em><b>Internal Subprogram Part</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SUBROUTINE_SUBPROGRAM__INTERNAL_SUBPROGRAM_PART = eINSTANCE.getSubroutineSubprogram_InternalSubprogramPart();

		/**
		 * The meta object literal for the '<em><b>End Subroutine Statement</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SUBROUTINE_SUBPROGRAM__END_SUBROUTINE_STATEMENT = eINSTANCE.getSubroutineSubprogram_EndSubroutineStatement();

		/**
		 * The meta object literal for the '{@link org.jfom.impl.SubroutineStatementImpl <em>Subroutine Statement</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.jfom.impl.SubroutineStatementImpl
		 * @see org.jfom.impl.JFOMPackageImpl#getSubroutineStatement()
		 * @generated
		 */
		EClass SUBROUTINE_STATEMENT = eINSTANCE.getSubroutineStatement();

		/**
		 * The meta object literal for the '<em><b>Subroutine Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SUBROUTINE_STATEMENT__SUBROUTINE_NAME = eINSTANCE.getSubroutineStatement_SubroutineName();

		/**
		 * The meta object literal for the '<em><b>Formal Argument</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SUBROUTINE_STATEMENT__FORMAL_ARGUMENT = eINSTANCE.getSubroutineStatement_FormalArgument();

		/**
		 * The meta object literal for the '{@link org.jfom.impl.EndSubroutineStatementImpl <em>End Subroutine Statement</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.jfom.impl.EndSubroutineStatementImpl
		 * @see org.jfom.impl.JFOMPackageImpl#getEndSubroutineStatement()
		 * @generated
		 */
		EClass END_SUBROUTINE_STATEMENT = eINSTANCE.getEndSubroutineStatement();

		/**
		 * The meta object literal for the '<em><b>Subroutine Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute END_SUBROUTINE_STATEMENT__SUBROUTINE_NAME = eINSTANCE.getEndSubroutineStatement_SubroutineName();

		/**
		 * The meta object literal for the '{@link org.antlr.stringtemplate.StringTemplate <em>EString Template</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.antlr.stringtemplate.StringTemplate
		 * @see org.jfom.impl.JFOMPackageImpl#getEStringTemplate()
		 * @generated
		 */
		EClass ESTRING_TEMPLATE = eINSTANCE.getEStringTemplate();

		/**
		 * The meta object literal for the '{@link org.jfom.impl.ArbitraryTextConstructImpl <em>Arbitrary Text Construct</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.jfom.impl.ArbitraryTextConstructImpl
		 * @see org.jfom.impl.JFOMPackageImpl#getArbitraryTextConstruct()
		 * @generated
		 */
		EClass ARBITRARY_TEXT_CONSTRUCT = eINSTANCE.getArbitraryTextConstruct();

		/**
		 * The meta object literal for the '<em><b>Text</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ARBITRARY_TEXT_CONSTRUCT__TEXT = eINSTANCE.getArbitraryTextConstruct_Text();

		/**
		 * The meta object literal for the '{@link org.jfom.impl.ArrayConstructorImpl <em>Array Constructor</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.jfom.impl.ArrayConstructorImpl
		 * @see org.jfom.impl.JFOMPackageImpl#getArrayConstructor()
		 * @generated
		 */
		EClass ARRAY_CONSTRUCTOR = eINSTANCE.getArrayConstructor();

		/**
		 * The meta object literal for the '<em><b>Array Constructor Value</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ARRAY_CONSTRUCTOR__ARRAY_CONSTRUCTOR_VALUE = eINSTANCE.getArrayConstructor_ArrayConstructorValue();

		/**
		 * The meta object literal for the '{@link org.jfom.ArrayConstructorValue <em>Array Constructor Value</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.jfom.ArrayConstructorValue
		 * @see org.jfom.impl.JFOMPackageImpl#getArrayConstructorValue()
		 * @generated
		 */
		EClass ARRAY_CONSTRUCTOR_VALUE = eINSTANCE.getArrayConstructorValue();

		/**
		 * The meta object literal for the '{@link org.jfom.impl.ProgramStatementImpl <em>Program Statement</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.jfom.impl.ProgramStatementImpl
		 * @see org.jfom.impl.JFOMPackageImpl#getProgramStatement()
		 * @generated
		 */
		EClass PROGRAM_STATEMENT = eINSTANCE.getProgramStatement();

		/**
		 * The meta object literal for the '<em><b>Program Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PROGRAM_STATEMENT__PROGRAM_NAME = eINSTANCE.getProgramStatement_ProgramName();

		/**
		 * The meta object literal for the '{@link org.jfom.impl.SaveAttrSpecImpl <em>Save Attr Spec</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.jfom.impl.SaveAttrSpecImpl
		 * @see org.jfom.impl.JFOMPackageImpl#getSaveAttrSpec()
		 * @generated
		 */
		EClass SAVE_ATTR_SPEC = eINSTANCE.getSaveAttrSpec();

		/**
		 * The meta object literal for the '{@link org.jfom.impl.TypeDeclarationStatementImpl <em>Type Declaration Statement</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.jfom.impl.TypeDeclarationStatementImpl
		 * @see org.jfom.impl.JFOMPackageImpl#getTypeDeclarationStatement()
		 * @generated
		 */
		EClass TYPE_DECLARATION_STATEMENT = eINSTANCE.getTypeDeclarationStatement();

		/**
		 * The meta object literal for the '<em><b>Type Spec</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TYPE_DECLARATION_STATEMENT__TYPE_SPEC = eINSTANCE.getTypeDeclarationStatement_TypeSpec();

		/**
		 * The meta object literal for the '<em><b>Attr Spec</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TYPE_DECLARATION_STATEMENT__ATTR_SPEC = eINSTANCE.getTypeDeclarationStatement_AttrSpec();

		/**
		 * The meta object literal for the '<em><b>Entity Declaration</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TYPE_DECLARATION_STATEMENT__ENTITY_DECLARATION = eINSTANCE.getTypeDeclarationStatement_EntityDeclaration();

		/**
		 * The meta object literal for the '{@link org.jfom.impl.TypeSpecImpl <em>Type Spec</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.jfom.impl.TypeSpecImpl
		 * @see org.jfom.impl.JFOMPackageImpl#getTypeSpec()
		 * @generated
		 */
		EClass TYPE_SPEC = eINSTANCE.getTypeSpec();

		/**
		 * The meta object literal for the '{@link org.jfom.impl.IntrinsicTypeSpecImpl <em>Intrinsic Type Spec</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.jfom.impl.IntrinsicTypeSpecImpl
		 * @see org.jfom.impl.JFOMPackageImpl#getIntrinsicTypeSpec()
		 * @generated
		 */
		EClass INTRINSIC_TYPE_SPEC = eINSTANCE.getIntrinsicTypeSpec();

		/**
		 * The meta object literal for the '<em><b>Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute INTRINSIC_TYPE_SPEC__TYPE = eINSTANCE.getIntrinsicTypeSpec_Type();

		/**
		 * The meta object literal for the '{@link org.jfom.impl.LiteralConstantImpl <em>Literal Constant</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.jfom.impl.LiteralConstantImpl
		 * @see org.jfom.impl.JFOMPackageImpl#getLiteralConstant()
		 * @generated
		 */
		EClass LITERAL_CONSTANT = eINSTANCE.getLiteralConstant();

		/**
		 * The meta object literal for the '<em><b>Literal</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute LITERAL_CONSTANT__LITERAL = eINSTANCE.getLiteralConstant_Literal();

		/**
		 * The meta object literal for the '{@link org.jfom.impl.DerivedTypeSpecImpl <em>Derived Type Spec</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.jfom.impl.DerivedTypeSpecImpl
		 * @see org.jfom.impl.JFOMPackageImpl#getDerivedTypeSpec()
		 * @generated
		 */
		EClass DERIVED_TYPE_SPEC = eINSTANCE.getDerivedTypeSpec();

		/**
		 * The meta object literal for the '<em><b>Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DERIVED_TYPE_SPEC__TYPE = eINSTANCE.getDerivedTypeSpec_Type();

		/**
		 * The meta object literal for the '{@link org.jfom.impl.ActionStatementImpl <em>Action Statement</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.jfom.impl.ActionStatementImpl
		 * @see org.jfom.impl.JFOMPackageImpl#getActionStatement()
		 * @generated
		 */
		EClass ACTION_STATEMENT = eINSTANCE.getActionStatement();

		/**
		 * The meta object literal for the '{@link org.jfom.impl.CallStatementImpl <em>Call Statement</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.jfom.impl.CallStatementImpl
		 * @see org.jfom.impl.JFOMPackageImpl#getCallStatement()
		 * @generated
		 */
		EClass CALL_STATEMENT = eINSTANCE.getCallStatement();

		/**
		 * The meta object literal for the '<em><b>Subroutine Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CALL_STATEMENT__SUBROUTINE_NAME = eINSTANCE.getCallStatement_SubroutineName();

		/**
		 * The meta object literal for the '<em><b>Actual Argument</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CALL_STATEMENT__ACTUAL_ARGUMENT = eINSTANCE.getCallStatement_ActualArgument();

		/**
		 * The meta object literal for the '{@link org.jfom.impl.ConstantImpl <em>Constant</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.jfom.impl.ConstantImpl
		 * @see org.jfom.impl.JFOMPackageImpl#getConstant()
		 * @generated
		 */
		EClass CONSTANT = eINSTANCE.getConstant();

		/**
		 * The meta object literal for the '{@link org.jfom.impl.ActualArgumentSpecImpl <em>Actual Argument Spec</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.jfom.impl.ActualArgumentSpecImpl
		 * @see org.jfom.impl.JFOMPackageImpl#getActualArgumentSpec()
		 * @generated
		 */
		EClass ACTUAL_ARGUMENT_SPEC = eINSTANCE.getActualArgumentSpec();

		/**
		 * The meta object literal for the '<em><b>Keyword</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ACTUAL_ARGUMENT_SPEC__KEYWORD = eINSTANCE.getActualArgumentSpec_Keyword();

		/**
		 * The meta object literal for the '<em><b>Argument</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ACTUAL_ARGUMENT_SPEC__ARGUMENT = eINSTANCE.getActualArgumentSpec_Argument();

		/**
		 * The meta object literal for the '{@link org.jfom.impl.IfStatementImpl <em>If Statement</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.jfom.impl.IfStatementImpl
		 * @see org.jfom.impl.JFOMPackageImpl#getIfStatement()
		 * @generated
		 */
		EClass IF_STATEMENT = eINSTANCE.getIfStatement();

		/**
		 * The meta object literal for the '<em><b>Test</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference IF_STATEMENT__TEST = eINSTANCE.getIfStatement_Test();

		/**
		 * The meta object literal for the '<em><b>Action</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference IF_STATEMENT__ACTION = eINSTANCE.getIfStatement_Action();

		/**
		 * The meta object literal for the '{@link org.jfom.impl.ExpressionImpl <em>Expression</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.jfom.impl.ExpressionImpl
		 * @see org.jfom.impl.JFOMPackageImpl#getExpression()
		 * @generated
		 */
		EClass EXPRESSION = eINSTANCE.getExpression();

		/**
		 * The meta object literal for the '{@link org.jfom.impl.FunctionReferenceImpl <em>Function Reference</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.jfom.impl.FunctionReferenceImpl
		 * @see org.jfom.impl.JFOMPackageImpl#getFunctionReference()
		 * @generated
		 */
		EClass FUNCTION_REFERENCE = eINSTANCE.getFunctionReference();

		/**
		 * The meta object literal for the '<em><b>Function Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FUNCTION_REFERENCE__FUNCTION_NAME = eINSTANCE.getFunctionReference_FunctionName();

		/**
		 * The meta object literal for the '<em><b>Actual Argument</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FUNCTION_REFERENCE__ACTUAL_ARGUMENT = eINSTANCE.getFunctionReference_ActualArgument();

		/**
		 * The meta object literal for the '{@link org.jfom.IntrinsicType <em>Intrinsic Type</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.jfom.IntrinsicType
		 * @see org.jfom.impl.JFOMPackageImpl#getIntrinsicType()
		 * @generated
		 */
		EEnum INTRINSIC_TYPE = eINSTANCE.getIntrinsicType();

	}

} //JFOMPackage
