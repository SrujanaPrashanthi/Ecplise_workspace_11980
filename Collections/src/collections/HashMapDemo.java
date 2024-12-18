package collections;

import java.util.HashMap;
import java.util.Map;

/*
 * hashmap:
 * 1.to store key and value pair
 * 2.stored based hash code of key
 * 3. values can be duplicated but key can't be duplicated
 * 4.null can be used as key and value 
 */

public class HashMapDemo {

	public static void main(String[] args) {
		HashMap<String,Integer> hm = new HashMap<>();
		hm.put("java", 400);
		hm.put("PFS", 400);
		hm.put("MEAN", 250);
		hm.put("MERN", 250);
		System.out.println(hm);
		
		hm.put("java", 500);
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
