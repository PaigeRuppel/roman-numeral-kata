package com.paigruppel.katas.romannumeral;

import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;

public class RomanToArabicTest {

	RomanToArabic underTest;

	@Before
	public void setup() {
		underTest = new RomanToArabic();
	}

	@Test
	public void shouldReturn1() {
		int response = underTest.convertToArabic("I");
		assertEquals(response, 1);
	}

	@Test
	public void shouldReturn2() {
		int response = underTest.convertToArabic("II");
		assertEquals(response, 2);
	}

	@Test
	public void shouldReturn3() {
		int response = underTest.convertToArabic("III");
		assertEquals(response, 3);
	}

	@Test
	public void shouldReturn4() {
		int response = underTest.convertToArabic("IV");
		assertEquals(response, 4);
	}

}
