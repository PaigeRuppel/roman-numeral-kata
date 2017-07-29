package com.paigruppel.katas.romannumeral;

import java.util.HashMap;
import java.util.Map;

public class RomanToArabic {

	private String input;

	private char[] inputArray;

	private int[] rawValues;

	public RomanToArabic(String input) {
		this.input = input;
		inputArray = input.toCharArray();
		rawValues = convertToRawValues();
	}

	public int convertToArabic() {

		int first = 0;
		int response = rawValues[0];

		for (int next = 1; next < rawValues.length; next++) {
			if (isDecreasing(first, next)) {
				response = response + rawValues[next];
				first++;
			} else {
				response = (response - rawValues[first]) + (rawValues[next] - rawValues[first]);
				first++;
			}
		}
		return response;
	}

	private int[] convertToRawValues() {
		int[] rawValues = new int[inputArray.length];

		for (int i = 0; i < rawValues.length; i++) {
			rawValues[i] = romanArabicMap().get(inputArray[i]);
		}
		return rawValues;
	}

	private boolean isDecreasing(int first, int next) {
		return rawValues[next] <= rawValues[first];
	}

	private static Map<Character, Integer> romanArabicMap() {
		Map<Character, Integer> romanArabic = new HashMap<>();

		romanArabic.put('I', 1);
		romanArabic.put('V', 5);
		romanArabic.put('X', 10);
		romanArabic.put('L', 50);
		romanArabic.put('C', 100);
		romanArabic.put('D', 500);
		romanArabic.put('M', 1000);

		return romanArabic;
	}

}
