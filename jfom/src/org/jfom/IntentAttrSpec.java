/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.jfom;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Intent Attr Spec</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.jfom.IntentAttrSpec#getIntentSpec <em>Intent Spec</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.jfom.JFOMPackage#getIntentAttrSpec()
 * @model
 * @generated
 */
public interface IntentAttrSpec extends AttrSpec {
	/**
	 * Returns the value of the '<em><b>Intent Spec</b></em>' attribute.
	 * The literals are from the enumeration {@link org.jfom.IntentSpec}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Intent Spec</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Intent Spec</em>' attribute.
	 * @see org.jfom.IntentSpec
	 * @see #setIntentSpec(IntentSpec)
	 * @see org.jfom.JFOMPackage#getIntentAttrSpec_IntentSpec()
	 * @model required="true"
	 * @generated
	 */
	IntentSpec getIntentSpec();

	/**
	 * Sets the value of the '{@link org.jfom.IntentAttrSpec#getIntentSpec <em>Intent Spec</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Intent Spec</em>' attribute.
	 * @see org.jfom.IntentSpec
	 * @see #getIntentSpec()
	 * @generated
	 */
	void setIntentSpec(IntentSpec value);

} // IntentAttrSpec
