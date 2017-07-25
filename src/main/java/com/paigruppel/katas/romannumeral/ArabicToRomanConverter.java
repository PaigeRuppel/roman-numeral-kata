package com.paigruppel.katas.romannumeral;

public class ArabicToRomanConverter {

	public String convertToRoman(int input) {
		String converted = "";
		switch (input) {
		case (1):
			converted = "I";
			break;
		case (2):
			converted = "II";
			break;
		case (3):
			converted = "III";
			break;
		}
		return converted;
	}

}
