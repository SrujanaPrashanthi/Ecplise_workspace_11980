package java8features;

import java.util.Arrays;
import java.util.List;
import java.util.function.BinaryOperator;

public class ReduceMethod {

	public static void main(String[] args) {
		List<Integer> salaries = Arrays.asList(40000,50000,60000,70000,80000,90000);
		System.out.println(salaries);
		
		BinaryOperator<Integer>bioper = (sal1,sal2) ->sal1+sal2;
		
		int total = salaries.stream()
				.reduce(bioper)
				.get();
		System.out.println(total);
		
		int sum  = salaries.stream()
							.reduce((sal1 ,sal2 ) -> sal1+ sal2)
							.get(); 
		int totalSalary =  salaries.stream()
									.mapToInt((salary) -> salary)
									.sum();
		System.out.println(totalSalary);
 
	}

}
