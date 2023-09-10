package day03scannerclass;

import java.util.Scanner;

public class ScannerClass03 {
    public static void main(String[] args) {
        // Initialize Scanner for user input
        Scanner input = new Scanner(System.in);

        // Prompt user for various details
        System.out.println("Please enter your full name:");
        String fullName = input.nextLine();

        System.out.println("Please enter your age:");
        int age = input.nextInt();

        // Clear the input buffer
        input.nextLine();

        System.out.println("Please enter your height:");
        double height = input.nextDouble();

        // Clear the input buffer
        input.nextLine();

        System.out.println("Are you married? (true/false):");
        boolean maritalStatus = input.nextBoolean();

        // Display the user inputs
        System.out.println("Full Name: " + fullName);
        System.out.println("Age: " + age);
        System.out.println("Height: " + height);
        System.out.println("Marital Status: " + (maritalStatus ? "Married" : "Single"));

        // Close the scanner
        input.close();
    }
}
