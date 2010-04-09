/*******************************************************************************
 * Copyright (c) 2007 University of Illinois at Urbana-Champaign and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *     UIUC - Initial API and implementation
 *******************************************************************************/
package org.earthsystemmodeling.model;

import org.eclipse.cdt.core.model.ICElement;
import org.eclipse.cdt.core.model.IContributedCElement;
import org.eclipse.cdt.core.model.IParent;
import org.eclipse.cdt.core.model.ISourceReference;
import org.eclipse.cdt.internal.core.model.Parent;
import org.eclipse.cdt.internal.core.model.SourceManipulation;
import org.eclipse.jface.resource.ImageDescriptor;
import org.eclipse.photran.internal.cdtinterface.CDTInterfacePlugin;
import org.eclipse.photran.internal.core.lexer.IToken;


@SuppressWarnings("restriction")
public abstract class ESMFElement extends SourceManipulation // Parent
    implements ICElement, IParent, ISourceReference, IContributedCElement  {
   
	/**
     * Most elements in the <code>FortranElement</code> hierarchy have a name (functions,
     * subroutines, etc.). For the ones that do, this is the <code>Token</code> for that name. It
     * is expected to contain position information within the source file.
     */
    //protected IToken identifier = null;

    /**
     * Most elements in the <code>FortranElement</code> hierarchy have a name (functions,
     * subroutines, etc.). For the ones that do, this is the <code>Token</code> for that name. It
     * is expected to contain position information within the source file.
     *
     * @return the identifier <code>Token</code> for this element.
     */
//    public IToken getIdentifier()
//    {
//        return identifier;
//    }

    /**
     * Most elements in the <code>FortranElement</code> hierarchy have a name (functions,
     * subroutines, etc.). For the ones that do, this sets the <code>Token</code> for that name.
     * It is expected to contain position information within the source file.
     *
     * @param identifier The identifier <code>Token</code> for this element.
     */
//    public void setIdentifier(IToken identifier)
//    {
//        this.identifier = identifier;
//
//        // Don't attempt to highlight identifiers that come from INCLUDE files or
//        // macro expansions.  We can't highlight something that's in another file,
//        // and likewise we'll punt on trying to highlight the macro.
//        if (identifier != null && identifier.getPreprocessorDirective() == null)
//        {
//            int offset = identifier.getFileOffset();
//            int length = identifier.getLength();
//            int line = identifier.getLine();
//
//            setIdPos(offset, length);
//            setPos(offset, length);
//            setLines(line, line);
//        }
//    }

	//-------------------------------------------------------------

	
	public ESMFElement(Parent parent, IToken identifier)
    {
        super(parent, identifier != null ? identifier.getText() : "(anonymous)", -1);
//        this.setIdentifier(identifier);
    }

   
	public ESMFElement(Parent parent, String name) //, int type)
    {
		super(parent, name == null ? "(anonymous)" : name, -1); //type);
	}

	public Object getAdapter(Class required)
    {
		if (ImageDescriptor.class.equals(required))
			return getBaseImageDescriptor();
		else
			return super.getAdapter(required);
	}
	
	

	protected abstract ImageDescriptor getBaseImageDescriptor();
		

	/**
     * Returns an <code>ImageDescriptor</code> for an icon in the icons folder of the core plugin.
     * Based on code in <code>CPluginImages</code>.
     *
     * @param filename
     * @return <code>ImageDescriptor</code>
     */
	public static ImageDescriptor getImageDescriptorForIcon(String filename)
    {
	    return CDTInterfacePlugin.getImageDescriptor("icons/model/" + filename);
	}

    /**
     * Returns an <code>ImageDescriptor</code> for elements that don't have a dedicated icon.
     *
     * @return <code>ImageDescriptor</code>
     */
    public static ImageDescriptor unknownImageDescriptor()
    {
        return getImageDescriptorForIcon("unknown.gif");
    }

	// --- Concrete Subclasses -------------------------------------------

    /**
     * An element for anything that is not covered by one of the specific classes below.
     * <p>
     * One of these elements can be added to the model, for example, to display an informative
     * message in the Outline view.
     */
    public static class UnknownNode extends ESMFElement
    {
        public UnknownNode(Parent parent, String name)
        {
            super(parent, name);
        }

        public ImageDescriptor getBaseImageDescriptor()
        {
            return getImageDescriptorForIcon("unknown.gif");
        }
    }

    /**
     * An element representing an error; will display as an error message with an corresponding icon
     * in the Outline view.
     */
    public static class ErrorNode extends ESMFElement
    {
        public ErrorNode(Parent parent, String name)
        {
            super(parent, name);
        }

        public ImageDescriptor getBaseImageDescriptor()
        {
            return getImageDescriptorForIcon("skullface.gif");
        }
    }

    
    public static class ESMFGriddedComponent extends ESMFElement
    {
        public ESMFGriddedComponent(Parent parent, IToken nameToken)
        {
            super(parent, nameToken);
        }
        
        public ESMFGriddedComponent(Parent parent, String name) {
        	super(parent, name);
        }

        public ImageDescriptor getBaseImageDescriptor()
        {
            return imageDescriptor();
        }

        public static ImageDescriptor imageDescriptor()
        {
            return getImageDescriptorForIcon("module.gif");
        }
        
        @Override
    	public String getElementName() {
        	return "gridded component (" + super.getElementName() + ")";
    	}
    }
    
    public static class ESMFExecutionGroup extends ESMFElement
    {
        public ESMFExecutionGroup(Parent parent)
        {
            super(parent, "");
        }

        public ImageDescriptor getBaseImageDescriptor()
        {
            return imageDescriptor();
        }

        public static ImageDescriptor imageDescriptor()
        {
            return getImageDescriptorForIcon("module.gif");
        }
        
        @Override
    	public String getElementName() {
        	return "execution stages";
    	}
    }
    
    public static class ESMFInitializeMethod extends ESMFElement
    {
        public ESMFInitializeMethod(Parent parent, IToken nameToken)
        {
            super(parent, nameToken);
        }

        public ImageDescriptor getBaseImageDescriptor()
        {
            return imageDescriptor();
        }

        public static ImageDescriptor imageDescriptor()
        {
            return getImageDescriptorForIcon("subroutine.gif");
        }
        
        @Override
    	public String getElementName() {
    		return "init (" + super.getElementName() + ")";
    	}
    }
    
    public static class ESMFRunMethod extends ESMFElement
    {
        public ESMFRunMethod(Parent parent, IToken nameToken)
        {
            super(parent, nameToken);
        }

        public ImageDescriptor getBaseImageDescriptor()
        {
            return imageDescriptor();
        }

        public static ImageDescriptor imageDescriptor()
        {
            return getImageDescriptorForIcon("subroutine.gif");
        }
        
        @Override
    	public String getElementName() {
        	return "run (" + super.getElementName() + ")";
    	}
    }
    
    public static class ESMFFinalizeMethod extends ESMFElement
    {
        public ESMFFinalizeMethod(Parent parent, IToken nameToken)
        {
            super(parent, nameToken);
        }

        public ImageDescriptor getBaseImageDescriptor()
        {
            return imageDescriptor();
        }

        public static ImageDescriptor imageDescriptor()
        {
            return getImageDescriptorForIcon("subroutine.gif");
        }
        
        @Override
    	public String getElementName() {
        	return "finalize (" + super.getElementName() + ")";
    	}
    }
    
    public static class ESMFArray extends ESMFElement
    {
        public ESMFArray(Parent parent, IToken nameToken)
        {
            super(parent, nameToken);
        }

        public ImageDescriptor getBaseImageDescriptor()
        {
            return imageDescriptor();
        }

        public static ImageDescriptor imageDescriptor()
        {
            return getImageDescriptorForIcon("variable.gif");
        }
        
        @Override
    	public String getElementName() {
    		return "array (" + super.getElementName() + ")";
    	}
    }
    

}
