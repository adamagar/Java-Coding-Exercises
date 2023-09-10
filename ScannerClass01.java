package day03scannerclass;

import java.util.Scanner;

public class ScannerClass01 {
    public static void main(String[] args) {

        // Initialize Scanner class for user input
        Scanner input = new Scanner(System.in);

        // Prompt user to enter two numbers
        System.out.println("Enter the first number:");
        int num1 = input.nextInt();

        System.out.println("Enter the second number:");
        int num2 = input.nextInt();

        // Perform addition and display the result
        int sum = num1 + num2;
        System.out.println("The sum of the two numbers is: " + sum);

        // Close the scanner
        input.close();
    }
}
