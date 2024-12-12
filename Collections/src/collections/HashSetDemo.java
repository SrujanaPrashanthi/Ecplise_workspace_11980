package collections;

import java.util.HashSet;// duplicates will not allow
/*
 * HashSet 
 * 1.insertion order won't be maintained
 * elements are added based on hashcode of object
 * duplicates are not allowed 
 */
public class HashSetDemo {

	public static void main(String[] args) {
		HashSet<Integer> hs = new HashSet<>();
		hs.add(100);
		hs.add(300);
		hs.add(400);
		hs.add(200);
		hs.add(500);
		
		System.out.println(hs);
		
		hs.add(100);
		hs.add(200);
		System.out.println(hs);
		
//these are not stored in the index we don't have set or get methods


	}

}
