package day03scannerclass;

import java.util.Scanner;

public class ScannerClass02 {
    public static void main(String[] args) {
        // Initialize Scanner for user input
        Scanner input = new Scanner(System.in);

        // Prompt user to enter the dimensions of the rectangle
        System.out.println("Enter the width of the rectangle:");
        double width = input.nextDouble();

        System.out.println("Enter the length of the rectangle:");
        double length = input.nextDouble();

        // Calculate and display the perimeter
        double perimeter = 2 * (width + length);
        System.out.println("The perimeter of the rectangle is: " + perimeter);

        // Calculate and display the area
        double area = width * length;
        System.out.println("The area of the rectangle is: " + area);

        // Close the scanner
        input.close();
    }
}
