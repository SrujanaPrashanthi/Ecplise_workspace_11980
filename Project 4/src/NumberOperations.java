
import java.util.Scanner;

public class NumberOperations {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int number = scanner.nextInt(); // Input the number
        int originalNumber = number;   // Store the original number for reuse

        int sum = 0;                   // To store the sum of digits
        int reverse = 0;               // To store the reversed number
        int count = 0;                 // To store the count of digits

        while (number > 0) {
            int digit = number % 10;   // Extract the last digit
            sum += digit;              // Add it to the sum
            reverse = reverse * 10 + digit; // Build the reversed number
            count++;                   // Increment the digit count
            number /= 10;              // Remove the last digit
        }

        // Output the results
        System.out.println("Sum: " + sum);
        System.out.println("Reverse: " + reverse);
        System.out.println("Count: " + count);

        scanner.close();
    }
}
