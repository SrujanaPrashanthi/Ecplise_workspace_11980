package com.edubridge.maven_project;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class AuthServiceTest {
	private static AuthService auth;
	
	@BeforeAll  
	public static void setUp() {
		auth = new AuthService();
	}
	@Disabled
	@Test
	@DisplayName("check with vaild data")
	public void testAuthenticteWithValidData() {
		boolean actual = auth.authenticate("admin", "admin123");
		assertTrue(actual);
	}
	@Test
	@DisplayName("check with invaild data")
	public void testAuthenticteWithValidData1() {
		boolean actual = auth.authenticate("admin", "admin");
		assertFalse(actual);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
