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
	 *                    
	 *                    Validating length
	 *                    
	 */
	@Test
	public void validate_symbolHasTooFewLetters_isNotValid() {
		
		boolean isValid = symbolValidator.validate("Unulu", "U");
		
		assertFalse(isValid);
	}

	@Test
	public void validate_symbolHasTooManyLetters_isNotValid() {
		
		boolean isValid = symbolValidator.validate("Unulu", "Unu");
		
		assertFalse(isValid);
	}

	@Test
	public void validate_symbolIsNull_isNotValid() {
		
		boolean isValid = symbolValidator.validate("Unulu", null);
		
		assertFalse(isValid);
	}
	
	@Test
	public void validate_symbolIsEmptyElementIsNotEmpty_isNotValid() {
		
		boolean isValid = symbolValidator.validate("Unulu", "");
		
		assertFalse(isValid);
	}
	
	@Test
	public void validate_symbolIsEmptyElementIsEmpty_isNotValid() {
		
		boolean isValid = symbolValidator.validate("", "");
		
		assertFalse(isValid);
	}
	
	
	/**
	 *                    
	 *                    Validating content
	 *                    
	 */
	@Test
	public void validate_only1LetterOfTheElementAppearsOnTheSymbol_firstLetter_isNotValid() {
		
		boolean isValid = symbolValidator.validate("Unulu", "Uk");
		
		assertFalse(isValid);
	}
	
	@Test
	public void validate_only1LetterOfTheElementAppearsOnTheSymbol_secondLetter_isNotValid() {
		
		boolean isValid = symbolValidator.validate("Unulu", "Kl");
		
		assertFalse(isValid);
	}
	
	@Test
	public void validate_symbolLettersAreTheSame_itOnlyAppearsOnceOnTheElement_firstLetter_isNotValid() {
		
		boolean isValid = symbolValidator.validate("Noboro", "Nn");
		
		assertFalse(isValid);
	}
	
	@Test
	public void validate_symbolLettersAreTheSame_itOnlyAppearsOnceOnTheElement_secondLetter_isNotValid() {
		
		boolean isValid = symbolValidator.validate("Unulu", "Nn");
		
		assertFalse(isValid);
	}
	
	@Test
	public void validate_symbolLettersAreTheSame_itAppearsTwiceOnTheElement_firstLetter_isValid() {
		
		boolean isValid = symbolValidator.validate("Unulu", "Uu");
		
		assertTrue(isValid);
	}
	
	@Test
	public void validate_symbolLettersAreTheSame_itAppearsTwiceOnTheElement_secondLetter_isValid() {
		
		boolean isValid = symbolValidator.validate("Kapope", "Pp");
		
		assertTrue(isValid);
	}
}
