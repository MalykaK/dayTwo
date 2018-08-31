package com.capgemini.day2.tests;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import com.day2.junit.Reversestr;

class ReversestrTest {

	@Test
	void testReverseString() 
	{
		assertEquals("akylam",Reversestr.findReverse("malyka"));
	}
}
