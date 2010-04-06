package org.earthsystemmodeling.refactor.heuristics;

import org.eclipse.photran.internal.core.analysis.binding.ScopingNode;
import org.eclipse.photran.internal.core.parser.IDeclarationConstruct;
import org.eclipse.photran.internal.core.parser.ISpecificationPartConstruct;
import org.eclipse.photran.internal.core.parser.Parser.IASTListNode;
import org.eclipse.photran.internal.core.parser.Parser.IASTNode;

public class AddVarDeclarationEndOfEnclosingScope implements IRefactorHeuristic {

	
	public static void go (IDeclarationConstruct decl, IASTNode context) throws HeuristicFailure {
		
		//context.findFirstToken().getEnclosingScope();
		ScopingNode scope = ScopingNode.getEnclosingScope(context);
		
		IASTListNode<IASTNode> body = (IASTListNode<IASTNode>) scope.getBody();
		if (body == null) {
			throw new HeuristicFailure();
		}
		
		//start from the end and look for the first SpecificationPartConstruct and add it after it
		int i = 0;
		for (i=body.size()-1; i >= 0; i--) {
			IASTNode node = body.get(i);
			if (node instanceof ISpecificationPartConstruct) {
				break;
			}
		}
		
		if (i <= 0) {
			body.add(decl);
		}
		else {
			body.add(i+1, decl);
		}
		
		
	}
	
	/*
	protected static int findIndexToInsertTypeDeclaration(IASTListNode<? extends IASTNode> body)
    {
        IASTNode node = null;
        Iterator<? extends IASTNode> iterator = body.iterator();
        while(iterator.hasNext())
        {
            node = iterator.next();
            if (!(node instanceof ASTUseStmtNode) && !(node instanceof ASTImplicitStmtNode))
            {
                break;
            }
        }
        //If there are no other nodes besides use statements and implicit none, then increment the index
        if (node instanceof ASTUseStmtNode || node instanceof ASTImplicitStmtNode)
        {
            return body.indexOf(node) + 1;
        }else
        {
            return body.indexOf(node);
        }
    }
	*/
	
}
