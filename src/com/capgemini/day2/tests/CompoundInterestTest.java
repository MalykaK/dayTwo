package com.capgemini.day2.tests;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import com.day2.junit.findCompoundInterest;

class CompoundInterestTest {

	@Test
	void testcompoundInterest() {
		assertEquals(10201, findCompoundInterest.compoundInterest(10000,1,2));
//		fail("Not yet implemented");
	}

}