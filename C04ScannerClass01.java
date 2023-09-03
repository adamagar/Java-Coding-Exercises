package day02_datatypes;

import java.util.Scanner;

// Demonstrates basic usage of Java's Scanner Class
public class C04ScannerClass01 {

    public static void main(String[] args) {

        // Using Scanner class to get user input

        // Step 1: Create a Scanner object to read input
        Scanner input = new Scanner(System.in);

        // Step 2: Prompt the user for an input
        System.out.println("Please enter your age:");

        // Step 3: Read the input from the user
        int userAge = input.nextInt();

        // Display the entered age
        System.out.println("You entered the age: " + userAge);

        // Close the scanner to prevent resource leak
        input.close();
    }
}
