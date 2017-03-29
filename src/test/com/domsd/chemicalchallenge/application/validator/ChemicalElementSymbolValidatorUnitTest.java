package com.domsd.chemicalchallenge.application.validator;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import org.junit.Before;
import org.junit.Test;

import com.domsd.chemicalchallenge.application.validator.criteria.Criteria;

public class ChemicalElementSymbolValidatorUnitTest {

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

	@Test
	public void validate_validByFirstCriteria_invalidBySecond_isNotValid() {
		
		symbolValidator = new ChemicalElementSymbolValidator(new Criteria[]{getValidCriteria(), getInvalidCriteria()});
		
		boolean isValid = symbolValidator.validate("Unulu", "Un");
		
		assertFalse(isValid);
	}
	
	@Test
	public void validate_validBySecondCriteria_invalidByFirst_isNotValid() {
		
		symbolValidator = new ChemicalElementSymbolValidator(new Criteria[]{getInvalidCriteria(), getValidCriteria()});
		
		boolean isValid = symbolValidator.validate("Unulu", "Un");
		
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
	
	private Criteria getValidCriteria() {
		
		return new Criteria() {
			
			@Override
			public boolean isValid(String element, String symbol) {
				return true;
			}
		};
	}

	private Criteria getInvalidCriteria() {
		
		return new Criteria() {
			
			@Override
			public boolean isValid(String element, String symbol) {
				return false;
			}
		};
	}
	
}
