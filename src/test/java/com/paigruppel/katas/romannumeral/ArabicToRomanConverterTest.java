package com.paigruppel.katas.romannumeral;

import static org.hamcrest.Matchers.is;
import static org.junit.Assert.assertThat;

import org.junit.Test;

public class ArabicToRomanConverterTest {

	private ArabicToRomanConverter underTest(int input) {
		return new ArabicToRomanConverter(input);
	}

	@Test
	public void shouldReturnI() {
		assertThat(underTest(1).convertToRoman(), is("I"));
	}

	@Test
	public void shouldReturnII() {
		assertThat(underTest(2).convertToRoman(), is("II"));
	}

	@Test
	public void shouldReturnIII() {
		assertThat(underTest(3).convertToRoman(), is("III"));
	}

	@Test
	public void shouldReturnIV() {
		assertThat(underTest(4).convertToRoman(), is("IV"));
	}

	@Test
	public void shouldReturnV() {
		assertThat(underTest(5).convertToRoman(), is("V"));
	}

	@Test
	public void shouldReturnVI() {
		assertThat(underTest(6).convertToRoman(), is("VI"));
	}

	@Test
	public void shouldReturnVII() {
		assertThat(underTest(7).convertToRoman(), is("VII"));
	}

	@Test
	public void shouldReturnVIII() {
		assertThat(underTest(8).convertToRoman(), is("VIII"));
	}

	@Test
	public void shouldReturnIX() {
		assertThat(underTest(9).convertToRoman(), is("IX"));
	}

	@Test
	public void shouldReturnX() {
		assertThat(underTest(10).convertToRoman(), is("X"));
	}

	@Test
	public void shouldReturnXX() {
		assertThat(underTest(20).convertToRoman(), is("XX"));
	}

	@Test
	public void shouldReturnXXX() {
		assertThat(underTest(30).convertToRoman(), is("XXX"));
	}

	@Test
	public void shouldReturnXL() {
		assertThat(underTest(40).convertToRoman(), is("XL"));
	}

	@Test
	public void shouldReturnL() {
		assertThat(underTest(50).convertToRoman(), is("L"));
	}

	@Test
	public void shouldReturnLX() {
		assertThat(underTest(60).convertToRoman(), is("LX"));
	}

	@Test
	public void shouldReturnLXXX() {
		assertThat(underTest(80).convertToRoman(), is("LXXX"));
	}

	@Test
	public void shouldReturnC() {
		assertThat(underTest(100).convertToRoman(), is("C"));
	}

	@Test
	public void shouldReturnD() {
		assertThat(underTest(500).convertToRoman(), is("D"));
	}

	@Test
	public void shouldReturnM() {
		assertThat(underTest(1000).convertToRoman(), is("M"));
	}

	@Test
	public void shouldReturnMCMLXXXIX() {
		assertThat(underTest(1989).convertToRoman(), is("MCMLXXXIX"));
	}

}
