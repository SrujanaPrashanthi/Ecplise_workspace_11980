package com.edubridge.maven_project;

public class Number {
	 public static int getSumOfDigits(int number) {
	        int sum = 0;
	        while (number != 0) {
	            sum += Math.abs(number % 10);
	            number /= 10;
	        }
	        return sum;
	    }
	 public static int getReversedNumber(int number) {
	        int reverse = 0;
	        while (number != 0) {
	            int digit = number % 10;
	            reverse = reverse * 10 + digit;
	            number /= 10;
	        }
	        return reverse;
	    }

	    // Method to count the number of digits
	    public static int getDigitCount(int number) {
	        if (number == 0) return 1;
	        int count = 0;
	        while (number != 0) {
	            number /= 10;
	            count++;
	        }
	        return count;
	    }
	
}
