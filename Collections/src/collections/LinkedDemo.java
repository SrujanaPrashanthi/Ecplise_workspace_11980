package collections;

//import java.util.ArrayList;
import java.util.LinkedList;//frequent operations  

public class LinkedDemo {

	public static void main(String[] args) {
		LinkedList ll = new LinkedList();
		ll.add(100);
		ll.add(200);
		ll.add("Java");
		ll.add("Python");
		ll.add(45000.0);
		ll.add(35000.0);
		System.out.println(ll);
		
		LinkedList<String> CourseName = new LinkedList<String>();
		CourseName.add("Java");
		CourseName.add("Python");
		CourseName.add("Angular");
		CourseName.add("ReactJS");
		CourseName.add("JS");
		
	
		System.out.println(CourseName);
		
		
		CourseName.remove(0);
		System.out.println(CourseName);
		
		String s1 = CourseName.get(0);
		System.out.println(s1);

	}

}
