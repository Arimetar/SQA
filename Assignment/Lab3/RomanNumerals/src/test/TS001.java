package test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import main.RomanNumerals;

class TS001 {

	// TC01: Input = "I", Expected result = 1
	@Test
	void TC01() {
		RomanNumerals romanNum = new RomanNumerals();
		int result = romanNum.convertRomanNumToInt("I");
		assertEquals(1, result);
	}

	// TC02: Input = "V", Expected result = 5
	@Test
	void TC02() {
		RomanNumerals romanNum = new RomanNumerals();
		int result = romanNum.convertRomanNumToInt("V");
		assertEquals(5, result);
	}

	// TC03: Input = "L", Expected result = 50
	@Test
	void TC03() {
		RomanNumerals romanNum = new RomanNumerals();
		int result = romanNum.convertRomanNumToInt("L");
		assertEquals(50, result);
	}

	// TC04: Input = "D", Expected result = 500
	@Test
	void TC04() {
		RomanNumerals romanNum = new RomanNumerals();
		int result = romanNum.convertRomanNumToInt("D");
		assertEquals(500, result);
	}

	// TC05: Input = "M", Expected result = 1000
	@Test
	void TC05() {
		RomanNumerals romanNum = new RomanNumerals();
		int result = romanNum.convertRomanNumToInt("M");
		assertEquals(1000, result);
	}

}
