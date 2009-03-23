/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.jfom.impl;

import org.antlr.stringtemplate.StringTemplate;


import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EGenericType;
import org.eclipse.emf.ecore.EOperation;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import org.eclipse.emf.ecore.impl.EPackageImpl;
import org.jfom.AccessSpec;
import org.jfom.AccessStatement;
import org.jfom.ActionStatement;
import org.jfom.ActualArgumentSpec;
import org.jfom.ArbitraryTextConstruct;
import org.jfom.ArrayConstructor;
import org.jfom.ArrayConstructorValue;
import org.jfom.AssignmentStatement;
import org.jfom.AttrSpec;
import org.jfom.CallStatement;
import org.jfom.Constant;
import org.jfom.ContainsStatement;
import org.jfom.DeclarationConstruct;
import org.jfom.DerivedTypeSpec;
import org.jfom.DoConstruct;
import org.jfom.EndModuleStatement;
import org.jfom.EndProgramStatement;
import org.jfom.EndSubroutineStatement;
import org.jfom.ExecutableConstruct;
import org.jfom.ExecutionPart;
import org.jfom.ExecutionPartConstruct;
import org.jfom.Expression;
import org.jfom.JFOMFactory;
import org.jfom.JFOMPackage;
import org.jfom.FunctionReference;
import org.jfom.FunctionSubprogram;
import org.jfom.IfStatement;
import org.jfom.ImplicitPart;
import org.jfom.ImplicitPartStatement;
import org.jfom.ImplicitStatement;
import org.jfom.IntentAttrSpec;
import org.jfom.IntentSpec;
import org.jfom.InternalSubprogramPart;
import org.jfom.IntrinsicType;
import org.jfom.IntrinsicTypeSpec;
import org.jfom.LiteralConstant;
import org.jfom.MainProgram;
import org.jfom.Module;
import org.jfom.ModuleStatement;
import org.jfom.ModuleSubprogram;
import org.jfom.ModuleSubprogramPart;
import org.jfom.NamedConstant;
import org.jfom.PrintStatement;
import org.jfom.ProgramStatement;
import org.jfom.ProgramUnit;
import org.jfom.SaveAttrSpec;
import org.jfom.SpecificationPart;
import org.jfom.SpecificationStatement;
import org.jfom.StringTemplateAdapter;
import org.jfom.SubroutineStatement;
import org.jfom.SubroutineSubprogram;
import org.jfom.TypeDeclarationStatement;
import org.jfom.TypeSpec;
import org.jfom.UseStatement;
import org.jfom._Spacer;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class JFOMPackageImpl extends EPackageImpl implements JFOMPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass accessStatementEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass programUnitEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass mainProgramEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass moduleEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass specificationPartEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass specificationStatementEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass executionPartEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass internalSubprogramPartEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass useStatementEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass implicitPartEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass declarationConstructEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass implicitStatementEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass intentAttrSpecEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass implicitPartStatementEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass executionPartConstructEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass executableConstructEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass doConstructEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass stringTemplateAdapterEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass endProgramStatementEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass assignmentStatementEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass attrSpecEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass _SpacerEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum accessSpecEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum intentSpecEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass printStatementEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass moduleStatementEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass endModuleStatementEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass moduleSubprogramPartEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass namedConstantEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass containsStatementEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass moduleSubprogramEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass functionSubprogramEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass subroutineSubprogramEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass subroutineStatementEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass endSubroutineStatementEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass eStringTemplateEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass arbitraryTextConstructEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass arrayConstructorEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass arrayConstructorValueEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass programStatementEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass saveAttrSpecEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass typeDeclarationStatementEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass typeSpecEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass intrinsicTypeSpecEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass literalConstantEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass derivedTypeSpecEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass actionStatementEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass callStatementEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass constantEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass actualArgumentSpecEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass ifStatementEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass expressionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass functionReferenceEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum intrinsicTypeEEnum = null;

	/**
	 * Creates an instance of the model <b>Package</b>, registered with
	 * {@link org.eclipse.emf.ecore.EPackage.Registry EPackage.Registry} by the package
	 * package URI value.
	 * <p>Note: the correct way to create the package is via the static
	 * factory method {@link #init init()}, which also performs
	 * initialization of the package, or returns the registered package,
	 * if one already exists.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.ecore.EPackage.Registry
	 * @see org.jfom.JFOMPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private JFOMPackageImpl() {
		super(eNS_URI, JFOMFactory.eINSTANCE);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static boolean isInited = false;

	/**
	 * Creates, registers, and initializes the <b>Package</b> for this
	 * model, and for any others upon which it depends.  Simple
	 * dependencies are satisfied by calling this method on all
	 * dependent packages before doing anything else.  This method drives
	 * initialization for interdependent packages directly, in parallel
	 * with this package, itself.
	 * <p>Of this package and its interdependencies, all packages which
	 * have not yet been registered by their URI values are first created
	 * and registered.  The packages are then initialized in two steps:
	 * meta-model objects for all of the packages are created before any
	 * are initialized, since one package's meta-model objects may refer to
	 * those of another.
	 * <p>Invocation of this method will not affect any packages that have
	 * already been initialized.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static JFOMPackage init() {
		if (isInited) return (JFOMPackage)EPackage.Registry.INSTANCE.getEPackage(JFOMPackage.eNS_URI);

		// Obtain or create and register package
		JFOMPackageImpl theJFOMPackage = (JFOMPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(eNS_URI) instanceof JFOMPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(eNS_URI) : new JFOMPackageImpl());

		isInited = true;

		// Create package meta-data objects
		theJFOMPackage.createPackageContents();

		// Initialize created meta-data
		theJFOMPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theJFOMPackage.freeze();

		return theJFOMPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAccessStatement() {
		return accessStatementEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAccessStatement_AccessSpec() {
		return (EAttribute)accessStatementEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAccessStatement_AccessIdentifier() {
		return (EAttribute)accessStatementEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getProgramUnit() {
		return programUnitEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getMainProgram() {
		return mainProgramEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getMainProgram_ProgramStatement() {
		return (EReference)mainProgramEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getMainProgram_SpecificationPart() {
		return (EReference)mainProgramEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getMainProgram_ExecutionPart() {
		return (EReference)mainProgramEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getMainProgram_InternalSubprogramPart() {
		return (EReference)mainProgramEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getMainProgram_EndProgramStatement() {
		return (EReference)mainProgramEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getModule() {
		return moduleEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getModule_ModuleStatement() {
		return (EReference)moduleEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getModule_SpecificationPart() {
		return (EReference)moduleEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getModule_ModuleSubprogramPart() {
		return (EReference)moduleEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getModule_EndModuleStatement() {
		return (EReference)moduleEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSpecificationPart() {
		return specificationPartEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSpecificationPart_UseStatement() {
		return (EReference)specificationPartEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSpecificationPart_ImplicitPart() {
		return (EReference)specificationPartEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSpecificationPart_DeclarationConstruct() {
		return (EReference)specificationPartEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSpecificationStatement() {
		return specificationStatementEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getExecutionPart() {
		return executionPartEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getExecutionPart_ExecutionPartConstruct() {
		return (EReference)executionPartEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getInternalSubprogramPart() {
		return internalSubprogramPartEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getUseStatement() {
		return useStatementEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getUseStatement_ModuleName() {
		return (EAttribute)useStatementEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getUseStatement_RenameList() {
		return (EAttribute)useStatementEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getImplicitPart() {
		return implicitPartEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getImplicitPart_ImplicitPartStatement() {
		return (EReference)implicitPartEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDeclarationConstruct() {
		return declarationConstructEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getImplicitStatement() {
		return implicitStatementEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getImplicitStatement_ImplicitSpecList() {
		return (EAttribute)implicitStatementEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getIntentAttrSpec() {
		return intentAttrSpecEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getIntentAttrSpec_IntentSpec() {
		return (EAttribute)intentAttrSpecEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getImplicitPartStatement() {
		return implicitPartStatementEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getExecutionPartConstruct() {
		return executionPartConstructEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getExecutableConstruct() {
		return executableConstructEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDoConstruct() {
		return doConstructEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDoConstruct_DoVariable() {
		return (EAttribute)doConstructEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDoConstruct_Start() {
		return (EAttribute)doConstructEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDoConstruct_End() {
		return (EAttribute)doConstructEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDoConstruct_ExecutionPartConstruct() {
		return (EReference)doConstructEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getStringTemplateAdapter() {
		return stringTemplateAdapterEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getStringTemplateAdapter_StringTemplate() {
		return (EReference)stringTemplateAdapterEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getEndProgramStatement() {
		return endProgramStatementEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getEndProgramStatement_ProgramName() {
		return (EAttribute)endProgramStatementEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAssignmentStatement() {
		return assignmentStatementEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAssignmentStatement_Variable() {
		return (EAttribute)assignmentStatementEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAssignmentStatement_Expression() {
		return (EReference)assignmentStatementEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAttrSpec() {
		return attrSpecEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass get_Spacer() {
		return _SpacerEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getAccessSpec() {
		return accessSpecEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getIntentSpec() {
		return intentSpecEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPrintStatement() {
		return printStatementEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPrintStatement_Format() {
		return (EAttribute)printStatementEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPrintStatement_OutputItem() {
		return (EAttribute)printStatementEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getModuleStatement() {
		return moduleStatementEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getModuleStatement_ModuleName() {
		return (EAttribute)moduleStatementEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getEndModuleStatement() {
		return endModuleStatementEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getEndModuleStatement_ModuleName() {
		return (EAttribute)endModuleStatementEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getModuleSubprogramPart() {
		return moduleSubprogramPartEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getModuleSubprogramPart_ContainsStatement() {
		return (EReference)moduleSubprogramPartEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getModuleSubprogramPart_ModuleSubprogram() {
		return (EReference)moduleSubprogramPartEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getNamedConstant() {
		return namedConstantEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getNamedConstant_Name() {
		return (EAttribute)namedConstantEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getContainsStatement() {
		return containsStatementEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getModuleSubprogram() {
		return moduleSubprogramEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getFunctionSubprogram() {
		return functionSubprogramEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSubroutineSubprogram() {
		return subroutineSubprogramEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSubroutineSubprogram_SubroutineStatement() {
		return (EReference)subroutineSubprogramEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSubroutineSubprogram_SpecificationPart() {
		return (EReference)subroutineSubprogramEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSubroutineSubprogram_ExecutionPart() {
		return (EReference)subroutineSubprogramEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSubroutineSubprogram_InternalSubprogramPart() {
		return (EReference)subroutineSubprogramEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSubroutineSubprogram_EndSubroutineStatement() {
		return (EReference)subroutineSubprogramEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSubroutineStatement() {
		return subroutineStatementEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSubroutineStatement_SubroutineName() {
		return (EAttribute)subroutineStatementEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSubroutineStatement_FormalArgument() {
		return (EAttribute)subroutineStatementEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getEndSubroutineStatement() {
		return endSubroutineStatementEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getEndSubroutineStatement_SubroutineName() {
		return (EAttribute)endSubroutineStatementEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getEStringTemplate() {
		return eStringTemplateEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getArbitraryTextConstruct() {
		return arbitraryTextConstructEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getArbitraryTextConstruct_Text() {
		return (EAttribute)arbitraryTextConstructEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getArrayConstructor() {
		return arrayConstructorEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getArrayConstructor_ArrayConstructorValue() {
		return (EReference)arrayConstructorEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getArrayConstructorValue() {
		return arrayConstructorValueEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getProgramStatement() {
		return programStatementEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getProgramStatement_ProgramName() {
		return (EAttribute)programStatementEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSaveAttrSpec() {
		return saveAttrSpecEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTypeDeclarationStatement() {
		return typeDeclarationStatementEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTypeDeclarationStatement_TypeSpec() {
		return (EReference)typeDeclarationStatementEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTypeDeclarationStatement_AttrSpec() {
		return (EReference)typeDeclarationStatementEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTypeDeclarationStatement_EntityDeclaration() {
		return (EAttribute)typeDeclarationStatementEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTypeSpec() {
		return typeSpecEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getIntrinsicTypeSpec() {
		return intrinsicTypeSpecEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getIntrinsicTypeSpec_Type() {
		return (EAttribute)intrinsicTypeSpecEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getLiteralConstant() {
		return literalConstantEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getLiteralConstant_Literal() {
		return (EAttribute)literalConstantEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDerivedTypeSpec() {
		return derivedTypeSpecEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDerivedTypeSpec_Type() {
		return (EAttribute)derivedTypeSpecEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getActionStatement() {
		return actionStatementEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getCallStatement() {
		return callStatementEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCallStatement_SubroutineName() {
		return (EAttribute)callStatementEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCallStatement_ActualArgument() {
		return (EReference)callStatementEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getConstant() {
		return constantEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getActualArgumentSpec() {
		return actualArgumentSpecEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getActualArgumentSpec_Keyword() {
		return (EAttribute)actualArgumentSpecEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getActualArgumentSpec_Argument() {
		return (EReference)actualArgumentSpecEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getIfStatement() {
		return ifStatementEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getIfStatement_Test() {
		return (EReference)ifStatementEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getIfStatement_Action() {
		return (EReference)ifStatementEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getExpression() {
		return expressionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getFunctionReference() {
		return functionReferenceEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getFunctionReference_FunctionName() {
		return (EAttribute)functionReferenceEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getFunctionReference_ActualArgument() {
		return (EReference)functionReferenceEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getIntrinsicType() {
		return intrinsicTypeEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public JFOMFactory getJFOMFactory() {
		return (JFOMFactory)getEFactoryInstance();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isCreated = false;

	/**
	 * Creates the meta-model objects for the package.  This method is
	 * guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void createPackageContents() {
		if (isCreated) return;
		isCreated = true;

		// Create classes and their features
		accessStatementEClass = createEClass(ACCESS_STATEMENT);
		createEAttribute(accessStatementEClass, ACCESS_STATEMENT__ACCESS_SPEC);
		createEAttribute(accessStatementEClass, ACCESS_STATEMENT__ACCESS_IDENTIFIER);

		actionStatementEClass = createEClass(ACTION_STATEMENT);

		actualArgumentSpecEClass = createEClass(ACTUAL_ARGUMENT_SPEC);
		createEAttribute(actualArgumentSpecEClass, ACTUAL_ARGUMENT_SPEC__KEYWORD);
		createEReference(actualArgumentSpecEClass, ACTUAL_ARGUMENT_SPEC__ARGUMENT);

		arbitraryTextConstructEClass = createEClass(ARBITRARY_TEXT_CONSTRUCT);
		createEAttribute(arbitraryTextConstructEClass, ARBITRARY_TEXT_CONSTRUCT__TEXT);

		arrayConstructorEClass = createEClass(ARRAY_CONSTRUCTOR);
		createEReference(arrayConstructorEClass, ARRAY_CONSTRUCTOR__ARRAY_CONSTRUCTOR_VALUE);

		arrayConstructorValueEClass = createEClass(ARRAY_CONSTRUCTOR_VALUE);

		assignmentStatementEClass = createEClass(ASSIGNMENT_STATEMENT);
		createEAttribute(assignmentStatementEClass, ASSIGNMENT_STATEMENT__VARIABLE);
		createEReference(assignmentStatementEClass, ASSIGNMENT_STATEMENT__EXPRESSION);

		attrSpecEClass = createEClass(ATTR_SPEC);

		callStatementEClass = createEClass(CALL_STATEMENT);
		createEAttribute(callStatementEClass, CALL_STATEMENT__SUBROUTINE_NAME);
		createEReference(callStatementEClass, CALL_STATEMENT__ACTUAL_ARGUMENT);

		constantEClass = createEClass(CONSTANT);

		containsStatementEClass = createEClass(CONTAINS_STATEMENT);

		declarationConstructEClass = createEClass(DECLARATION_CONSTRUCT);

		derivedTypeSpecEClass = createEClass(DERIVED_TYPE_SPEC);
		createEAttribute(derivedTypeSpecEClass, DERIVED_TYPE_SPEC__TYPE);

		doConstructEClass = createEClass(DO_CONSTRUCT);
		createEAttribute(doConstructEClass, DO_CONSTRUCT__DO_VARIABLE);
		createEAttribute(doConstructEClass, DO_CONSTRUCT__START);
		createEAttribute(doConstructEClass, DO_CONSTRUCT__END);
		createEReference(doConstructEClass, DO_CONSTRUCT__EXECUTION_PART_CONSTRUCT);

		endModuleStatementEClass = createEClass(END_MODULE_STATEMENT);
		createEAttribute(endModuleStatementEClass, END_MODULE_STATEMENT__MODULE_NAME);

		endProgramStatementEClass = createEClass(END_PROGRAM_STATEMENT);
		createEAttribute(endProgramStatementEClass, END_PROGRAM_STATEMENT__PROGRAM_NAME);

		endSubroutineStatementEClass = createEClass(END_SUBROUTINE_STATEMENT);
		createEAttribute(endSubroutineStatementEClass, END_SUBROUTINE_STATEMENT__SUBROUTINE_NAME);

		eStringTemplateEClass = createEClass(ESTRING_TEMPLATE);

		executableConstructEClass = createEClass(EXECUTABLE_CONSTRUCT);

		executionPartEClass = createEClass(EXECUTION_PART);
		createEReference(executionPartEClass, EXECUTION_PART__EXECUTION_PART_CONSTRUCT);

		executionPartConstructEClass = createEClass(EXECUTION_PART_CONSTRUCT);

		expressionEClass = createEClass(EXPRESSION);

		functionReferenceEClass = createEClass(FUNCTION_REFERENCE);
		createEAttribute(functionReferenceEClass, FUNCTION_REFERENCE__FUNCTION_NAME);
		createEReference(functionReferenceEClass, FUNCTION_REFERENCE__ACTUAL_ARGUMENT);

		functionSubprogramEClass = createEClass(FUNCTION_SUBPROGRAM);

		ifStatementEClass = createEClass(IF_STATEMENT);
		createEReference(ifStatementEClass, IF_STATEMENT__TEST);
		createEReference(ifStatementEClass, IF_STATEMENT__ACTION);

		implicitPartEClass = createEClass(IMPLICIT_PART);
		createEReference(implicitPartEClass, IMPLICIT_PART__IMPLICIT_PART_STATEMENT);

		implicitPartStatementEClass = createEClass(IMPLICIT_PART_STATEMENT);

		implicitStatementEClass = createEClass(IMPLICIT_STATEMENT);
		createEAttribute(implicitStatementEClass, IMPLICIT_STATEMENT__IMPLICIT_SPEC_LIST);

		intentAttrSpecEClass = createEClass(INTENT_ATTR_SPEC);
		createEAttribute(intentAttrSpecEClass, INTENT_ATTR_SPEC__INTENT_SPEC);

		internalSubprogramPartEClass = createEClass(INTERNAL_SUBPROGRAM_PART);

		intrinsicTypeSpecEClass = createEClass(INTRINSIC_TYPE_SPEC);
		createEAttribute(intrinsicTypeSpecEClass, INTRINSIC_TYPE_SPEC__TYPE);

		literalConstantEClass = createEClass(LITERAL_CONSTANT);
		createEAttribute(literalConstantEClass, LITERAL_CONSTANT__LITERAL);

		mainProgramEClass = createEClass(MAIN_PROGRAM);
		createEReference(mainProgramEClass, MAIN_PROGRAM__PROGRAM_STATEMENT);
		createEReference(mainProgramEClass, MAIN_PROGRAM__SPECIFICATION_PART);
		createEReference(mainProgramEClass, MAIN_PROGRAM__EXECUTION_PART);
		createEReference(mainProgramEClass, MAIN_PROGRAM__INTERNAL_SUBPROGRAM_PART);
		createEReference(mainProgramEClass, MAIN_PROGRAM__END_PROGRAM_STATEMENT);

		moduleEClass = createEClass(MODULE);
		createEReference(moduleEClass, MODULE__MODULE_STATEMENT);
		createEReference(moduleEClass, MODULE__SPECIFICATION_PART);
		createEReference(moduleEClass, MODULE__MODULE_SUBPROGRAM_PART);
		createEReference(moduleEClass, MODULE__END_MODULE_STATEMENT);

		moduleStatementEClass = createEClass(MODULE_STATEMENT);
		createEAttribute(moduleStatementEClass, MODULE_STATEMENT__MODULE_NAME);

		moduleSubprogramEClass = createEClass(MODULE_SUBPROGRAM);

		moduleSubprogramPartEClass = createEClass(MODULE_SUBPROGRAM_PART);
		createEReference(moduleSubprogramPartEClass, MODULE_SUBPROGRAM_PART__CONTAINS_STATEMENT);
		createEReference(moduleSubprogramPartEClass, MODULE_SUBPROGRAM_PART__MODULE_SUBPROGRAM);

		namedConstantEClass = createEClass(NAMED_CONSTANT);
		createEAttribute(namedConstantEClass, NAMED_CONSTANT__NAME);

		printStatementEClass = createEClass(PRINT_STATEMENT);
		createEAttribute(printStatementEClass, PRINT_STATEMENT__FORMAT);
		createEAttribute(printStatementEClass, PRINT_STATEMENT__OUTPUT_ITEM);

		programUnitEClass = createEClass(PROGRAM_UNIT);

		programStatementEClass = createEClass(PROGRAM_STATEMENT);
		createEAttribute(programStatementEClass, PROGRAM_STATEMENT__PROGRAM_NAME);

		saveAttrSpecEClass = createEClass(SAVE_ATTR_SPEC);

		specificationPartEClass = createEClass(SPECIFICATION_PART);
		createEReference(specificationPartEClass, SPECIFICATION_PART__USE_STATEMENT);
		createEReference(specificationPartEClass, SPECIFICATION_PART__IMPLICIT_PART);
		createEReference(specificationPartEClass, SPECIFICATION_PART__DECLARATION_CONSTRUCT);

		specificationStatementEClass = createEClass(SPECIFICATION_STATEMENT);

		stringTemplateAdapterEClass = createEClass(STRING_TEMPLATE_ADAPTER);
		createEReference(stringTemplateAdapterEClass, STRING_TEMPLATE_ADAPTER__STRING_TEMPLATE);

		subroutineStatementEClass = createEClass(SUBROUTINE_STATEMENT);
		createEAttribute(subroutineStatementEClass, SUBROUTINE_STATEMENT__SUBROUTINE_NAME);
		createEAttribute(subroutineStatementEClass, SUBROUTINE_STATEMENT__FORMAL_ARGUMENT);

		subroutineSubprogramEClass = createEClass(SUBROUTINE_SUBPROGRAM);
		createEReference(subroutineSubprogramEClass, SUBROUTINE_SUBPROGRAM__SUBROUTINE_STATEMENT);
		createEReference(subroutineSubprogramEClass, SUBROUTINE_SUBPROGRAM__SPECIFICATION_PART);
		createEReference(subroutineSubprogramEClass, SUBROUTINE_SUBPROGRAM__EXECUTION_PART);
		createEReference(subroutineSubprogramEClass, SUBROUTINE_SUBPROGRAM__INTERNAL_SUBPROGRAM_PART);
		createEReference(subroutineSubprogramEClass, SUBROUTINE_SUBPROGRAM__END_SUBROUTINE_STATEMENT);

		typeDeclarationStatementEClass = createEClass(TYPE_DECLARATION_STATEMENT);
		createEReference(typeDeclarationStatementEClass, TYPE_DECLARATION_STATEMENT__TYPE_SPEC);
		createEReference(typeDeclarationStatementEClass, TYPE_DECLARATION_STATEMENT__ATTR_SPEC);
		createEAttribute(typeDeclarationStatementEClass, TYPE_DECLARATION_STATEMENT__ENTITY_DECLARATION);

		typeSpecEClass = createEClass(TYPE_SPEC);

		useStatementEClass = createEClass(USE_STATEMENT);
		createEAttribute(useStatementEClass, USE_STATEMENT__MODULE_NAME);
		createEAttribute(useStatementEClass, USE_STATEMENT__RENAME_LIST);

		_SpacerEClass = createEClass(_SPACER);

		// Create enums
		accessSpecEEnum = createEEnum(ACCESS_SPEC);
		intentSpecEEnum = createEEnum(INTENT_SPEC);
		intrinsicTypeEEnum = createEEnum(INTRINSIC_TYPE);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isInitialized = false;

	/**
	 * Complete the initialization of the package and its meta-model.  This
	 * method is guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void initializePackageContents() {
		if (isInitialized) return;
		isInitialized = true;

		// Initialize package
		setName(eNAME);
		setNsPrefix(eNS_PREFIX);
		setNsURI(eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes
		accessStatementEClass.getESuperTypes().add(this.getSpecificationStatement());
		actionStatementEClass.getESuperTypes().add(this.getExecutableConstruct());
		actualArgumentSpecEClass.getESuperTypes().add(this.getStringTemplateAdapter());
		arbitraryTextConstructEClass.getESuperTypes().add(this.getExecutableConstruct());
		arrayConstructorEClass.getESuperTypes().add(this.getExpression());
		arrayConstructorValueEClass.getESuperTypes().add(this.getStringTemplateAdapter());
		assignmentStatementEClass.getESuperTypes().add(this.getActionStatement());
		attrSpecEClass.getESuperTypes().add(this.getStringTemplateAdapter());
		callStatementEClass.getESuperTypes().add(this.getActionStatement());
		constantEClass.getESuperTypes().add(this.getExpression());
		containsStatementEClass.getESuperTypes().add(this.getStringTemplateAdapter());
		declarationConstructEClass.getESuperTypes().add(this.getStringTemplateAdapter());
		derivedTypeSpecEClass.getESuperTypes().add(this.getTypeSpec());
		doConstructEClass.getESuperTypes().add(this.getExecutableConstruct());
		endModuleStatementEClass.getESuperTypes().add(this.getStringTemplateAdapter());
		endProgramStatementEClass.getESuperTypes().add(this.getStringTemplateAdapter());
		endSubroutineStatementEClass.getESuperTypes().add(this.getStringTemplateAdapter());
		eStringTemplateEClass.getESuperTypes().add(ecorePackage.getEDataType());
		executableConstructEClass.getESuperTypes().add(this.getExecutionPartConstruct());
		executionPartEClass.getESuperTypes().add(this.getStringTemplateAdapter());
		executionPartConstructEClass.getESuperTypes().add(this.getStringTemplateAdapter());
		expressionEClass.getESuperTypes().add(this.getArrayConstructorValue());
		functionReferenceEClass.getESuperTypes().add(this.getExpression());
		functionSubprogramEClass.getESuperTypes().add(this.getModuleSubprogram());
		ifStatementEClass.getESuperTypes().add(this.getActionStatement());
		implicitPartEClass.getESuperTypes().add(this.getStringTemplateAdapter());
		implicitPartStatementEClass.getESuperTypes().add(this.getStringTemplateAdapter());
		implicitStatementEClass.getESuperTypes().add(this.getImplicitPartStatement());
		intentAttrSpecEClass.getESuperTypes().add(this.getAttrSpec());
		intrinsicTypeSpecEClass.getESuperTypes().add(this.getTypeSpec());
		literalConstantEClass.getESuperTypes().add(this.getConstant());
		mainProgramEClass.getESuperTypes().add(this.getProgramUnit());
		moduleEClass.getESuperTypes().add(this.getProgramUnit());
		moduleStatementEClass.getESuperTypes().add(this.getStringTemplateAdapter());
		moduleSubprogramEClass.getESuperTypes().add(this.getStringTemplateAdapter());
		moduleSubprogramPartEClass.getESuperTypes().add(this.getStringTemplateAdapter());
		namedConstantEClass.getESuperTypes().add(this.getConstant());
		printStatementEClass.getESuperTypes().add(this.getActionStatement());
		programUnitEClass.getESuperTypes().add(this.getStringTemplateAdapter());
		programStatementEClass.getESuperTypes().add(this.getStringTemplateAdapter());
		saveAttrSpecEClass.getESuperTypes().add(this.getAttrSpec());
		specificationPartEClass.getESuperTypes().add(this.getStringTemplateAdapter());
		specificationStatementEClass.getESuperTypes().add(this.getDeclarationConstruct());
		subroutineStatementEClass.getESuperTypes().add(this.getStringTemplateAdapter());
		subroutineSubprogramEClass.getESuperTypes().add(this.getModuleSubprogram());
		typeDeclarationStatementEClass.getESuperTypes().add(this.getDeclarationConstruct());
		typeSpecEClass.getESuperTypes().add(this.getStringTemplateAdapter());
		useStatementEClass.getESuperTypes().add(this.getStringTemplateAdapter());
		_SpacerEClass.getESuperTypes().add(this.getExecutionPartConstruct());

		// Initialize classes and features; add operations and parameters
		initEClass(accessStatementEClass, AccessStatement.class, "AccessStatement", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getAccessStatement_AccessSpec(), this.getAccessSpec(), "accessSpec", null, 1, 1, AccessStatement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getAccessStatement_AccessIdentifier(), ecorePackage.getEString(), "accessIdentifier", null, 1, -1, AccessStatement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(actionStatementEClass, ActionStatement.class, "ActionStatement", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(actualArgumentSpecEClass, ActualArgumentSpec.class, "ActualArgumentSpec", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getActualArgumentSpec_Keyword(), ecorePackage.getEString(), "keyword", null, 0, 1, ActualArgumentSpec.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getActualArgumentSpec_Argument(), this.getExpression(), null, "argument", null, 1, 1, ActualArgumentSpec.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(arbitraryTextConstructEClass, ArbitraryTextConstruct.class, "ArbitraryTextConstruct", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getArbitraryTextConstruct_Text(), ecorePackage.getEString(), "text", null, 0, 1, ArbitraryTextConstruct.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(arrayConstructorEClass, ArrayConstructor.class, "ArrayConstructor", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getArrayConstructor_ArrayConstructorValue(), this.getArrayConstructorValue(), null, "arrayConstructorValue", null, 1, -1, ArrayConstructor.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(arrayConstructorValueEClass, ArrayConstructorValue.class, "ArrayConstructorValue", IS_ABSTRACT, IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(assignmentStatementEClass, AssignmentStatement.class, "AssignmentStatement", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getAssignmentStatement_Variable(), ecorePackage.getEString(), "variable", null, 1, 1, AssignmentStatement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getAssignmentStatement_Expression(), this.getExpression(), null, "expression", null, 1, 1, AssignmentStatement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(attrSpecEClass, AttrSpec.class, "AttrSpec", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(callStatementEClass, CallStatement.class, "CallStatement", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getCallStatement_SubroutineName(), ecorePackage.getEString(), "subroutineName", null, 1, 1, CallStatement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getCallStatement_ActualArgument(), this.getActualArgumentSpec(), null, "actualArgument", null, 0, -1, CallStatement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(constantEClass, Constant.class, "Constant", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(containsStatementEClass, ContainsStatement.class, "ContainsStatement", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(declarationConstructEClass, DeclarationConstruct.class, "DeclarationConstruct", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(derivedTypeSpecEClass, DerivedTypeSpec.class, "DerivedTypeSpec", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getDerivedTypeSpec_Type(), ecorePackage.getEString(), "type", null, 1, 1, DerivedTypeSpec.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(doConstructEClass, DoConstruct.class, "DoConstruct", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getDoConstruct_DoVariable(), ecorePackage.getEString(), "doVariable", null, 1, 1, DoConstruct.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDoConstruct_Start(), ecorePackage.getEString(), "start", null, 1, 1, DoConstruct.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDoConstruct_End(), ecorePackage.getEString(), "end", null, 1, 1, DoConstruct.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getDoConstruct_ExecutionPartConstruct(), this.getExecutionPartConstruct(), null, "executionPartConstruct", null, 0, -1, DoConstruct.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		EOperation op = addEOperation(doConstructEClass, null, "setStart", 1, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEInt(), "start", 1, 1, IS_UNIQUE, IS_ORDERED);

		op = addEOperation(doConstructEClass, null, "setEnd", 1, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEInt(), "end", 1, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(endModuleStatementEClass, EndModuleStatement.class, "EndModuleStatement", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getEndModuleStatement_ModuleName(), ecorePackage.getEString(), "moduleName", null, 0, 1, EndModuleStatement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(endProgramStatementEClass, EndProgramStatement.class, "EndProgramStatement", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getEndProgramStatement_ProgramName(), ecorePackage.getEString(), "programName", null, 0, 1, EndProgramStatement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(endSubroutineStatementEClass, EndSubroutineStatement.class, "EndSubroutineStatement", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getEndSubroutineStatement_SubroutineName(), ecorePackage.getEString(), "subroutineName", null, 0, 1, EndSubroutineStatement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(eStringTemplateEClass, StringTemplate.class, "EStringTemplate", IS_ABSTRACT, IS_INTERFACE, !IS_GENERATED_INSTANCE_CLASS);

		initEClass(executableConstructEClass, ExecutableConstruct.class, "ExecutableConstruct", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(executionPartEClass, ExecutionPart.class, "ExecutionPart", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getExecutionPart_ExecutionPartConstruct(), this.getExecutionPartConstruct(), null, "executionPartConstruct", null, 0, -1, ExecutionPart.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(executionPartConstructEClass, ExecutionPartConstruct.class, "ExecutionPartConstruct", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(expressionEClass, Expression.class, "Expression", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(functionReferenceEClass, FunctionReference.class, "FunctionReference", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getFunctionReference_FunctionName(), ecorePackage.getEString(), "functionName", null, 1, 1, FunctionReference.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getFunctionReference_ActualArgument(), this.getActualArgumentSpec(), null, "actualArgument", null, 0, -1, FunctionReference.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(functionSubprogramEClass, FunctionSubprogram.class, "FunctionSubprogram", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(ifStatementEClass, IfStatement.class, "IfStatement", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getIfStatement_Test(), this.getExpression(), null, "test", null, 1, 1, IfStatement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getIfStatement_Action(), this.getActionStatement(), null, "action", null, 1, 1, IfStatement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(implicitPartEClass, ImplicitPart.class, "ImplicitPart", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getImplicitPart_ImplicitPartStatement(), this.getImplicitPartStatement(), null, "implicitPartStatement", null, 1, -1, ImplicitPart.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(implicitPartStatementEClass, ImplicitPartStatement.class, "ImplicitPartStatement", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(implicitStatementEClass, ImplicitStatement.class, "ImplicitStatement", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		EGenericType g1 = createEGenericType(ecorePackage.getEEList());
		EGenericType g2 = createEGenericType(ecorePackage.getEObject());
		g1.getETypeArguments().add(g2);
		initEAttribute(getImplicitStatement_ImplicitSpecList(), g1, "implicitSpecList", null, 1, 1, ImplicitStatement.class, IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		addEOperation(implicitStatementEClass, ecorePackage.getEBoolean(), "isNone", 1, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(intentAttrSpecEClass, IntentAttrSpec.class, "IntentAttrSpec", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getIntentAttrSpec_IntentSpec(), this.getIntentSpec(), "intentSpec", null, 1, 1, IntentAttrSpec.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(internalSubprogramPartEClass, InternalSubprogramPart.class, "InternalSubprogramPart", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(intrinsicTypeSpecEClass, IntrinsicTypeSpec.class, "IntrinsicTypeSpec", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getIntrinsicTypeSpec_Type(), this.getIntrinsicType(), "type", null, 1, 1, IntrinsicTypeSpec.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(literalConstantEClass, LiteralConstant.class, "LiteralConstant", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getLiteralConstant_Literal(), ecorePackage.getEString(), "literal", null, 1, 1, LiteralConstant.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(mainProgramEClass, MainProgram.class, "MainProgram", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getMainProgram_ProgramStatement(), this.getProgramStatement(), null, "programStatement", null, 1, 1, MainProgram.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getMainProgram_SpecificationPart(), this.getSpecificationPart(), null, "specificationPart", null, 0, 1, MainProgram.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getMainProgram_ExecutionPart(), this.getExecutionPart(), null, "executionPart", null, 0, 1, MainProgram.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getMainProgram_InternalSubprogramPart(), this.getInternalSubprogramPart(), null, "internalSubprogramPart", null, 0, 1, MainProgram.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getMainProgram_EndProgramStatement(), this.getEndProgramStatement(), null, "endProgramStatement", null, 1, 1, MainProgram.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(moduleEClass, Module.class, "Module", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getModule_ModuleStatement(), this.getModuleStatement(), null, "moduleStatement", null, 1, 1, Module.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getModule_SpecificationPart(), this.getSpecificationPart(), null, "specificationPart", null, 0, 1, Module.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getModule_ModuleSubprogramPart(), this.getModuleSubprogramPart(), null, "moduleSubprogramPart", null, 1, 1, Module.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getModule_EndModuleStatement(), this.getEndModuleStatement(), null, "endModuleStatement", null, 1, 1, Module.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(moduleStatementEClass, ModuleStatement.class, "ModuleStatement", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getModuleStatement_ModuleName(), ecorePackage.getEString(), "moduleName", null, 1, 1, ModuleStatement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(moduleSubprogramEClass, ModuleSubprogram.class, "ModuleSubprogram", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(moduleSubprogramPartEClass, ModuleSubprogramPart.class, "ModuleSubprogramPart", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getModuleSubprogramPart_ContainsStatement(), this.getContainsStatement(), null, "containsStatement", null, 1, 1, ModuleSubprogramPart.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getModuleSubprogramPart_ModuleSubprogram(), this.getModuleSubprogram(), null, "moduleSubprogram", null, 1, -1, ModuleSubprogramPart.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);

		initEClass(namedConstantEClass, NamedConstant.class, "NamedConstant", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getNamedConstant_Name(), ecorePackage.getEString(), "name", null, 1, 1, NamedConstant.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(printStatementEClass, PrintStatement.class, "PrintStatement", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getPrintStatement_Format(), ecorePackage.getEString(), "format", null, 1, 1, PrintStatement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPrintStatement_OutputItem(), ecorePackage.getEString(), "outputItem", null, 0, -1, PrintStatement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(programUnitEClass, ProgramUnit.class, "ProgramUnit", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(programStatementEClass, ProgramStatement.class, "ProgramStatement", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getProgramStatement_ProgramName(), ecorePackage.getEString(), "programName", null, 1, 1, ProgramStatement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(saveAttrSpecEClass, SaveAttrSpec.class, "SaveAttrSpec", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(specificationPartEClass, SpecificationPart.class, "SpecificationPart", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getSpecificationPart_UseStatement(), this.getUseStatement(), null, "useStatement", null, 0, -1, SpecificationPart.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getSpecificationPart_ImplicitPart(), this.getImplicitPart(), null, "implicitPart", null, 0, 1, SpecificationPart.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getSpecificationPart_DeclarationConstruct(), this.getDeclarationConstruct(), null, "declarationConstruct", null, 0, -1, SpecificationPart.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(specificationStatementEClass, SpecificationStatement.class, "SpecificationStatement", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(stringTemplateAdapterEClass, StringTemplateAdapter.class, "StringTemplateAdapter", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getStringTemplateAdapter_StringTemplate(), this.getEStringTemplate(), null, "stringTemplate", null, 1, 1, StringTemplateAdapter.class, !IS_TRANSIENT, !IS_VOLATILE, !IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(subroutineStatementEClass, SubroutineStatement.class, "SubroutineStatement", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getSubroutineStatement_SubroutineName(), ecorePackage.getEString(), "subroutineName", null, 1, 1, SubroutineStatement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getSubroutineStatement_FormalArgument(), ecorePackage.getEString(), "formalArgument", null, 0, -1, SubroutineStatement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(subroutineSubprogramEClass, SubroutineSubprogram.class, "SubroutineSubprogram", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getSubroutineSubprogram_SubroutineStatement(), this.getSubroutineStatement(), null, "subroutineStatement", null, 1, 1, SubroutineSubprogram.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getSubroutineSubprogram_SpecificationPart(), this.getSpecificationPart(), null, "specificationPart", null, 0, 1, SubroutineSubprogram.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getSubroutineSubprogram_ExecutionPart(), this.getExecutionPart(), null, "executionPart", null, 0, 1, SubroutineSubprogram.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getSubroutineSubprogram_InternalSubprogramPart(), this.getInternalSubprogramPart(), null, "internalSubprogramPart", null, 0, 1, SubroutineSubprogram.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getSubroutineSubprogram_EndSubroutineStatement(), this.getEndSubroutineStatement(), null, "endSubroutineStatement", null, 1, 1, SubroutineSubprogram.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(typeDeclarationStatementEClass, TypeDeclarationStatement.class, "TypeDeclarationStatement", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getTypeDeclarationStatement_TypeSpec(), this.getTypeSpec(), null, "typeSpec", null, 1, 1, TypeDeclarationStatement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getTypeDeclarationStatement_AttrSpec(), this.getAttrSpec(), null, "attrSpec", null, 0, -1, TypeDeclarationStatement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getTypeDeclarationStatement_EntityDeclaration(), ecorePackage.getEString(), "entityDeclaration", null, 1, -1, TypeDeclarationStatement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(typeSpecEClass, TypeSpec.class, "TypeSpec", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(useStatementEClass, UseStatement.class, "UseStatement", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getUseStatement_ModuleName(), ecorePackage.getEString(), "moduleName", null, 1, 1, UseStatement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		g1 = createEGenericType(ecorePackage.getEMap());
		g2 = createEGenericType(ecorePackage.getEString());
		g1.getETypeArguments().add(g2);
		g2 = createEGenericType(ecorePackage.getEString());
		g1.getETypeArguments().add(g2);
		initEAttribute(getUseStatement_RenameList(), g1, "renameList", null, 1, 1, UseStatement.class, IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(_SpacerEClass, _Spacer.class, "_Spacer", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		// Initialize enums and add enum literals
		initEEnum(accessSpecEEnum, AccessSpec.class, "AccessSpec");
		addEEnumLiteral(accessSpecEEnum, AccessSpec.PUBLIC);
		addEEnumLiteral(accessSpecEEnum, AccessSpec.PRIVATE);

		initEEnum(intentSpecEEnum, IntentSpec.class, "IntentSpec");
		addEEnumLiteral(intentSpecEEnum, IntentSpec.IN);
		addEEnumLiteral(intentSpecEEnum, IntentSpec.OUT);
		addEEnumLiteral(intentSpecEEnum, IntentSpec.INOUT);

		initEEnum(intrinsicTypeEEnum, IntrinsicType.class, "IntrinsicType");
		addEEnumLiteral(intrinsicTypeEEnum, IntrinsicType.INTEGER);
		addEEnumLiteral(intrinsicTypeEEnum, IntrinsicType.REAL);
		addEEnumLiteral(intrinsicTypeEEnum, IntrinsicType.DOUBLE_PRECISION);
		addEEnumLiteral(intrinsicTypeEEnum, IntrinsicType.COMPLEX);
		addEEnumLiteral(intrinsicTypeEEnum, IntrinsicType.CHARACTER);
		addEEnumLiteral(intrinsicTypeEEnum, IntrinsicType.LOGICAL);

		// Create resource
		createResource(eNS_URI);
	}

} //JFOMPackageImpl
