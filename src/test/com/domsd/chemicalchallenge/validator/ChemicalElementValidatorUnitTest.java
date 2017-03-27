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
	public void validate_symbolLettersAreTheSame_itOnlyAppearsOnceInTheElement_firstLetter_isNotValid() {
		
		boolean isValid = symbolValidator.validate("Noboro", "Nn");
		
		assertFalse(isValid);
	}
	
	@Test
	public void validate_symbolLettersAreTheSame_itOnlyAppearsOnceInTheElement_secondLetter_isNotValid() {
		
		boolean isValid = symbolValidator.validate("Unulu", "Nn");
		
		assertFalse(isValid);
	}
	
	@Test
	public void validate_symbolLettersAreTheSame_itAppearsTwiceInTheElement_firstLetter_isValid() {
		
		boolean isValid = symbolValidator.validate("Unulu", "Uu");
		
		assertTrue(isValid);
	}
	
	@Test
	public void validate_symbolLettersAreTheSame_itAppearsTwiceInTheElement_secondLetter_isValid() {
		
		boolean isValid = symbolValidator.validate("Kapope", "Pp");
		
		assertTrue(isValid);
	}
	
	
	
	/**
	 *                    
	 *                    Validating order
	 *                    
	 */
	@Test
	public void validate_symbolLettersAppearInTheSameOrderAsInElement_adjacent_isValid() {
		
		boolean isValid = symbolValidator.validate("Porigom", "Or");
		
		assertTrue(isValid);
	}

	@Test
	public void validate_symbolLettersAppearInTheSameOrderAsInElement_nonAdjacent_isValid() {
		
		boolean isValid = symbolValidator.validate("Porigom", "Ro");
		
		assertTrue(isValid);
	}
	
	@Test
	public void validate_symbolLettersAppearInADifferentOrderFromTheElement_adjacent_isNotValid() {
		
		boolean isValid = symbolValidator.validate("Porigom", "Gi");
		
		assertFalse(isValid);
	}
	
	
	@Test
	public void validate_symbolLettersAppearInADifferentOrderFromTheElement_nonAdjacent_isNotValid() {
		
		boolean isValid = symbolValidator.validate("Porigom", "Gr");
		
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
