package com.domsd.chemicalchallenge;

import com.domsd.chemicalchallenge.validator.ChemicalElementSymbolValidator;

public class ChemicalElementValidatorFacade {

	private ChemicalElementSymbolValidator chemicalElementValidator;
	
	
	/****
	 * Constructors
	 */
	public ChemicalElementValidatorFacade() {
		chemicalElementValidator = new ChemicalElementSymbolValidator();
	}
	
	/*
	 * For testing purposes only
	 */
	protected ChemicalElementValidatorFacade(ChemicalElementSymbolValidator validator) {
		
		chemicalElementValidator = validator;
	}
	
	
	public boolean validateSymbol(String elementName, String symbol) {
		
		boolean isValid = chemicalElementValidator.validate(elementName, symbol);
		
		return isValid;
	}
	
	
}
