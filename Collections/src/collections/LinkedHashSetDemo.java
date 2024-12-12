package collections;

//import java.util.HashSet;
import java.util.LinkedHashSet;// duplicates will not allow
/*
 * HashSet 
 * 1.insertion order maintained
 * elements are added based on hashcode of object
 * duplicates are not allowed 
 */
public class LinkedHashSetDemo {

	public static void main(String[] args) {
		LinkedHashSet<Integer> hs = new LinkedHashSet<>();
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