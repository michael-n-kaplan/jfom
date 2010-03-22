/*******************************************************************************
 * Copyright (c) 2008 University of Illinois at Urbana-Champaign and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *     UIUC - Initial API and implementation
 *******************************************************************************/
package org.earthsystemmodeling.refactor;

import java.util.HashMap;
import java.util.Map;

import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.core.runtime.OperationCanceledException;
import org.eclipse.ltk.core.refactoring.RefactoringStatus;
import org.eclipse.photran.internal.core.lexer.Token;
import org.eclipse.photran.internal.core.parser.ASTFunctionSubprogramNode;
import org.eclipse.photran.internal.core.parser.ASTMainProgramNode;
import org.eclipse.photran.internal.core.parser.ASTSubroutineSubprogramNode;
import org.eclipse.photran.internal.core.parser.Parser.GenericASTVisitor;
import org.eclipse.photran.internal.core.refactoring.infrastructure.SingleFileFortranRefactoring;
import org.eclipse.photran.internal.core.util.IterableWrapper;

/**
 * This class replaces all comments from the current class with meaningless
 * ones.
 * 
 * @author Nicholas Chen
 * @author Jeff Overbey
 */
public class NativeArrayToESMFArray extends SingleFileFortranRefactoring
{
    private static final String COMMENT_SYMBOL = "!";

    private Map<Token, String> tokensWithCommentsBefore;
    private Map<Token, String> tokensWithCommentsAfter;
    private StringBuilder functionsAndSubroutineNames;
    private Token mainProgramToken;

    /**
     * This simple utility class just encapsulates the task of removing the
     * comments from the whitespace since everything is lumped together. See
     * {@link edu.uiuc.nchen.obfuscator.test.CommentRemoverTest} for examples of
     * strings that need to be removed.
     * 
     * @author Nicholas Chen
     */
    public static class CommentRemover
    {
        private static final String COMMENT_REGEX = "!.*";

        public static boolean hasComments(String string)
        {
            return string.indexOf(COMMENT_SYMBOL) != -1;
        }

        public static String removeCommentsFrom(String string)
        {
            return string.replaceAll(COMMENT_REGEX, "");
        }
    }

    public NativeArrayToESMFArray()
    {
        tokensWithCommentsBefore = new HashMap<Token, String>();
        tokensWithCommentsAfter = new HashMap<Token, String>();
        functionsAndSubroutineNames = new StringBuilder();
    }

    /*
     * For this simple refactoring we don't really have any initial/final
     * conditions to check. We are just using the initial condition
     * method call as a hook for doing some initial information collection work.
     */
    @Override
    protected void doCheckInitialConditions(RefactoringStatus status,
        IProgressMonitor pm) throws PreconditionFailure
    {
        astOfFileInEditor.accept(new GenericASTVisitor()
        {
            @Override
            public void visitASTMainProgramNode(ASTMainProgramNode node)
            {
                mainProgramToken = node.findFirstToken();
            }

            @Override
            public void visitASTSubroutineSubprogramNode(
                ASTSubroutineSubprogramNode node)
            {
                functionsAndSubroutineNames.append(COMMENT_SYMBOL + " "
                    + node.getRepresentativeToken().getText() + "\n");
            }

            @Override
            public void visitASTFunctionSubprogramNode(
                ASTFunctionSubprogramNode node)
            {
                functionsAndSubroutineNames.append(COMMENT_SYMBOL + " "
                    + node.getRepresentativeToken().getText() + "\n");
            }
        });

        if (functionsAndSubroutineNames.length() != 0)
            functionsAndSubroutineNames.insert(0,
                "\n" + COMMENT_SYMBOL +
                " This file contains the following functions/subroutines: \n");

        return;
    }

    @Override
    protected void doCheckFinalConditions(RefactoringStatus status,
        IProgressMonitor pm) throws PreconditionFailure
    {
        return;
    }

    @Override
    protected void doCreateChange(IProgressMonitor pm) throws CoreException,
        OperationCanceledException
    {
        // Query
        retrieveComments();

        // Modify
        addMeaninglessHeader();
        removeComments();

        addChangeFromModifiedAST(fileInEditor, pm);
        vpg.releaseAllASTs();
    }

    /**
     * Store all the tokens that have comments. This must be done in one pass
     * before any modification is done to the AST.
     * <p>
     * Instead if you <b>interleave</b> and <b>repeat</b> querying/modifying the
     * AST e.g.
     * <ul>
     * <li>token.getWhiteBefore() // query</li>
     * <li>token.setWhiteBefore() // modify</li>
     * <li>token.getWhiteBefore() // query</li>
     * <li>token.setWhiteBefore() // modify</li>
     * <li>....</li>
     * </ul>
     * Then you will have an invalid AST and the queries will return invalid
     * answers.
     */
    private void retrieveComments()
    {
        for (Token token : new IterableWrapper<Token>(astOfFileInEditor))
        {
            checkCommentsFor(token, token.getWhiteBefore(),
                tokensWithCommentsBefore);
            checkCommentsFor(token, token.getWhiteAfter(),
                tokensWithCommentsAfter);
        }
    }

    private void checkCommentsFor(Token token, String whiteSpace,
        Map<Token, String> accumulator)
    {
        if (whiteSpace != null && CommentRemover.hasComments(whiteSpace))
            accumulator.put(token,
                CommentRemover.removeCommentsFrom(whiteSpace));
    }

    private void addMeaninglessHeader()
    {
        if (mainProgramToken != null)
        {
            String concat = mainProgramToken.getWhiteBefore().concat(
                functionsAndSubroutineNames.toString());
            mainProgramToken.setWhiteBefore(concat);
        }
    }

    private void removeComments()
    {
        for (Token token : tokensWithCommentsBefore.keySet())
            token.setWhiteBefore(tokensWithCommentsBefore.get(token));
    
        for (Token token : tokensWithCommentsAfter.keySet())
            token.setWhiteAfter(tokensWithCommentsAfter.get(token));
    }

    @Override
    public String getName()
    {
        return "Token Changer";
    }
}
