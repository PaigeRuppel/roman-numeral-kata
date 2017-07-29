package com.paigruppel.katas.romannumeral;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ArabicToRomanConverter {

	private int input;

	private String converted;
	
	private List<Integer> inputAsList;

	public ArabicToRomanConverter(int input) {
		this.input = input;
		inputAsList = createListFrom(input);
	}

	public String convertToRoman() {
		if (inputAsList.size() == 1) {
			converted = unitsToRoman(0);
		} else if (inputAsList.size() == 2) {
			converted = tensToRoman(0) + unitsToRoman(1);
		} else if (inputAsList.size() == 3) {
			converted = hundredsToRoman(0) + tensToRoman(1) + unitsToRoman(2);
		} else {
			converted = "M" + hundredsToRoman(1) + tensToRoman(2) + unitsToRoman(3);
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

	private static Map<Integer, String> buildMap(String first, String second, String third) {
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
		Map<Integer, String> unitsDigit = buildMap("I", "V", "X");
		return unitsDigit;
	}

	private String unitsToRoman(int index) {
		return unitsDigit().get(inputAsList.get(index));
	}

	private static Map<Integer, String> tensDigit() {
		Map<Integer, String> tensDigit = buildMap("X", "L", "C");

		return tensDigit;
	}

	private String tensToRoman(int index) {
		return tensDigit().get(inputAsList.get(index));
	}

	private static Map<Integer, String> hundredsDigit() {
		Map<Integer, String> hundredsDigit = buildMap("C", "D", "M");

		return hundredsDigit;
	}

	private String hundredsToRoman(int index) {
		return hundredsDigit().get(inputAsList.get(index));
	}

}
