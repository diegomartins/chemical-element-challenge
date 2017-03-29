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
	
	@Test
	public void uppercaseFirstLetter_theWholeStringIsLowerCase_uppercasesFirst() {
		
		String uppercased = MyUtils.uppercaseFirstLetter("test");
		
		assertEquals("Test", uppercased);
	}
	
	@Test
	public void uppercaseFirstLetter_firstLetterIsAlreadyUppercase_makesNoDifference() {
		
		String uppercased = MyUtils.uppercaseFirstLetter("Test");
		
		assertEquals("Test", uppercased);
	}
	
	@Test
	public void uppercaseFirstLetter_everythingIsUppercase_makesNoDifference() {
		
		String uppercased = MyUtils.uppercaseFirstLetter("TEST");
		
		assertEquals("TEST", uppercased);
	}
	
	@Test
	public void uppercaseFirstLetter_everythingButFirstLetterIsUppercase_uppercasesFirst() {
		
		String uppercased = MyUtils.uppercaseFirstLetter("tEST");
		
		assertEquals("TEST", uppercased);
	}
	
	@Test
	public void uppercaseFirstLetter_stringIsEmptySpaces_returnsTheSameString() {
		
		String uppercased = MyUtils.uppercaseFirstLetter("    ");
		
		assertEquals("    ", uppercased);
	}
	
	@Test
	public void uppercaseFirstLetter_stringIsNumeric_returnsTheSameString() {
		
		String uppercased = MyUtils.uppercaseFirstLetter("1234");
		
		assertEquals("1234", uppercased);
	}
	
	@Test
	public void uppercaseFirstLetter_stringIsEmpty_returnsEmpty() {
		
		String uppercased = MyUtils.uppercaseFirstLetter("");
		
		assertEquals("", uppercased);
	}
	
	@Test(expected = IllegalArgumentException.class)
	public void uppercaseFirstLetter_stringIsNull_throwsException() {
		
		MyUtils.uppercaseFirstLetter(null);
		
	}
}
