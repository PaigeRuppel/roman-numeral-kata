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
	
	@Test
	public void shouldReturnIV() {
		ArabicToRomanConverter underTest = new ArabicToRomanConverter();
		String response = underTest.convertToRoman(4);
		assertEquals("IV", response);
	}
	
	@Test
	public void shouldReturnV() {
		ArabicToRomanConverter underTest = new ArabicToRomanConverter();
		String response = underTest.convertToRoman(5);
		assertEquals("V", response);
	}
	
	@Test
	public void shouldReturnVI() {
		ArabicToRomanConverter underTest = new ArabicToRomanConverter();
		String response = underTest.convertToRoman(6);
		assertEquals("VI", response);
	}

	@Test
	public void shouldReturnVII() {
		ArabicToRomanConverter underTest = new ArabicToRomanConverter();
		String response = underTest.convertToRoman(7);
		assertEquals("VII", response);
	}

	@Test
	public void shouldReturnVIII() {
		ArabicToRomanConverter underTest = new ArabicToRomanConverter();
		String response = underTest.convertToRoman(8);
		assertEquals("VIII", response);
	}
}
