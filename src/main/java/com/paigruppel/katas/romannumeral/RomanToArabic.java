package com.paigruppel.katas.romannumeral;

import java.util.HashMap;
import java.util.Map;

public class RomanToArabic {

	public int convertToArabic(String input) {
		
		Map <Character, Integer> romanArabic = new HashMap<>();
		
		romanArabic.put('I', 1);
		romanArabic.put('V', 5);
		
		char[] inputArray = input.toCharArray();
		
		
		int first = 0;
		int response = romanArabic.get(inputArray[0]);
		
		for (int next = 1; next < inputArray.length; next++) {
			if (inputArray[1] <= inputArray[0]) {
				response = response + romanArabic.get(inputArray[next]);				
			}
		}
		
		
		
		
		return response;

	}

}
