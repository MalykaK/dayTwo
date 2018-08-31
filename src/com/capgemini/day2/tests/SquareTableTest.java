package com.capgemini.day2.tests;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import com.day2.junit.SquareTable;

class SquareTableTest {

	@Test
	void test() {
		//fail("Not yet implemented");
		assertEquals(25,SquareTable.checkSqrtbl(5));
		assertEquals(25,SquareTable.checkSqrtbl(-5));
		assertEquals(0,SquareTable.checkSqrtbl(0));
		assertEquals(0.25,SquareTable.checkSqrtbl(0.5));
		
	}

}
