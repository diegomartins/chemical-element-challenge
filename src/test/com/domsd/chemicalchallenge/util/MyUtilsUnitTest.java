package com.domsd.chemicalchallenge.util;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

public class MyUtilsUnitTest {

	public static Integer nullSafeGet(Integer myInteger) {
		
		if(myInteger == null) {
			return 0;
		}
		
		return myInteger;
	}
	
	@Test
	public void nullSafeGet_integerParameterIsNull_shouldReturnZero() {
		
		Integer value = MyUtils.nullSafeGet(null);
		
		assertEquals(new Integer(0), value);
	}
	
	
	@Test
	public void nullSafeGet_integerParameterIsNotNull_shouldReturnParameterValue() {
		
		Integer originalValue = new Integer(1500);
		
		Integer value = MyUtils.nullSafeGet(originalValue);
		
		assertTrue(originalValue == value);
		assertEquals(originalValue, value);
	}
}
