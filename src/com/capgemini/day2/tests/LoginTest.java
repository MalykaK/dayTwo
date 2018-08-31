package com.capgemini.day2.tests;

import static org.junit.jupiter.api.Assertions.*;

import com.day2.junit.LoginCheck;

class LoginTest {
	void testLogin() {
		assertEquals("Welcome", LoginCheck.checkLoginDetails("Malyka", "9807abc"));
		assertEquals("Invalid Credentials, Contact the Admin", LoginCheck.checkLoginDetails("Malyka", "9807abc"));
		
//		fail("Not yet implemented");
	}

}
