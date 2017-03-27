package com.domsd.chemicalchallenge.util;

public class MyUtils {

	public static Integer nullSafeGet(Integer myInteger) {
		
		if(myInteger == null) {
			return 0;
		}
		
		return myInteger;
	}
}
