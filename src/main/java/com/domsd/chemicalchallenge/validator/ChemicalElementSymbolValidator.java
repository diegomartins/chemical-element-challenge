package com.domsd.chemicalchallenge.validator;

public class ChemicalElementSymbolValidator {

	public boolean validate(String elementName, String symbol) {
		
		if(symbol == null) {
			return false;
		}

		boolean isValidByLengthCriteria = validateLengthCriteria(symbol);
		boolean isValidByContentAndOrderCriteria = validateContentAndOrderCriteria(elementName, symbol);
		
		return isValidByLengthCriteria && isValidByContentAndOrderCriteria;
		
	}

	private boolean validateContentAndOrderCriteria(String elementName, String symbol) {
		
		String normalizedSymbol = symbol.toLowerCase();
		String normalizedElement = elementName.toLowerCase();

		char[] symbolLetters = normalizedSymbol.toCharArray();
		
		int fromIndex = 0;

		for (char letter : symbolLetters) {
			
			if(normalizedElement.indexOf(letter, fromIndex) < 0) {
				return false;
			}
			
			fromIndex = normalizedElement.indexOf(letter, fromIndex) + 1;
			
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
