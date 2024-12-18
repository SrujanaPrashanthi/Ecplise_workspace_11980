package collections;

import java.util.ArrayList;

public class ArrayListDemo2 {

	public static void main(String[] args) {
		//normal array list 
		ArrayList al = new ArrayList();
		al.add(100);
		al.add(200);
		al.add("Java");
		al.add("Python");
		al.add(45000.0);
		al.add(35000.0);
		System.out.println(al);
		
		Object abj = al.get(0);
		int x = (int) abj;//type casting
		System.out.println(x);
		
		// when we want to only specific data type then we use this
		//Generic version arraylist
		// type  safety - avoids type casting 
		ArrayList<Integer> subjectMarks = new ArrayList<Integer>();
		subjectMarks.add(44);
		subjectMarks.add(55);
		subjectMarks.add(66);
		subjectMarks.add(77);
		subjectMarks.add(88);
		subjectMarks.add(99);
		// we can't add any data type element we get error
		System.out.println(subjectMarks);
		
		int s1 = subjectMarks.get(0);
		System.out.println(s1);// it automatically changes to that type
	}
//create an array list with a group of course names
//java, python, angular, reacctJS, JS
}
