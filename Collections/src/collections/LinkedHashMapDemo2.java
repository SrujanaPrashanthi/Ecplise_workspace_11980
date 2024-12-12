package collections;

//import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

/*
 * Linkedhashmap:
 * 1.to store key and value pair
 * 2.insertion order maintained based on the keys
 * 3. values can be duplicated but key can't be duplicated
 * 4.null can be used as key and value
 */

public class LinkedHashMapDemo2 {

	public static void main(String[] args) {
		LinkedHashMap<String,Integer> hm = new LinkedHashMap<>();
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
