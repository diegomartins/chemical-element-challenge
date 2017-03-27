package com.domsd.chemicalchallenge;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import org.junit.Before;
import org.junit.Test;
import org.mockito.Mockito;

import com.domsd.chemicalchallenge.validator.ChemicalElementSymbolValidator;

public class ChemicalElementValidatorFacadeUnitTest {

	private ChemicalElementValidatorFacade validatorFacade;
	
	private ChemicalElementSymbolValidator chemicalElementSymbolValidator;
	
	@Before
	public void setup() {
		
		chemicalElementSymbolValidator = Mockito.mock(ChemicalElementSymbolValidator.class);
		
		validatorFacade = new ChemicalElementValidatorFacade(chemicalElementSymbolValidator);
	}
	
	@Test
	public void validate_isValid_shouldCallValidator() {
		
		Mockito.when(chemicalElementSymbolValidator.validate("Unulu", "Un")).thenReturn(true);

		boolean isValid = validatorFacade.validateSymbol("Unulu", "Un");
		
		assertTrue(isValid);
		
		Mockito.verify(chemicalElementSymbolValidator).validate("Unulu", "Un");
	}
	
	@Test
	public void validate_isNotValid_shouldCallValidator() {
		
		Mockito.when(chemicalElementSymbolValidator.validate("Unulu", "U")).thenReturn(false);

		boolean isValid = validatorFacade.validateSymbol("Unulu", "U");
		
		assertFalse(isValid);
		
		Mockito.verify(chemicalElementSymbolValidator).validate("Unulu", "U");
	}

		
}
