package com.domsd.chemicalchallenge.application.validator.criteria;

import java.util.HashMap;

import com.domsd.chemicalchallenge.util.MyUtilsUnitTest;

public class ContentCriteria implements Criteria {

	@Override
	public boolean isValid(String element, String symbol) {
		
		String normalizedSymbol = symbol.toLowerCase();
		String normalizedElement = element.toLowerCase();
		
		HashMap<Character, Integer> frequencyMap = new HashMap<>();
		
		for(char letter : normalizedElement.toCharArray()) {
			
			Integer frequency = MyUtilsUnitTest.nullSafeGet(frequencyMap.get(letter));
			
			frequencyMap.put(letter, ++frequency);
		}
		
		
		for(char letter : normalizedSymbol.toCharArray()) {
			
			Integer frequency = MyUtilsUnitTest.nullSafeGet(frequencyMap.get(letter));
			
			if(frequency <= 0) {
				return false;
			}
			
			frequencyMap.put(letter, --frequency);
		}
		
		return true;
	}

}
