package org.earthsystemmodeling.ui;

import org.eclipse.cdt.internal.ui.wizards.filewizard.AbstractFileCreationWizard;
import org.eclipse.cdt.ui.CUIPlugin;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.photran.internal.cdtinterface.CDTInterfacePlugin;


@SuppressWarnings("restriction")
public class ESMFComponentCreationWizard extends AbstractFileCreationWizard
{
	
	
    public ESMFComponentCreationWizard()
    {
        super();
		setDefaultPageImageDescriptor(CDTInterfacePlugin.getImageDescriptor("icons/wizban/newffile_wiz.gif"));
        setDialogSettings(CUIPlugin.getDefault().getDialogSettings());
		setWindowTitle("New ESMF Component");
    }

    public void addPages() {
        super.addPages();
        fPage = new ESMFComponentCreationWizardPage();
        addPage(fPage);
        fPage.init(getSelection());
    }
    
    @Override
    protected void finishPage(IProgressMonitor monitor) throws InterruptedException, CoreException {
        super.finishPage(monitor);
    	((ESMFComponentCreationWizardPage) fPage).createESMFComponent(monitor);
    }
}
