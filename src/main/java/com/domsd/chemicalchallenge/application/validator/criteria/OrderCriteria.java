package com.domsd.chemicalchallenge.application.validator.criteria;

import com.domsd.chemicalchallenge.interfaces.Criteria;

public class OrderCriteria implements Criteria {

	@Override
	public boolean isValid(String element, String symbol) {
		
		String normalizedSymbol = symbol.toLowerCase();
		String normalizedElement = element.toLowerCase();
		
		int fromIndex = 0;
		
		for (char letter : normalizedSymbol.toCharArray()) {
			
			if(normalizedElement.indexOf(letter, fromIndex) < 0) {
				return false;
			}
			
			fromIndex = normalizedElement.indexOf(letter, fromIndex) + 1;		
		}
		
		return true;
	}

}
