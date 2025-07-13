package test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import main.RomanNumerals;

class TS008 {

	// TC01: Input = "A", Expected result = NullPointerException
	@Test
	void TC01() {
		RomanNumerals romanNum = new RomanNumerals();
		assertThrows(NullPointerException.class, () -> {
			romanNum.convertRomanNumToInt("A");
		});
	}

	// TC02: Input = "0", Expected result = NullPointerException
	@Test
	void TC02() {
		RomanNumerals romanNum = new RomanNumerals();
		assertThrows(NullPointerException.class, () -> {
			romanNum.convertRomanNumToInt("0");
		});
	}

	// TC03: Input = "-", Expected result = NullPointerException
	@Test
	void TC03() {
		RomanNumerals romanNum = new RomanNumerals();
		assertThrows(NullPointerException.class, () -> {
			romanNum.convertRomanNumToInt("-");
		});
	}

	// TC04: Input = "ก", Expected result = NullPointerException
	@Test
	void TC04() {
		RomanNumerals romanNum = new RomanNumerals();
		assertThrows(NullPointerException.class, () -> {
			romanNum.convertRomanNumToInt("ก");
		});
	}

	// TC05: Input = "JJ", Expected result = NullPointerException
	@Test
	void TC05() {
		RomanNumerals romanNum = new RomanNumerals();
		assertThrows(NullPointerException.class, () -> {
			romanNum.convertRomanNumToInt("JJ");
		});
	}

}
