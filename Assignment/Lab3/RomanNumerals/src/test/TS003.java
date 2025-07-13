package test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import main.RomanNumerals;

class TS003 {

	// TC01: Input = "I", Expected result = 1
		@Test
		void TC01() {
			RomanNumerals romanNum = new RomanNumerals();
			int result = romanNum.convertRomanNumToInt("I");
			assertEquals(1, result);
		}

		// TC02: Input = "", Expected result =
		@Test
		void TC02() {
			RomanNumerals romanNum = new RomanNumerals();
			int result = romanNum.convertRomanNumToInt("");
			assertEquals(, result);
		}

		// TC03: Input = "I", Expected result =
		@Test
		void TC03() {
			RomanNumerals romanNum = new RomanNumerals();
			int result = romanNum.convertRomanNumToInt("");
			assertEquals(, result);
		}

		// TC04: Input = "I", Expected result =
		@Test
		void TC04() {
			RomanNumerals romanNum = new RomanNumerals();
			int result = romanNum.convertRomanNumToInt("");
			assertEquals(, result);
		}

		// TC05: Input = "I", Expected result =
		@Test
		void TC05() {
			RomanNumerals romanNum = new RomanNumerals();
			int result = romanNum.convertRomanNumToInt("");
			assertEquals(, result);
		}

}
