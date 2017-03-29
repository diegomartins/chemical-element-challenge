package com.domsd.chemicalchallenge.util;

public class MyUtils {

	public static Integer nullSafeGet(Integer myInteger) {
		
		if(myInteger == null) {
			return 0;
		}
		
		return myInteger;
	}
	
	public static String uppercaseFirstLetter(String str) {
		
		if(str == null) {
			throw new IllegalArgumentException("String cannot be null.");
		}
		
		if(str.isEmpty()) {
			return "";
		}
		
		return str.substring(0,  1).toUpperCase() + str.substring(1);
	}
	
}
