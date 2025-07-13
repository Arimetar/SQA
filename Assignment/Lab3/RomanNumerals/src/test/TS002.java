package test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import main.RomanNumerals;

class TS002 {

	// TC01: Input = "IV", Expected result = 4
	@Test
	void TC01() {
		RomanNumerals romanNum = new RomanNumerals();
		int result = romanNum.convertRomanNumToInt("IV");
		assertEquals(4, result);
	}

	// TC02: Input = "IX", Expected result = 9
	@Test
	void TC02() {
		RomanNumerals romanNum = new RomanNumerals();
		int result = romanNum.convertRomanNumToInt("IX");
		assertEquals(9, result);
	}

	// TC03: Input = "XL", Expected result = 40
	@Test
	void TC03() {
		RomanNumerals romanNum = new RomanNumerals();
		int result = romanNum.convertRomanNumToInt("XL");
		assertEquals(40, result);
	}

	// TC04: Input = "LD", Expected result = 450
	@Test
	void TC04() {
		RomanNumerals romanNum = new RomanNumerals();
		int result = romanNum.convertRomanNumToInt("LD");
		assertEquals(450, result);
	}

	// TC05: Input = "CM", Expected result = 900
	@Test
	void TC05() {
		RomanNumerals romanNum = new RomanNumerals();
		int result = romanNum.convertRomanNumToInt("CM");
		assertEquals(900, result);
	}

}
