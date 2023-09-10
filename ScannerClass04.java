package day03scannerclass;

import java.util.Scanner;

public class ScannerClass04 {
    public static void main(String[] args) {
        // Initialize Scanner for user input
        Scanner input = new Scanner(System.in);

        // Prompt user to enter a 5-digit number
        System.out.println("Please enter a 5-digit number:");

        // Obtain user input
        int num = input.nextInt();

        // Calculate the sum of the first two and last two digits
        int firstTwo = num / 1000;
        int lastTwo = num % 100;
        int sum = firstTwo + lastTwo;

        // Display the sum
        System.out.println("Sum of the first two and last two digits is: " + sum);

        // Close the scanner
        input.close();
    }
}
