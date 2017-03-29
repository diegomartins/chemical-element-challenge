package com.domsd.chemicalchallenge.application;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class SymbolGeneratorUnitTest {

	private ChemicalElementSymbolGenerator symbolGenerator;
	
	@Before
	public void setup() {
		
		symbolGenerator = new ChemicalElementSymbolGenerator();
	}
	
	@Test
	public void generateSymbol_nameIsKokoa_shouldReturnKa() {
		
		String symbol = symbolGenerator.generateSymbol("Kokoa");
		
		Assert.assertEquals("Ka", symbol);
	}
	
	@Test
	public void generateSymbol_nameIsGozerium_shouldReturnEi() {
		
		String symbol = symbolGenerator.generateSymbol("Gozerium");
		
		Assert.assertEquals("Ei", symbol);
	}
	
	@Test
	public void generateSymbol_nameIsSlimyrine_shouldReturnIe() {
		
		String symbol = symbolGenerator.generateSymbol("Slimyrine");
		
		Assert.assertEquals("Ie", symbol);
	}
	
	@Test
	public void generateSymbol_nameIsAbcdef_shouldReturnAb() {
		
		String symbol = symbolGenerator.generateSymbol("Abcdef");
		
		Assert.assertEquals("Ab", symbol);
	}
	
	@Test
	public void generateSymbol_nameIsFedcba_shouldReturnBa() {
		
		String symbol = symbolGenerator.generateSymbol("Fedcba");
		
		Assert.assertEquals("Ba", symbol);
	}
	
	@Test
	public void generateSymbol_nameIsZzzzza_shouldReturnZa() {
		
		String symbol = symbolGenerator.generateSymbol("Zzzzza");
		
		Assert.assertEquals("Za", symbol);
	}
	
	@Test
	public void generateSymbol_nameIsZzzzaa_shouldReturnAa() {
		
		String symbol = symbolGenerator.generateSymbol("Zzzzaa");
		
		Assert.assertEquals("Aa", symbol);
	}
	
	@Test
	public void generateSymbol_elementNameHasExactlySymbolLength_isInOrder() {
		
		String symbol = symbolGenerator.generateSymbol("Fo");
		
		Assert.assertEquals("Fo", symbol);
	}
	
	@Test
	public void generateSymbol_elementNameHasExactlySymbolLength_isNotInOrder() {
		
		String symbol = symbolGenerator.generateSymbol("Of");
		
		Assert.assertEquals("Of", symbol);
	}
	
	@Test(expected = IllegalArgumentException.class)
	public void generateSymbol_elementNameHasLessCharsThanSymbolLength_shouldThrowException() {
		
		symbolGenerator.generateSymbol("O");
	}
	
	@Test(expected = IllegalArgumentException.class)
	public void generateSymbol_elementNameIsNull_shouldThrowException() {
		
		symbolGenerator.generateSymbol(null);
	}
}
