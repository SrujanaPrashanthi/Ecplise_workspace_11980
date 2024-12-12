package com.pack1;

public class Calc {
	//default scope - can be accessed upto package
	public int x = 100;
	
	//private scope -  only within class we can access not outside 
	private int y = 90;
	
	public int z = 40;
	
	protected int i = 111;
	
	//default scope
	 public void findSquare(int num) {
		System.out.println(num*num);
	}
	public void findSum(int num) {
		System.out.println(num+num);
	}
	
	protected void findProduct(int num1, int num2) {
		System.out.println(num1*num2);
	}
	
	/*private findCube(int num) {
		System.out.println(num*num*num);// we can't access it and we get error
	}*/

}
