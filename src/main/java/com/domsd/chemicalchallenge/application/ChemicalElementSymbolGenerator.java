package com.domsd.chemicalchallenge.application;

import java.util.Arrays;

import com.domsd.chemicalchallenge.interfaces.SymbolGenerator;
import com.domsd.chemicalchallenge.model.Constants;
import com.domsd.chemicalchallenge.util.MyUtils;

public class ChemicalElementSymbolGenerator implements SymbolGenerator {

	/*
	 * Please note that even though this method could be way simpler for the given
	 * requirements (a symbol of two letters), in order to challenge myself I wrote
	 * it in such a way that it works even if the SYMBOL_LENGTH changed.
	 * 
	 */
	public String generateSymbol(String elementName) {
		
		if(elementName == null || elementName.length() < Constants.SYMBOL_LENGTH) {
			throw new IllegalArgumentException("Element name must have more than " + Constants.SYMBOL_LENGTH + " characters.");
		}
		
		
		char[] nameChars   = elementName.toLowerCase().toCharArray();
		char[] symbolChars = new char[Constants.SYMBOL_LENGTH];
		
		Arrays.fill(symbolChars, Character.MAX_VALUE);
		
		
		for (int nameIndex = 0; nameIndex < nameChars.length - Constants.SYMBOL_LENGTH + 1; nameIndex ++) {
			
			for(int i = 0; i < Constants.SYMBOL_LENGTH; i ++) {
				
				if(nameChars[nameIndex + i] < symbolChars[i]) {
			
					for(int j = i; j < Constants.SYMBOL_LENGTH; j ++) {
						symbolChars[j] = nameChars[nameIndex + j];
					}
				}
			
			}
		}
		
		return MyUtils.uppercaseFirstLetter(new String(symbolChars));
	}
	
}
