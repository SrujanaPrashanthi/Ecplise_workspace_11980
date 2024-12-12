import java.util.Scanner;

public class Test {

	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);// this is used to get the values dynamically from the user 
		System.out.println("enter first number:");
		int num1 = in.nextInt();
		
		System.out.println("enter the second number:");
		int num2 = in.nextInt();		
		//int num1 = 300;
		//int num2 = 500;
		
		int min = (num1 < num2)? num1 : num2;//we can use it as if else condition and it is called conditional operator which has three operators
		int max = (num1 > num2)? num1 : num2;
		System.out.println("min value is" +min);
		System.out.println("max value is" +max);
	}

}
