/*
* Calculator Program
* Name: Riyaan Chatterjee
* PRN: 23070126507
* Batch: SY AIML B3
*/

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Calculator calculator = new Calculator();
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("\nMenu:");
            System.out.println("1. Addition");
            System.out.println("2. Subtraction");
            System.out.println("3. Multiplication");
            System.out.println("4. Division");
            System.out.println("5. Exit");

            System.out.print("Enter your choice (1-5): ");
            int choice = scanner.nextInt();

            try {
                switch (choice) {
                    case 1:
                        calculator.add();
                        break;
                    case 2:
                        calculator.subtract();
                        break;
                    case 3:
                        calculator.multiply();
                        break;
                    case 4:
                        calculator.divide();
                        break;
                    case 5:
                        System.out.println("Exiting the program. Goodbye!");
                        System.exit(0);
                    default:
                        System.out.println("Invalid choice. Please enter a number between 1 and 5.");
                }
            } catch (ArithmeticException e) {
                System.out.println("Error: " + e.getMessage());
            }
        }
    }
}
