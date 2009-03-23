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
 * A representation of the model object '<em><b>Specification Part</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.jfom.SpecificationPart#getUseStatement <em>Use Statement</em>}</li>
 *   <li>{@link org.jfom.SpecificationPart#getImplicitPart <em>Implicit Part</em>}</li>
 *   <li>{@link org.jfom.SpecificationPart#getDeclarationConstruct <em>Declaration Construct</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.jfom.JFOMPackage#getSpecificationPart()
 * @model
 * @generated
 */
public interface SpecificationPart extends StringTemplateAdapter {
	/**
	 * Returns the value of the '<em><b>Use Statement</b></em>' containment reference list.
	 * The list contents are of type {@link org.jfom.UseStatement}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Use Statement</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Use Statement</em>' containment reference list.
	 * @see org.jfom.JFOMPackage#getSpecificationPart_UseStatement()
	 * @model containment="true"
	 * @generated
	 */
	EList<UseStatement> getUseStatement();

	/**
	 * Returns the value of the '<em><b>Implicit Part</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Implicit Part</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Implicit Part</em>' containment reference.
	 * @see #setImplicitPart(ImplicitPart)
	 * @see org.jfom.JFOMPackage#getSpecificationPart_ImplicitPart()
	 * @model containment="true"
	 * @generated
	 */
	ImplicitPart getImplicitPart();

	/**
	 * Sets the value of the '{@link org.jfom.SpecificationPart#getImplicitPart <em>Implicit Part</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Implicit Part</em>' containment reference.
	 * @see #getImplicitPart()
	 * @generated
	 */
	void setImplicitPart(ImplicitPart value);

	/**
	 * Returns the value of the '<em><b>Declaration Construct</b></em>' containment reference list.
	 * The list contents are of type {@link org.jfom.DeclarationConstruct}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Declaration Construct</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Declaration Construct</em>' containment reference list.
	 * @see org.jfom.JFOMPackage#getSpecificationPart_DeclarationConstruct()
	 * @model containment="true"
	 * @generated
	 */
	EList<DeclarationConstruct> getDeclarationConstruct();

} // SpecificationPart
