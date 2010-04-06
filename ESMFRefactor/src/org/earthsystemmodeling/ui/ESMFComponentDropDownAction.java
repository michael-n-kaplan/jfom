package org.earthsystemmodeling.ui;

import org.eclipse.cdt.internal.ui.wizards.AbstractWizardDropDownAction;
import org.eclipse.jface.action.IAction;

@SuppressWarnings("restriction")
public class ESMFComponentDropDownAction extends AbstractWizardDropDownAction
{	
	protected IAction[] getWizardActions() {
		return ESMFWizardRegistry.getFileWizardActions();		
	}
}
