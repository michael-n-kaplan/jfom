package org.earthsystemmodeling.refactor.heuristics;

import org.eclipse.photran.internal.core.analysis.binding.ScopingNode;
import org.eclipse.photran.internal.core.parser.ISpecificationPartConstruct;
import org.eclipse.photran.internal.core.parser.Parser.IASTListNode;
import org.eclipse.photran.internal.core.parser.Parser.IASTNode;

public class EndOfEnclosingScopeSpecPart implements ILocationHeuristic {

	//this could be based on pre-conditions and post-conditions
	
	public boolean insert(IASTNode toInsert, IASTNode context) {
		
		ScopingNode scope = ScopingNode.getEnclosingScope(context);
		
		IASTListNode<IASTNode> body = (IASTListNode<IASTNode>) scope.getBody();
		if (body == null) {
			return false;
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
			body.add(toInsert);
		}
		else {
			body.add(i+1, toInsert);
		}
		
		return true;
		
	}
}
