package test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import main.RomanNumerals;

class TS009 {

	// TC01: Input = "VV", Expected result = 1
	@Test
	void TC01() {
		RomanNumerals romanNum = new RomanNumerals();
		int result = romanNum.convertRomanNumToInt("VV");
		assertNotEquals(10, result);
	}

	// TC02: Input = "LL", Expected result =
	@Test
	void TC02() {
		RomanNumerals romanNum = new RomanNumerals();
		int result = romanNum.convertRomanNumToInt("LL");
		assertNotEquals(100, result);
	}

	// TC03: Input = "DD", Expected result =
	@Test
	void TC03() {
		RomanNumerals romanNum = new RomanNumerals();
		int result = romanNum.convertRomanNumToInt("DD");
		assertNotEquals(1000, result);
	}

}
