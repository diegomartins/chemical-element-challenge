package com.domsd.chemicalchallenge.application.validator.criteria;

import com.domsd.chemicalchallenge.interfaces.Criteria;
import com.domsd.chemicalchallenge.model.Constants;

public class LengthCriteria implements Criteria {

	@Override
	public boolean isValid(String element, String symbol) {

		if(symbol.length() != Constants.SYMBOL_LENGTH) {
			return false;
		}
		
		return true;
		
	}

}
