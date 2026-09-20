import java.util.Scanner; // Import the Scanner utility to read user input

public class Calculator {
    public static void main(String[] args) {
        // Initialize the Scanner object to listen to standard system input
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter the first number: ");
        double num1 = scanner.nextDouble();
        
        System.out.print("Enter the second number: ");
        double num2 = scanner.nextDouble();
        
        // Perform calculation
        double sum = num1 + num2;
        
        // Print out the results using concatenation
        System.out.println("The total sum is: " + sum);
        
        // Close the scanner resource to avoid memory leaks
        scanner.close();
    }
}
