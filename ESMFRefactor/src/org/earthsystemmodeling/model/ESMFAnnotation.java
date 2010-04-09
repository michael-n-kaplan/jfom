package org.earthsystemmodeling.model;

import java.util.Map;
import java.util.Map.Entry;


public class ESMFAnnotation {
	
	public enum Type {
		init,
		run,
		finalize,
		gridded_component,
		array;
	}
	
	private Map<String,String> params;
	private Type type;
	
	public String getParameter(String param) {
		return params.get(param);
	}
	
	public void setParameterValue(String param, String val) {
		params.put(param, val);
	}
	
	public void setParameters(Map<String, String> params) {
		this.params = params;
	}
	
	public Type getType() {
		return type;
	}
	
	protected ESMFAnnotation() {}
	
	protected ESMFAnnotation(Type t) {
		this.type = t;
	}
	
	public String toString() {
		String s = getType().toString();
		if (params.size() > 0) {
			s += "[";
			for (Entry<String, String> e : params.entrySet()) {				
				s += e.getKey() + "=" + e.getValue() + ", ";
			}
			s = s.substring(0, s.length() - 2) + "]";
		}	
		return s;	
	}
	
	public static ESMFAnnotation newAnnotation(Type t) {
		return new ESMFAnnotation(t);
	}
}
