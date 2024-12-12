//we define user defined class to store one entity of objects.these are called instance variables
public class Student2 {
	//instance variables, for each variable it assign memory allocation
	int studentId ;
	String studentName ;
	double studentGPA ;
	
	static String batchCode ="2024 - 12980";//static variable one memory allocation 
	//constructor: to get the value dynamically and used for initilize the instance variables, to access instance variables from class to outside the class we need object creation or instatation
	public Student2() {
		
		System.out.println("constructor");
		
	}
	 public Student2(int studentId, String studentName, double studentGPA) {
		 System.out.println("parameterized constructor");
		this.studentId = studentId;// when the constructor argument and instance variable are same the we use this keyword
		this.studentName = studentName;
		this.studentGPA = studentGPA;
	}
	
	
// the method which doesn't have any static keyword is instance method
	//we can access directly in instance
	public void displayStudentDetails() {

		System.out.println("ID:"+studentId);
		System.out.println("Name:"+studentName);
		System.out.println("GPA:"+studentGPA);
		System.out.println("BatchCode:" +batchCode);
		
		

	}

}
