package com.paigruppel.katas.romannumeral;

import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;

public class ArabicToRomanConverterTest {

	ArabicToRomanConverter underTest;

	@Before
	public void setup() {
		underTest = new ArabicToRomanConverter();
	}

	@Test
	public void shouldReturnI() {
		String response = underTest.convertToRoman(1);
		assertEquals("I", response);
	}

	@Test
	public void shouldReturnII() {
		String response = underTest.convertToRoman(2);
		assertEquals("II", response);
	}

	@Test
	public void shouldReturnIII() {
		String response = underTest.convertToRoman(3);
		assertEquals("III", response);
	}

	@Test
	public void shouldReturnIV() {
		String response = underTest.convertToRoman(4);
		assertEquals("IV", response);
	}

	@Test
	public void shouldReturnV() {
		String response = underTest.convertToRoman(5);
		assertEquals("V", response);
	}

	@Test
	public void shouldReturnVI() {
		String response = underTest.convertToRoman(6);
		assertEquals("VI", response);
	}

	@Test
	public void shouldReturnVII() {
		String response = underTest.convertToRoman(7);
		assertEquals("VII", response);
	}

	@Test
	public void shouldReturnVIII() {
		String response = underTest.convertToRoman(8);
		assertEquals("VIII", response);
	}

	@Test
	public void shouldReturnIX() {
		String response = underTest.convertToRoman(9);
		assertEquals("IX", response);
	}

	@Test
	public void shouldReturnX() {
		String response = underTest.convertToRoman(10);
		assertEquals("X", response);
	}
	
	@Test
	public void shouldReturnXX(){
		String response = underTest.convertToRoman(20);
		assertEquals("XX", response);
	}
	
	@Test
	public void shouldReturnXXX(){
		String response = underTest.convertToRoman(30);
		assertEquals("XXX", response);
	}
	
	@Test
	public void shouldReturnXL(){
		String response = underTest.convertToRoman(40);
		assertEquals("XL", response);
	}
	
	@Test
	public void shouldReturnL(){
		String response = underTest.convertToRoman(50);
		assertEquals("L", response);
	}
	
	@Test
	public void shouldReturnLX(){
		String response = underTest.convertToRoman(60);
		assertEquals("LX", response);
	}
	
	@Test
	public void shouldReturnLXX(){
		String response = underTest.convertToRoman(70);
		assertEquals("LXX", response);
	}
	
	@Test
	public void shouldReturnLXXX(){
		String response = underTest.convertToRoman(80);
		assertEquals("LXXX", response);
	}
	
	@Test
	public void shouldReturnXC(){
		String response = underTest.convertToRoman(90);
		assertEquals("XC", response);
	}
		
	@Test
	public void shouldReturnXI(){
		String response = underTest.convertToRoman(11);
		assertEquals("XI", response);
	}
	
	@Test
	public void shouldReturnXII(){
		String response = underTest.convertToRoman(12);
		assertEquals("XII", response);
	}
	
	
	
}
