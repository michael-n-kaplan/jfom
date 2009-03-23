package org.jfom.codegen;

import java.io.PrintWriter;
import java.io.StringWriter;

import org.jfom.ActionStatement;
import org.jfom.ActualArgumentSpec;
import org.jfom.ArbitraryTextConstruct;
import org.jfom.CallStatement;
import org.jfom.DeclarationConstruct;
import org.jfom.DerivedTypeSpec;
import org.jfom.DoConstruct;
import org.jfom.ExecutableConstruct;
import org.jfom.ExecutionPart;
import org.jfom.ExecutionPartConstruct;
import org.jfom.IfStatement;
import org.jfom.ImplicitPart;
import org.jfom.ImplicitPartStatement;
import org.jfom.ImplicitStatement;
import org.jfom.IntrinsicTypeSpec;
import org.jfom.MainProgram;
import org.jfom.SpecificationPart;
import org.jfom.TypeDeclarationStatement;
import org.jfom.TypeSpec;
import org.jfom.UseStatement;

public class FOMCodeGenerator {

	public static PrintWriter out;
	public static StringWriter stringOut;
	private static String indent = "";
	
	
	public static String generate(MainProgram mp) {
		stringOut = new StringWriter();
		out = new PrintWriter(stringOut);
		
		String programName = mp.getProgramStatement().getProgramName();
		outputln("program " + programName);
		outputln();
		
		incIndent();
		
		//handle specification part
		generate(mp.getSpecificationPart());
		
		//handle execution part
		generate(mp.getExecutionPart());
		
		decIndent();
		
		outputln("end program");
		
		return stringOut.toString();
	}
	
	private static void generate(SpecificationPart sp) {
		
		if (sp == null)
			return;
		
		//handle use statements
		for (UseStatement us : sp.getUseStatement()) {
			generate(us);			
		}
		outputln();
		
		//handle implicit part
		generate(sp.getImplicitPart());
		outputln();
				
		//handle declaration constructs
		for (DeclarationConstruct dc : sp.getDeclarationConstruct()) {
			generate(dc);
		}
		outputln();
		
	}
	
	private static void generate(UseStatement us) {
		String s = "use " + us.getModuleName();
		if (!us.getRenameList().isEmpty()) {
			s += ", only : ";
			boolean first = true;
			for (String localName : us.getRenameList().keySet()) {
				if (!first)
					s += ", ";
				s += us.getRenameList().get(localName) + " => " + localName;
				first = false;
			}
		}
		outputln(s);
	}
	
	private static void generate(ImplicitPart ip) {
		if (ip == null)
			return;
		
		for (ImplicitPartStatement ips : ip.getImplicitPartStatement()) {			
			generate(ips);
		}
	}
	
	private static void generate(ImplicitPartStatement ips) {
		if (ips instanceof ImplicitStatement) {
			generate((ImplicitStatement) ips);
		}		
	}
	
	private static void generate(ImplicitStatement is) {
		if (is.isNone()) {
			outputln("implicit none");
		}
	}
	
	private static void generate(DeclarationConstruct dc) {
		if (dc instanceof TypeDeclarationStatement) {
			generate((TypeDeclarationStatement) dc);
		}
	}
	
	private static void generate(TypeDeclarationStatement tds) {
		//for now, assume a single entity
		TypeSpec ts = tds.getTypeSpec();
		String type = "";
		if (ts instanceof DerivedTypeSpec) {
			type = "type(" + ((DerivedTypeSpec) ts).getType() + ")";			
		}
		else if (ts instanceof IntrinsicTypeSpec) {
			type = ((IntrinsicTypeSpec) ts).getType().getName();
		}
		outputln(type + " :: " + tds.getEntityDeclaration().get(0));
	}
	
	private static void generate(ExecutionPart ep) {
		if (ep == null)
			return;
		
		for (ExecutionPartConstruct epc : ep.getExecutionPartConstruct()) {
			generate(epc);
		}	
	}
	
	private static void generate(ExecutionPartConstruct epc) {
		if (epc instanceof ExecutableConstruct) {
			generate((ExecutableConstruct) epc);
		}
	}
	
	private static void generate(ExecutableConstruct ec) {
		if (ec instanceof DoConstruct) {
			generate((DoConstruct) ec);
		}
		else if (ec instanceof ActionStatement) {
			generate((ActionStatement) ec);
		}
		else if (ec instanceof ArbitraryTextConstruct) {
			generate((ArbitraryTextConstruct) ec);
		}
	}
	
	private static void generate(DoConstruct dc) {
		outputln("do " + dc.getDoVariable() + " = " + dc.getStart() + ", " + dc.getEnd());
		incIndent();
		for (ExecutionPartConstruct epc : dc.getExecutionPartConstruct()) {
			generate(epc);
		}
		decIndent();
		outputln("end do");
	}

	private static void generate(ArbitraryTextConstruct arc) {
		outputln(arc.getText());
	}
	
	private static void generate(ActionStatement as) {
		if (as instanceof CallStatement) {
			generate((CallStatement) as);
		}
		else if (as instanceof IfStatement) {
			generate((IfStatement) as);
		}
	}
	
	private static void generate(CallStatement cs) {
		String s = "call " + cs.getSubroutineName() + "(";
		boolean first = true;
		for (ActualArgumentSpec argSpec : cs.getActualArgument()) {
			if (!first)
				s += ", ";
			first = false;
			if (argSpec.getKeyword() != null && argSpec.getKeyword().length() > 0) {
				s += argSpec.getKeyword() + "=";
			}
			s += argSpec.getArgument();			
		}
		s += ")";
		outputln(s);
	}
	
	private static void generate(IfStatement is) {
		//String s = "if ";
	}
	
	private static void incIndent() {
		indent += "  ";
	}
	
	private static void decIndent() {
		indent = indent.substring(0, indent.length() - 2);
	}
		
	private static void outputln(String s) {
		out.println(indent + s);
	}
	
//	private static void output(String s) {
//		out.print(indent + s);
//	}
	
	private static void outputln() {
		out.println();
	}
	
}
