package com.pack2;

import com.pack1.Calc;

public class CalcTest2 extends Calc{
		
	public static void main(String[] args) {
		CalcTest2 t = new CalcTest2();
		System.out.println(t.x);
		System.out.println(t.z);
		System.out.println(t.i);
		t.findSquare(10);
		t.findSum(70);
		t.findProduct(10,30);

	}
}
