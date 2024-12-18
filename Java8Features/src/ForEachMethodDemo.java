

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

public class ForEachMethodDemo {

	public static void main(String[] args) {
		List<Integer> list = Arrays.asList(44,55,66,77,88,99);
		
		System.out.println("using for each loop");
		for(int x : list) {
			System.out.println(x);
		}
		
		System.out.println("Uisng forEach() method with lambda expression from java8v");
		Consumer<Integer> consumer = (element) -> System.out.println(element);
		list.forEach(consumer);
		
		System.out.println("Uisng forEach() method with method expression from java8v");
		Consumer<Integer> consumer2 = System.out ::println;
		list.forEach(consumer2);
		
		System.out.println("Uisng forEach() method with lambda expression from java8v");
		list.forEach((element) -> System.out.println(element));
		//list.forEach(consumer2);
		
		System.out.println("Uisng forEach() method with method expression from java8v");
		list.forEach(System.out :: println);
		

		
		
	}

}
