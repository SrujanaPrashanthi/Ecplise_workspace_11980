package collections;

import java.util.ArrayList;

public class ArrayDemo3 {

	public static void main(String[] args) {
		ArrayList<String> CourseName = new ArrayList<String>();
		CourseName.add("Java");
		CourseName.add("Python");
		CourseName.add("Angular");
		CourseName.add("ReactJS");
		CourseName.add("JS");
		
		System.out.println(CourseName);
		
		String s1 = CourseName.get(0);
		System.out.println(s1);
	}

	}


