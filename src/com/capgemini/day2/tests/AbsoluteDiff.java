package com.capgemini.day2.tests;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import com.day2.junit.AbsoluteDifference;


class AbsoluteDiff {

	@Test
	void testDifference() {
		assertEquals(1,AbsoluteDifference.findAbsoluteDifference(8,new int[]{1,2,3,4,5,4,3,2},5));
//		fail("Not yet implemented");
	}

}
