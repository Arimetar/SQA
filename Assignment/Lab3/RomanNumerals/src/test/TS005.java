package test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import main.RomanNumerals;

class TS005 {

	// TC01: Input = "III", Expected result = 3
	@Test
	void TC01() {
		RomanNumerals romanNum = new RomanNumerals();
		int result = romanNum.convertRomanNumToInt("III");
		assertEquals(3, result);
	}

	// TC02: Input = "XXX", Expected result = 300
	@Test
	void TC02() {
		RomanNumerals romanNum = new RomanNumerals();
		int result = romanNum.convertRomanNumToInt("XXX");
		assertEquals(30, result);
	}

	// TC03: Input = "CCC", Expected result = 300
	@Test
	void TC03() {
		RomanNumerals romanNum = new RomanNumerals();
		int result = romanNum.convertRomanNumToInt("CCC");
		assertEquals(300, result);
	}

	// TC04: Input = "MMM", Expected result = 3000
	@Test
	void TC04() {
		RomanNumerals romanNum = new RomanNumerals();
		int result = romanNum.convertRomanNumToInt("MMM");
		assertEquals(3000, result);
	}

}
