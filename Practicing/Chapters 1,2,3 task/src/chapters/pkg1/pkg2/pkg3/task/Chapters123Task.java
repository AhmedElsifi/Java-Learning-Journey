package chapters.pkg1.pkg2.pkg3.task;

// importing the Scanner Class to our program so we can scan user input and process it :
import java.util.Scanner;

public class Chapters123Task {

    public static void main(String[] args) {
        // Create Scanner object for user input
        Scanner input = new Scanner(System.in);

        // Display welcome message
        System.out.println("Hello To Smart Calculator V1.0 , Made By Ahmed Elsifi");
        System.out.println("=====================================================");

        // Display menu options
        System.out.println("Please choose an operation:");
        System.out.println("1. Add two numbers");
        System.out.println("2. Subtract two numbers");
        System.out.println("3. Multiply two numbers");
        System.out.println("4. Divide two numbers");
        System.out.println("5. Generate a random number within a range");
        System.out.println("6. Exit");
        System.out.print("Enter your choice (1-6): ");

        // Read user's choice
        int choice = input.nextInt();

        // Process user's choice using switch statement
        switch (choice) {
            case 1: // Addition
                System.out.print("Please enter the first number: ");
                float addNum1 = input.nextFloat();
                System.out.print("Please enter the second number: ");
                float addNum2 = input.nextFloat();
                System.out.println("The sum of these two numbers = " + addNum1 + " + " + addNum2 + " = " + (addNum1 + addNum2));
                break;

            case 2: // Subtraction
                System.out.print("Please enter the first number: ");
                float subNum1 = input.nextFloat();
                System.out.print("Please enter the second number: ");
                float subNum2 = input.nextFloat();
                System.out.println("The result of subtracting these two numbers = " + subNum1 + " - " + subNum2 + " = " + (subNum1 - subNum2));
                break;

            case 3: // Multiplication
                System.out.print("Please enter the first number: ");
                float mulNum1 = input.nextFloat();
                System.out.print("Please enter the second number: ");
                float mulNum2 = input.nextFloat();
                System.out.println("The result of multiplying these two numbers = " + mulNum1 + " * " + mulNum2 + " = " + (mulNum1 * mulNum2));
                break;

            case 4: // Division
                System.out.print("Please enter the numerator: ");
                float numerator = input.nextFloat();
                System.out.print("Please enter the denominator: ");
                float denominator = input.nextFloat();

                // Check for division by zero
                if (denominator == 0) {
                    System.out.println("Error: Cannot divide by zero!");
                } else {
                    System.out.println("The result of dividing these two numbers = " + numerator + " / " + denominator + " = " + (numerator / denominator));
                }
                break;

            case 5: // Random number generation
                System.out.print("Please enter the lower bound (integer): ");
                int min = input.nextInt();
                System.out.print("Please enter the upper bound (integer): ");
                int max = input.nextInt();

                // Ensure min is less than max
                if (min > max) {
                    // Swap values if needed
                    int temp = min;
                    min = max;
                    max = temp;
                    System.out.println("Note: Swapped bounds to ensure lower < upper.");
                }

                // Generate random number within range [min, max]
                int randomNum = min + (int) (Math.random() * (max - min + 1));
                System.out.println("Your random number between " + min + " and " + max + " is: " + randomNum);
                break;

            case 6: // Exit program
                System.out.println("Thank you for using Smart Calculator V1.0! Goodbye.");
                input.close();
                return; // Exit program gracefully

            default: // Invalid choice
                System.out.println("Invalid choice. Please restart the program and select a number between 1 and 6.");
                input.close();
                return; // Exit program
        }

        // Close scanner and exit gracefully after operations
        input.close();
    }
}
