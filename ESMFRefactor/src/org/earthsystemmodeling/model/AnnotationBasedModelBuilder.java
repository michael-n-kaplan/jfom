package org.earthsystemmodeling.model;

import java.io.ByteArrayInputStream;
import java.io.IOException;

import org.earthsystemcurator.esmf.ESMFWorkspace;
import org.earthsystemcurator.esmf.FFramework;
import org.eclipse.cdt.core.model.CModelException;
import org.eclipse.cdt.core.model.ITranslationUnit;
import org.eclipse.core.resources.IFile;
import org.eclipse.photran.core.IFortranAST;
import org.eclipse.photran.internal.core.FortranAST;
import org.eclipse.photran.internal.core.SyntaxException;
import org.eclipse.photran.internal.core.lexer.IAccumulatingLexer;
import org.eclipse.photran.internal.core.lexer.LexerException;
import org.eclipse.photran.internal.core.lexer.LexerFactory;
import org.eclipse.photran.internal.core.lexer.SourceForm;
import org.eclipse.photran.internal.core.parser.Parser;

/**
 * 
 * @author Rocky Dunlap
 * 
 * Builds an ESMF Conceptual Model instance from annotated code.
 *
 */
public class AnnotationBasedModelBuilder {

	private ITranslationUnit translationUnit;
	
	public ITranslationUnit getTranslationUnit() {
		return translationUnit;
	}

	private ESMFWorkspace workspace;
	private FFramework framework;
	
	public FFramework getFramework() {
		return framework;
	}

	public ESMFWorkspace getESMFWorkspace() {
		return workspace;
	}

	public AnnotationBasedModelBuilder(ITranslationUnit tu, ESMFWorkspace w, FFramework f) {
		this.translationUnit = tu;
		this.workspace = w;
		this.framework = f;
	}
	
	public boolean parse() {				

        IAccumulatingLexer lexer = null;

        IFile file = (IFile) translationUnit.getResource();
        //SourceForm sourceForm = determineSourceForm(file);
        String filename = determineFilename(file);
        try {
			
        	lexer = LexerFactory.createLexer(
					new ByteArrayInputStream(translationUnit.getBuffer().getContents().getBytes()),
			        	file,
			        	filename,
			        	SourceForm.UNPREPROCESSED_FREE_FORM,
			        	true);
			
			IFortranAST ast = new FortranAST(file, new Parser().parse(lexer), lexer.getTokenList());
			
			ast.accept(new AnnotationBasedModelBuildingVisitor(this));
		
        } catch (CModelException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} catch (LexerException e) {
			e.printStackTrace();
		} catch (SyntaxException e) {
			e.printStackTrace();
		}
 
		return true;
        
    }
	
//	
//	public boolean isESMFGriddedComponent(IFortranAST ast) {
//    	ASTModuleNode node = ast.getRoot().findFirst(ASTModuleNode.class);
//    	if (node != null) {
//    		if (ESMFAnnotationUtil.hasESMFAnnotationOfType(node, ESMFAnnotation.Type.gridded_component)) {
//    			return true;
//    		}
//    	}
//    	return false;
//    }
	
	private String determineFilename(IFile file) {
		if (file == null)
			return "";
		else if (isLocal(file)) // C preprocessor requires absolute path
			return file.getLocation().toFile().getAbsolutePath();
		else
			return file.getName();
	}
	
	private boolean isLocal(IFile file) {
		return file != null && file.getLocation() != null;
	}
	
}
