package org.earthsystemmodeling.refactor;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.earthsystemmodeling.refactor.heuristics.EndOfEnclosingScopeSpecPart;
import org.earthsystemmodeling.refactor.heuristics.InsertDeclarationConstruct;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.core.runtime.OperationCanceledException;
import org.eclipse.ltk.core.refactoring.RefactoringStatus;
import org.eclipse.photran.internal.core.analysis.binding.Definition;
import org.eclipse.photran.internal.core.analysis.binding.ScopingNode;
import org.eclipse.photran.internal.core.analysis.types.Type;
import org.eclipse.photran.internal.core.lexer.Token;
import org.eclipse.photran.internal.core.parser.ASTCallStmtNode;
import org.eclipse.photran.internal.core.parser.IBodyConstruct;
import org.eclipse.photran.internal.core.parser.IDeclarationConstruct;
import org.eclipse.photran.internal.core.parser.Parser.IASTListNode;
import org.eclipse.photran.internal.core.refactoring.infrastructure.Reindenter;
import org.eclipse.photran.internal.core.refactoring.infrastructure.SingleFileFortranRefactoring;
import org.eclipse.photran.internal.core.vpg.PhotranTokenRef;

/**
 * @author Rocky Dunlap
 */
public class NativeArrayToESMFArray extends SingleFileFortranRefactoring {
//    private static final String COMMENT_SYMBOL = "!";
//
//    private Map<Token, String> tokensWithCommentsBefore;
//    private Map<Token, String> tokensWithCommentsAfter;
//    private StringBuilder functionsAndSubroutineNames;
//    private Token mainProgramToken;
	
	public Token nativeArrayToken;
	private Token defToken;
	private Definition def;
	private ScopingNode defScopeNode;
	
	private String esmfArrayName;
	private String esmfDistGridName;
	private String esmfArraySpecName;

    public NativeArrayToESMFArray() {

    }

    @Override
    protected void doCheckInitialConditions(RefactoringStatus status, IProgressMonitor pm) throws PreconditionFailure {
    	    	
    	
    	nativeArrayToken = findEnclosingToken();
    	if (!nativeArrayToken.isIdentifier()) {
    		fail("Not an identifier.");
    	}    	
    	
    	//is this an array?
    	List<Definition> nativeArrayDefs = nativeArrayToken.resolveBinding();
    	if (nativeArrayDefs.size() != 1) {
    		fail("Must be one definition only.");
    	}
    	
    	def = nativeArrayDefs.get(0);
    	if (!def.isArray()) {
    		fail("Must be an array.");
    	}
    	    	   
    	defToken = def.getTokenRef().findToken();
    	defScopeNode = defToken.getEnclosingScope();
  
    	esmfArrayName = nativeArrayToken.getText() + "_ESMF_Array";
    	esmfArraySpecName = nativeArrayToken.getText() + "_ESMF_ArraySpec";
    	esmfDistGridName = nativeArrayToken.getText() + "_ESMF_DistGrid";
 	       
        return;
    }

    @Override
    protected void doCheckFinalConditions(RefactoringStatus status, IProgressMonitor pm) throws PreconditionFailure {
        return;
    }

    
	@SuppressWarnings("unchecked")
	@Override
    protected void doCreateChange(IProgressMonitor pm) throws CoreException, OperationCanceledException {
        
    	try {    		    		
    		
    		//IASTListNode<IBodyConstruct> body = (IASTListNode<IBodyConstruct>) defScopeNode.getBody();
    		//int idx = findIndexToInsertTypeDeclaration(body);
    		    		
    		String lit;
    		IDeclarationConstruct idc;
    		
    		InsertDeclarationConstruct insertGoal = new InsertDeclarationConstruct();
    		insertGoal.addLocationHeuristic(new EndOfEnclosingScopeSpecPart());
    		
    		lit = "type(ESMF_Array) :: " + esmfArrayName;
	    	idc = (IDeclarationConstruct) parseLiteralStatement(lit);    		
    		insertGoal.go(idc, defToken);
    		Reindenter.reindent(idc, astOfFileInEditor);
	    	
    		lit = "type(ESMF_ArraySpec) :: " + esmfArraySpecName;
	    	idc = (IDeclarationConstruct) parseLiteralStatement(lit);    		
	    	insertGoal.go(idc, defToken);
	    	Reindenter.reindent(idc, astOfFileInEditor);
    		
    		lit = "type(ESMF_DistGrid) :: " + esmfDistGridName;
	    	idc = (IDeclarationConstruct) parseLiteralStatement(lit);
	    	insertGoal.go(idc, defToken);
	    	Reindenter.reindent(idc, astOfFileInEditor);
    		
    		
    		//Reindenter.reindent(idc, astOfFileInEditor);
    		
    		
    		
    		List<PhotranTokenRef> refs = sortRefsByOffset(def.findAllReferences(false));
    		//System.out.println("sizes: " + refs.size() + " - " + def.findAllReferences(false).size());
        	        	    	        
    		if (refs.size() == 0) {
    			fail("Array is never used.");
    		}
        	
    		//set up ArraySpec before first use
    		ScopingNode firstUseScope = refs.get(0).findToken().getLocalScope();
    		//System.out.println("local scope of first use = " + firstUseScope + "\n\n");
    		
    		if (!firstUseScope.isSubprogram()) {
    			fail("Array's first use not inside subprogram.");
    		}
    		
    		IASTListNode<IBodyConstruct> body = (IASTListNode<IBodyConstruct>) firstUseScope.getBody();
    		int idx = findIndexToInsertStatement(body);
    		
    		//call ESMF_ArraySpecSet(arrayspec, typekind=ESMF_TYPEKIND_R8, rank=2, rc=rc)
    	    //if (rc/=ESMF_SUCCESS) return ! bail out
    		String typekind = "";
    		if (def.getType().equals(Type.REAL)) {
    			typekind = "ESMF_TYPEKIND_R8";
    		}
    		else {
    			fail("Only arrays of reals supported.");
    		}
    		
    		int rank = def.getArraySpec().getRank();
    		
    		lit = "call ESMF_ArraySpecSet(" + esmfArraySpecName  + ", typekind=" + typekind + ", rank=" + rank + ", rc=rc)";
	    	System.out.println(lit);
    		ASTCallStmtNode callStmt = (ASTCallStmtNode) parseLiteralStatement(lit);    		
    		body.add(idx, callStmt);
    		
    		Reindenter.reindent(callStmt, astOfFileInEditor);
    		
    		addChangeFromModifiedAST(fileInEditor, pm);
    		
	    	//String lit = "distgrid = ESMF_DistGridCreate(minIndex=(/1,1/), maxIndex=(/xmax,xmax/), regDecomp=(/1,1/), rc=rc)";
	    	//String lit = "real :: ABC";
    		//IBodyConstruct ibc = parseLiteralStatement(lit);
	    	//System.out.println("ibc = " + ibc);
//	    	ScopingNode sn = nativeArrayToken.getEnclosingScope();
//	    	ScopingNode ls = nativeArrayToken.getLocalScope();
//	    	ScopingNode di = nativeArrayToken.findScopeDeclaringOrImporting(nativeArrayToken.resolveBinding().get(0));
//	    	
//	    	System.out.println("Enclosing scope = " + sn + "\n\n");
//	    	System.out.println("Local scope = " + ls + "\n\n");
//	    	System.out.println("Declaring/importing scope = " + di + "\n\n");
	    	
	    	
	    	
	    	//IASTListNode ln = nativeArrayToken.findNearestAncestor(IASTListNode.class);
	    	//ln.add(0, ibc);
	    	
	    	//addChangeFromModifiedAST(this.fileInEditor, pm);
    	} catch (Exception e) {
    		e.printStackTrace();
    	}
    	// Query
       // retrieveComments();

        // Modify
      //  addMeaninglessHeader();
       // removeComments();

      //  addChangeFromModifiedAST(fileInEditor, pm);
       // vpg.releaseAllASTs();
    }
    
	private List<PhotranTokenRef> sortRefsByOffset(Set<PhotranTokenRef> refs) {
		ArrayList<PhotranTokenRef> ret = new ArrayList<PhotranTokenRef>();
		
		for (PhotranTokenRef ref : refs) {
			for (int i = 0; i < ret.size(); i++) {
				if (ref.getOffset() <= ret.get(i).getOffset()) {
					ret.add(i, ref);
					break;
				}
			}
			ret.add(ref);
		}
		
		return ret;
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
        return "Native array to ESMF Array";
    }
}
