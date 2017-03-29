package com.domsd.chemicalchallenge.application;

import static org.junit.Assert.assertEquals;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class ChemicalElementSymbolCalculatorUnitTest {

	private ChemicalElementSymbolCalculator symbolCalculator;
	
	@Before
	public void setup() {
		
		symbolCalculator = new ChemicalElementSymbolCalculator();
	}
	
	@Test
	public void retrieveNumberOfValidSymbols_nameIsKokoa_shouldReturn6() {
		
		int numberOfValidSymbols = symbolCalculator.retrieveNumberOfValidSymbols("Kokoa");
		
		Assert.assertEquals(6, numberOfValidSymbols);
	}
	
	@Test
	public void retrieveNumberOfValidSymbols_nameIsGozerium_shouldReturn28() {
		
		int numberOfValidSymbols = symbolCalculator.retrieveNumberOfValidSymbols("Gozerium");
		
		Assert.assertEquals(28, numberOfValidSymbols);
	}
	
	@Test
	public void retrieveNumberOfValidSymbols_nameIsSlimyrine_shouldReturn32() {
		
		int numberOfValidSymbols = symbolCalculator.retrieveNumberOfValidSymbols("Slimyrine");
		
		Assert.assertEquals(32, numberOfValidSymbols);
	}
	
	@Test
	public void retrieveNumberOfValidSymbols_nameIsAbcdef_shouldReturn7() {
		
		int numberOfValidSymbols = symbolCalculator.retrieveNumberOfValidSymbols("Abcdef");
		
		Assert.assertEquals(15, numberOfValidSymbols);
	}
	
	@Test
	public void retrieveNumberOfValidSymbols_Koa_shouldReturn3() {
		
		int numberOfValidSymbols = symbolCalculator.retrieveNumberOfValidSymbols("Koa");
		
		assertEquals(3, numberOfValidSymbols);
	}
	
	@Test
	public void retrieveNumberOfValidSymbols_Au_shouldReturn1() {
		
		int numberOfValidSymbols = symbolCalculator.retrieveNumberOfValidSymbols("Au");
		
		assertEquals(1, numberOfValidSymbols);
	}
	
	@Test
	public void retrieveNumberOfValidSymbols_Zuulon_shouldReturn11() {
		
		int numberOfValidSymbols = symbolCalculator.retrieveNumberOfValidSymbols("Zuulon");
		
		assertEquals(11, numberOfValidSymbols);
	}
	
	@Test
	public void retrieveNumberOfValidSymbols_Aaaaaaa_shouldReturn1() {
		
		int numberOfValidSymbols = symbolCalculator.retrieveNumberOfValidSymbols("Aaaaaaa");
		
		assertEquals(1, numberOfValidSymbols);
	}
	
	@Test
	public void retrieveNumberOfValidSymbols_elementNameHasLessCharsThanSymbolLength_shouldReturn0() {
		
		int numberOfValidSymbols = symbolCalculator.retrieveNumberOfValidSymbols("O");
		
		assertEquals(0, numberOfValidSymbols);
	}
	
	@Test
	public void retrieveNumberOfValidSymbols_elementNameIsNull_shouldReturn0() {
		
		int numberOfValidSymbols = symbolCalculator.retrieveNumberOfValidSymbols(null);
		
		assertEquals(0, numberOfValidSymbols);
	}
	
	@Test
	public void retrieveNumberOfValidSymbols_elementNameIsEmpty_shouldReturn0() {
		
		int numberOfValidSymbols = symbolCalculator.retrieveNumberOfValidSymbols("");
		
		assertEquals(0, numberOfValidSymbols);
	}
	
	@Test
	public void retrieveNumberOfValidSymbols_elementNameIsOnlyBlankSpaces_shouldReturn0() {
		
		int numberOfValidSymbols = symbolCalculator.retrieveNumberOfValidSymbols("          ");
		
		assertEquals(0, numberOfValidSymbols);
	}
}
