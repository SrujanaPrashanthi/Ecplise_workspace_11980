package myproject;

public class EmployeeTest {

	public static void main(String[] args) {
		Employee e1 = new Employee();
		
		Employee e2 = new Employee(1,"will",5500,"wills@gmail.com");
		e2.setEmployeeId(101);
		e2.setEmployeeName("sweety");
		e2.setEmployeeSalary(4500);;
		e2.setEmployeeEmail("sweety2001@gmail.com");
		
		System.out.println(e2.getEmployeeId());
		System.out.println(e2.getEmployeeName());
		System.out.println(e2.getEmployeeSalary());
		System.out.println(e2.getEmployeeEmail());
	}

}
