package test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import main.RomanNumerals;

class TS010 {

	// TC01: Input = "IIII", Expected result != 4
	@Test
	void TC01() {
		RomanNumerals romanNum = new RomanNumerals();
		int result = romanNum.convertRomanNumToInt("IIII");
		assertNotEquals(4, result);
	}

	// TC02: Input = "VVVV", Expected result != 20
	@Test
	void TC02() {
		RomanNumerals romanNum = new RomanNumerals();
		int result = romanNum.convertRomanNumToInt("VVVV");
		assertNotEquals(20, result);
	}

	// TC03: Input = "LLLL", Expected result != 200
	@Test
	void TC03() {
		RomanNumerals romanNum = new RomanNumerals();
		int result = romanNum.convertRomanNumToInt("LLLL");
		assertNotEquals(200, result);
	}

	// TC04: Input = "DDDD", Expected result != 2000
	@Test
	void TC04() {
		RomanNumerals romanNum = new RomanNumerals();
		int result = romanNum.convertRomanNumToInt("DDDD");
		assertNotEquals(2000, result);
	}

	// TC05: Input = "MMMM", Expected result != 4000
	@Test
	void TC05() {
		RomanNumerals romanNum = new RomanNumerals();
		int result = romanNum.convertRomanNumToInt("MMMM");
		assertNotEquals(4000, result);
	}

}
