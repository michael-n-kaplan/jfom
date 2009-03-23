/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.jfom.util;

import java.util.List;

import org.antlr.stringtemplate.StringTemplate;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EClassifier;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EModelElement;
import org.eclipse.emf.ecore.ENamedElement;
import org.eclipse.emf.ecore.EObject;

import org.jfom.*;

/**
 * <!-- begin-user-doc -->
 * The <b>Switch</b> for the model's inheritance hierarchy.
 * It supports the call {@link #doSwitch(EObject) doSwitch(object)}
 * to invoke the <code>caseXXX</code> method for each class of the model,
 * starting with the actual class of the object
 * and proceeding up the inheritance hierarchy
 * until a non-null result is returned,
 * which is the result of the switch.
 * <!-- end-user-doc -->
 * @see org.jfom.JFOMPackage
 * @generated
 */
public class JFOMSwitch<T> {
	/**
	 * The cached model package
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static JFOMPackage modelPackage;

	/**
	 * Creates an instance of the switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public JFOMSwitch() {
		if (modelPackage == null) {
			modelPackage = JFOMPackage.eINSTANCE;
		}
	}

	/**
	 * Calls <code>caseXXX</code> for each class of the model until one returns a non null result; it yields that result.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the first non-null result returned by a <code>caseXXX</code> call.
	 * @generated
	 */
	public T doSwitch(EObject theEObject) {
		return doSwitch(theEObject.eClass(), theEObject);
	}

	/**
	 * Calls <code>caseXXX</code> for each class of the model until one returns a non null result; it yields that result.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the first non-null result returned by a <code>caseXXX</code> call.
	 * @generated
	 */
	protected T doSwitch(EClass theEClass, EObject theEObject) {
		if (theEClass.eContainer() == modelPackage) {
			return doSwitch(theEClass.getClassifierID(), theEObject);
		}
		else {
			List<EClass> eSuperTypes = theEClass.getESuperTypes();
			return
				eSuperTypes.isEmpty() ?
					defaultCase(theEObject) :
					doSwitch(eSuperTypes.get(0), theEObject);
		}
	}

	/**
	 * Calls <code>caseXXX</code> for each class of the model until one returns a non null result; it yields that result.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the first non-null result returned by a <code>caseXXX</code> call.
	 * @generated
	 */
	protected T doSwitch(int classifierID, EObject theEObject) {
		switch (classifierID) {
			case JFOMPackage.ACCESS_STATEMENT: {
				AccessStatement accessStatement = (AccessStatement)theEObject;
				T result = caseAccessStatement(accessStatement);
				if (result == null) result = caseSpecificationStatement(accessStatement);
				if (result == null) result = caseDeclarationConstruct(accessStatement);
				if (result == null) result = caseStringTemplateAdapter(accessStatement);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case JFOMPackage.ACTION_STATEMENT: {
				ActionStatement actionStatement = (ActionStatement)theEObject;
				T result = caseActionStatement(actionStatement);
				if (result == null) result = caseExecutableConstruct(actionStatement);
				if (result == null) result = caseExecutionPartConstruct(actionStatement);
				if (result == null) result = caseStringTemplateAdapter(actionStatement);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case JFOMPackage.ACTUAL_ARGUMENT_SPEC: {
				ActualArgumentSpec actualArgumentSpec = (ActualArgumentSpec)theEObject;
				T result = caseActualArgumentSpec(actualArgumentSpec);
				if (result == null) result = caseStringTemplateAdapter(actualArgumentSpec);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case JFOMPackage.ARBITRARY_TEXT_CONSTRUCT: {
				ArbitraryTextConstruct arbitraryTextConstruct = (ArbitraryTextConstruct)theEObject;
				T result = caseArbitraryTextConstruct(arbitraryTextConstruct);
				if (result == null) result = caseExecutableConstruct(arbitraryTextConstruct);
				if (result == null) result = caseExecutionPartConstruct(arbitraryTextConstruct);
				if (result == null) result = caseStringTemplateAdapter(arbitraryTextConstruct);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case JFOMPackage.ARRAY_CONSTRUCTOR: {
				ArrayConstructor arrayConstructor = (ArrayConstructor)theEObject;
				T result = caseArrayConstructor(arrayConstructor);
				if (result == null) result = caseExpression(arrayConstructor);
				if (result == null) result = caseArrayConstructorValue(arrayConstructor);
				if (result == null) result = caseStringTemplateAdapter(arrayConstructor);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case JFOMPackage.ARRAY_CONSTRUCTOR_VALUE: {
				ArrayConstructorValue arrayConstructorValue = (ArrayConstructorValue)theEObject;
				T result = caseArrayConstructorValue(arrayConstructorValue);
				if (result == null) result = caseStringTemplateAdapter(arrayConstructorValue);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case JFOMPackage.ASSIGNMENT_STATEMENT: {
				AssignmentStatement assignmentStatement = (AssignmentStatement)theEObject;
				T result = caseAssignmentStatement(assignmentStatement);
				if (result == null) result = caseActionStatement(assignmentStatement);
				if (result == null) result = caseExecutableConstruct(assignmentStatement);
				if (result == null) result = caseExecutionPartConstruct(assignmentStatement);
				if (result == null) result = caseStringTemplateAdapter(assignmentStatement);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case JFOMPackage.ATTR_SPEC: {
				AttrSpec attrSpec = (AttrSpec)theEObject;
				T result = caseAttrSpec(attrSpec);
				if (result == null) result = caseStringTemplateAdapter(attrSpec);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case JFOMPackage.CALL_STATEMENT: {
				CallStatement callStatement = (CallStatement)theEObject;
				T result = caseCallStatement(callStatement);
				if (result == null) result = caseActionStatement(callStatement);
				if (result == null) result = caseExecutableConstruct(callStatement);
				if (result == null) result = caseExecutionPartConstruct(callStatement);
				if (result == null) result = caseStringTemplateAdapter(callStatement);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case JFOMPackage.CONSTANT: {
				Constant constant = (Constant)theEObject;
				T result = caseConstant(constant);
				if (result == null) result = caseExpression(constant);
				if (result == null) result = caseArrayConstructorValue(constant);
				if (result == null) result = caseStringTemplateAdapter(constant);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case JFOMPackage.CONTAINS_STATEMENT: {
				ContainsStatement containsStatement = (ContainsStatement)theEObject;
				T result = caseContainsStatement(containsStatement);
				if (result == null) result = caseStringTemplateAdapter(containsStatement);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case JFOMPackage.DECLARATION_CONSTRUCT: {
				DeclarationConstruct declarationConstruct = (DeclarationConstruct)theEObject;
				T result = caseDeclarationConstruct(declarationConstruct);
				if (result == null) result = caseStringTemplateAdapter(declarationConstruct);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case JFOMPackage.DERIVED_TYPE_SPEC: {
				DerivedTypeSpec derivedTypeSpec = (DerivedTypeSpec)theEObject;
				T result = caseDerivedTypeSpec(derivedTypeSpec);
				if (result == null) result = caseTypeSpec(derivedTypeSpec);
				if (result == null) result = caseStringTemplateAdapter(derivedTypeSpec);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case JFOMPackage.DO_CONSTRUCT: {
				DoConstruct doConstruct = (DoConstruct)theEObject;
				T result = caseDoConstruct(doConstruct);
				if (result == null) result = caseExecutableConstruct(doConstruct);
				if (result == null) result = caseExecutionPartConstruct(doConstruct);
				if (result == null) result = caseStringTemplateAdapter(doConstruct);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case JFOMPackage.END_MODULE_STATEMENT: {
				EndModuleStatement endModuleStatement = (EndModuleStatement)theEObject;
				T result = caseEndModuleStatement(endModuleStatement);
				if (result == null) result = caseStringTemplateAdapter(endModuleStatement);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case JFOMPackage.END_PROGRAM_STATEMENT: {
				EndProgramStatement endProgramStatement = (EndProgramStatement)theEObject;
				T result = caseEndProgramStatement(endProgramStatement);
				if (result == null) result = caseStringTemplateAdapter(endProgramStatement);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case JFOMPackage.END_SUBROUTINE_STATEMENT: {
				EndSubroutineStatement endSubroutineStatement = (EndSubroutineStatement)theEObject;
				T result = caseEndSubroutineStatement(endSubroutineStatement);
				if (result == null) result = caseStringTemplateAdapter(endSubroutineStatement);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case JFOMPackage.EXECUTABLE_CONSTRUCT: {
				ExecutableConstruct executableConstruct = (ExecutableConstruct)theEObject;
				T result = caseExecutableConstruct(executableConstruct);
				if (result == null) result = caseExecutionPartConstruct(executableConstruct);
				if (result == null) result = caseStringTemplateAdapter(executableConstruct);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case JFOMPackage.EXECUTION_PART: {
				ExecutionPart executionPart = (ExecutionPart)theEObject;
				T result = caseExecutionPart(executionPart);
				if (result == null) result = caseStringTemplateAdapter(executionPart);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case JFOMPackage.EXECUTION_PART_CONSTRUCT: {
				ExecutionPartConstruct executionPartConstruct = (ExecutionPartConstruct)theEObject;
				T result = caseExecutionPartConstruct(executionPartConstruct);
				if (result == null) result = caseStringTemplateAdapter(executionPartConstruct);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case JFOMPackage.EXPRESSION: {
				Expression expression = (Expression)theEObject;
				T result = caseExpression(expression);
				if (result == null) result = caseArrayConstructorValue(expression);
				if (result == null) result = caseStringTemplateAdapter(expression);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case JFOMPackage.FUNCTION_REFERENCE: {
				FunctionReference functionReference = (FunctionReference)theEObject;
				T result = caseFunctionReference(functionReference);
				if (result == null) result = caseExpression(functionReference);
				if (result == null) result = caseArrayConstructorValue(functionReference);
				if (result == null) result = caseStringTemplateAdapter(functionReference);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case JFOMPackage.FUNCTION_SUBPROGRAM: {
				FunctionSubprogram functionSubprogram = (FunctionSubprogram)theEObject;
				T result = caseFunctionSubprogram(functionSubprogram);
				if (result == null) result = caseModuleSubprogram(functionSubprogram);
				if (result == null) result = caseStringTemplateAdapter(functionSubprogram);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case JFOMPackage.IF_STATEMENT: {
				IfStatement ifStatement = (IfStatement)theEObject;
				T result = caseIfStatement(ifStatement);
				if (result == null) result = caseActionStatement(ifStatement);
				if (result == null) result = caseExecutableConstruct(ifStatement);
				if (result == null) result = caseExecutionPartConstruct(ifStatement);
				if (result == null) result = caseStringTemplateAdapter(ifStatement);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case JFOMPackage.IMPLICIT_PART: {
				ImplicitPart implicitPart = (ImplicitPart)theEObject;
				T result = caseImplicitPart(implicitPart);
				if (result == null) result = caseStringTemplateAdapter(implicitPart);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case JFOMPackage.IMPLICIT_PART_STATEMENT: {
				ImplicitPartStatement implicitPartStatement = (ImplicitPartStatement)theEObject;
				T result = caseImplicitPartStatement(implicitPartStatement);
				if (result == null) result = caseStringTemplateAdapter(implicitPartStatement);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case JFOMPackage.IMPLICIT_STATEMENT: {
				ImplicitStatement implicitStatement = (ImplicitStatement)theEObject;
				T result = caseImplicitStatement(implicitStatement);
				if (result == null) result = caseImplicitPartStatement(implicitStatement);
				if (result == null) result = caseStringTemplateAdapter(implicitStatement);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case JFOMPackage.INTENT_ATTR_SPEC: {
				IntentAttrSpec intentAttrSpec = (IntentAttrSpec)theEObject;
				T result = caseIntentAttrSpec(intentAttrSpec);
				if (result == null) result = caseAttrSpec(intentAttrSpec);
				if (result == null) result = caseStringTemplateAdapter(intentAttrSpec);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case JFOMPackage.INTERNAL_SUBPROGRAM_PART: {
				InternalSubprogramPart internalSubprogramPart = (InternalSubprogramPart)theEObject;
				T result = caseInternalSubprogramPart(internalSubprogramPart);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case JFOMPackage.INTRINSIC_TYPE_SPEC: {
				IntrinsicTypeSpec intrinsicTypeSpec = (IntrinsicTypeSpec)theEObject;
				T result = caseIntrinsicTypeSpec(intrinsicTypeSpec);
				if (result == null) result = caseTypeSpec(intrinsicTypeSpec);
				if (result == null) result = caseStringTemplateAdapter(intrinsicTypeSpec);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case JFOMPackage.LITERAL_CONSTANT: {
				LiteralConstant literalConstant = (LiteralConstant)theEObject;
				T result = caseLiteralConstant(literalConstant);
				if (result == null) result = caseConstant(literalConstant);
				if (result == null) result = caseExpression(literalConstant);
				if (result == null) result = caseArrayConstructorValue(literalConstant);
				if (result == null) result = caseStringTemplateAdapter(literalConstant);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case JFOMPackage.MAIN_PROGRAM: {
				MainProgram mainProgram = (MainProgram)theEObject;
				T result = caseMainProgram(mainProgram);
				if (result == null) result = caseProgramUnit(mainProgram);
				if (result == null) result = caseStringTemplateAdapter(mainProgram);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case JFOMPackage.MODULE: {
				Module module = (Module)theEObject;
				T result = caseModule(module);
				if (result == null) result = caseProgramUnit(module);
				if (result == null) result = caseStringTemplateAdapter(module);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case JFOMPackage.MODULE_STATEMENT: {
				ModuleStatement moduleStatement = (ModuleStatement)theEObject;
				T result = caseModuleStatement(moduleStatement);
				if (result == null) result = caseStringTemplateAdapter(moduleStatement);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case JFOMPackage.MODULE_SUBPROGRAM: {
				ModuleSubprogram moduleSubprogram = (ModuleSubprogram)theEObject;
				T result = caseModuleSubprogram(moduleSubprogram);
				if (result == null) result = caseStringTemplateAdapter(moduleSubprogram);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case JFOMPackage.MODULE_SUBPROGRAM_PART: {
				ModuleSubprogramPart moduleSubprogramPart = (ModuleSubprogramPart)theEObject;
				T result = caseModuleSubprogramPart(moduleSubprogramPart);
				if (result == null) result = caseStringTemplateAdapter(moduleSubprogramPart);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case JFOMPackage.NAMED_CONSTANT: {
				NamedConstant namedConstant = (NamedConstant)theEObject;
				T result = caseNamedConstant(namedConstant);
				if (result == null) result = caseConstant(namedConstant);
				if (result == null) result = caseExpression(namedConstant);
				if (result == null) result = caseArrayConstructorValue(namedConstant);
				if (result == null) result = caseStringTemplateAdapter(namedConstant);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case JFOMPackage.PRINT_STATEMENT: {
				PrintStatement printStatement = (PrintStatement)theEObject;
				T result = casePrintStatement(printStatement);
				if (result == null) result = caseActionStatement(printStatement);
				if (result == null) result = caseExecutableConstruct(printStatement);
				if (result == null) result = caseExecutionPartConstruct(printStatement);
				if (result == null) result = caseStringTemplateAdapter(printStatement);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case JFOMPackage.PROGRAM_UNIT: {
				ProgramUnit programUnit = (ProgramUnit)theEObject;
				T result = caseProgramUnit(programUnit);
				if (result == null) result = caseStringTemplateAdapter(programUnit);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case JFOMPackage.PROGRAM_STATEMENT: {
				ProgramStatement programStatement = (ProgramStatement)theEObject;
				T result = caseProgramStatement(programStatement);
				if (result == null) result = caseStringTemplateAdapter(programStatement);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case JFOMPackage.SAVE_ATTR_SPEC: {
				SaveAttrSpec saveAttrSpec = (SaveAttrSpec)theEObject;
				T result = caseSaveAttrSpec(saveAttrSpec);
				if (result == null) result = caseAttrSpec(saveAttrSpec);
				if (result == null) result = caseStringTemplateAdapter(saveAttrSpec);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case JFOMPackage.SPECIFICATION_PART: {
				SpecificationPart specificationPart = (SpecificationPart)theEObject;
				T result = caseSpecificationPart(specificationPart);
				if (result == null) result = caseStringTemplateAdapter(specificationPart);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case JFOMPackage.SPECIFICATION_STATEMENT: {
				SpecificationStatement specificationStatement = (SpecificationStatement)theEObject;
				T result = caseSpecificationStatement(specificationStatement);
				if (result == null) result = caseDeclarationConstruct(specificationStatement);
				if (result == null) result = caseStringTemplateAdapter(specificationStatement);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case JFOMPackage.STRING_TEMPLATE_ADAPTER: {
				StringTemplateAdapter stringTemplateAdapter = (StringTemplateAdapter)theEObject;
				T result = caseStringTemplateAdapter(stringTemplateAdapter);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case JFOMPackage.SUBROUTINE_STATEMENT: {
				SubroutineStatement subroutineStatement = (SubroutineStatement)theEObject;
				T result = caseSubroutineStatement(subroutineStatement);
				if (result == null) result = caseStringTemplateAdapter(subroutineStatement);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case JFOMPackage.SUBROUTINE_SUBPROGRAM: {
				SubroutineSubprogram subroutineSubprogram = (SubroutineSubprogram)theEObject;
				T result = caseSubroutineSubprogram(subroutineSubprogram);
				if (result == null) result = caseModuleSubprogram(subroutineSubprogram);
				if (result == null) result = caseStringTemplateAdapter(subroutineSubprogram);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case JFOMPackage.TYPE_DECLARATION_STATEMENT: {
				TypeDeclarationStatement typeDeclarationStatement = (TypeDeclarationStatement)theEObject;
				T result = caseTypeDeclarationStatement(typeDeclarationStatement);
				if (result == null) result = caseDeclarationConstruct(typeDeclarationStatement);
				if (result == null) result = caseStringTemplateAdapter(typeDeclarationStatement);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case JFOMPackage.TYPE_SPEC: {
				TypeSpec typeSpec = (TypeSpec)theEObject;
				T result = caseTypeSpec(typeSpec);
				if (result == null) result = caseStringTemplateAdapter(typeSpec);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case JFOMPackage.USE_STATEMENT: {
				UseStatement useStatement = (UseStatement)theEObject;
				T result = caseUseStatement(useStatement);
				if (result == null) result = caseStringTemplateAdapter(useStatement);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case JFOMPackage._SPACER: {
				_Spacer _Spacer = (_Spacer)theEObject;
				T result = case_Spacer(_Spacer);
				if (result == null) result = caseExecutionPartConstruct(_Spacer);
				if (result == null) result = caseStringTemplateAdapter(_Spacer);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			default: return defaultCase(theEObject);
		}
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Access Statement</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Access Statement</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAccessStatement(AccessStatement object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Action Statement</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Action Statement</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseActionStatement(ActionStatement object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Actual Argument Spec</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Actual Argument Spec</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseActualArgumentSpec(ActualArgumentSpec object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Arbitrary Text Construct</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Arbitrary Text Construct</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseArbitraryTextConstruct(ArbitraryTextConstruct object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Array Constructor</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Array Constructor</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseArrayConstructor(ArrayConstructor object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Array Constructor Value</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Array Constructor Value</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseArrayConstructorValue(ArrayConstructorValue object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Assignment Statement</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Assignment Statement</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAssignmentStatement(AssignmentStatement object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Attr Spec</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Attr Spec</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAttrSpec(AttrSpec object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Call Statement</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Call Statement</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCallStatement(CallStatement object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Constant</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Constant</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseConstant(Constant object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Contains Statement</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Contains Statement</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseContainsStatement(ContainsStatement object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Declaration Construct</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Declaration Construct</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDeclarationConstruct(DeclarationConstruct object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Derived Type Spec</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Derived Type Spec</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDerivedTypeSpec(DerivedTypeSpec object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Do Construct</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Do Construct</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDoConstruct(DoConstruct object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>End Module Statement</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>End Module Statement</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseEndModuleStatement(EndModuleStatement object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>End Program Statement</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>End Program Statement</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseEndProgramStatement(EndProgramStatement object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>End Subroutine Statement</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>End Subroutine Statement</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseEndSubroutineStatement(EndSubroutineStatement object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>EString Template</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>EString Template</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseEStringTemplate(StringTemplate object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Executable Construct</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Executable Construct</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseExecutableConstruct(ExecutableConstruct object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Execution Part</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Execution Part</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseExecutionPart(ExecutionPart object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Execution Part Construct</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Execution Part Construct</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseExecutionPartConstruct(ExecutionPartConstruct object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Expression</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Expression</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseExpression(Expression object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Function Reference</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Function Reference</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseFunctionReference(FunctionReference object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Function Subprogram</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Function Subprogram</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseFunctionSubprogram(FunctionSubprogram object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>If Statement</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>If Statement</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseIfStatement(IfStatement object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Implicit Part</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Implicit Part</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseImplicitPart(ImplicitPart object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Implicit Part Statement</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Implicit Part Statement</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseImplicitPartStatement(ImplicitPartStatement object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Implicit Statement</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Implicit Statement</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseImplicitStatement(ImplicitStatement object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Intent Attr Spec</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Intent Attr Spec</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseIntentAttrSpec(IntentAttrSpec object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Internal Subprogram Part</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Internal Subprogram Part</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseInternalSubprogramPart(InternalSubprogramPart object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Intrinsic Type Spec</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Intrinsic Type Spec</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseIntrinsicTypeSpec(IntrinsicTypeSpec object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Literal Constant</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Literal Constant</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseLiteralConstant(LiteralConstant object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Main Program</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Main Program</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMainProgram(MainProgram object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Module</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Module</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseModule(Module object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Module Statement</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Module Statement</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseModuleStatement(ModuleStatement object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Module Subprogram</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Module Subprogram</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseModuleSubprogram(ModuleSubprogram object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Module Subprogram Part</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Module Subprogram Part</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseModuleSubprogramPart(ModuleSubprogramPart object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Named Constant</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Named Constant</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseNamedConstant(NamedConstant object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Print Statement</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Print Statement</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePrintStatement(PrintStatement object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Program Unit</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Program Unit</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseProgramUnit(ProgramUnit object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Program Statement</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Program Statement</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseProgramStatement(ProgramStatement object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Save Attr Spec</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Save Attr Spec</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSaveAttrSpec(SaveAttrSpec object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Specification Part</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Specification Part</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSpecificationPart(SpecificationPart object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Specification Statement</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Specification Statement</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSpecificationStatement(SpecificationStatement object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>String Template Adapter</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>String Template Adapter</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseStringTemplateAdapter(StringTemplateAdapter object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Subroutine Statement</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Subroutine Statement</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSubroutineStatement(SubroutineStatement object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Subroutine Subprogram</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Subroutine Subprogram</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSubroutineSubprogram(SubroutineSubprogram object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Type Declaration Statement</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Type Declaration Statement</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTypeDeclarationStatement(TypeDeclarationStatement object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Type Spec</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Type Spec</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTypeSpec(TypeSpec object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Use Statement</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Use Statement</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseUseStatement(UseStatement object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Spacer</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Spacer</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T case_Spacer(_Spacer object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>EModel Element</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>EModel Element</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseEModelElement(EModelElement object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>ENamed Element</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>ENamed Element</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseENamedElement(ENamedElement object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>EClassifier</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>EClassifier</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseEClassifier(EClassifier object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>EData Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>EData Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseEDataType(EDataType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch, but this is the last case anyway.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject)
	 * @generated
	 */
	public T defaultCase(EObject object) {
		return null;
	}

} //JFOMSwitch
