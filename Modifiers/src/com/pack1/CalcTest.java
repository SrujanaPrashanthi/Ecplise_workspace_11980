package com.pack1;

//if we have same package name they we don't need import statement.
//we can directly access the class

public class CalcTest {

	public static void main(String[] args) {
		Calc c = new Calc();
		System.out.println(c.x);
		System.out.println(c.z);
		System.out.println(c.i);
		
		c.findSquare(10);
		c.findSum(70);
		c.findProduct(10, 30);

	}

}
