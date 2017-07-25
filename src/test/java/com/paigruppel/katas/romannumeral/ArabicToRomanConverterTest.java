package com.paigruppel.katas.romannumeral;

import static org.junit.Assert.*;

import org.junit.Test;

public class ArabicToRomanConverterTest {

	@Test
	public void shouldReturnI() {
		ArabicToRomanConverter underTest = new ArabicToRomanConverter();
		String response = underTest.convertToRoman(1);
		assertEquals("I", response);
	}
}
