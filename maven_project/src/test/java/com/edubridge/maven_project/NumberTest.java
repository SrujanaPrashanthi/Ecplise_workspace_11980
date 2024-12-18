package com.edubridge.maven_project;
import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import com.edubridge.maven_project.Number;

public class NumberTest {
	private Number n = null;
	
@BeforeEach
	
	public void setUp() {
		n = new Number();
		System.out.println("BeforeEach");
	}
	@AfterEach
	public void tearUp() {
		n = null;
		System.out.println("AfterEach");
	}
	
	@Test
	void testGetSumOfDigits() {
		Number n = new Number();
		int actual = n.getSumOfDigits(123);
		int expected = 6;
		assertEquals(expected, actual);
		if(expected == 6) {
			System.out.println(expected);
		}else {
			System.out.println("wrong input");
		}
    }

    @Test
    void testGetReversedNumber() {
    	Number n = new Number();
		int actual = n.getReversedNumber(123);
		int expected = 321;
		assertEquals(expected, actual);
		if(expected == 321) {
			System.out.println(expected);
		}else {
			System.out.println("wrong input");
		}
        
    }

    @Test
    void testGetDigitCount() {
    	Number n = new Number();
		int actual = n.getDigitCount(12345);
		int expected = 5;
		assertEquals(expected, actual);
		if(expected == 5) {
			System.out.println(expected);
		}else {
			System.out.println("wrong input");
		}
       
    }
    
    
}

