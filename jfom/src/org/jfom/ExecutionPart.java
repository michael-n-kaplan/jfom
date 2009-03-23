/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.jfom;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Execution Part</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.jfom.ExecutionPart#getExecutionPartConstruct <em>Execution Part Construct</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.jfom.JFOMPackage#getExecutionPart()
 * @model
 * @generated
 */
public interface ExecutionPart extends StringTemplateAdapter {
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
	 * @see org.jfom.JFOMPackage#getExecutionPart_ExecutionPartConstruct()
	 * @model containment="true"
	 * @generated
	 */
	EList<ExecutionPartConstruct> getExecutionPartConstruct();

} // ExecutionPart
