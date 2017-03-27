package com.domsd.chemicalchallenge.validator;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import org.junit.Before;
import org.junit.Test;

public class ChemicalElementValidatorUnitTest {

	private ChemicalElementSymbolValidator symbolValidator;
	
	@Before
	public void setup() {
		symbolValidator = new ChemicalElementSymbolValidator();
	}
	
	@Test
	public void validate_isValid() {
		
		boolean isValid = symbolValidator.validate("Unulu", "Un");
		
		assertTrue(isValid);
	}
	
	
	/**
	 *                      Pre-validations
	 */
	@Test
	public void isValid_symbolIsNull_isNotValid() {
		
		boolean isValid = symbolValidator.validate("Unulu", null);
		
		assertFalse(isValid);
	}

	
	/**
	 * 
	 * Examples given by DZone
	 * 
	 */
	@Test
	public void validate_givenExamples() {
		
		assertTrue(symbolValidator.validate("Spenglerium", "Ee"));
		assertTrue(symbolValidator.validate("Zeddemorium", "Zr"));
		assertTrue(symbolValidator.validate("Venkmine", "Kn"));
		assertFalse(symbolValidator.validate("Stantzon", "Zt"));
		assertFalse(symbolValidator.validate("Melintzum", "Nn"));
		assertFalse(symbolValidator.validate("Tullium", "Ty"));
	}
	
}
