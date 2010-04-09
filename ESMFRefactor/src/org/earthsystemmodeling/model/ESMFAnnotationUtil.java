package org.earthsystemmodeling.model;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import org.eclipse.photran.internal.core.parser.Parser.IASTNode;

public class ESMFAnnotationUtil {

	
	public static Set<ESMFAnnotation> getESMFAnnotations(IASTNode node) {		
		//for now, just get comment before first token
		return parseAnnotation(node.findFirstToken().getWhiteBefore());	
	}
	
	public static boolean hasESMFAnnotationOfType(IASTNode node, ESMFAnnotation.Type t) {
		Set<ESMFAnnotation> anns = getESMFAnnotations(node);
		for (ESMFAnnotation a : anns) {
			if (a.getType().equals(t)) {
				return true;
			}
		}
		return false;
	}
	
	private static final Pattern esmfAnnotationPattern = 
		Pattern.compile("([Cc*!][ \\t]*@ESMF[ \\t]*)([\\w]+)([ \\t]*\\([^\\)]*\\))?(\\r?\\n)");
	
	protected static Set<ESMFAnnotation> parseAnnotation(String text) {
		Set<ESMFAnnotation> ret = new HashSet<ESMFAnnotation>();		
		Matcher m = esmfAnnotationPattern.matcher(text);
		while (m.find()) {
			String annotationName = m.group(2);
			String annotationParams = m.group(3);
			//System.out.println(m.group(1) +  " : " + m.group(2) + " : " + m.group(3));
						
			try {
				ESMFAnnotation ann = ESMFAnnotation.newAnnotation(ESMFAnnotation.Type.valueOf(annotationName));
				ann.setParameters(parseParameters(annotationParams));
				//need to parse parameters as well
				ret.add(ann);
			}
			catch (IllegalArgumentException iae) {
				//ignore bad annotations				
			}
			
		}
		return ret;
	}
	
	//input form expected is of the form "(a=b, c=d, e=f)"
	protected static Map<String, String> parseParameters(String paramString) {
		Map<String, String> params = new HashMap<String, String>();
		if (paramString == null)
			return params;
		
		paramString = paramString.replace("(", "");
		paramString = paramString.replace(")", "");
		String[] ps = paramString.split(",");
		for (String p : ps) {
			p = p.trim();
			if (p.contains("=")) {
				String[] pp = p.split("=");
				String paramName = pp[0].trim();
				String paramVal = pp[1].trim();
				params.put(paramName, paramVal);
			}
			else {
				params.put(p, null);
			}
		}
		return params;
	}
	
	/*
	public List<Token> getOpenMPComments()
    {
        String whitetext = getWhiteBefore();
        Matcher m = ompComment.matcher(whitetext);
        int startStreamOffset = getStreamOffset() - whitetext.length();
        int startFileOffset = getFileOffset() - whitetext.length();
        List<Token> result = new LinkedList<Token>();
        
        for (int startSearchFrom = 0; m.find(startSearchFrom); startSearchFrom = m.end())
        {
            Token token = new Token(this);
            token.setTerminal(Terminal.SKIP);
            String prefix = m.group(1);
            String directive = m.group(2).trim();
            String suffix = directive.length() >= m.group(2).length() ? ""  : m.group(2).substring(directive.length());
            token.setWhiteBefore(prefix);
            token.setText(directive);
            token.setWhiteAfter(suffix);
            token.setStreamOffset(startStreamOffset + m.start());
            token.setFileOffset(startFileOffset + m.start());
            token.setLength(prefix.length() + directive.length());
            token.setParent(null);
            token.setLine(token.getLine() - countNewlines(whitetext.substring(m.start())));
            token.setCol(1);
            result.add(token);
        }
        
        return result;
    }
    */
}
