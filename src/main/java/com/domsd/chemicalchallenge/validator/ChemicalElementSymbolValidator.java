package com.domsd.chemicalchallenge.validator;

public class ChemicalElementSymbolValidator {

	public boolean validate(String elementName, String symbol) {
		
		if(symbol == null) {
			return false;
		}

		boolean isValidByLengthCriteria = validateLengthCriteria(symbol);
		boolean isValidByContentCriteria = validateContentCriteria(elementName, symbol);
		
		return isValidByLengthCriteria && isValidByContentCriteria;
		
	}

	private boolean validateContentCriteria(String elementName, String symbol) {
		
		char[] symbolLetters = symbol.toLowerCase().toCharArray();
		
		int fromIndex = 0;

		for (char letter : symbolLetters) {
			
			if(elementName.toLowerCase().indexOf(letter, fromIndex) < 0) {
				return false;
			}
			
			fromIndex = elementName.toLowerCase().indexOf(letter, fromIndex) + 1;
			
		}
		
		return true;
	}

	
	private boolean validateLengthCriteria(String symbol) {
		
		if(symbol.length() != 2) {
			return false;
		}
		
		return true;
	}
	
	
}
