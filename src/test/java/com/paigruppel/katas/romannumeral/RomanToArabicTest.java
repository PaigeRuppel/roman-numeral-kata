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
	
	@Test
	public void shouldReturn5() {
		assertThat(underTest.convertToArabic("V"), is(5));
	}
	
	@Test
	public void shouldReturn6() {
		assertThat(underTest.convertToArabic("VI"), is(6));
	}
	
	@Test
	public void shouldReturn7() {
		assertThat(underTest.convertToArabic("VII"), is(7));
	}
	
	@Test
	public void shouldReturn8() {
		assertThat(underTest.convertToArabic("VIII"), is(8));
	}
	
	@Test
	public void shouldReturn9() {
		assertThat(underTest.convertToArabic("IX"), is(9));
	}
	
	@Test
	public void shouldReturn14() {
		assertThat(underTest.convertToArabic("XIV"), is(14));
	}
	
	@Test
	public void shouldReturn24() {
		assertThat(underTest.convertToArabic("XXIV"), is(24));
	}
	
	@Test
	public void shouldReturn44() {
		assertThat(underTest.convertToArabic("XLIV"), is(44));
	}
	
	@Test
	public void shouldReturn1144() {
		assertThat(underTest.convertToArabic("MCXLIV"), is(1144));
	}

}
