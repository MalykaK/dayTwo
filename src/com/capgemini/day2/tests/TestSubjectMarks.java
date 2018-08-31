package com.capgemini.day2.tests;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import com.day2.junit.SubjectMarks;

class TestSubjectMarks {

	@Test
	void test() {
		//fail("Not yet implemented");
		assertEquals("Passed",SubjectMarks.findGrade(96,62,87));
		assertEquals("Promoted",SubjectMarks.findGrade(45,95,86));
		assertEquals("Fail",SubjectMarks.findGrade(40,35,36));
		
	}

}
