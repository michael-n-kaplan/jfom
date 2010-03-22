/*******************************************************************************
 * Copyright (c) 2008-2009 University of Illinois at Urbana-Champaign and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *     UIUC - Initial API and implementation
 *******************************************************************************/
package org.earthsystemmodeling.refactor.ui;

import org.earthsystemmodeling.refactor.NativeArrayToESMFArray;
import org.eclipse.rephraserengine.ui.refactoring.CustomUserInputPage;
import org.eclipse.swt.SWT;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Label;


/**
 * Handles the Obfuscate Fortran action in the Fortran editor's
 * Refactoring popup menu and in the Refactor menu in the workbench menu bar.
 * 
 * @author Nicholas Chen
 * @author Jeff Overbey
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
        lbl.setText("Click OK to refactor to ESMF Array.");
        
        /*
         * If we actually asked for any input from the user, we would call
         *     this.getRefactoring().setXXXX()
         * to pass it on to the Refactoring class.
         */
    }
}
