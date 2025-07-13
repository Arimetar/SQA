package test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import main.RomanNumerals;

class TS003 {

	// TC01: Input = "VI", Expected result = 6
	@Test
	void TC01() {
		RomanNumerals romanNum = new RomanNumerals();
		int result = romanNum.convertRomanNumToInt("VI");
		assertEquals(6, result);
	}

	// TC02: Input = "XV", Expected result = 600
	@Test
	void TC02() {
		RomanNumerals romanNum = new RomanNumerals();
		int result = romanNum.convertRomanNumToInt("XV");
		assertEquals(15, result);
	}

	// TC03: Input = "CL", Expected result = 150
	@Test
	void TC03() {
		RomanNumerals romanNum = new RomanNumerals();
		int result = romanNum.convertRomanNumToInt("CL");
		assertEquals(150, result);
	}

	// TC04: Input = "DC", Expected result = 600
	@Test
	void TC04() {
		RomanNumerals romanNum = new RomanNumerals();
		int result = romanNum.convertRomanNumToInt("DC");
		assertEquals(600, result);
	}

	// TC05: Input = "MD", Expected result = 1500
	@Test
	void TC05() {
		RomanNumerals romanNum = new RomanNumerals();
		int result = romanNum.convertRomanNumToInt("MD");
		assertEquals(1500, result);
	}

}
