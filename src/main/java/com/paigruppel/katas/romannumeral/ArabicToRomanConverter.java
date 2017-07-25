package com.paigruppel.katas.romannumeral;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class ArabicToRomanConverter {

	public String convertToRoman(int input) {
		// splitting input into an array so that I can determine length of input

		ArrayList<Integer> inputArray = createArray(input);

		String converted = "";

		if (inputArray.size() == 1) {
			converted = unitsToRoman(inputArray, 0);
		} else if (inputArray.size() == 2) {
			converted = tensToRoman(inputArray, 0) + unitsToRoman(inputArray, 1);
		} else {
			converted = hundredsToRoman(inputArray, 0) + tensToRoman(inputArray, 1) + unitsToRoman(inputArray, 2);
		}
		return converted;
	}

	private ArrayList<Integer> createArray(int input) {
		ArrayList<Integer> inputArray = new ArrayList<>();
		do {
			// adding at the first index each time so that the array will be in
			// order relative to the input
			inputArray.add(0, input % 10);
			input /= 10;
		} while (input > 0);
		return inputArray;
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

	private String unitsToRoman(ArrayList<Integer> inputArray, int index) {
		return unitsDigit().get(inputArray.get(index));
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

	private String tensToRoman(ArrayList<Integer> inputArray, int index) {
		return tensDigit().get(inputArray.get(index));
	}

	public static Map<Integer, String> hundredsDigit() {
		Map<Integer, String> hundredsDigit = new HashMap<>();

		hundredsDigit.put(1, "C");

		return hundredsDigit;

	}

	private String hundredsToRoman(ArrayList<Integer> inputArray, int index) {
		return hundredsDigit().get(inputArray.get(index));
	}

}
