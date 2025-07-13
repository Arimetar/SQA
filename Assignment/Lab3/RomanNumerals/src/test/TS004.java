package test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import main.RomanNumerals;

class TS004 {

	// TC01: Input = "II", Expected result = 2
	@Test
	void TC01() {
		RomanNumerals romanNum = new RomanNumerals();
		int result = romanNum.convertRomanNumToInt("II");
		assertEquals(2, result);
	}

	// TC02: Input = "XX", Expected result =20
	@Test
	void TC02() {
		RomanNumerals romanNum = new RomanNumerals();
		int result = romanNum.convertRomanNumToInt("XX");
		assertEquals(20, result);
	}

	// TC03: Input = "CC", Expected result = 200
	@Test
	void TC03() {
		RomanNumerals romanNum = new RomanNumerals();
		int result = romanNum.convertRomanNumToInt("CC");
		assertEquals(200, result);
	}

	// TC04: Input = "MM", Expected result = 2000
	@Test
	void TC04() {
		RomanNumerals romanNum = new RomanNumerals();
		int result = romanNum.convertRomanNumToInt("MM");
		assertEquals(2000, result);
	}

}
