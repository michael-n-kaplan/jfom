package org.earthsystemmodeling.refactor.heuristics;

import org.eclipse.photran.internal.core.parser.Parser.IASTNode;

/**
 * A kind of heuristic for finding locations in the AST.
 * @author rocky
 *
 */
public interface ILocationHeuristic extends IRefactorHeuristic {

	public boolean insert(IASTNode toInsert, IASTNode context);	

}
