package org.earthsystemmodeling.model;

import java.io.ByteArrayInputStream;
import java.util.HashMap;
import java.util.Map;

import org.eclipse.cdt.core.model.CModelException;
import org.eclipse.cdt.core.model.ICElement;
import org.eclipse.cdt.core.model.IContributedModelBuilder;
import org.eclipse.cdt.core.model.ITranslationUnit;
import org.eclipse.cdt.internal.core.model.Parent;
import org.eclipse.cdt.internal.core.model.TranslationUnit;
import org.eclipse.core.resources.IFile;
import org.eclipse.photran.core.IFortranAST;
import org.eclipse.photran.internal.core.FortranAST;
import org.eclipse.photran.internal.core.lexer.IAccumulatingLexer;
import org.eclipse.photran.internal.core.lexer.LexerFactory;
import org.eclipse.photran.internal.core.lexer.SourceForm;
import org.eclipse.photran.internal.core.lexer.preprocessor.fortran_include.IncludeLoaderCallback;
import org.eclipse.photran.internal.core.parser.Parser;

import org.eclipse.photran.internal.core.model.IFortranModelBuilder;

@SuppressWarnings("restriction")
public class ESMFModelBuilder implements IContributedModelBuilder, IFortranModelBuilder
{
    private TranslationUnit translationUnit;
    private Map<ICElement, Object /*CElementInfo*/> newElements;
    private boolean isFixedForm;

    public void setTranslationUnit(ITranslationUnit tu)
    {
        if (!(tu instanceof TranslationUnit)) throw new Error("Unexpected subclass of ITranslationUnit");

        this.translationUnit = (TranslationUnit)tu;
    }

    public void setIsFixedForm(boolean isFixedForm)
    {
        this.isFixedForm = isFixedForm;
    }


    public void parse(boolean quickParseMode) throws Exception
    {
        this.newElements = new HashMap<ICElement, Object /*CElementInfo*/>();
        boolean wasSuccessful = true;

        IAccumulatingLexer lexer = null;
        try
        {
            IFile file = translationUnit.getFile();
            SourceForm sourceForm = determineSourceForm(file);
            String filename = determineFilename(file);
            lexer = LexerFactory.createLexer(
                new ByteArrayInputStream(translationUnit.getBuffer().getContents().getBytes()),
                file,
                filename,
                sourceForm,
                true);
 
            IFortranAST ast = new FortranAST(file, new Parser().parse(lexer), lexer.getTokenList());

            createSourceFormNode(sourceForm.getDescription(filename));

            ast.accept(new ESMFModelBuildingVisitor(translationUnit, this));
 
            
            //FortranElement note = new FortranElement.UnknownNode(translationUnit, isFixedForm ? "<Fixed Form Source>" : "<Free Form Source>");
            //this.addF90Element(note);

            /* For whatever reason, we have to only set the *parent* while we
             * parse, then go back through (now) and traverse the model in
             * preorder, executing addChild().  This doesn't make any sense,
             * but the "obvious" way of doing it all while parsing (in
             * BuildModelParserAction.java) doesn't work.
             */
            //newElements.putAll(newElts);
            //this.addF90Elements(newElements);
        }
        catch (Exception e)
        {
            String message = e.getMessage();
            if (!e.getClass().equals(Exception.class))
                message = e.getClass().getSimpleName() + ": " + message; // Not a legit parser error
            ESMFElement elt = createParseFailureNode(translationUnit, message);
            if (lexer != null)
            {
                int offset = lexer.getLastTokenFileOffset();
                int length = lexer.getLastTokenLength();
                int line = lexer.getLastTokenLine();
                if (offset >= 0 && length > 0)
                {
                    elt.setIdPos(offset, length);
                    elt.setPos(offset, length);
                    if (line > 0) elt.setLines(line, line);
                }
            }
            wasSuccessful = false;
        }

        // From CDT: important to know if the unit has parse errors or not
        setIsStructureKnown(wasSuccessful);
    }

	private String determineFilename(IFile file)
	{
		if (file == null)
			return "";
		else if (isLocal(file)) // C preprocessor requires absolute path
			return file.getLocation().toFile().getAbsolutePath();
		else
			return file.getName();
	}
	
	private SourceForm determineSourceForm(IFile file) {
		if (isFixedForm) {
			return SourceForm.FIXED_FORM;
		}
		else {
			if (isLocal(file) && file.getProject() != null)
				return SourceForm.preprocessedFreeForm(new IncludeLoaderCallback(file.getProject()));
			else
				return SourceForm.UNPREPROCESSED_FREE_FORM;
		}
	}

	private boolean isLocal(IFile file) {
		return file != null && file.getLocation() != null;
	}

    public void setIsStructureKnown(boolean isStructureKnown) {
        translationUnit.setIsStructureKnown(isStructureKnown);
    }

    private ESMFElement createSourceFormNode(String desc) throws CModelException
    {
        desc = "<" + desc + ">";
        ESMFElement element = new ESMFElement.UnknownNode(translationUnit, desc);
        translationUnit.addChild(element);
        this.newElements.put(element, element.getElementInfo());
        return element;

    }


    private ESMFElement createParseFailureNode(Parent parent, String errorMessage) throws CModelException {
        ESMFElement element = new ESMFElement.ErrorNode(parent, errorMessage);
        parent.addChild(element);
        this.newElements.put(element, element.getElementInfo());
        return element;
    }

    public ESMFElement addESMFElement(ESMFElement element) throws CModelException {
        if (element.getParent() == null) element.setParent(translationUnit);

        ICElement parent = element.getParent();
        if (parent instanceof Parent) ((Parent)parent).addChild(element);

        this.newElements.put(element, element.getElementInfo());

        return element;
    }
}
