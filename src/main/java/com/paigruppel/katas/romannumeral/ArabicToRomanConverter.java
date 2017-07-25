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
		case (4):
			converted = "IV";
			break;
		case (5):
			converted = "V";
			break;
		case (6):
			converted = "VI";
			break;
		case (7):
			converted = "VII";
			break;
		case (8):
			converted = "VIII";
			break;
		}
		return converted;
	}

}
