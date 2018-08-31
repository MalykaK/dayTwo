package com.capgemini.day2.tests;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import com.day2.junit.changeDateFormat;

class DateTest {

	@Test
	void testdateFormatChange() {
		//fail("Not yet implemented");
		assertEquals("18/aug/1996",changeDateFormat.dateFormatChange("18,08,1996"));
	}

}