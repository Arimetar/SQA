package test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import main.RomanNumerals;

class TS006 {

	// TC01: Input = "VIII", Expected result = 8
	@Test
	void TC01() {
		RomanNumerals romanNum = new RomanNumerals();
		int result = romanNum.convertRomanNumToInt("VIII");
		assertEquals(8, result);
	}

	// TC02: Input = "XXIV", Expected result = 24
	@Test
	void TC02() {
		RomanNumerals romanNum = new RomanNumerals();
		int result = romanNum.convertRomanNumToInt("XXIV");
		assertEquals(24, result);
	}

	// TC03: Input = "LXVII", Expected result = 67
	@Test
	void TC03() {
		RomanNumerals romanNum = new RomanNumerals();
		int result = romanNum.convertRomanNumToInt("LXVII");
		assertEquals(67, result);
	}

	// TC04: Input = "DCCLXX", Expected result = 770
	@Test
	void TC04() {
		RomanNumerals romanNum = new RomanNumerals();
		int result = romanNum.convertRomanNumToInt("DCCLXX");
		assertEquals(770, result);
	}

	// TC05: Input = "MCDXI", Expected result = 1420
	@Test
	void TC05() {
		RomanNumerals romanNum = new RomanNumerals();
		int result = romanNum.convertRomanNumToInt("MCDXI");
		assertEquals(1420, result);
	}

}
