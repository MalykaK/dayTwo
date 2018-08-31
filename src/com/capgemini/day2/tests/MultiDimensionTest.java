package com.capgemini.day2.tests;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import com.day2.junit.MultiDimension;

class MultiDimensionTest {

	@Test
	void test() {
		assertEquals("found",MultiDimension.searchElement(new int[][] {{1,2},{3,4}}));
	}

}