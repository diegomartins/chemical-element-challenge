package com.domsd.chemicalchallenge;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import org.junit.Before;
import org.junit.Test;
import org.mockito.Mockito;

import com.domsd.chemicalchallenge.application.ChemicalElementSymbolCalculator;
import com.domsd.chemicalchallenge.application.ChemicalElementSymbolGenerator;
import com.domsd.chemicalchallenge.application.validator.ChemicalElementSymbolValidator;
import com.domsd.chemicalchallenge.interfaces.SymbolCalculator;
import com.domsd.chemicalchallenge.interfaces.SymbolGenerator;
import com.domsd.chemicalchallenge.interfaces.SymbolValidator;

public class SplurthChemicalElementFacadeUnitTest {

	private SplurthChemicalElementFacade facade;
	
	private SymbolValidator symbolValidator;

	private SymbolGenerator symbolGenerator;

	private SymbolCalculator symbolCalculator;
	
	@Before
	public void setup() {
		
		symbolValidator  = Mockito.mock(ChemicalElementSymbolValidator.class);
		symbolGenerator  = Mockito.mock(ChemicalElementSymbolGenerator.class);
		symbolCalculator = Mockito.mock(ChemicalElementSymbolCalculator.class);
		
		facade = new SplurthChemicalElementFacade();
		
		facade.setSymbolValidator(symbolValidator);
		facade.setSymbolGenerator(symbolGenerator);
		facade.setSymbolCalculator(symbolCalculator);
	}
	
	@Test
	public void validate_isValid_shouldCallValidator() {
		
		Mockito.when(symbolValidator.validate("Unulu", "Un")).thenReturn(true);

		boolean isValid = facade.validateSymbol("Unulu", "Un");
		
		assertTrue(isValid);
		
		Mockito.verify(symbolValidator).validate("Unulu", "Un");
	}
	
	@Test
	public void validate_isNotValid_shouldCallValidator() {
		
		Mockito.when(symbolValidator.validate("Unulu", "U")).thenReturn(false);

		boolean isValid = facade.validateSymbol("Unulu", "U");
		
		assertFalse(isValid);
		
		Mockito.verify(symbolValidator).validate("Unulu", "U");
	}

	@Test
	public void generateSymbol_shouldCallSymbolGenerator() {

		Mockito.when(symbolGenerator.generateSymbol("Unulu")).thenReturn("Ul");

		String symbol = symbolGenerator.generateSymbol("Unulu");
		
		assertEquals("Ul", symbol);
		
		Mockito.verify(symbolGenerator).generateSymbol("Unulu");
	}
	
	@Test
	public void retrieveNumberOfValidSymbols_shouldCallSymbolGenerator() {

		Mockito.when(symbolCalculator.retrieveNumberOfValidSymbols("Unulu")).thenReturn(8);

		int numberOfValidSymbols = symbolCalculator.retrieveNumberOfValidSymbols("Unulu");
		
		assertEquals(8, numberOfValidSymbols);
		
		Mockito.verify(symbolCalculator).retrieveNumberOfValidSymbols("Unulu");
	}
	
}
