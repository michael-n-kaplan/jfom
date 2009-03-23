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
import org.eclipse.emf.ecore.impl.EObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;
import org.jfom.DeclarationConstruct;
import org.jfom.JFOMPackage;
import org.jfom.ImplicitPart;
import org.jfom.JFOMPackage;
import org.jfom.SpecificationPart;
import org.jfom.UseStatement;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Specification Part</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.jfom.impl.SpecificationPartImpl#getUseStatement <em>Use Statement</em>}</li>
 *   <li>{@link org.jfom.impl.SpecificationPartImpl#getImplicitPart <em>Implicit Part</em>}</li>
 *   <li>{@link org.jfom.impl.SpecificationPartImpl#getDeclarationConstruct <em>Declaration Construct</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class SpecificationPartImpl extends StringTemplateAdapterImpl implements SpecificationPart {
	/**
	 * The cached value of the '{@link #getUseStatement() <em>Use Statement</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUseStatement()
	 * @generated
	 * @ordered
	 */
	protected EList<UseStatement> useStatement;

	/**
	 * The cached value of the '{@link #getImplicitPart() <em>Implicit Part</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getImplicitPart()
	 * @generated
	 * @ordered
	 */
	protected ImplicitPart implicitPart;

	/**
	 * The cached value of the '{@link #getDeclarationConstruct() <em>Declaration Construct</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDeclarationConstruct()
	 * @generated
	 * @ordered
	 */
	protected EList<DeclarationConstruct> declarationConstruct;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SpecificationPartImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return JFOMPackage.Literals.SPECIFICATION_PART;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<UseStatement> getUseStatement() {
		if (useStatement == null) {
			useStatement = new EObjectContainmentEList<UseStatement>(UseStatement.class, this, JFOMPackage.SPECIFICATION_PART__USE_STATEMENT);
		}
		return useStatement;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ImplicitPart getImplicitPart() {
		return implicitPart;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetImplicitPart(ImplicitPart newImplicitPart, NotificationChain msgs) {
		ImplicitPart oldImplicitPart = implicitPart;
		implicitPart = newImplicitPart;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, JFOMPackage.SPECIFICATION_PART__IMPLICIT_PART, oldImplicitPart, newImplicitPart);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setImplicitPart(ImplicitPart newImplicitPart) {
		if (newImplicitPart != implicitPart) {
			NotificationChain msgs = null;
			if (implicitPart != null)
				msgs = ((InternalEObject)implicitPart).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - JFOMPackage.SPECIFICATION_PART__IMPLICIT_PART, null, msgs);
			if (newImplicitPart != null)
				msgs = ((InternalEObject)newImplicitPart).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - JFOMPackage.SPECIFICATION_PART__IMPLICIT_PART, null, msgs);
			msgs = basicSetImplicitPart(newImplicitPart, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, JFOMPackage.SPECIFICATION_PART__IMPLICIT_PART, newImplicitPart, newImplicitPart));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<DeclarationConstruct> getDeclarationConstruct() {
		if (declarationConstruct == null) {
			declarationConstruct = new EObjectContainmentEList<DeclarationConstruct>(DeclarationConstruct.class, this, JFOMPackage.SPECIFICATION_PART__DECLARATION_CONSTRUCT);
		}
		return declarationConstruct;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case JFOMPackage.SPECIFICATION_PART__USE_STATEMENT:
				return ((InternalEList<?>)getUseStatement()).basicRemove(otherEnd, msgs);
			case JFOMPackage.SPECIFICATION_PART__IMPLICIT_PART:
				return basicSetImplicitPart(null, msgs);
			case JFOMPackage.SPECIFICATION_PART__DECLARATION_CONSTRUCT:
				return ((InternalEList<?>)getDeclarationConstruct()).basicRemove(otherEnd, msgs);
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
			case JFOMPackage.SPECIFICATION_PART__USE_STATEMENT:
				return getUseStatement();
			case JFOMPackage.SPECIFICATION_PART__IMPLICIT_PART:
				return getImplicitPart();
			case JFOMPackage.SPECIFICATION_PART__DECLARATION_CONSTRUCT:
				return getDeclarationConstruct();
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
			case JFOMPackage.SPECIFICATION_PART__USE_STATEMENT:
				getUseStatement().clear();
				getUseStatement().addAll((Collection<? extends UseStatement>)newValue);
				return;
			case JFOMPackage.SPECIFICATION_PART__IMPLICIT_PART:
				setImplicitPart((ImplicitPart)newValue);
				return;
			case JFOMPackage.SPECIFICATION_PART__DECLARATION_CONSTRUCT:
				getDeclarationConstruct().clear();
				getDeclarationConstruct().addAll((Collection<? extends DeclarationConstruct>)newValue);
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
			case JFOMPackage.SPECIFICATION_PART__USE_STATEMENT:
				getUseStatement().clear();
				return;
			case JFOMPackage.SPECIFICATION_PART__IMPLICIT_PART:
				setImplicitPart((ImplicitPart)null);
				return;
			case JFOMPackage.SPECIFICATION_PART__DECLARATION_CONSTRUCT:
				getDeclarationConstruct().clear();
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
			case JFOMPackage.SPECIFICATION_PART__USE_STATEMENT:
				return useStatement != null && !useStatement.isEmpty();
			case JFOMPackage.SPECIFICATION_PART__IMPLICIT_PART:
				return implicitPart != null;
			case JFOMPackage.SPECIFICATION_PART__DECLARATION_CONSTRUCT:
				return declarationConstruct != null && !declarationConstruct.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //SpecificationPartImpl
