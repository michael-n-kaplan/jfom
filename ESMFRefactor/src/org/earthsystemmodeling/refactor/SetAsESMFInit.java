package org.earthsystemmodeling.refactor;

import java.io.IOException;
import java.util.List;
import java.util.Set;

import org.earthsystemcurator.esmf.ESMFPackage;
import org.earthsystemmodeling.link.SemanticLink;
import org.earthsystemmodeling.model.ESMFAnnotation;
import org.earthsystemmodeling.model.ESMFAnnotationUtil;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.core.runtime.OperationCanceledException;
import org.eclipse.ltk.core.refactoring.RefactoringStatus;
import org.eclipse.photran.internal.core.analysis.binding.Definition;
import org.eclipse.photran.internal.core.lexer.Token;
import org.eclipse.photran.internal.core.parser.Parser.IASTNode;
import org.eclipse.photran.internal.core.refactoring.infrastructure.SingleFileFortranRefactoring;

/**
 * @author Rocky Dunlap
 */
public class SetAsESMFInit extends SingleFileFortranRefactoring {


    public SetAsESMFInit() {

    }

    @Override
    protected void doCheckInitialConditions(RefactoringStatus status, IProgressMonitor pm) throws PreconditionFailure {
    	
    	Token subroutineNameToken = findEnclosingToken();
    	IASTNode enclosingNode = findEnclosingNode(this.astOfFileInEditor, this.selectedRegionInEditor);
    	
    	//System.out.println("getWhiteBefore(): " + subroutineNameToken.getWhiteBefore());
    	//System.out.println("getWhiteAfter(): " + subroutineNameToken.getWhiteAfter());
    	System.out.println("Enclosing node: " + enclosingNode + " (" + enclosingNode.getClass() + ")\n\n");
    	
    	try {
	    	Set<ESMFAnnotation> anns = ESMFAnnotationUtil.getESMFAnnotations(enclosingNode);
	    	for (ESMFAnnotation ann : anns) {
	    		System.out.println("ESMF Annotation: " + ann);
	    	}
    	} catch (Exception e) {
    		e.printStackTrace();
    	}
    	
    	/*
    	if (!subroutineNameToken.isIdentifier()) {
    		fail("Not an identifier.");
    	}
    	
    	List<Definition> defs = subroutineNameToken.resolveBinding();
    	if (defs.size() != 1) {
    		fail("Multiple definitions.");
    	}
    	
    	Definition def = defs.get(0);
    	if (!def.isSubprogram()) {
    		fail("Not a subprogram.");
    	}
    	*/
    	 
    	//get the ESMF annotations on this subroutine
    	//System.out.println("def.getTokenRef(): " + def.getTokenRef().findToken()); 
    	
    	/*
    	System.out.println("HashCode: " + def.hashCode());
    	try {
			def.writeTo(System.out);
		} catch (IOException e) {			
			e.printStackTrace();
		}
		*/
    	
    		
    	//def.
    	
    	//this.astOfFileInEditor.
    	//this.fileInEditor.
    	
    	//SemanticLink sl = new SemanticLink(ESMFPackage.eINSTANCE.getESMFGriddedComponent(), def);
    	
    }

    @Override
    protected void doCheckFinalConditions(RefactoringStatus status, IProgressMonitor pm) throws PreconditionFailure {
        return;
    }

 
	@Override
    protected void doCreateChange(IProgressMonitor pm) throws CoreException, OperationCanceledException {
        
    	
    }
    
	
    private Token findEnclosingToken() throws PreconditionFailure  {
		System.out.println("findEnclosingToken()");
    	Token selectedToken = findEnclosingToken(this.astOfFileInEditor, this.selectedRegionInEditor);
//        if (selectedToken == null || !isIdentifier(selectedToken)) {
//            fail("Please select an identifier.");
//        }
		return selectedToken;
	}

 
    @Override
    public String getName() {
        return "[ARCH] Set as Gridded Component's init method";
    }
}
