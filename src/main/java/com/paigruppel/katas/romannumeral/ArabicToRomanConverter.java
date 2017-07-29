package com.paigruppel.katas.romannumeral;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ArabicToRomanConverter {

	private int input;

	public ArabicToRomanConverter(int input) {
		this.input = input;
	}

	public String convertToRoman() {
		// splitting input into an array so that I can determine length of input
		List<Integer> inputAsList = createListFrom(input);

		String converted = "";

		if (inputAsList.size() == 1) {
			converted = unitsToRoman(inputAsList, 0);
		} else if (inputAsList.size() == 2) {
			converted = tensToRoman(inputAsList, 0) + unitsToRoman(inputAsList, 1);
		} else if (inputAsList.size() == 3) {
			converted = hundredsToRoman(inputAsList, 0) + tensToRoman(inputAsList, 1) + unitsToRoman(inputAsList, 2);
		} else {
			converted = thousandsToRoman(inputAsList, 0) + hundredsToRoman(inputAsList, 1) + tensToRoman(inputAsList, 2)
					+ unitsToRoman(inputAsList, 3);
		}
		return converted;
	}

	private List<Integer> createListFrom(int input) {
		List<Integer> inputAsList = new ArrayList<>();
		do {
			// adding at the first index each time so that the array will be in
			// order relative to the input
			inputAsList.add(0, input % 10);
			input /= 10;
		} while (input > 0);
		return inputAsList;
	}

	private static Map<Integer, String> buildOutput(String first, String second, String third) {
		Map<Integer, String> conversionMap = new HashMap<>();

		conversionMap.put(0, "");
		conversionMap.put(1, first);
		conversionMap.put(2, first + first);
		conversionMap.put(3, first + first + first);
		conversionMap.put(4, first + second);
		conversionMap.put(5, second);
		conversionMap.put(6, second + first);
		conversionMap.put(7, second + first + first);
		conversionMap.put(8, second + first + first + first);
		conversionMap.put(9, first + third);

		return conversionMap;

	}

	private static Map<Integer, String> unitsDigit() {
		Map<Integer, String> unitsDigit = buildOutput("I", "V", "X");

		return unitsDigit;
	}

	private String unitsToRoman(List<Integer> inputAsList, int index) {
		return unitsDigit().get(inputAsList.get(index));
	}

	private static Map<Integer, String> tensDigit() {
		Map<Integer, String> tensDigit = buildOutput("X", "L", "C");

		return tensDigit;
	}

	private String tensToRoman(List<Integer> inputAsList, int index) {
		return tensDigit().get(inputAsList.get(index));
	}

	private static Map<Integer, String> hundredsDigit() {
		Map<Integer, String> hundredsDigit = buildOutput("C", "D", "M");

		return hundredsDigit;

	}

	private String hundredsToRoman(List<Integer> inputAsList, int index) {
		return hundredsDigit().get(inputAsList.get(index));
	}

	private static Map<Integer, String> thousandsDigit() {
		Map<Integer, String> thousandsDigit = new HashMap<>();

		thousandsDigit.put(1, "M");
		thousandsDigit.put(2, "MM");

		return thousandsDigit;
	}

	private String thousandsToRoman(List<Integer> inputAsList, int index) {
		return thousandsDigit().get(inputAsList.get(index));
	}

}
