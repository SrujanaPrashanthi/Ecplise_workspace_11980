package java8features;
//maximum salary program
import java.util.Arrays;
import java.util.List;

public class AggregateFunctionDemo {

	public static void main(String[] args) {
		List<Integer> salaries = Arrays.asList(40000,50000,60000,70000,80000,90000);
		System.out.println(salaries);
		
		/*(int totalSalary =  salaries.stream()
				.mapToInt((salary) -> salary)
				.sum();
		System.out.println(totalSalary);*/
		
		int max  =  salaries.stream()//stream source 
				.mapToInt((salary) -> salary)//intermediate operations
				.max()//terminal operation
				.getAsInt();
		
		System.out.println(max);
		
		int min  =  salaries.stream()
				.mapToInt((salary) -> salary)
				.min()
				.getAsInt();
		
		System.out.println(min);
		
		double avg = salaries.stream()
				.mapToDouble((salary) -> salary)
				.average()
				.getAsDouble();
		System.out.println(avg);
		
		


	}

}
