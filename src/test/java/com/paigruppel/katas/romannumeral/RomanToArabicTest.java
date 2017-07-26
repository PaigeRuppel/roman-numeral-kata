package com.paigruppel.katas.romannumeral;

import static org.hamcrest.Matchers.is;
import static org.junit.Assert.*;

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
		assertThat(response, is(1));
	}

	@Test
	public void shouldReturn2() {
		int response = underTest.convertToArabic("II");
		assertThat(response, is(2));
	}

	@Test
	public void shouldReturn3() {
		int response = underTest.convertToArabic("III");
		assertThat(response, is(3));
	}

	@Test
	public void shouldReturn4() {
		int response = underTest.convertToArabic("IV");
		assertThat(response, is(4));
	}

}
