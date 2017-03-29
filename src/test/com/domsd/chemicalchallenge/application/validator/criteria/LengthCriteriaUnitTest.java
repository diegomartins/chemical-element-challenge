package com.domsd.chemicalchallenge.application.validator.criteria;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import org.junit.Before;
import org.junit.Test;

public class LengthCriteriaUnitTest {

	
	private LengthCriteria lengthCriteria;
	
	@Before
	public void setup() {
		lengthCriteria = new LengthCriteria();
	}
	
	@Test
	public void isValid_isValid() {
		
		boolean isValid = lengthCriteria.isValid("Unulu", "Aa");
		
		assertTrue(isValid);
	}
	
	
	/**
	 *                    
	 *                    Validating length
	 *                    
	 */
	@Test
	public void isValid_symbolHasTooFewLetters_isNotValid() {
		
		boolean isValid = lengthCriteria.isValid("Unulu", "U");
		
		assertFalse(isValid);
	}

	@Test
	public void isValid_symbolHasTooManyLetters_isNotValid() {
		
		boolean isValid = lengthCriteria.isValid("Unulu", "Unu");
		
		assertFalse(isValid);
	}
	
	@Test
	public void isValid_symbolIsEmptyElementIsNotEmpty_isNotValid() {
		
		boolean isValid = lengthCriteria.isValid("Unulu", "");
		
		assertFalse(isValid);
	}
	
	@Test
	public void isValid_symbolIsEmptyElementIsEmpty_isNotValid() {
		
		boolean isValid = lengthCriteria.isValid("", "");
		
		assertFalse(isValid);
	}
	
	
}
