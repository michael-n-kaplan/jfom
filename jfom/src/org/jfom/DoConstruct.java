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
 * A representation of the model object '<em><b>Do Construct</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.jfom.DoConstruct#getDoVariable <em>Do Variable</em>}</li>
 *   <li>{@link org.jfom.DoConstruct#getStart <em>Start</em>}</li>
 *   <li>{@link org.jfom.DoConstruct#getEnd <em>End</em>}</li>
 *   <li>{@link org.jfom.DoConstruct#getExecutionPartConstruct <em>Execution Part Construct</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.jfom.JFOMPackage#getDoConstruct()
 * @model
 * @generated
 */
public interface DoConstruct extends ExecutableConstruct {

	/**
	 * Returns the value of the '<em><b>Do Variable</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Do Variable</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Do Variable</em>' attribute.
	 * @see #setDoVariable(String)
	 * @see org.jfom.JFOMPackage#getDoConstruct_DoVariable()
	 * @model required="true"
	 * @generated
	 */
	String getDoVariable();

	/**
	 * Sets the value of the '{@link org.jfom.DoConstruct#getDoVariable <em>Do Variable</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Do Variable</em>' attribute.
	 * @see #getDoVariable()
	 * @generated
	 */
	void setDoVariable(String value);

	/**
	 * Returns the value of the '<em><b>Start</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Start</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Start</em>' attribute.
	 * @see #setStart(String)
	 * @see org.jfom.JFOMPackage#getDoConstruct_Start()
	 * @model required="true"
	 * @generated
	 */
	String getStart();

	/**
	 * Sets the value of the '{@link org.jfom.DoConstruct#getStart <em>Start</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Start</em>' attribute.
	 * @see #getStart()
	 * @generated
	 */
	void setStart(String value);

	/**
	 * Returns the value of the '<em><b>End</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>End</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>End</em>' attribute.
	 * @see #setEnd(String)
	 * @see org.jfom.JFOMPackage#getDoConstruct_End()
	 * @model required="true"
	 * @generated
	 */
	String getEnd();

	/**
	 * Sets the value of the '{@link org.jfom.DoConstruct#getEnd <em>End</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>End</em>' attribute.
	 * @see #getEnd()
	 * @generated
	 */
	void setEnd(String value);

	/**
	 * Returns the value of the '<em><b>Execution Part Construct</b></em>' containment reference list.
	 * The list contents are of type {@link org.jfom.ExecutionPartConstruct}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Execution Part Construct</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Execution Part Construct</em>' containment reference list.
	 * @see org.jfom.JFOMPackage#getDoConstruct_ExecutionPartConstruct()
	 * @model containment="true"
	 * @generated
	 */
	EList<ExecutionPartConstruct> getExecutionPartConstruct();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model startRequired="true"
	 * @generated
	 */
	void setStart(int start);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model endRequired="true"
	 * @generated
	 */
	void setEnd(int end);
} // DoConstruct
