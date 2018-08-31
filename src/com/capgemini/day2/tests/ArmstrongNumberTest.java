package com.capgemini.day2.tests;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import com.day2.junit.ArmstrongNumber;

class ArmstrongNumberTest {

	@Test
	void test() {
		//fail("Not yet implemented");
		assertEquals(true,ArmstrongNumber.checkArmstrongNumber(153));
		assertEquals(false,ArmstrongNumber.checkArmstrongNumber(125));
		assertEquals(true,ArmstrongNumber.checkArmstrongNumber(371));
		assertEquals(false,ArmstrongNumber.checkArmstrongNumber(0456));
		assertEquals(false,ArmstrongNumber.checkArmstrongNumber(0X153));
		assertEquals(false,ArmstrongNumber.checkArmstrongNumber('m'));
		
}
}