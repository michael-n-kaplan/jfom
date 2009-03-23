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
 * A representation of the model object '<em><b>Implicit Part</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.jfom.ImplicitPart#getImplicitPartStatement <em>Implicit Part Statement</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.jfom.JFOMPackage#getImplicitPart()
 * @model
 * @generated
 */
public interface ImplicitPart extends StringTemplateAdapter {
	/**
	 * Returns the value of the '<em><b>Implicit Part Statement</b></em>' containment reference list.
	 * The list contents are of type {@link org.jfom.ImplicitPartStatement}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Implicit Part Statement</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Implicit Part Statement</em>' containment reference list.
	 * @see org.jfom.JFOMPackage#getImplicitPart_ImplicitPartStatement()
	 * @model containment="true" required="true"
	 * @generated
	 */
	EList<ImplicitPartStatement> getImplicitPartStatement();

} // ImplicitPart
