package org.earthsystemmodeling.model;

import java.util.Map;
import java.util.Map.Entry;


public class ESMFAnnotation {
	
	public static class Init extends ESMFAnnotation {}
	public static class Run extends ESMFAnnotation {}
	public static class Finalize extends ESMFAnnotation {}
	public static class GriddedComponent extends ESMFAnnotation {}
	public static class Array extends ESMFAnnotation {}
	public static class ImportState extends ESMFAnnotation {}
	public static class ExportState extends ESMFAnnotation {}	
	
	private Map<String,String> params;
	//private Type type;
	
	public String getParameter(String param) {
		return params.get(param);
	}
	
	public boolean getParameterBool(String param) {
		return Boolean.valueOf(getParameter(param));
	}
	
	public void setParameterValue(String param, String val) {
		params.put(param, val);
	}
	
	public void setParameters(Map<String, String> params) {
		this.params = params;
	}
	
//	public Type getType() {
//		return type;
//	}
	
	public ESMFAnnotation() {}
	
//	protected ESMFAnnotation(Type t) {
//		this.type = t;
//	}
	
	public String toString() {
		String s = this.getClass().getCanonicalName();
		if (params.size() > 0) {
			s += "[";
			for (Entry<String, String> e : params.entrySet()) {				
				s += e.getKey() + "=" + e.getValue() + ", ";
			}
			s = s.substring(0, s.length() - 2) + "]";
		}	
		return s;	
	}
	
	@SuppressWarnings("unchecked")
	public static ESMFAnnotation newAnnotation(String name) {		
		Class<? extends ESMFAnnotation>[] classes = (Class<? extends ESMFAnnotation>[]) ESMFAnnotation.class.getDeclaredClasses();
		for (Class<? extends ESMFAnnotation> c : classes) {
			//System.out.println("comparing: " + c.getSimpleName() + " : " + name);			
			if (c.getSimpleName().equalsIgnoreCase(name)) {
				try {
					//System.out.println("Returning an instance of " + c.getSimpleName());
					return c.newInstance();
				} catch (InstantiationException e) {					
					e.printStackTrace();
				} catch (IllegalAccessException e) {					
					e.printStackTrace();
				}
			}
		}
		return null;
	}
}
