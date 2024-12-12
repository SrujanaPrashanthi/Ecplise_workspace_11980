import java.util.Scanner;
public class Employee {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		System.out.println("Please enter the employee id:");
		int employeeid = in.nextInt();
		
		System.out.println("please enter the employee name:");
		String employeeName = in.next();
		
		System.out.println("please enter the employee salary:");
		double employeesalary = in.nextDouble();
		
		System.out.println("Employee Id:" +employeeid);
		System.out.println("Employee Name:"+employeeName);
		System.out.println("Employee salary:" +employeesalary);
		
	}

}
