/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.jfom.util;

import org.antlr.stringtemplate.StringTemplate;


import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;

import org.eclipse.emf.ecore.EClassifier;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EModelElement;
import org.eclipse.emf.ecore.ENamedElement;
import org.eclipse.emf.ecore.EObject;
import org.jfom.*;

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see org.jfom.JFOMPackage
 * @generated
 */
public class FOMAdapterFactory extends AdapterFactoryImpl {
	/**
	 * The cached model package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static JFOMPackage modelPackage;

	/**
	 * Creates an instance of the adapter factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FOMAdapterFactory() {
		if (modelPackage == null) {
			modelPackage = JFOMPackage.eINSTANCE;
		}
	}

	/**
	 * Returns whether this factory is applicable for the type of the object.
	 * <!-- begin-user-doc -->
	 * This implementation returns <code>true</code> if the object is either the model's package or is an instance object of the model.
	 * <!-- end-user-doc -->
	 * @return whether this factory is applicable for the type of the object.
	 * @generated
	 */
	@Override
	public boolean isFactoryForType(Object object) {
		if (object == modelPackage) {
			return true;
		}
		if (object instanceof EObject) {
			return ((EObject)object).eClass().getEPackage() == modelPackage;
		}
		return false;
	}

	/**
	 * The switch that delegates to the <code>createXXX</code> methods.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected FOMSwitch<Adapter> modelSwitch =
		new FOMSwitch<Adapter>() {
			@Override
			public Adapter caseAccessStatement(AccessStatement object) {
				return createAccessStatementAdapter();
			}
			@Override
			public Adapter caseActionStatement(ActionStatement object) {
				return createActionStatementAdapter();
			}
			@Override
			public Adapter caseActualArgumentSpec(ActualArgumentSpec object) {
				return createActualArgumentSpecAdapter();
			}
			@Override
			public Adapter caseArbitraryTextConstruct(ArbitraryTextConstruct object) {
				return createArbitraryTextConstructAdapter();
			}
			@Override
			public Adapter caseArrayConstructor(ArrayConstructor object) {
				return createArrayConstructorAdapter();
			}
			@Override
			public Adapter caseArrayConstructorValue(ArrayConstructorValue object) {
				return createArrayConstructorValueAdapter();
			}
			@Override
			public Adapter caseAssignmentStatement(AssignmentStatement object) {
				return createAssignmentStatementAdapter();
			}
			@Override
			public Adapter caseAttrSpec(AttrSpec object) {
				return createAttrSpecAdapter();
			}
			@Override
			public Adapter caseCallStatement(CallStatement object) {
				return createCallStatementAdapter();
			}
			@Override
			public Adapter caseConstant(Constant object) {
				return createConstantAdapter();
			}
			@Override
			public Adapter caseContainsStatement(ContainsStatement object) {
				return createContainsStatementAdapter();
			}
			@Override
			public Adapter caseDeclarationConstruct(DeclarationConstruct object) {
				return createDeclarationConstructAdapter();
			}
			@Override
			public Adapter caseDerivedTypeSpec(DerivedTypeSpec object) {
				return createDerivedTypeSpecAdapter();
			}
			@Override
			public Adapter caseDoConstruct(DoConstruct object) {
				return createDoConstructAdapter();
			}
			@Override
			public Adapter caseEndModuleStatement(EndModuleStatement object) {
				return createEndModuleStatementAdapter();
			}
			@Override
			public Adapter caseEndProgramStatement(EndProgramStatement object) {
				return createEndProgramStatementAdapter();
			}
			@Override
			public Adapter caseEndSubroutineStatement(EndSubroutineStatement object) {
				return createEndSubroutineStatementAdapter();
			}
			@Override
			public Adapter caseEStringTemplate(StringTemplate object) {
				return createEStringTemplateAdapter();
			}
			@Override
			public Adapter caseExecutableConstruct(ExecutableConstruct object) {
				return createExecutableConstructAdapter();
			}
			@Override
			public Adapter caseExecutionPart(ExecutionPart object) {
				return createExecutionPartAdapter();
			}
			@Override
			public Adapter caseExecutionPartConstruct(ExecutionPartConstruct object) {
				return createExecutionPartConstructAdapter();
			}
			@Override
			public Adapter caseExpression(Expression object) {
				return createExpressionAdapter();
			}
			@Override
			public Adapter caseFunctionReference(FunctionReference object) {
				return createFunctionReferenceAdapter();
			}
			@Override
			public Adapter caseFunctionSubprogram(FunctionSubprogram object) {
				return createFunctionSubprogramAdapter();
			}
			@Override
			public Adapter caseIfStatement(IfStatement object) {
				return createIfStatementAdapter();
			}
			@Override
			public Adapter caseImplicitPart(ImplicitPart object) {
				return createImplicitPartAdapter();
			}
			@Override
			public Adapter caseImplicitPartStatement(ImplicitPartStatement object) {
				return createImplicitPartStatementAdapter();
			}
			@Override
			public Adapter caseImplicitStatement(ImplicitStatement object) {
				return createImplicitStatementAdapter();
			}
			@Override
			public Adapter caseIntentAttrSpec(IntentAttrSpec object) {
				return createIntentAttrSpecAdapter();
			}
			@Override
			public Adapter caseInternalSubprogramPart(InternalSubprogramPart object) {
				return createInternalSubprogramPartAdapter();
			}
			@Override
			public Adapter caseIntrinsicTypeSpec(IntrinsicTypeSpec object) {
				return createIntrinsicTypeSpecAdapter();
			}
			@Override
			public Adapter caseLiteralConstant(LiteralConstant object) {
				return createLiteralConstantAdapter();
			}
			@Override
			public Adapter caseMainProgram(MainProgram object) {
				return createMainProgramAdapter();
			}
			@Override
			public Adapter caseModule(Module object) {
				return createModuleAdapter();
			}
			@Override
			public Adapter caseModuleStatement(ModuleStatement object) {
				return createModuleStatementAdapter();
			}
			@Override
			public Adapter caseModuleSubprogram(ModuleSubprogram object) {
				return createModuleSubprogramAdapter();
			}
			@Override
			public Adapter caseModuleSubprogramPart(ModuleSubprogramPart object) {
				return createModuleSubprogramPartAdapter();
			}
			@Override
			public Adapter caseNamedConstant(NamedConstant object) {
				return createNamedConstantAdapter();
			}
			@Override
			public Adapter casePrintStatement(PrintStatement object) {
				return createPrintStatementAdapter();
			}
			@Override
			public Adapter caseProgramUnit(ProgramUnit object) {
				return createProgramUnitAdapter();
			}
			@Override
			public Adapter caseProgramStatement(ProgramStatement object) {
				return createProgramStatementAdapter();
			}
			@Override
			public Adapter caseSaveAttrSpec(SaveAttrSpec object) {
				return createSaveAttrSpecAdapter();
			}
			@Override
			public Adapter caseSpecificationPart(SpecificationPart object) {
				return createSpecificationPartAdapter();
			}
			@Override
			public Adapter caseSpecificationStatement(SpecificationStatement object) {
				return createSpecificationStatementAdapter();
			}
			@Override
			public Adapter caseStringTemplateAdapter(StringTemplateAdapter object) {
				return createStringTemplateAdapterAdapter();
			}
			@Override
			public Adapter caseSubroutineStatement(SubroutineStatement object) {
				return createSubroutineStatementAdapter();
			}
			@Override
			public Adapter caseSubroutineSubprogram(SubroutineSubprogram object) {
				return createSubroutineSubprogramAdapter();
			}
			@Override
			public Adapter caseTypeDeclarationStatement(TypeDeclarationStatement object) {
				return createTypeDeclarationStatementAdapter();
			}
			@Override
			public Adapter caseTypeSpec(TypeSpec object) {
				return createTypeSpecAdapter();
			}
			@Override
			public Adapter caseUseStatement(UseStatement object) {
				return createUseStatementAdapter();
			}
			@Override
			public Adapter case_Spacer(_Spacer object) {
				return create_SpacerAdapter();
			}
			@Override
			public Adapter caseEModelElement(EModelElement object) {
				return createEModelElementAdapter();
			}
			@Override
			public Adapter caseENamedElement(ENamedElement object) {
				return createENamedElementAdapter();
			}
			@Override
			public Adapter caseEClassifier(EClassifier object) {
				return createEClassifierAdapter();
			}
			@Override
			public Adapter caseEDataType(EDataType object) {
				return createEDataTypeAdapter();
			}
			@Override
			public Adapter defaultCase(EObject object) {
				return createEObjectAdapter();
			}
		};

	/**
	 * Creates an adapter for the <code>target</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param target the object to adapt.
	 * @return the adapter for the <code>target</code>.
	 * @generated
	 */
	@Override
	public Adapter createAdapter(Notifier target) {
		return modelSwitch.doSwitch((EObject)target);
	}


	/**
	 * Creates a new adapter for an object of class '{@link org.jfom.AccessStatement <em>Access Statement</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.jfom.AccessStatement
	 * @generated
	 */
	public Adapter createAccessStatementAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.jfom.ProgramUnit <em>Program Unit</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.jfom.ProgramUnit
	 * @generated
	 */
	public Adapter createProgramUnitAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.jfom.MainProgram <em>Main Program</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.jfom.MainProgram
	 * @generated
	 */
	public Adapter createMainProgramAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.jfom.Module <em>Module</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.jfom.Module
	 * @generated
	 */
	public Adapter createModuleAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.jfom.SpecificationPart <em>Specification Part</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.jfom.SpecificationPart
	 * @generated
	 */
	public Adapter createSpecificationPartAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.jfom.SpecificationStatement <em>Specification Statement</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.jfom.SpecificationStatement
	 * @generated
	 */
	public Adapter createSpecificationStatementAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.jfom.ExecutionPart <em>Execution Part</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.jfom.ExecutionPart
	 * @generated
	 */
	public Adapter createExecutionPartAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.jfom.InternalSubprogramPart <em>Internal Subprogram Part</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.jfom.InternalSubprogramPart
	 * @generated
	 */
	public Adapter createInternalSubprogramPartAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.jfom.UseStatement <em>Use Statement</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.jfom.UseStatement
	 * @generated
	 */
	public Adapter createUseStatementAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.jfom.ImplicitPart <em>Implicit Part</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.jfom.ImplicitPart
	 * @generated
	 */
	public Adapter createImplicitPartAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.jfom.DeclarationConstruct <em>Declaration Construct</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.jfom.DeclarationConstruct
	 * @generated
	 */
	public Adapter createDeclarationConstructAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.jfom.ImplicitStatement <em>Implicit Statement</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.jfom.ImplicitStatement
	 * @generated
	 */
	public Adapter createImplicitStatementAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.jfom.IntentAttrSpec <em>Intent Attr Spec</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.jfom.IntentAttrSpec
	 * @generated
	 */
	public Adapter createIntentAttrSpecAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.jfom.ImplicitPartStatement <em>Implicit Part Statement</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.jfom.ImplicitPartStatement
	 * @generated
	 */
	public Adapter createImplicitPartStatementAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.jfom.ExecutionPartConstruct <em>Execution Part Construct</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.jfom.ExecutionPartConstruct
	 * @generated
	 */
	public Adapter createExecutionPartConstructAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.jfom.ExecutableConstruct <em>Executable Construct</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.jfom.ExecutableConstruct
	 * @generated
	 */
	public Adapter createExecutableConstructAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.jfom.DoConstruct <em>Do Construct</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.jfom.DoConstruct
	 * @generated
	 */
	public Adapter createDoConstructAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.jfom.StringTemplateAdapter <em>String Template Adapter</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.jfom.StringTemplateAdapter
	 * @generated
	 */
	public Adapter createStringTemplateAdapterAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.jfom.EndProgramStatement <em>End Program Statement</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.jfom.EndProgramStatement
	 * @generated
	 */
	public Adapter createEndProgramStatementAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.jfom.AssignmentStatement <em>Assignment Statement</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.jfom.AssignmentStatement
	 * @generated
	 */
	public Adapter createAssignmentStatementAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.jfom.AttrSpec <em>Attr Spec</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.jfom.AttrSpec
	 * @generated
	 */
	public Adapter createAttrSpecAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.jfom._Spacer <em>Spacer</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.jfom._Spacer
	 * @generated
	 */
	public Adapter create_SpacerAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.jfom.PrintStatement <em>Print Statement</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.jfom.PrintStatement
	 * @generated
	 */
	public Adapter createPrintStatementAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.jfom.ModuleStatement <em>Module Statement</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.jfom.ModuleStatement
	 * @generated
	 */
	public Adapter createModuleStatementAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.jfom.EndModuleStatement <em>End Module Statement</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.jfom.EndModuleStatement
	 * @generated
	 */
	public Adapter createEndModuleStatementAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.jfom.ModuleSubprogramPart <em>Module Subprogram Part</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.jfom.ModuleSubprogramPart
	 * @generated
	 */
	public Adapter createModuleSubprogramPartAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.jfom.NamedConstant <em>Named Constant</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.jfom.NamedConstant
	 * @generated
	 */
	public Adapter createNamedConstantAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.jfom.ContainsStatement <em>Contains Statement</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.jfom.ContainsStatement
	 * @generated
	 */
	public Adapter createContainsStatementAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.jfom.ModuleSubprogram <em>Module Subprogram</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.jfom.ModuleSubprogram
	 * @generated
	 */
	public Adapter createModuleSubprogramAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.jfom.FunctionSubprogram <em>Function Subprogram</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.jfom.FunctionSubprogram
	 * @generated
	 */
	public Adapter createFunctionSubprogramAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.jfom.SubroutineSubprogram <em>Subroutine Subprogram</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.jfom.SubroutineSubprogram
	 * @generated
	 */
	public Adapter createSubroutineSubprogramAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.jfom.SubroutineStatement <em>Subroutine Statement</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.jfom.SubroutineStatement
	 * @generated
	 */
	public Adapter createSubroutineStatementAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.jfom.EndSubroutineStatement <em>End Subroutine Statement</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.jfom.EndSubroutineStatement
	 * @generated
	 */
	public Adapter createEndSubroutineStatementAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.antlr.stringtemplate.StringTemplate <em>EString Template</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.antlr.stringtemplate.StringTemplate
	 * @generated
	 */
	public Adapter createEStringTemplateAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.jfom.ArbitraryTextConstruct <em>Arbitrary Text Construct</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.jfom.ArbitraryTextConstruct
	 * @generated
	 */
	public Adapter createArbitraryTextConstructAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.jfom.ArrayConstructor <em>Array Constructor</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.jfom.ArrayConstructor
	 * @generated
	 */
	public Adapter createArrayConstructorAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.jfom.ArrayConstructorValue <em>Array Constructor Value</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.jfom.ArrayConstructorValue
	 * @generated
	 */
	public Adapter createArrayConstructorValueAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.jfom.ProgramStatement <em>Program Statement</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.jfom.ProgramStatement
	 * @generated
	 */
	public Adapter createProgramStatementAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.jfom.SaveAttrSpec <em>Save Attr Spec</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.jfom.SaveAttrSpec
	 * @generated
	 */
	public Adapter createSaveAttrSpecAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.jfom.TypeDeclarationStatement <em>Type Declaration Statement</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.jfom.TypeDeclarationStatement
	 * @generated
	 */
	public Adapter createTypeDeclarationStatementAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.jfom.TypeSpec <em>Type Spec</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.jfom.TypeSpec
	 * @generated
	 */
	public Adapter createTypeSpecAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.jfom.IntrinsicTypeSpec <em>Intrinsic Type Spec</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.jfom.IntrinsicTypeSpec
	 * @generated
	 */
	public Adapter createIntrinsicTypeSpecAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.jfom.LiteralConstant <em>Literal Constant</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.jfom.LiteralConstant
	 * @generated
	 */
	public Adapter createLiteralConstantAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.jfom.DerivedTypeSpec <em>Derived Type Spec</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.jfom.DerivedTypeSpec
	 * @generated
	 */
	public Adapter createDerivedTypeSpecAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.jfom.ActionStatement <em>Action Statement</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.jfom.ActionStatement
	 * @generated
	 */
	public Adapter createActionStatementAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.jfom.CallStatement <em>Call Statement</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.jfom.CallStatement
	 * @generated
	 */
	public Adapter createCallStatementAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.jfom.Constant <em>Constant</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.jfom.Constant
	 * @generated
	 */
	public Adapter createConstantAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.jfom.ActualArgumentSpec <em>Actual Argument Spec</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.jfom.ActualArgumentSpec
	 * @generated
	 */
	public Adapter createActualArgumentSpecAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.jfom.IfStatement <em>If Statement</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.jfom.IfStatement
	 * @generated
	 */
	public Adapter createIfStatementAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.jfom.Expression <em>Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.jfom.Expression
	 * @generated
	 */
	public Adapter createExpressionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.jfom.FunctionReference <em>Function Reference</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.jfom.FunctionReference
	 * @generated
	 */
	public Adapter createFunctionReferenceAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.emf.ecore.EModelElement <em>EModel Element</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.emf.ecore.EModelElement
	 * @generated
	 */
	public Adapter createEModelElementAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.emf.ecore.ENamedElement <em>ENamed Element</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.emf.ecore.ENamedElement
	 * @generated
	 */
	public Adapter createENamedElementAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.emf.ecore.EClassifier <em>EClassifier</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.emf.ecore.EClassifier
	 * @generated
	 */
	public Adapter createEClassifierAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.emf.ecore.EDataType <em>EData Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.emf.ecore.EDataType
	 * @generated
	 */
	public Adapter createEDataTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for the default case.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @generated
	 */
	public Adapter createEObjectAdapter() {
		return null;
	}

} //FOMAdapterFactory
