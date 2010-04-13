package org.earthsystemmodeling.model;

import java.util.Stack;

import org.earthsystemcurator.esmf.ESMFArray;
import org.earthsystemcurator.esmf.ESMFFactory;
import org.earthsystemcurator.esmf.ESMFGriddedComponent;
import org.earthsystemcurator.esmf.ESMFPackage;
import org.earthsystemcurator.esmf.ESMFStateItem;
import org.earthsystemcurator.esmf.ESMFWorkspace;
import org.earthsystemcurator.esmf.FFramework;
import org.earthsystemcurator.esmf.FSemanticReference;
import org.earthsystemcurator.esmf.FSourceReference;
import org.earthsystemcurator.esmf.FSourceReferenceType;
import org.earthsystemmodeling.model.ESMFAnnotation.Array;
import org.earthsystemmodeling.model.ESMFAnnotation.Finalize;
import org.earthsystemmodeling.model.ESMFAnnotation.GriddedComponent;
import org.earthsystemmodeling.model.ESMFAnnotation.ImportState;
import org.earthsystemmodeling.model.ESMFAnnotation.Init;
import org.earthsystemmodeling.model.ESMFAnnotation.Run;
import org.eclipse.cdt.core.model.ISourceReference;
import org.eclipse.cdt.internal.core.model.Parent;
import org.eclipse.cdt.internal.core.model.ext.SourceRange;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.photran.internal.core.lexer.Token;
import org.eclipse.photran.internal.core.model.FortranElement;
import org.eclipse.photran.internal.core.parser.ASTModuleNode;
import org.eclipse.photran.internal.core.parser.ASTSubroutineSubprogramNode;
import org.eclipse.photran.internal.core.parser.ASTTypeDeclarationStmtNode;
import org.eclipse.photran.internal.core.parser.Parser.GenericASTVisitor;
import org.eclipse.photran.internal.core.parser.Parser.IASTNode;

public final class AnnotationBasedModelBuildingVisitor extends GenericASTVisitor {
 
    private AnnotationBasedModelBuilder builder;
    private ESMFWorkspace workspace;
    private FFramework framework;
    private ESMFFactory factory;
    private ESMFPackage pack;
    
    private Stack<EObject> contextStack = new Stack<EObject>();
    private Stack<IASTNode> parseStack = new Stack<IASTNode>();
        
    public AnnotationBasedModelBuildingVisitor(AnnotationBasedModelBuilder builder) {
    	this.builder = builder;
    	this.workspace = this.builder.getESMFWorkspace();
    	this.framework = this.builder.getFramework();
    	this.factory = ESMFFactory.eINSTANCE;
    	this.pack = ESMFPackage.eINSTANCE;
    }
   
    private boolean isCurrentParent(IASTNode node) {
        if (parseStack.isEmpty())
            return false;
        else
            return node == (IASTNode) parseStack.peek();
    } 
    
    private void beginAddingChildrenFor(IASTNode node, EObject obj) {
        parseStack.add(node);
        contextStack.add(obj);
    }

    private void doneAddingChildrenFor(IASTNode node) {
        if (isCurrentParent(node)) {
            parseStack.pop();
            contextStack.pop();
        }
    }
    
    private boolean isContextGriddedComponent() {
    	return pack.getESMFGriddedComponent().isInstance(contextStack.peek());
    }
    
    @SuppressWarnings("unchecked")
	private <T extends EObject> T getContext(Class<T> type) {
    	return (T) contextStack.peek();
    }
    
    ///private void addToImportState(ESMFGriddedComponent)

    @Override 
    public void visitASTNode(IASTNode node) {        
    	traverseChildren(node);
        doneAddingChildrenFor(node);        
    }
    
////
//    @SuppressWarnings("restriction")
//	private <T extends FortranElement> T setPos(T element, IASTNode astNode) {
//        Token first = astNode.findFirstToken();
//        Token last = astNode.findLastToken();
//        if (first != null && last != null) {
//            element.setPos(first.getFileOffset(), last.getFileOffset()+last.getLength()-first.getFileOffset());
//            element.setLines(first.getLine(), last.getLine());
//        }        
//        System.out.println("setPos for " + element.getElementName() + ": " + first.getFileOffset() + ", " + (last.getFileOffset()+last.getLength()-first.getFileOffset()));
//        System.out.println("setLines for " + element.getElementName() + ": " + first.getLine() + ", " + last.getLine());        
//        return element;
//    }
    
    @SuppressWarnings("restriction")
	private FSourceReference getSourceReference(IASTNode node) {
    	Token first = node.findFirstToken();
        Token last = node.findLastToken();
    	
        int offset = first.getFileOffset();
        int length = last.getFileOffset() + last.getLength() - first.getFileOffset();
    	
    	FSourceReference sr = factory.createFSourceReference();
		sr.setOffset(offset);
		sr.setLength(length);
		System.out.println("About to return source reference");
		return sr;
    }

//    public void visitASTMainProgramNode(ASTMainProgramNode node)
//    {
//        Token token = node.getProgramStmt() == null
//            ? null
//            : node.getProgramStmt().getProgramName().getProgramName();
//        addToModel(node, setPos(new FortranElement.MainProgram(getCurrentParent(), token), node));
//    }
    

    
    @Override
    public void visitASTTypeDeclarationStmtNode(ASTTypeDeclarationStmtNode node) {
    	
    	if (isContextGriddedComponent()) {       
        	ESMFGriddedComponent parent = getContext(ESMFGriddedComponent.class);
        
	    	if (ESMFAnnotationUtil.hasESMFAnnotation(node, ImportState.class)) {
	    		Token token = node.getEntityDeclList().get(0).getObjectName().getObjectName();
	    		
	    		if (parent.getImportState() == null) {
	    			parent.setImportState(factory.createESMFState());
	    		}
	    		
	    		//here I would like to have access to all declared names
	    		//perhaps by storing all code references?
	    		
	    		parent.getImportState().setName(token.getText());  
	    		//addToModel(node, setPos(new ESMFElement.ESMFArray(getCurrentParent(), token), node));
	    	}
	    	
	    	if (ESMFAnnotationUtil.hasESMFAnnotation(node, Array.class)) {
	    		Token token = node.getEntityDeclList().get(0).getObjectName().getObjectName();
	    		
	    		ESMFAnnotation ann = ESMFAnnotationUtil.getESMFAnnotation(node, Array.class);
	    		String id = ann.getParameter("id");
	    		
	    		System.out.println("finding array with id = " + id);
	    		ESMFStateItem array = framework.findByID(ESMFStateItem.class, id);
	    		//ESMFStateItem array = null;
	    		if (array == null) {
	    			System.out.println("search failed");
	    			array = factory.createESMFArray();
	    			array.setName(token.getText());
		    		array.setID(id);		    	
		    		
		    		//System.out.println("creating fortran array element");
		    		//SourceReference sourceReference = new FortranElement.Variable((Parent) builder.getTranslationUnit(), token);
		    		FSourceReference sr = getSourceReference(node);
		    		//System.out.println("done setting position");    		
		    		
		    		FSemanticReference fsr = factory.createFSemanticReference();
		    		fsr.setReferenceType(FSourceReferenceType.TYPE_DECLARATION);
		    		fsr.setSourceReference(sr);
		    		
		    		array.getReference().add(fsr);
		    		framework.getStructures().add(array);
		    		
	    		}    			
	    		
	    		if (ann.getParameterBool("import")) {	    				    			
	    			array = parent.addToImportState(array);
		    		workspace.getStateItem().add(array);		    		
	    		}
	    		
	    		if (ann.getParameterBool("export")) {
	    			array = parent.addToExportState(array);
		    		workspace.getStateItem().add(array);		    		
	    		}
	    		
	    	}
	    	
    	}
    }

    @Override
    public void visitASTModuleNode(ASTModuleNode node) {
    	if (ESMFAnnotationUtil.hasESMFAnnotation(node, GriddedComponent.class)) {
    		Token token = node.getModuleStmt().getModuleName().getModuleName();
    		
    		ESMFGriddedComponent comp = factory.createESMFGriddedComponent();
    		comp.setName(token.getText());
    		workspace.getComponent().add(comp);
    		beginAddingChildrenFor(node, comp);    		
    	}    
    }

//    public void visitASTSubmoduleNode(ASTSubmoduleNode node)
//    {
//        Token token = node.getSubmoduleStmt().getSubmoduleName().getModuleName();
//        addToModel(node, setPos(new FortranElement.Submodule(getCurrentParent(), token), node));
//    }
//
//    public void visitASTFunctionSubprogramNode(ASTFunctionSubprogramNode node)
//    {
//        Token token = node.getFunctionStmt().getFunctionName().getFunctionName();
//        addToModel(node, setPos(new FortranElement.Function(getCurrentParent(), token), node));
//    }

    @Override
    public void visitASTSubroutineSubprogramNode(ASTSubroutineSubprogramNode node) {
        Token token = node.getSubroutineStmt().getSubroutineName().getSubroutineName();
        
        //are we inside a gridded or coupler component
        if (pack.getESMFGriddedComponent().isInstance(contextStack.peek())) {       
        	ESMFGriddedComponent parent = (ESMFGriddedComponent) contextStack.peek();
        	
	        if (ESMFAnnotationUtil.hasESMFAnnotation(node, Init.class)) {        	
	        	parent.getInit().add(token.getText());	        	
	        }
	        
	        if (ESMFAnnotationUtil.hasESMFAnnotation(node, Run.class)) {
	        	parent.getRun().add(token.getText());
	        }
	        
	        if (ESMFAnnotationUtil.hasESMFAnnotation(node, Finalize.class)) {
	        	parent.getFinalize().add(token.getText());	
	        }
	        
        }
        
    }

//    public void visitASTSpecificBindingNode(ASTSpecificBindingNode node)
//    {
//        Token token = node.getBindingName();
//        addToModel(node, setPos(new FortranElement.Subroutine(getCurrentParent(), token), node));
//    }

//    public void visitASTGenericBindingNode(ASTGenericBindingNode node)
//    {
//        Token token;
//        if (node.getGenericName() != null)
//        {
//            token =  node.getGenericName().getGenericName();
//        }
//        else
//        {
//            ASTGenericSpecNode spec = node.getGenericSpec();
//            if (spec.isAssignmentOperator())
//                token = spec.getEqualsToken();
//            else if (spec.isDefinedOperator())
//                token = spec.getDefinedOperator().findFirstToken();
//            else
//                token = spec.findFirstToken();
//        }
//        addToModel(node, setPos(new FortranElement.Subroutine(getCurrentParent(), token), node));
//    }
//
//    public void visitASTBlockDataSubprogramNode(ASTBlockDataSubprogramNode node)
//    {
//        Token token = node.getBlockDataStmt().getBlockDataName() == null
//            ? null
//            : node.getBlockDataStmt().getBlockDataName().getBlockDataName();
//        addToModel(node, setPos(new FortranElement.BlockData(getCurrentParent(), token), node));
//    }
//
//    public void visitASTDerivedTypeDefNode(ASTDerivedTypeDefNode node)
//    {
//        Token token = node.getDerivedTypeStmt().getTypeName();
//        addToModel(node, setPos(new FortranElement.DerivedType(getCurrentParent(), token), node));
//    }
//
//    public void visitASTDataComponentDefStmtNode(ASTDataComponentDefStmtNode node)
//    {
//        for (ASTComponentDeclNode decl : node.getComponentDeclList())
//            addToModelNoChildren(setPos(new FortranElement.Variable(getCurrentParent(), decl.getComponentName().getComponentName()), node));
//    }
//
//    public void visitASTExternalStmtNode(ASTExternalStmtNode node)
//    {
//        IASTListNode<ASTExternalNameListNode> list = node.getExternalNameList();
//        for (int i = 0; i < list.size(); i++)
//            addToModel(node, setPos(new FortranElement.Variable(getCurrentParent(), list.get(i).getExternalName()), node));
//    }
//
//    public void visitASTInterfaceBlockNode(ASTInterfaceBlockNode node)
//    {
//        Token token = node.getInterfaceStmt().getGenericName() == null
//            ? null
//            : node.getInterfaceStmt().getGenericName().getGenericName();
//        addToModel(node, setPos(new FortranElement.Variable(getCurrentParent(), token), node));
//    }
//
//    public void visitASTIntrinsicStmtNode(ASTIntrinsicStmtNode node)
//    {
//        IASTListNode<ASTIntrinsicListNode> list = node.getIntrinsicList();
//        for (int i = 0; i < list.size(); i++)
//            addToModel(node, setPos(new FortranElement.Variable(getCurrentParent(), list.get(i).getIntrinsicProcedureName()), node));
//    }
//
//    public void visitASTStmtFunctionStmtNode(ASTStmtFunctionStmtNode node)
//    {
//        addToModel(node, setPos(new FortranElement.Variable(getCurrentParent(), node.getName().getName()), node));
//    }
}
