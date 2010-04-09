package org.earthsystemmodeling.link;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.photran.internal.core.analysis.binding.Definition;
import org.eclipse.photran.internal.core.model.FortranElement;

public class SemanticLink {

	private EObject domainObject;
	private Definition definition;
	private FortranElement fotranElement;
	
	public SemanticLink (EObject domainObject, Definition definition) {
		this.domainObject = domainObject;
		this.definition = definition;
		//this.fortranElement.
	}
	
	public Definition getDefinition() {
		return definition;
	}

	public void setDefinition(Definition definition) {
		this.definition = definition;
	}
	
	public EObject getDomainObject() {
		return domainObject;
	}

	public void setDomainObject(EObject domainObject) {
		this.domainObject = domainObject;
	}
	
}
