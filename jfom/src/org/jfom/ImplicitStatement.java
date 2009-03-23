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
 * A representation of the model object '<em><b>Implicit Statement</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.jfom.ImplicitStatement#getImplicitSpecList <em>Implicit Spec List</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.jfom.JFOMPackage#getImplicitStatement()
 * @model
 * @generated
 */
public interface ImplicitStatement extends ImplicitPartStatement {
	/**
	 * Returns the value of the '<em><b>Implicit Spec List</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Implicit Spec List</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Implicit Spec List</em>' attribute.
	 * @see #setImplicitSpecList(EList)
	 * @see org.jfom.JFOMPackage#getImplicitStatement_ImplicitSpecList()
	 * @model required="true" many="false" transient="true"
	 * @generated
	 */
	EList<EObject> getImplicitSpecList();

	/**
	 * Sets the value of the '{@link org.jfom.ImplicitStatement#getImplicitSpecList <em>Implicit Spec List</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Implicit Spec List</em>' attribute.
	 * @see #getImplicitSpecList()
	 * @generated
	 */
	void setImplicitSpecList(EList<EObject> value);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model kind="operation" required="true"
	 * @generated
	 */
	boolean isNone();

} // ImplicitStatement
