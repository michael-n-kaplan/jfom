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
 * A representation of the model object '<em><b>Type Declaration Statement</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.jfom.TypeDeclarationStatement#getTypeSpec <em>Type Spec</em>}</li>
 *   <li>{@link org.jfom.TypeDeclarationStatement#getAttrSpec <em>Attr Spec</em>}</li>
 *   <li>{@link org.jfom.TypeDeclarationStatement#getEntityDeclaration <em>Entity Declaration</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.jfom.JFOMPackage#getTypeDeclarationStatement()
 * @model
 * @generated
 */
public interface TypeDeclarationStatement extends DeclarationConstruct {
	/**
	 * Returns the value of the '<em><b>Type Spec</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Type Spec</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Type Spec</em>' containment reference.
	 * @see #setTypeSpec(TypeSpec)
	 * @see org.jfom.JFOMPackage#getTypeDeclarationStatement_TypeSpec()
	 * @model containment="true" required="true"
	 * @generated
	 */
	TypeSpec getTypeSpec();

	/**
	 * Sets the value of the '{@link org.jfom.TypeDeclarationStatement#getTypeSpec <em>Type Spec</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Type Spec</em>' containment reference.
	 * @see #getTypeSpec()
	 * @generated
	 */
	void setTypeSpec(TypeSpec value);

	/**
	 * Returns the value of the '<em><b>Attr Spec</b></em>' containment reference list.
	 * The list contents are of type {@link org.jfom.AttrSpec}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Attr Spec</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Attr Spec</em>' containment reference list.
	 * @see org.jfom.JFOMPackage#getTypeDeclarationStatement_AttrSpec()
	 * @model containment="true"
	 * @generated
	 */
	EList<AttrSpec> getAttrSpec();

	/**
	 * Returns the value of the '<em><b>Entity Declaration</b></em>' attribute list.
	 * The list contents are of type {@link java.lang.String}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Entity Declaration</em>' attribute list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Entity Declaration</em>' attribute list.
	 * @see org.jfom.JFOMPackage#getTypeDeclarationStatement_EntityDeclaration()
	 * @model required="true"
	 * @generated
	 */
	EList<String> getEntityDeclaration();

} // TypeDeclarationStatement
