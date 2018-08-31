package com.capgemini.day2.tests;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import com.day2.junit.IncomeTax;

class IncomeTaxTest {

	@Test
	void testCheckIncomeTax() {
		//fail("Not yet implemented");
		assertEquals(0,IncomeTax.checkIncomeTax(100000));
		assertEquals(20000,IncomeTax.checkIncomeTax(200000));
		assertEquals(80000,IncomeTax.checkIncomeTax(400000));
		assertEquals(180000,IncomeTax.checkIncomeTax(600000));
		
	}

}
