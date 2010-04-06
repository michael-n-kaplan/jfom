package org.earthsystemmodeling.ui;

import java.io.ByteArrayInputStream;

import org.eclipse.cdt.core.model.ITranslationUnit;
import org.eclipse.cdt.internal.corext.codemanipulation.StubUtility;
import org.eclipse.cdt.ui.CUIPlugin;
import org.eclipse.cdt.ui.CodeGeneration;
import org.eclipse.core.resources.IFile;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.jface.text.templates.Template;
import org.eclipse.jface.text.templates.persistence.TemplatePersistenceData;
import org.eclipse.photran.internal.core.FortranAST;
import org.eclipse.photran.internal.core.lexer.IAccumulatingLexer;
import org.eclipse.photran.internal.core.lexer.LexerFactory;
import org.eclipse.photran.internal.core.lexer.SourceForm;
import org.eclipse.photran.internal.core.parser.ASTAssignmentStmtNode;
import org.eclipse.photran.internal.core.parser.ASTContainsStmtNode;
import org.eclipse.photran.internal.core.parser.ASTMainProgramNode;
import org.eclipse.photran.internal.core.parser.IBodyConstruct;
import org.eclipse.photran.internal.core.parser.IExpr;
import org.eclipse.photran.internal.core.parser.IProgramUnit;
import org.eclipse.photran.internal.core.parser.Parser;
import org.eclipse.photran.internal.core.parser.Parser.IASTListNode;

@SuppressWarnings("restriction")
public class ESMFComponentCreationWizardPage extends org.eclipse.cdt.internal.ui.wizards.filewizard.NewSourceFileCreationWizardPage {
	
	public static final String TEMPLATE_ID = "org.eclipse.photran.codetemplates.yourmom";
	
	@Override
	protected Template[] getApplicableTemplates() {
		//hard coded for now
		TemplatePersistenceData tpd = CUIPlugin.getDefault().getCodeTemplateStore().getTemplateData(TEMPLATE_ID);
		return new Template[] {tpd.getTemplate()};
	}
	
	
	public void createESMFComponent(IProgressMonitor monitor) throws CoreException  {
		
		ITranslationUnit createdTU  = getCreatedFileTU();
		//IFile createdFile = (IFile) createdTU.getResource();
		
		//IFortranAST ast = PhotranVPG.getInstance().acquirePermanentAST(createdFile);
		//System.out.println("ast = " + ast);

		//IProgramUnit pu = parseLiteralProgramUnit("module esmf_component\nimplicit none\nend module esmf_component");
		//ast.getRoot().replaceWith(newNode)
		
		
		//System.out.println("createdTU.getBuffer().isClosed(): " + createdTU.getBuffer().isClosed());
		//System.out.println("createdTU.getBuffer().isReadOnly(): " + createdTU.getBuffer().isReadOnly());
		//System.out.println("IFile: " + (createdTU.getResource() instanceof IFile));
		
		
		//MOVE TO A TEMPLATE APPROACH
		String lineDelimiter = StubUtility.getLineDelimiterUsed(createdTU);
		String content = CodeGeneration.getBodyFileContent(getTemplate(), createdTU, null, null, lineDelimiter);
		if (content != null) {
			createdTU.getBuffer().setContents(content.toCharArray());
			createdTU.save(monitor, true);
		}
		
		//createdTU.getBuffer().setContents("module esmf_component\nimplicit none\nend module esmf_component");
		//createdTU.save(monitor, true);	
		
		//IFortranAST ast = PhotranVPG.getInstance().acquirePermanentAST(createdFile);
		//Reindenter.reindent(ast.getRoot(), ast);
		
		
		
		/*
		try {
			Method[] methods = {
					ITranslationUnit.class.getMethod("getSource"),
					ITranslationUnit.class.getMethod("getAST"),
					ITranslationUnit.class.getMethod("getLanguage"),
					ITranslationUnit.class.getMethod("getLocation"),
					ITranslationUnit.class.getMethod("getResource"),
					ITranslationUnit.class.getMethod("getPath")
			};

			for (Method m : methods) {
				System.out.println(m.getName() + ":" + m.invoke(createdTU));
			}
			//createdTU.
			//System.out.println("createdTU.getContents() : " + String.valueOf(createdTU.getContents()));
			//System.out.println("createdTU.getSource() : " + createdTU.get);	

		} catch (Exception e) {			
			e.printStackTrace();
		}
		*/
	}
	
	// THESE STOLEN FROM org.eclipse.photran.internal.core.refactoring.infrastructure.MultipleFileFortranRefactoring
    // CODE EXTRACTION ////////////////////////////////////////////////////////

    /**
     * Parses the given Fortran statement.
     * <p>
     * Internally, <code>string</code> is embedded into the following program
     * <pre>
     * program p
     *   (string is placed here)
     * end program
     * </pre>
     * which is parsed and its body extracted and returned,
     * so <code>string</code> must "make sense" (syntactically) in this context.
     * No semantic analysis is done; it is only necessary that the
     * program be syntactically correct.
     */
    protected static IBodyConstruct parseLiteralStatement(String string)
    {
        return parseLiteralStatementSequence(string).get(0);
    }

    /**
     * Parses the given Fortran statement, or returns <code>null</code> if the
     * statement cannot be parsed.
     *
     * @see #parseLiteralStatement(String)
     */
    protected static IBodyConstruct parseLiteralStatementNoFail(String string)
    {
        try
        {
            return parseLiteralStatement(string);
        }
        catch (Throwable e)
        {
            return null;
        }
    }

    /**
     * Parses the given Fortran expression.
     * <p>
     * Internally, <code>string</code> is embedded into the following program
     * <pre>
     * program p
     *   x = (string is placed here)
     * end program
     * </pre>
     * which is parsed and the resulting expression extracted and returned,
     * so <code>string</code> must "make sense" (syntactically) in this context.
     * No semantic analysis is done; it is only necessary that the
     * program be syntactically correct.
     */
    protected static IExpr parseLiteralExpression(String string)
    {
        return ((ASTAssignmentStmtNode)parseLiteralStatement("x = " + string)).getRhs();
    }

    /**
     * Parses the given list of Fortran statements.
     * <p>
     * @see parseLiteralStatement
     */
    protected static IASTListNode<IBodyConstruct> parseLiteralStatementSequence(String string)
    {
        string = "program p\n" + string + "\nend program";
        return ((ASTMainProgramNode)parseLiteralProgramUnit(string)).getBody();
    }

    /** @return a CONTAINS statement */
    protected static ASTContainsStmtNode createContainsStmt()
    {
        String string = "program p\ncontains\nsubroutine s\nend subroutine\nend program";
        return ((ASTMainProgramNode)parseLiteralProgramUnit(string)).getContainsStmt();
    }

    /**
     * Parses the given Fortran program unit.
     * <p>
     * No semantic analysis is done; it is only necessary that the
     * program unit be syntactically correct.
     */
    protected static IProgramUnit parseLiteralProgramUnit(String string)
    {
        try
        {
            IAccumulatingLexer lexer = LexerFactory.createLexer(
                new ByteArrayInputStream(string.getBytes()), null, "(none)",
                SourceForm.UNPREPROCESSED_FREE_FORM, true);
            Parser parser = new Parser();

            FortranAST ast = new FortranAST(null, parser.parse(lexer), lexer.getTokenList());
            return ast.getRoot().getProgramUnitList().get(0);
        }
        catch (Exception e)
        {
            throw new Error(e);
        }
    }
	
	
}
