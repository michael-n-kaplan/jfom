/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.jfom.impl;

import java.util.Collection;


import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EDataTypeUniqueEList;
import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;
import org.jfom.AttrSpec;
import org.jfom.JFOMPackage;
import org.jfom.JFOMPackage;
import org.jfom.IntrinsicType;
import org.jfom.TypeDeclarationStatement;
import org.jfom.TypeSpec;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Type Declaration Statement</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.jfom.impl.TypeDeclarationStatementImpl#getTypeSpec <em>Type Spec</em>}</li>
 *   <li>{@link org.jfom.impl.TypeDeclarationStatementImpl#getAttrSpec <em>Attr Spec</em>}</li>
 *   <li>{@link org.jfom.impl.TypeDeclarationStatementImpl#getEntityDeclaration <em>Entity Declaration</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class TypeDeclarationStatementImpl extends DeclarationConstructImpl implements TypeDeclarationStatement {
	/**
	 * The cached value of the '{@link #getTypeSpec() <em>Type Spec</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTypeSpec()
	 * @generated
	 * @ordered
	 */
	protected TypeSpec typeSpec;

	/**
	 * The cached value of the '{@link #getAttrSpec() <em>Attr Spec</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAttrSpec()
	 * @generated
	 * @ordered
	 */
	protected EList<AttrSpec> attrSpec;

	/**
	 * The cached value of the '{@link #getEntityDeclaration() <em>Entity Declaration</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEntityDeclaration()
	 * @generated
	 * @ordered
	 */
	protected EList<String> entityDeclaration;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TypeDeclarationStatementImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return JFOMPackage.Literals.TYPE_DECLARATION_STATEMENT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TypeSpec getTypeSpec() {
		return typeSpec;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetTypeSpec(TypeSpec newTypeSpec, NotificationChain msgs) {
		TypeSpec oldTypeSpec = typeSpec;
		typeSpec = newTypeSpec;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, JFOMPackage.TYPE_DECLARATION_STATEMENT__TYPE_SPEC, oldTypeSpec, newTypeSpec);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTypeSpec(TypeSpec newTypeSpec) {
		if (newTypeSpec != typeSpec) {
			NotificationChain msgs = null;
			if (typeSpec != null)
				msgs = ((InternalEObject)typeSpec).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - JFOMPackage.TYPE_DECLARATION_STATEMENT__TYPE_SPEC, null, msgs);
			if (newTypeSpec != null)
				msgs = ((InternalEObject)newTypeSpec).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - JFOMPackage.TYPE_DECLARATION_STATEMENT__TYPE_SPEC, null, msgs);
			msgs = basicSetTypeSpec(newTypeSpec, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, JFOMPackage.TYPE_DECLARATION_STATEMENT__TYPE_SPEC, newTypeSpec, newTypeSpec));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<AttrSpec> getAttrSpec() {
		if (attrSpec == null) {
			attrSpec = new EObjectContainmentEList<AttrSpec>(AttrSpec.class, this, JFOMPackage.TYPE_DECLARATION_STATEMENT__ATTR_SPEC);
		}
		return attrSpec;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<String> getEntityDeclaration() {
		if (entityDeclaration == null) {
			entityDeclaration = new EDataTypeUniqueEList<String>(String.class, this, JFOMPackage.TYPE_DECLARATION_STATEMENT__ENTITY_DECLARATION);
		}
		return entityDeclaration;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case JFOMPackage.TYPE_DECLARATION_STATEMENT__TYPE_SPEC:
				return basicSetTypeSpec(null, msgs);
			case JFOMPackage.TYPE_DECLARATION_STATEMENT__ATTR_SPEC:
				return ((InternalEList<?>)getAttrSpec()).basicRemove(otherEnd, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case JFOMPackage.TYPE_DECLARATION_STATEMENT__TYPE_SPEC:
				return getTypeSpec();
			case JFOMPackage.TYPE_DECLARATION_STATEMENT__ATTR_SPEC:
				return getAttrSpec();
			case JFOMPackage.TYPE_DECLARATION_STATEMENT__ENTITY_DECLARATION:
				return getEntityDeclaration();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case JFOMPackage.TYPE_DECLARATION_STATEMENT__TYPE_SPEC:
				setTypeSpec((TypeSpec)newValue);
				return;
			case JFOMPackage.TYPE_DECLARATION_STATEMENT__ATTR_SPEC:
				getAttrSpec().clear();
				getAttrSpec().addAll((Collection<? extends AttrSpec>)newValue);
				return;
			case JFOMPackage.TYPE_DECLARATION_STATEMENT__ENTITY_DECLARATION:
				getEntityDeclaration().clear();
				getEntityDeclaration().addAll((Collection<? extends String>)newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
			case JFOMPackage.TYPE_DECLARATION_STATEMENT__TYPE_SPEC:
				setTypeSpec((TypeSpec)null);
				return;
			case JFOMPackage.TYPE_DECLARATION_STATEMENT__ATTR_SPEC:
				getAttrSpec().clear();
				return;
			case JFOMPackage.TYPE_DECLARATION_STATEMENT__ENTITY_DECLARATION:
				getEntityDeclaration().clear();
				return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case JFOMPackage.TYPE_DECLARATION_STATEMENT__TYPE_SPEC:
				return typeSpec != null;
			case JFOMPackage.TYPE_DECLARATION_STATEMENT__ATTR_SPEC:
				return attrSpec != null && !attrSpec.isEmpty();
			case JFOMPackage.TYPE_DECLARATION_STATEMENT__ENTITY_DECLARATION:
				return entityDeclaration != null && !entityDeclaration.isEmpty();
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuffer result = new StringBuffer(super.toString());
		result.append(" (entityDeclaration: ");
		result.append(entityDeclaration);
		result.append(')');
		return result.toString();
	}

} //TypeDeclarationStatementImpl
