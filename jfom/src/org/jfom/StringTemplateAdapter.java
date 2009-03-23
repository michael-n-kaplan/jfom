/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.jfom;

import org.antlr.stringtemplate.StringTemplate;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>String Template Adapter</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.jfom.StringTemplateAdapter#getStringTemplate <em>String Template</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.jfom.JFOMPackage#getStringTemplateAdapter()
 * @model abstract="true"
 * @generated
 */
public interface StringTemplateAdapter extends EObject {
	/**
	 * Returns the value of the '<em><b>String Template</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>String Template</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>String Template</em>' containment reference.
	 * @see org.jfom.JFOMPackage#getStringTemplateAdapter_StringTemplate()
	 * @model type="org.jfom.EStringTemplate" containment="true" required="true" changeable="false"
	 * @generated
	 */
	StringTemplate getStringTemplate();


} // StringTemplateAdapter
