package com.domsd.chemicalchallenge;

import com.domsd.chemicalchallenge.application.validator.ChemicalElementSymbolValidator;
import com.domsd.chemicalchallenge.interfaces.SymbolGenerator;
import com.domsd.chemicalchallenge.interfaces.SymbolValidator;

public class SplurthChemicalElementFacade {

	private SymbolValidator symbolValidator;
	
	private SymbolGenerator symbolGenerator;

	
	public SplurthChemicalElementFacade() {
		symbolValidator = new ChemicalElementSymbolValidator();
	}
	
	
	public boolean validateSymbol(String elementName, String symbol) {
		
		boolean isValid = symbolValidator.validate(elementName, symbol);
		
		return isValid;
	}
	
	public String generateSymbol(String elementName) {
		
		String symbol = symbolGenerator.generateSymbol(elementName);
		
		return symbol;
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
	

}
