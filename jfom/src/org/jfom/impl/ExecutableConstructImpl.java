/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.jfom.impl;

import org.antlr.stringtemplate.StringTemplate;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.jfom.ExecutableConstruct;
import org.jfom.JFOMPackage;
import org.jfom.JFOMPackage;
import org.jfom.StringTemplateAdapter;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Executable Construct</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * </p>
 *
 * @generated
 */
public abstract class ExecutableConstructImpl extends ExecutionPartConstructImpl implements ExecutableConstruct {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ExecutableConstructImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return JFOMPackage.Literals.EXECUTABLE_CONSTRUCT;
	}

} //ExecutableConstructImpl
