package com.domsd.chemicalchallenge.validator.criteria;

public class LengthCriteria implements Criteria {

	@Override
	public boolean isValid(String element, String symbol) {

		if(symbol.length() != 2) {
			return false;
		}
		
		return true;
		
	}

}
