package com.domsd.chemicalchallenge;

import com.domsd.chemicalchallenge.application.ChemicalElementSymbolCalculator;
import com.domsd.chemicalchallenge.application.ChemicalElementSymbolGenerator;
import com.domsd.chemicalchallenge.application.validator.ChemicalElementSymbolValidator;
import com.domsd.chemicalchallenge.interfaces.SymbolCalculator;
import com.domsd.chemicalchallenge.interfaces.SymbolGenerator;
import com.domsd.chemicalchallenge.interfaces.SymbolValidator;

public class SplurthChemicalElementFacade {

	private SymbolValidator symbolValidator;
	
	private SymbolGenerator symbolGenerator;

	private SymbolCalculator symbolCalculator;
	
	
	public SplurthChemicalElementFacade() {
		symbolValidator  = new ChemicalElementSymbolValidator();
		symbolGenerator  = new ChemicalElementSymbolGenerator();
		symbolCalculator = new ChemicalElementSymbolCalculator();
	}
	
	
	public boolean validateSymbol(String elementName, String symbol) {
		
		boolean isValid = symbolValidator.validate(elementName, symbol);
		
		return isValid;
	}
	
	public String generateSymbol(String elementName) {
		
		String symbol = symbolGenerator.generateSymbol(elementName);
		
		return symbol;
	}
	
	public int retrieveNumberOfValidSymbols(String elementName) {
		
		int numberOfValidSymbols = symbolCalculator.retrieveNumberOfValidSymbols(elementName);
		
		return numberOfValidSymbols;
	}
	
	/*
	 * For testing purposes only
	 */
	protected void setSymbolValidator(SymbolValidator symbolValidator) {
		this.symbolValidator = symbolValidator;
	}
	
	protected void setSymbolGenerator(SymbolGenerator symbolGenerator) {
		this.symbolGenerator = symbolGenerator;
	}
	
	protected void setSymbolCalculator(SymbolCalculator symbolCalculator) {
		this.symbolCalculator = symbolCalculator;
	}
	

}
