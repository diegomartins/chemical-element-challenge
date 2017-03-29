package com.domsd.chemicalchallenge;

import com.domsd.chemicalchallenge.validator.ChemicalElementSymbolValidator;

public class SplurthChemicalElementFacade {

	private ChemicalElementSymbolValidator chemicalElementValidator;
	
	
	/****
	 * Constructors
	 */
	public SplurthChemicalElementFacade() {
		chemicalElementValidator = new ChemicalElementSymbolValidator();
	}
	
	/*
	 * For testing purposes only
	 */
	protected SplurthChemicalElementFacade(ChemicalElementSymbolValidator validator) {
		
		chemicalElementValidator = validator;
	}
	
	
	public boolean validateSymbol(String elementName, String symbol) {
		
		boolean isValid = chemicalElementValidator.validate(elementName, symbol);
		
		return isValid;
	}
	
	
}
