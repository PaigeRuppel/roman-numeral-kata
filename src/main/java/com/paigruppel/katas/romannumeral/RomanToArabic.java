package com.paigruppel.katas.romannumeral;

import java.util.HashMap;
import java.util.Map;

public class RomanToArabic {

	public int convertToArabic(String input) {
		
		Map <Character, Integer> romanArabic = new HashMap<>();
		
		romanArabic.put('I', 1);
		romanArabic.put('V', 5);
		
		char[] inputArray = input.toCharArray();
		int response = 0;
		
		for (int i = 0; i < inputArray.length; i++) {
			response = response + romanArabic.get(inputArray[i]);
		}
		
		
		
		
		return response;

	}

}
