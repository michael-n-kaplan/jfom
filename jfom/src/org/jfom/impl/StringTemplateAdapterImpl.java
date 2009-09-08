/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.jfom.impl;

import java.io.FileNotFoundException;
import java.io.FileReader;

import org.antlr.stringtemplate.AttributeRenderer;
import org.antlr.stringtemplate.StringTemplate;
import org.antlr.stringtemplate.StringTemplateGroup;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;
import org.jfom.JFOMPackage;
import org.jfom.StringTemplateAdapter;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>String Template Adapter</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.jfom.impl.StringTemplateAdapterImpl#getStringTemplate <em>String Template</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public abstract class StringTemplateAdapterImpl extends EObjectImpl implements StringTemplateAdapter {
	
	/**
	 * Temporarily hard code the location of the templates.
	 */
	public static final String TEMPLATE_FILE = "C:\\Users\\Rocky\\Documents\\eclipse\\workspace-codegen\\JFOM\\src\\org\\jfom\\template\\fortran95.stg";
	
	/**
	 * Default value for line wrap.  Use -1 for none.
	 */
	//public static final int LINE_WRAP = 78;

	
	/**
	 * The cached value of the '{@link #getStringTemplate() <em>String Template</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStringTemplate()
	 * @generated
	 * @ordered
	 */
	protected StringTemplate stringTemplate;
	
	/**
	 * The group of templates.
	 */
	private StringTemplateGroup templates;
	

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	@SuppressWarnings("unchecked")
	protected StringTemplateAdapterImpl() {
		super();
		
		//load the string template group
		try {
			templates = new StringTemplateGroup(new FileReader(TEMPLATE_FILE));			
		} catch (FileNotFoundException e) {			
			e.printStackTrace();
		}
		
		AttributeRenderer adapterRenderer = new AttributeRenderer() {

			@Override
			public String toString(Object obj) {
				StringTemplateAdapter sta = (StringTemplateAdapter) obj;
				return sta.getStringTemplate().toString();				
			}

			@Override
			public String toString(Object obj, String format) {
				return toString(obj);
			}

		};

		/*
		 * This is a bit hackish due to the way StringTemplate handles
		 * custom attribute renderers.  Instead of tying it directly to
		 * a specific implementation class, the renderers should be tied
		 * to the interface.
		 */
		Class[] classesToRegister = {
				AccessStatementImpl.class,
				ActualArgumentSpecImpl.class,
				ArrayConstructorImpl.class,
				AssignmentStatementImpl.class,
				CallStatementImpl.class,
				ContainsStatementImpl.class,
				DerivedTypeSpecImpl.class,
				EndModuleStatementImpl.class,
				EndProgramStatementImpl.class,
				EndSubroutineStatementImpl.class,
				ExecutionPartImpl.class,
				FunctionReferenceImpl.class,
				IfStatementImpl.class,			
				ImplicitPartImpl.class,
				ImplicitStatementImpl.class, 
				IntentAttrSpecImpl.class,
				IntrinsicTypeSpecImpl.class,
				LiteralConstantImpl.class,
				MainProgramImpl.class,
				ModuleImpl.class,
				ModuleStatementImpl.class,
				ModuleSubprogramPartImpl.class,
				NamedConstantImpl.class,
				PrintStatementImpl.class,
				ProgramStatementImpl.class,
				SaveAttrSpecImpl.class,
				SpecificationPartImpl.class,
				SubroutineStatementImpl.class,
				SubroutineSubprogramImpl.class,
				TypeDeclarationStatementImpl.class,
				UseStatementImpl.class,
				_SpacerImpl.class
		};
		
		for (Class c : classesToRegister) {
			templates.registerRenderer(c, adapterRenderer);
		}
		
		
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return JFOMPackage.Literals.STRING_TEMPLATE_ADAPTER;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public StringTemplate getStringTemplate() {
		
		String className = this.eClass().getName();
	
		StringTemplate st;
		if (templates.isDefined(className)) {
			st = templates.getInstanceOf(className);
		}
		else {
			return null;
		}
				
		for (EStructuralFeature esf : this.eClass().getEAllStructuralFeatures()) {
			if (st.getFormalArguments().containsKey(esf.getName())) {
				//System.out.println("setting feature: " + esf.getName());								
				//set the attribute in the string template
				//StringTemplate handles lists (EList) appropriately here
				st.setAttribute(esf.getName(), this.eGet(esf));
			}
		}
						
		return st;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetStringTemplate(StringTemplate newStringTemplate, NotificationChain msgs) {
		StringTemplate oldStringTemplate = stringTemplate;
		stringTemplate = newStringTemplate;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, JFOMPackage.STRING_TEMPLATE_ADAPTER__STRING_TEMPLATE, oldStringTemplate, newStringTemplate);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case JFOMPackage.STRING_TEMPLATE_ADAPTER__STRING_TEMPLATE:
				return basicSetStringTemplate(null, msgs);
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
			case JFOMPackage.STRING_TEMPLATE_ADAPTER__STRING_TEMPLATE:
				return getStringTemplate();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case JFOMPackage.STRING_TEMPLATE_ADAPTER__STRING_TEMPLATE:
				return stringTemplate != null;
		}
		return super.eIsSet(featureID);
	}

} //StringTemplateAdapterImpl
