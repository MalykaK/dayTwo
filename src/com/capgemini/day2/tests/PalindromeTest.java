package com.capgemini.day2.tests;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import com.day2.junit.Palindrome;


class PalindromeTest {

	@Test
	void testPalindrome() {
		assertEquals(true,Palindrome.checkPalindrome(12321));

	}

}
