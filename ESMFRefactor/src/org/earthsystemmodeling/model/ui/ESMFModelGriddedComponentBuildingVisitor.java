package org.earthsystemmodeling.model.ui;

import java.util.LinkedList;

import org.earthsystemmodeling.model.ESMFAnnotation;
import org.earthsystemmodeling.model.ESMFAnnotationUtil;
import org.earthsystemmodeling.model.ui.ESMFElement.ESMFExecutionGroup;
import org.eclipse.cdt.core.model.CModelException;
import org.eclipse.cdt.internal.core.model.Parent;
import org.eclipse.cdt.internal.core.model.TranslationUnit;
import org.eclipse.photran.internal.core.lexer.Token;
import org.eclipse.photran.internal.core.parser.ASTDerivedTypeStmtNode;
import org.eclipse.photran.internal.core.parser.ASTModuleNode;
import org.eclipse.photran.internal.core.parser.ASTSubroutineSubprogramNode;
import org.eclipse.photran.internal.core.parser.ASTTypeDeclarationStmtNode;
import org.eclipse.photran.internal.core.parser.IDeclarationConstruct;
import org.eclipse.photran.internal.core.parser.Parser.GenericASTVisitor;
import org.eclipse.photran.internal.core.parser.Parser.IASTNode;

@SuppressWarnings("restriction")
public final class ESMFModelGriddedComponentBuildingVisitor extends GenericASTVisitor
{
 
    private TranslationUnit translationUnit;
    
    private ESMFModelBuilder modelBuilder;

    public ESMFModelGriddedComponentBuildingVisitor(TranslationUnit translationUnit, ESMFModelBuilder modelBuilder) {
        this.translationUnit = translationUnit;
        this.modelBuilder = modelBuilder;
    }

    private LinkedList<IASTNode> parentParseTreeNodeStack = new LinkedList<IASTNode>();

    private LinkedList<ESMFElement> parentElementStack = new LinkedList<ESMFElement>();
    
    private Parent getCurrentParent()
    {
        if (parentElementStack.isEmpty())
            return translationUnit;
        else
            return (Parent) parentElementStack.getLast();
    }

    private boolean isCurrentParent(IASTNode node)
    {
        if (parentParseTreeNodeStack.isEmpty())
            return false;
        else
            return node == (IASTNode) parentParseTreeNodeStack.getLast();
    }

    private void addToModel(IASTNode parseTreeNode, ESMFElement element)
    {
        try
        {
            modelBuilder.addESMFElement(element);
            beginAddingChildrenFor(parseTreeNode, element);
        }
        catch (CModelException e)
        {
            e.printStackTrace();
        }
    }
    
    private void addToExecutionGroup(ESMFElement element) {
    	try {
			modelBuilder.addToExecutionGroup(element);
		} catch (CModelException e) {			
			e.printStackTrace();
		}
    }
   
    /*
    private void addToExecutionGroup(IASTNode parseTreeNode, ESMFElement element) {    	
		executionGroup.addChild(element);		
    }
    */

//    private void addToModelNoChildren(ESMFElement element)
//    {
//        try
//        {
//            modelBuilder.addESMFElement(element);
//        }
//        catch (CModelException e)
//        {
//            ;
//        }
//    }

    private void beginAddingChildrenFor(IASTNode parseTreeNode, ESMFElement element)
    {
        parentParseTreeNodeStack.addLast(parseTreeNode);
        parentElementStack.addLast(element);
    }

    private void doneAddingChildrenFor(IASTNode node)
    {
        if (isCurrentParent(node))
        {
            parentParseTreeNodeStack.removeLast();
            parentElementStack.removeLast();
        }
    }

    // --VISITOR METHODS-------------------------------------------------

    @Override public void visitASTNode(IASTNode node)
    {
        // beginAddingChildrenFor is called in addToModel
        traverseChildren(node);
        doneAddingChildrenFor(node);
        //super.visitASTDerivedTypeStmtNode(node)
    }

    private <T extends ESMFElement> T setPos(T element, IASTNode astNode) {
        Token first = astNode.findFirstToken();
        Token last = astNode.findLastToken();
        if (first != null && last != null) {
            element.setPos(first.getFileOffset(), last.getFileOffset()+last.getLength()-first.getFileOffset());
            element.setLines(first.getLine(), last.getLine());
        }
        
        //System.out.println("setPos for " + element.getElementName() + ": " + first.getFileOffset() + ", " + (last.getFileOffset()+last.getLength()-first.getFileOffset()));
        //System.out.println("setLines for " + element.getElementName() + ": " + first.getLine() + ", " + last.getLine());
        
        return element;
    }

//    public void visitASTMainProgramNode(ASTMainProgramNode node)
//    {
//        Token token = node.getProgramStmt() == null
//            ? null
//            : node.getProgramStmt().getProgramName().getProgramName();
//        addToModel(node, setPos(new FortranElement.MainProgram(getCurrentParent(), token), node));
//    }
    

    
//    @Override
//    public void visitASTTypeDeclarationStmtNode(ASTTypeDeclarationStmtNode node) {
//    	if (ESMFAnnotationUtil.hasESMFAnnotationOfType(node, ESMFAnnotation.Type.array)) {
//    		Token token = node.getEntityDeclList().get(0).getObjectName().getObjectName();
//    		addToModel(node, setPos(new ESMFElement.ESMFArray(getCurrentParent(), token), node));
//    	}    
//    }

//    @Override
//    public void visitASTModuleNode(ASTModuleNode node) {
//    	if (ESMFAnnotationUtil.hasESMFAnnotationOfType(node, ESMFAnnotation.Type.gridded_component)) {
//    		Token token = node.getModuleStmt().getModuleName().getModuleName();
//    		addToModel(node, setPos(new ESMFElement.ESMFGriddedComponent(getCurrentParent(), token), node));
//    	}    
//    }

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

//    public void visitASTSubroutineSubprogramNode(ASTSubroutineSubprogramNode node) {
//        Token token = node.getSubroutineStmt().getSubroutineName().getSubroutineName();
//        
//        if (ESMFAnnotationUtil.hasESMFAnnotationOfType(node, ESMFAnnotation.Type.init)) {        	
//        	addToExecutionGroup(setPos(new ESMFElement.ESMFInitializeMethod(getCurrentParent(), token), node));
//        }
//        
//        if (ESMFAnnotationUtil.hasESMFAnnotationOfType(node, ESMFAnnotation.Type.run)) {
//        	addToExecutionGroup(setPos(new ESMFElement.ESMFRunMethod(getCurrentParent(), token), node));
//        }
//        
//        if (ESMFAnnotationUtil.hasESMFAnnotationOfType(node, ESMFAnnotation.Type.finalize)) {
//        	addToExecutionGroup(setPos(new ESMFElement.ESMFFinalizeMethod(getCurrentParent(), token), node));
//        }
//        
//    }

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
