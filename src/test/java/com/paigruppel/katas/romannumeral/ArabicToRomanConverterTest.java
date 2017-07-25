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
	
	@Test
	public void shouldReturnII() {
		ArabicToRomanConverter underTest = new ArabicToRomanConverter();
		String response = underTest.convertToRoman(2);
		assertEquals("II", response);
	}
	
	@Test
	public void shouldReturnIII() {
		ArabicToRomanConverter underTest = new ArabicToRomanConverter();
		String response = underTest.convertToRoman(3);
		assertEquals("III", response);
	}
}
