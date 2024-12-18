package collections;

import java.util.Comparator;
//import java.util.LinkedHashSet;
import java.util.TreeSet;

public class TreeSetDemo {
/*
 * maintained ordered sequence of elements
 * duplicates are not allowed.
 */

	public static void main(String[] args) {
		//TreeSet<Integer> ts = new TreeSet<>();
		//to get the values in reverse order]
		TreeSet<Integer> ts = new TreeSet<>(Comparator.reverseOrder());
		ts.add(100);
		ts.add(300);
		ts.add(400);
		ts.add(200);
		ts.add(500);
		
		System.out.println(ts);
		
		ts.add(100);
		ts.add(200);
		
		System.out.println(ts);
		
		TreeSet<String> ts1 = new TreeSet<>(Comparator.reverseOrder());

		//TreeSet<String> ts1 = new TreeSet<>();
		ts1.add("Java");
		ts1.add("Python");
		ts1.add("React");
		ts1.add("Angular");
		
		System.out.println(ts1);
		//for traversal we use for each loop
		for(String course : ts1) {//to get all the data in sequence manner
			System.out.println(course);
		}
		
		for(Integer price : ts) {
			System.out.println(price);
		}
		
	}

}
