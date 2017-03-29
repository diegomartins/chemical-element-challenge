package com.domsd.chemicalchallenge.validator;

import com.domsd.chemicalchallenge.validator.criteria.ContentCriteria;
import com.domsd.chemicalchallenge.validator.criteria.Criteria;
import com.domsd.chemicalchallenge.validator.criteria.LengthCriteria;
import com.domsd.chemicalchallenge.validator.criteria.OrderCriteria;

public class ChemicalElementSymbolValidator {

	private Criteria[] criteriaArray;
	
	public ChemicalElementSymbolValidator() {
		
		Criteria[] criteriaArray = {new LengthCriteria(),
									new ContentCriteria(),
									new OrderCriteria()};
		
		this.criteriaArray = criteriaArray;
	}
	
	public ChemicalElementSymbolValidator(Criteria[] criteriaArray) {
		this.criteriaArray = criteriaArray;
	}
	
	public boolean validate(String elementName, String symbol) {
		
		if(symbol == null) {
			return false;
		}

		boolean valid = true;
		
		
		for (Criteria criteria : criteriaArray) {
			valid = valid && criteria.isValid(elementName, symbol);
		}
		
		
		return valid;
	}

}
