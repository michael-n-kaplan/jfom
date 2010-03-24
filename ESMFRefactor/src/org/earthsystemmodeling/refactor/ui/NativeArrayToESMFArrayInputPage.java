package org.earthsystemmodeling.refactor.ui;

import org.earthsystemmodeling.refactor.NativeArrayToESMFArray;
import org.eclipse.rephraserengine.ui.refactoring.CustomUserInputPage;
import org.eclipse.swt.SWT;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Label;


/**
 * @author Rocky Dunlap
 */
public class NativeArrayToESMFArrayInputPage extends CustomUserInputPage<NativeArrayToESMFArray>
{
    public void createControl(Composite parent)
    {
        Composite top = new Composite(parent, SWT.NONE);
        initializeDialogUnits(top);
        setControl(top);

        top.setLayout(new GridLayout(1, false));

        Label lbl = new Label(top, SWT.NONE);
        lbl.setText("Click OK to refactor to ESMF Array: " + getRefactoring().nativeArrayToken.getText());
        
        //getRefactoring().nativeArrayToken;
        
        /*
         * If we actually asked for any input from the user, we would call
         *     this.getRefactoring().setXXXX()
         * to pass it on to the Refactoring class.
         */
    }
}
