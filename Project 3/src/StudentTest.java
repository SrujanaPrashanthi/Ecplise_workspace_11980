
public class StudentTest {

	public static void main(String[] args) {
		
	//to access instance variables from class to outside the class we need object creation or instatation
		Student2 s1 =  new Student2(1001, "wills", 6.5);
		s1.displayStudentDetails();
		
		System.out.println("---------------");
		
		Student2 s2 =  new Student2(1002, "smith", 9.5);
		s2.displayStudentDetails();
		//local varaiables- taken inside the method
		//outside the variable are global variables like static, instance
		

	}
	//doctor and patient 

}
