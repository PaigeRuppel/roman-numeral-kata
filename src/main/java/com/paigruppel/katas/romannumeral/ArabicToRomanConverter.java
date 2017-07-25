package com.paigruppel.katas.romannumeral;

import java.util.HashMap;
import java.util.Map;

public class ArabicToRomanConverter {

	public String convertToRoman(int input) {
		String converted = arabicToRoman().get(input);
		return converted;
	}
	
	public static Map<Integer, String> arabicToRoman() {
		Map<Integer, String> arabicToRoman = new HashMap<>();
		
		arabicToRoman.put(1, "I");
		arabicToRoman.put(2, "II");
		arabicToRoman.put(3, "III");
		arabicToRoman.put(4, "IV");
		arabicToRoman.put(5, "V");
		arabicToRoman.put(6, "VI");
		arabicToRoman.put(7, "VII");
		arabicToRoman.put(8, "VIII");
		arabicToRoman.put(9, "IX");
		arabicToRoman.put(10, "X");
		
		
		return arabicToRoman;
	}

}
