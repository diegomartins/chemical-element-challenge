package com.domsd.chemicalchallenge.validator.criteria;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import org.junit.Before;
import org.junit.Test;

public class OrderCriteriaUnitTest {

	private OrderCriteria criteria;
	
	@Before
	public void setup() {
		criteria = new OrderCriteria();
	}
	
	
	@Test
	public void isValid_symbolLettersAppearInTheSameOrderAsInElement_adjacent_isValid() {
		
		boolean isValid = criteria.isValid("Porigom", "Or");
		
		assertTrue(isValid);
	}

	@Test
	public void isValid_symbolLettersAppearInTheSameOrderAsInElement_nonAdjacent_isValid() {
		
		boolean isValid = criteria.isValid("Porigom", "Ro");
		
		assertTrue(isValid);
	}
	
	@Test
	public void isValid_symbolLettersAppearInADifferentOrderFromTheElement_adjacent_isNotValid() {
		
		boolean isValid = criteria.isValid("Porigom", "Gi");
		
		assertFalse(isValid);
	}
	
	
	@Test
	public void isValid_symbolLettersAppearInADifferentOrderFromTheElement_nonAdjacent_isNotValid() {
		
		boolean isValid = criteria.isValid("Porigom", "Gr");
		
		assertFalse(isValid);
	}
	
}
