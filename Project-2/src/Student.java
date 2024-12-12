import java.util.Scanner; // package

public class Student {
	public static String Grades(int marks) {
		String Grade = null;
		if(marks >=91 && marks <= 100 ) {
			//grade = "A1";
		}
		return Grade;
	}
	
    public static void main(String[] args) { // it is a method
        Scanner in = new Scanner(System.in); // the Scanner class in Java is the easiest way to read input in a Java program, standard input stream
        
        System.out.println("Please enter the student name:"); // println are method names
        String studentName = in.nextLine();
        
        System.out.println("Please enter the Father Name:");
        String fathersName = in.nextLine();
        
        System.out.println("Please enter the Mother Name:");
        String mothersName = in.nextLine();
        
        System.out.println("Please enter the Roll Number:");
        long rollNumber = in.nextLong();
        
        System.out.println("Please enter the Date Of Birth:");
        String dateOfBirth = in.next();
        
        System.out.println("Please enter the School Name:");
        String schoolName = in.next();
        
        in.nextLine(); // Consume newline
        
        System.out.println("Please enter the Medium:");
        String medium = in.nextLine();
        
        System.out.println("Please enter Telugu Marks");
        int telugumarks = in.nextInt();
        
        System.out.println("Please enter English Marks");
        int englishmarks = in.nextInt();
        
        System.out.println("Please enter Maths marks");
        int mathsmarks = in.nextInt();
        
        System.out.println("Please enter Science marks");
        int sciencemarks = in.nextInt();
        
        System.out.println("Please enter Social marks");
        int socialmarks = in.nextInt();
        
        System.out.println("Please enter Hindi marks");
        int hindimarks = in.nextInt();
        
        
       
      /*  System.out.println("Enter the name of Subject 1:");
        String subject1Name = in.nextLine();
        System.out.println("Enter marks for " + subject1Name + ":");
        int marks1 = in.nextInt();
        int gradePoint1 = calculateGradePoint(marks1);
        
        in.nextLine(); // Consume newline
        
        System.out.println("Enter the name of Subject 2:");
        String subject2Name = in.nextLine();
        System.out.println("Enter marks for " + subject2Name + ":");
        int marks2 = in.nextInt();
        int gradePoint2 = calculateGradePoint(marks2);
        
        in.nextLine(); // Consume newline
        
        System.out.println("Enter the name of Subject 3:");
        String subject3Name = in.nextLine();
        System.out.println("Enter marks for " + subject3Name + ":");
        int marks3 = in.nextInt();
        int gradePoint3 = calculateGradePoint(marks3);
        
       in.nextLine(); // Consume newline
        
        System.out.println("Enter the name of Subject 4:");
        String subject4Name = in.nextLine();
        System.out.println("Enter marks for " + subject4Name + ":");
        int marks4 = in.nextInt();
        int gradePoint4 = calculateGradePoint(marks4);
        
        in.nextLine(); // Consume newline
        
        System.out.println("Enter the name of Subject 5:");
        String subject5Name = in.nextLine();
        System.out.println("Enter marks for " + subject5Name + ":");
        int marks5 = in.nextInt();
        int gradePoint5 = calculateGradePoint(marks5);
        
        in.nextLine(); // Consume newline
        
        System.out.println("Enter the name of Subject 6:");
        String subject6Name = in.nextLine();
        System.out.println("Enter marks for " + subject6Name + ":");
        int marks6 = in.nextInt();
        int gradePoint6 = calculateGradePoint(marks6);
        
        
        // Calculating CGPA
        double cgpa = (gradePoint1 + gradePoint2 + gradePoint3+gradePoint4+gradePoint5+gradePoint6) / 6.0;*/
        
        // Output the details
        System.out.println("Student Name: " + studentName);
        System.out.println("Father Name: " + fathersName);
        System.out.println("Mother Name: " + mothersName);
        System.out.println("Roll Number: " + rollNumber);
        System.out.println("Date Of Birth: " + dateOfBirth);
        System.out.println("School Name: " + schoolName);
        System.out.println("Medium: " + medium);
        System.out.println("Telugu Marks :" + telugumarks);
        System.out.println("English Marks :" + englishmarks);
        System.out.println("Maths Marks :" + mathsmarks);
        System.out.println("Science Marks :" + sciencemarks);
        System.out.println("Social Marks :" + socialmarks);
        System.out.println("Hindi Marks :" + hindimarks);
        
        
        /*System.out.println("\nSubject-wise Grades:");
        System.out.println("subject1Name: Marks = " + marks1 + ", Grade Point = " + gradePoint1);
        System.out.println("subject2Name: Marks = " + marks2 + ", Grade Point = " + gradePoint2);
        System.out.println("subject3Name: Marks = " + marks3 + ", Grade Point = " + gradePoint3);
        System.out.println("subject4Name: Marks = " + marks4 + ", Grade Point = " + gradePoint4);
        System.out.println("subject5Name: Marks = " + marks5 + ", Grade Point = " + gradePoint5);
        System.out.println("subject6Name: Marks = " + marks6 + ", Grade Point = " + gradePoint6);
        
        System.out.printf("\nOverall CGPA: %.2f\n", cgpa);
        
        in.close();*/
    }

    // Method to calculate Grade Point
   public static int calculateGradePoint(int marks) {
        if (marks >= 91) {
            return 10;
        } else if (marks >= 81) {
            return 9;
        } else if (marks >= 71) {
            return 8;
        } else if (marks >= 61) {
            return 7;
        } else if (marks >= 51) {
            return 6;
        } else if (marks >= 41) {
            return 5;
        } else if (marks >= 33) {
            return 4;
        } else {
            return 0; // Fail
        }
    }
}



     