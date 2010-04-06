package org.earthsystemmodeling.refactor.heuristics;

import java.util.ArrayList;
import java.util.List;

import org.eclipse.photran.internal.core.parser.IDeclarationConstruct;
import org.eclipse.photran.internal.core.parser.Parser.IASTNode;

public class InsertDeclarationConstruct implements IRefactorGoal {

	//private IDeclarationConstruct idc;
	//private IASTNode context;
	private List<ILocationHeuristic> heuristics;
	
	public InsertDeclarationConstruct() {		
		//assert idc != null;
		//assert context != null;
		//this.idc = idc;
		//this.context = context;
		heuristics = new ArrayList<ILocationHeuristic>();
	}
	
	public void addLocationHeuristic(ILocationHeuristic h) {
		heuristics.add(h);		
	}
	
	/**
	 * Attempt to accomplish the goal using the heuristics provided.
	 * @return
	 */
	public boolean go(IDeclarationConstruct idc, IASTNode context) {
		for (ILocationHeuristic lh : heuristics) {
			if (lh.insert(idc, context)) {
				return true;
			}			
		}
		return false;
	}
	
	public static boolean go(IDeclarationConstruct idc, IASTNode context, ILocationHeuristic lh) {
		return lh.insert(idc, context);
	}
	
}
