package com.domsd.chemicalchallenge.application;

import java.util.HashSet;
import java.util.Set;

import com.domsd.chemicalchallenge.interfaces.SymbolCalculator;

public class ChemicalElementSymbolCalculator implements SymbolCalculator {

	
	public int retrieveNumberOfValidSymbols(String elementName) {
		
		if(elementName == null || elementName.trim().isEmpty()) {
			return 0;
		}
		
		Set<String> validSymbols = new HashSet<>();
		
		String normalizedElementName = elementName.toLowerCase();
		
		for(int firstLetterIndex = 0; firstLetterIndex < elementName.length() - 1; firstLetterIndex ++) {
			
			char currentFirstChar = normalizedElementName.charAt(firstLetterIndex);
			
			for(int secondLetterIndex = firstLetterIndex + 1; secondLetterIndex < elementName.length(); secondLetterIndex ++) {
				
				char currentSecondChar = normalizedElementName.charAt(secondLetterIndex);
				
				char[] symbol = {currentFirstChar, currentSecondChar};
				validSymbols.add(new String(symbol));
			}
		}
		
		return validSymbols.size();
	}
	
}
