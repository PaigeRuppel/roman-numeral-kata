package com.paigruppel.katas.romannumeral;

import static org.junit.Assert.*;

import org.junit.Test;

public class RomanToArabicTest {
	
	@Test
	public void shouldReturn1() {
		RomanToArabic underTest = new RomanToArabic();
		int response = underTest.convertToArabic("I");
		assertEquals(response, 1);
	}
	
	@Test
	public void shouldReturn2() {
		RomanToArabic underTest = new RomanToArabic();
		int response = underTest.convertToArabic("II");
		assertEquals(response, 2);
	}

}
