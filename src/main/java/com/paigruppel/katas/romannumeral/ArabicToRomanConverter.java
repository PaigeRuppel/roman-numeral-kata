package com.paigruppel.katas.romannumeral;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ArabicToRomanConverter {

	// private int input;
	//
	// public ArabicToRomanConverter(int input) {
	// this.input = input;
	// }

	public String convertToRoman(int input) {
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

	private static Map<Integer, String> arabicRoman() {
		Map<Integer, String> arabicRoman = new HashMap<>();

		arabicRoman.put(0, "");
		arabicRoman.put(1, "I");
		arabicRoman.put(5, "V");
		arabicRoman.put(10, "X");
		arabicRoman.put(50, "L");
		arabicRoman.put(100, "C");
		arabicRoman.put(500, "D");
		arabicRoman.put(1000, "M");

		return arabicRoman;
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

	private String unitsToRoman(List<Integer> inputArray, int index) {
		return unitsDigit().get(inputArray.get(index));
	}

	private static Map<Integer, String> tensDigit() {
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

	private String tensToRoman(List<Integer> inputArray, int index) {
		return tensDigit().get(inputArray.get(index));
	}

	private static Map<Integer, String> hundredsDigit() {
		Map<Integer, String> hundredsDigit = new HashMap<>();

		hundredsDigit.put(0, "");
		hundredsDigit.put(1, "C");
		hundredsDigit.put(2, "CC");
		hundredsDigit.put(3, "CCC");
		hundredsDigit.put(4, "CD");
		hundredsDigit.put(5, "D");
		hundredsDigit.put(6, "DC");
		hundredsDigit.put(7, "DCC");
		hundredsDigit.put(8, "DCCC");
		hundredsDigit.put(9, "CM");

		return hundredsDigit;

	}

	private String hundredsToRoman(List<Integer> inputArray, int index) {
		return hundredsDigit().get(inputArray.get(index));
	}

	private static Map<Integer, String> thousandsDigit() {
		Map<Integer, String> thousandsDigit = new HashMap<>();

		thousandsDigit.put(1, "M");
		thousandsDigit.put(2, "MM");

		return thousandsDigit;
	}

	private String thousandsToRoman(List<Integer> inputArray, int index) {
		return thousandsDigit().get(inputArray.get(index));
	}

}
