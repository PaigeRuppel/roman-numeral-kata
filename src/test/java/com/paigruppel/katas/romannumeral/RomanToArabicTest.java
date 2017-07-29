package com.paigruppel.katas.romannumeral;

import static org.hamcrest.Matchers.is;
import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class RomanToArabicTest {



	public RomanToArabic underTest(String input) {
		return new RomanToArabic(input);
	}

	@Test
	public void shouldReturn1() {
		assertThat(underTest("I").convertToArabic(), is(1));
	}

	@Test
	public void shouldReturn2() {
		assertThat(underTest("II").convertToArabic(), is (2));
	}

	@Test
	public void shouldReturn3() {
		assertThat(underTest("III").convertToArabic(), is (3));
	}

	@Test
	public void shouldReturn4() {
		assertThat(underTest("IV").convertToArabic(), is (4));
	}
	
	@Test
	public void shouldReturn5() {
		assertThat(underTest("V").convertToArabic(), is(5));
	}
	
	@Test
	public void shouldReturn6() {
		assertThat(underTest("VI").convertToArabic(), is(6));
	}
	
	@Test
	public void shouldReturn7() {
		assertThat(underTest("VII").convertToArabic(), is(7));
	}
	
	@Test
	public void shouldReturn8() {
		assertThat(underTest("VIII").convertToArabic(), is(8));
	}
	
	@Test
	public void shouldReturn9() {
		assertThat(underTest("IX").convertToArabic(), is(9));
	}
	
	@Test
	public void shouldReturn14() {
		assertThat(underTest("XIV").convertToArabic(), is(14));
	}
	
	@Test
	public void shouldReturn24() {
		assertThat(underTest("XXIV").convertToArabic(), is(24));
	}
	
	@Test
	public void shouldReturn44() {
		assertThat(underTest("XLIV").convertToArabic(), is(44));
	}
	
	@Test
	public void shouldReturn544() {
		assertThat(underTest("DXLIV").convertToArabic(), is(544));
	}
	
	@Test
	public void shouldReturn1144() {
		assertThat(underTest("MCXLIV").convertToArabic(), is(1144));
	}

}
