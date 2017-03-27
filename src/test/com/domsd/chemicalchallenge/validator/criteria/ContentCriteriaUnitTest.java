package com.domsd.chemicalchallenge.validator.criteria;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import org.junit.Before;
import org.junit.Test;

public class ContentCriteriaUnitTest {

	private ContentCriteria contentCriteria;
	
	@Before
	public void setup() {
		contentCriteria = new ContentCriteria();
	}
	
	@Test
	public void isValid_symbolLettersAreTheSame_itAppearsTwiceInTheElement_firstLetter_isValid() {
		
		boolean isValid = contentCriteria.isValid("Unulu", "Uu");
		
		assertTrue(isValid);
	}
	
	@Test
	public void isValid_symbolLettersAreTheSame_itAppearsTwiceInTheElement_secondLetter_isValid() {
		
		boolean isValid = contentCriteria.isValid("Kapope", "Pp");
		
		assertTrue(isValid);
	}

	@Test
	public void isValid_only1LetterOfTheElementAppearsOnTheSymbol_firstLetter_isNotValid() {
		
		boolean isValid = contentCriteria.isValid("Unulu", "Uk");
		
		assertFalse(isValid);
	}
	
	@Test
	public void isValid_only1LetterOfTheElementAppearsOnTheSymbol_secondLetter_isNotValid() {
		
		boolean isValid = contentCriteria.isValid("Unulu", "Kl");
		
		assertFalse(isValid);
	}
	
	@Test
	public void isValid_symbolLettersAreTheSame_itOnlyAppearsOnceInTheElement_firstLetter_isNotValid() {
		
		boolean isValid = contentCriteria.isValid("Noboro", "Nn");
		
		assertFalse(isValid);
	}
	
	@Test
	public void isValid_symbolLettersAreTheSame_itOnlyAppearsOnceInTheElement_secondLetter_isNotValid() {
		
		boolean isValid = contentCriteria.isValid("Unulu", "Nn");
		
		assertFalse(isValid);
	}
	
}
