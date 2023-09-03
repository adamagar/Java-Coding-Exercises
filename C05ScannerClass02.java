package day02_datatypes;

import java.util.Scanner;

// Demonstrates the use of nextLine() method in Scanner class for string inputs
public class C05ScannerClass02 {

    public static void main(String[] args) {

        // Create a Scanner object for user input
        Scanner test = new Scanner(System.in);

        // Prompt user to enter their name
        System.out.println("Please enter your name:");

        // Use nextLine() method to capture the full name
        // Note: nextLine() captures the entire line, while next() captures only the first word
        String userName = test.nextLine();

        // Display the captured name
        System.out.println("The entered name is: " + userName);

        // Close the scanner to prevent resource leaks
        test.close();
    }
}
