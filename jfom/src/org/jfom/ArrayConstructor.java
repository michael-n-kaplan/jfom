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
 * A representation of the model object '<em><b>Array Constructor</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.jfom.ArrayConstructor#getArrayConstructorValue <em>Array Constructor Value</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.jfom.JFOMPackage#getArrayConstructor()
 * @model
 * @generated
 */
public interface ArrayConstructor extends Expression {
	/**
	 * Returns the value of the '<em><b>Array Constructor Value</b></em>' containment reference list.
	 * The list contents are of type {@link org.jfom.ArrayConstructorValue}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Array Constructor Value</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Array Constructor Value</em>' containment reference list.
	 * @see org.jfom.JFOMPackage#getArrayConstructor_ArrayConstructorValue()
	 * @model containment="true" required="true"
	 * @generated
	 */
	EList<ArrayConstructorValue> getArrayConstructorValue();

} // ArrayConstructor
