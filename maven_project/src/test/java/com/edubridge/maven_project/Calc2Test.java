package com.edubridge.maven_project;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class Calc2Test {
	@Test
	public void testFindSum() {
		Calc2 c = new Calc2();
		int actual = c.findSum(10,20);	
		int expected = 30;
		
	Assertions.assertEquals(expected, actual);
	
	}
	@Test
	public void testFindSub() {
		Calc2 c = new Calc2();
		int actual = c.findSub(10,5);	
		int expected = 5;
		
	Assertions.assertEquals(expected, actual);
	
	}
	@Test
	public void testFindMul() {
		Calc2 c = new Calc2();
		int actual = c.findMul(10,5);	
		int expected = 50;
		
	Assertions.assertEquals(expected, actual);
	
	}
	@Test
	public void testFindDiv() {
		Calc2 c = new Calc2();
		int actual = c.findDiv(10 , 5);	
		int expected = 2;
		
	Assertions.assertEquals(expected, actual);
	
	}
}
