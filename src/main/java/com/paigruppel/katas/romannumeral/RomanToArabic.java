package com.paigruppel.katas.romannumeral;

import java.util.HashMap;
import java.util.Map;

public class RomanToArabic {

	public int convertToArabic(String input) {
		
		Map <Character, Integer> romanArabic = new HashMap<>();
		
		romanArabic.put('I', 1);
		romanArabic.put('V', 5);
		romanArabic.put('X', 10);
		
		char[] inputArray = input.toCharArray();
		
		int[] rawValues = new int[inputArray.length];
		
		for (int i = 0 ; i < rawValues.length; i++) {
			rawValues[i] = romanArabic.get(inputArray[i]);
		}
		

		int first = 0;
		int response = rawValues[0];
		
		for (int next = 1; next < inputArray.length; next++) {
			if (rawValues[next] <= rawValues[first]) {
				response =  response + romanArabic.get(inputArray[next]);	
				first++;
			} else {
				response = (response - rawValues[first]) + (rawValues[next] - rawValues[first]);
				first++;
			}
		}
		
		
		
		
		return response;

	}

}
