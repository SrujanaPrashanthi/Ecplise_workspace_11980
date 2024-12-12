
import java.util.Scanner;//package

public class StudentSsc {
	public static void main(String[] args) {//it is a method
         Scanner in = new Scanner(System.in);//the Scanner class in Java is the easiest way to read input in a Java program,standard input stream	
		
		System.out.println("please enter the student name:");//println are method name
		String studentName = in.nextLine();
		
		System.out.println("please enter the Father Name:");
		String fathersname = in.nextLine();
		
		
		System.out.println("please enter the Mother Name:");
        String mothersname = in.nextLine();
		
        
        System.out.println("please enter the Roll Number:");
		long rollnumber = in.nextLong();
		
		
		System.out.println("please enter the Date Of Birth:");
		String dateofbirth = in.next();
		
		
		System.out.println("please enter the School Name:");
		String schoolname = in.next();
		
		in.nextLine(); // Consume newline
		
		System.out.println("Please enter the Medium:");
		String medium = in.nextLine();

        System.out.println("Enter the number of subjects:");
        int numSubjects = in.nextInt();
        
        String[] subjectNames = new String[numSubjects];
        int[] marks = new int[numSubjects];// an array created to store the marks for each subject
        int totalGradePoints = 0;
        
        
        for (int i = 0; i < numSubjects; i++) {//Prompts the user to input marks for each subject and stores them in the marks array
            System.out.println("Enter the name of Subject " + (i + 1) + ":");
            subjectNames[i] = in.nextLine(); // Read subject name
            in.nextLine(); // Consume newline
            System.out.println("Enter marks for " + subjectNames[i] + ":");
            marks[i] = in.nextInt();
            
            totalGradePoints += calculateGradePoint(marks[i]); // Sum grade points
            in.nextLine(); // Consume newline

        }
        
        double cgpa = totalGradePoints / numSubjects;//Computes the CGPA by dividing the total grade points by the number of subjects.
     
		System.out.println("student name:" +studentName);
		System.out.println("Father Name:" +fathersname);
		System.out.println("Mother Name:"  +mothersname);
		System.out.println("Roll Number:"  +rollnumber);
		System.out.println("Date Of Birth:" +dateofbirth);
		System.out.println("School Name:" +schoolname);
		System.out.println("Medium:" +medium);
		
	
		System.out.println("\nSubject-wise Grades:");
			for (int i = 0; i < numSubjects; i++) {
			int gradePoint = calculateGradePoint(marks[i]);
			System.out.println(subjectNames[i] + ": Marks = " + marks[i] + ", Grade Point = " + gradePoint);
    }

			System.out.printf("\nOverall CGPA: %.2f\n", cgpa);// Prints the overall CGPA formatted to 2 decimal places.

			in.close();

	}
// Method to calculate Grade Point
		public static int calculateGradePoint(int marks) {
			if (marks >= 91) {
				return 10;
			}
			else if (marks >= 81) {
				return 9;
			}
			else if (marks >= 71) {
				return 8;
			}
			else if (marks >= 61) {
				return 7;
			}
			else if (marks >= 51) {
				return 6;
			}
			else if (marks >= 41) {
				return 5;
			}
			else if (marks >= 33) {
				return 4;
			}
			else return 0; // Fail
  }
}
