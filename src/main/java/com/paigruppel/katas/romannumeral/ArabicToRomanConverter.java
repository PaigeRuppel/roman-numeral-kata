package com.paigruppel.katas.romannumeral;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class ArabicToRomanConverter {

	public String convertToRoman(int input) {
		// splitting input into an array so that I can determine length of input
		int temp = input;

		ArrayList<Integer> inputArray = new ArrayList<>();
		do {
			// adding at the first index each time so that the array will be in
			// order relative to the input
			inputArray.add(0, temp % 10);
			temp /= 10;
		} while (temp > 0);

		String converted = "";
		if (inputArray.size() == 1) {
			converted = unitsDigit().get(input);
		} else if (inputArray.size() == 2) {
			converted = tensDigit().get(inputArray.get(0)) + unitsDigit().get(inputArray.get(1));
		} else {
			converted = hundredsDigit().get(inputArray.get(0)) + tensDigit().get(inputArray.get(1)) + unitsDigit().get(inputArray.get(2));
		}
		return converted;
	}

	public static Map<Integer, String> unitsDigit() {
		Map<Integer, String> unitsDigit = new HashMap<>();

		unitsDigit.put(0, "");
		unitsDigit.put(1, "I");
		unitsDigit.put(2, "II");
		unitsDigit.put(3, "III");
		unitsDigit.put(4, "IV");
		unitsDigit.put(5, "V");
		unitsDigit.put(6, "VI");
		unitsDigit.put(7, "VII");
		unitsDigit.put(8, "VIII");
		unitsDigit.put(9, "IX");

		return unitsDigit;
	}

	public static Map<Integer, String> tensDigit() {
		Map<Integer, String> tensDigit = new HashMap<>();

		tensDigit.put(0, "");
		tensDigit.put(1, "X");
		tensDigit.put(2, "XX");
		tensDigit.put(3, "XXX");
		tensDigit.put(4, "XL");
		tensDigit.put(5, "L");
		tensDigit.put(6, "LX");
		tensDigit.put(7, "LXX");
		tensDigit.put(8, "LXXX");
		tensDigit.put(9, "XC");
		return tensDigit;

	}
	
	public static Map<Integer, String> hundredsDigit() {
		Map<Integer, String> hundredsDigit = new HashMap<>();

		hundredsDigit.put(1, "C");
		
		return hundredsDigit;

	}

}
