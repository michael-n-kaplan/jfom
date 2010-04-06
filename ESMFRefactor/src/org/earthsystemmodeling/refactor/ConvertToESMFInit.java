package org.earthsystemmodeling.refactor;

import java.util.List;

import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.core.runtime.OperationCanceledException;
import org.eclipse.ltk.core.refactoring.RefactoringStatus;
import org.eclipse.photran.internal.core.analysis.binding.Definition;
import org.eclipse.photran.internal.core.lexer.Token;
import org.eclipse.photran.internal.core.refactoring.infrastructure.SingleFileFortranRefactoring;

/**
 * @author Rocky Dunlap
 */
public class ConvertToESMFInit extends SingleFileFortranRefactoring {


    public ConvertToESMFInit() {

    }

    @Override
    protected void doCheckInitialConditions(RefactoringStatus status, IProgressMonitor pm) throws PreconditionFailure {
    	
    	Token subroutineNameToken = findEnclosingToken();
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
    	
    	
    }

    @Override
    protected void doCheckFinalConditions(RefactoringStatus status, IProgressMonitor pm) throws PreconditionFailure {
        return;
    }

 
	@Override
    protected void doCreateChange(IProgressMonitor pm) throws CoreException, OperationCanceledException {
        
    	
    }
    
	
    private Token findEnclosingToken() throws PreconditionFailure  {
		Token selectedToken = findEnclosingToken(this.astOfFileInEditor, this.selectedRegionInEditor);
        if (selectedToken == null || !isIdentifier(selectedToken)) {
            fail("Please select an identifier.");
        }
		return selectedToken;
	}

 
    @Override
    public String getName() {
        return "Convert to ESMF init";
    }
}
