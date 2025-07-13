package test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import main.RomanNumerals;

class TS007 {

	// TC01: Input = "LXXIV", Expected result = 74
	@Test
	void TC01() {
		RomanNumerals romanNum = new RomanNumerals();
		int result = romanNum.convertRomanNumToInt("LXXIV");
		assertEquals(74, result);
	}

	// TC02: Input = "CXLIV", Expected result = 76
	@Test
	void TC02() {
		RomanNumerals romanNum = new RomanNumerals();
		int result = romanNum.convertRomanNumToInt("CXXIV");
		assertEquals(124, result);
	}

	// TC03: Input = "DCCIX", Expected result =
	@Test
	void TC03() {
		RomanNumerals romanNum = new RomanNumerals();
		int result = romanNum.convertRomanNumToInt("DCCIX");
		assertEquals(709, result);
	}

	// TC04: Input = "MLDXX", Expected result = 1470
	@Test
	void TC04() {
		RomanNumerals romanNum = new RomanNumerals();
		int result = romanNum.convertRomanNumToInt("MLDXX");
		assertEquals(1470, result);
	}


}
