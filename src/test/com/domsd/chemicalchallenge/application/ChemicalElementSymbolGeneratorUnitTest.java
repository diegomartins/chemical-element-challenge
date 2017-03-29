package com.domsd.chemicalchallenge.application;

import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;

public class ChemicalElementSymbolGeneratorUnitTest {

	private ChemicalElementSymbolGenerator symbolGenerator;
	
	@Before
	public void setup() {
		
		symbolGenerator = new ChemicalElementSymbolGenerator();
	}
	
	@Test
	public void generateSymbol_nameIsKokoa_shouldReturnKa() {
		
		String symbol = symbolGenerator.generateSymbol("Kokoa");
		
		assertEquals("Ka", symbol);
	}
	
	@Test
	public void generateSymbol_nameIsGozerium_shouldReturnEi() {
		
		String symbol = symbolGenerator.generateSymbol("Gozerium");
		
		assertEquals("Ei", symbol);
	}
	
	@Test
	public void generateSymbol_nameIsSlimyrine_shouldReturnIe() {
		
		String symbol = symbolGenerator.generateSymbol("Slimyrine");
		
		assertEquals("Ie", symbol);
	}
	
	@Test
	public void generateSymbol_nameIsAbcdef_shouldReturnAb() {
		
		String symbol = symbolGenerator.generateSymbol("Abcdef");
		
		assertEquals("Ab", symbol);
	}
	
	@Test
	public void generateSymbol_nameIsFedcba_shouldReturnBa() {
		
		String symbol = symbolGenerator.generateSymbol("Fedcba");
		
		assertEquals("Ba", symbol);
	}
	
	@Test
	public void generateSymbol_nameIsZzzzza_shouldReturnZa() {
		
		String symbol = symbolGenerator.generateSymbol("Zzzzza");
		
		assertEquals("Za", symbol);
	}
	
	@Test
	public void generateSymbol_nameIsZzzzaa_shouldReturnAa() {
		
		String symbol = symbolGenerator.generateSymbol("Zzzzaa");
		
		assertEquals("Aa", symbol);
	}
	
	@Test
	public void generateSymbol_elementNameHasExactlySymbolLength_isInOrder() {
		
		String symbol = symbolGenerator.generateSymbol("Fo");
		
		assertEquals("Fo", symbol);
	}
	
	@Test
	public void generateSymbol_elementNameHasExactlySymbolLength_isNotInOrder() {
		
		String symbol = symbolGenerator.generateSymbol("Of");
		
		assertEquals("Of", symbol);
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
