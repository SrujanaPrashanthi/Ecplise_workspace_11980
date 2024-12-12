import java.util.Scanner;

public class Pattern {

    // Method to print the star pattern
    public static void printPattern(int n) {
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print("* ");
            }
            System.out.println(); // Move to the next line after each row
        }
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        
        
        System.out.println("Enter a number: ");
        int input = in.nextInt();
        
        
        printPattern(input);
        
        in.close();
    }
}
