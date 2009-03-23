/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.jfom.impl;

import java.util.Collection;

import org.antlr.stringtemplate.StringTemplate;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;
import org.jfom.DoConstruct;
import org.jfom.ExecutionPartConstruct;
import org.jfom.JFOMPackage;
import org.jfom.JFOMPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Do Construct</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.jfom.impl.DoConstructImpl#getDoVariable <em>Do Variable</em>}</li>
 *   <li>{@link org.jfom.impl.DoConstructImpl#getStart <em>Start</em>}</li>
 *   <li>{@link org.jfom.impl.DoConstructImpl#getEnd <em>End</em>}</li>
 *   <li>{@link org.jfom.impl.DoConstructImpl#getExecutionPartConstruct <em>Execution Part Construct</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class DoConstructImpl extends ExecutableConstructImpl implements DoConstruct {
	/**
	 * The default value of the '{@link #getDoVariable() <em>Do Variable</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDoVariable()
	 * @generated
	 * @ordered
	 */
	protected static final String DO_VARIABLE_EDEFAULT = null;
	/**
	 * The cached value of the '{@link #getDoVariable() <em>Do Variable</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDoVariable()
	 * @generated
	 * @ordered
	 */
	protected String doVariable = DO_VARIABLE_EDEFAULT;
	/**
	 * The default value of the '{@link #getStart() <em>Start</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStart()
	 * @generated
	 * @ordered
	 */
	protected static final String START_EDEFAULT = null;
	/**
	 * The cached value of the '{@link #getStart() <em>Start</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStart()
	 * @generated
	 * @ordered
	 */
	protected String start = START_EDEFAULT;
	/**
	 * The default value of the '{@link #getEnd() <em>End</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEnd()
	 * @generated
	 * @ordered
	 */
	protected static final String END_EDEFAULT = null;
	/**
	 * The cached value of the '{@link #getEnd() <em>End</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEnd()
	 * @generated
	 * @ordered
	 */
	protected String end = END_EDEFAULT;

	/**
	 * The cached value of the '{@link #getExecutionPartConstruct() <em>Execution Part Construct</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getExecutionPartConstruct()
	 * @generated
	 * @ordered
	 */
	protected EList<ExecutionPartConstruct> executionPartConstruct;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	protected DoConstructImpl() {
		super();
		//pull this in from a template file instead
		this.stringTemplate = new StringTemplate("DO $doVariable$ = $start$, $end$\n$executionPartConstruct$\nend do");
	}

	@Override
	public String toString() {
		stringTemplate.setAttribute("doVariable", getDoVariable());
		stringTemplate.setAttribute("start", getStart());
		stringTemplate.setAttribute("end", getEnd());
		for (ExecutionPartConstruct epc : getExecutionPartConstruct()) {
			stringTemplate.setAttribute("executionPartConstruct", epc.toString());
		}
		return stringTemplate.toString();
	}
	
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return JFOMPackage.Literals.DO_CONSTRUCT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getDoVariable() {
		return doVariable;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDoVariable(String newDoVariable) {
		String oldDoVariable = doVariable;
		doVariable = newDoVariable;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, JFOMPackage.DO_CONSTRUCT__DO_VARIABLE, oldDoVariable, doVariable));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getStart() {
		return start;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setStart(String newStart) {
		String oldStart = start;
		start = newStart;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, JFOMPackage.DO_CONSTRUCT__START, oldStart, start));
	}
	
	public void setStart(int start) {
		setStart(String.valueOf(start));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getEnd() {
		return end;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setEnd(String newEnd) {
		String oldEnd = end;
		end = newEnd;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, JFOMPackage.DO_CONSTRUCT__END, oldEnd, end));
	}
	
	public void setEnd(int end) {
		setEnd(String.valueOf(end));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ExecutionPartConstruct> getExecutionPartConstruct() {
		if (executionPartConstruct == null) {
			executionPartConstruct = new EObjectContainmentEList<ExecutionPartConstruct>(ExecutionPartConstruct.class, this, JFOMPackage.DO_CONSTRUCT__EXECUTION_PART_CONSTRUCT);
		}
		return executionPartConstruct;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case JFOMPackage.DO_CONSTRUCT__EXECUTION_PART_CONSTRUCT:
				return ((InternalEList<?>)getExecutionPartConstruct()).basicRemove(otherEnd, msgs);
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
			case JFOMPackage.DO_CONSTRUCT__DO_VARIABLE:
				return getDoVariable();
			case JFOMPackage.DO_CONSTRUCT__START:
				return getStart();
			case JFOMPackage.DO_CONSTRUCT__END:
				return getEnd();
			case JFOMPackage.DO_CONSTRUCT__EXECUTION_PART_CONSTRUCT:
				return getExecutionPartConstruct();
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
			case JFOMPackage.DO_CONSTRUCT__DO_VARIABLE:
				setDoVariable((String)newValue);
				return;
			case JFOMPackage.DO_CONSTRUCT__START:
				setStart((String)newValue);
				return;
			case JFOMPackage.DO_CONSTRUCT__END:
				setEnd((String)newValue);
				return;
			case JFOMPackage.DO_CONSTRUCT__EXECUTION_PART_CONSTRUCT:
				getExecutionPartConstruct().clear();
				getExecutionPartConstruct().addAll((Collection<? extends ExecutionPartConstruct>)newValue);
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
			case JFOMPackage.DO_CONSTRUCT__DO_VARIABLE:
				setDoVariable(DO_VARIABLE_EDEFAULT);
				return;
			case JFOMPackage.DO_CONSTRUCT__START:
				setStart(START_EDEFAULT);
				return;
			case JFOMPackage.DO_CONSTRUCT__END:
				setEnd(END_EDEFAULT);
				return;
			case JFOMPackage.DO_CONSTRUCT__EXECUTION_PART_CONSTRUCT:
				getExecutionPartConstruct().clear();
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
			case JFOMPackage.DO_CONSTRUCT__DO_VARIABLE:
				return DO_VARIABLE_EDEFAULT == null ? doVariable != null : !DO_VARIABLE_EDEFAULT.equals(doVariable);
			case JFOMPackage.DO_CONSTRUCT__START:
				return START_EDEFAULT == null ? start != null : !START_EDEFAULT.equals(start);
			case JFOMPackage.DO_CONSTRUCT__END:
				return END_EDEFAULT == null ? end != null : !END_EDEFAULT.equals(end);
			case JFOMPackage.DO_CONSTRUCT__EXECUTION_PART_CONSTRUCT:
				return executionPartConstruct != null && !executionPartConstruct.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //DoConstructImpl
