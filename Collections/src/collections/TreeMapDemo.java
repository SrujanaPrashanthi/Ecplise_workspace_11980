package collections;

//import java.util.HashMap;
//import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;

/*
 * treemap:
 * 1.to store key and value pair
 * 2.keys and values are represented in alphabetical order
 * 3. values can be duplicated but key can't be duplicated
 * 4.null key is not allowed we get error nullpointer exception
 * 5.null value is allowed.
 */

public class TreeMapDemo {

	public static void main(String[] args) {
		TreeMap<String,Integer> hm = new TreeMap<>();
		hm.put("Java", 400);
		hm.put("PFS", 400);
		hm.put("MEAN", 250);
		hm.put("MERN", 250);
		System.out.println(hm);
		
		hm.put("Java", 500);
		System.out.println(hm);
		
		hm.put(null, 500);
		System.out.println(hm);
		
		hm.put("Angular", null);
		System.out.println(hm);
		
		System.out.println(hm.keySet());//keyset return only keys
		System.out.println(hm.values());// returns only values
		System.out.println(hm.entrySet());
		
		for(Map.Entry<String, Integer>entry: hm.entrySet()) {
			System.out.println(entry);//enters the set 
		}
	}

}
