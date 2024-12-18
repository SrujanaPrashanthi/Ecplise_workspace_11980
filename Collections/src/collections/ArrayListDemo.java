//insertion order is happening here in list
//duplicate elements are allowed in list

package collections;

import java.util.ArrayList;//when we create array list we need to have this package it comes automatically7

/*
 * Array list:
 * ----maintain insertion order
 * duplicates are allowed 
 */



public class ArrayListDemo {

	public static void main(String[] args) {
		ArrayList al = new ArrayList();
		System.out.println(al.size());
		al.add(100);
		al.add(200);
		
		System.out.println(al.size());
		System.out.println(al);//when you reference variable directly it is showed in square brackets

		al.add("Java");
		al.add("Python");
		
		System.out.println(al.size());
		System.out.println(al);
	// when we are adding elements the size will increase 
		
		al.add(2,"Angular");
		System.out.println(al.size());
		System.out.println(al);
		
		//set method for update operation
		al.set(0, 1000);//updating
		System.out.println(al.size());
		System.out.println(al);
		
		//remove method is used to removed and decrease the size
		al.remove(0);
		System.out.println(al.size());
		System.out.println(al);
		
		System.out.println(al.get(0));
		System.out.println(al.get(3));
		System.out.println(al.get(al.size()-1));//this expression will give last element
		// if we don't give this indexboundexception error comes 
	
		al.clear();//remove all elements
		System.out.println(al.size());
		System.out.println(al);
	
	
	}
	

}
