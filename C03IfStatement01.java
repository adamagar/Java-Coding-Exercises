package day04logical_operators_if_switch_statements;

import java.util.Scanner;

public class C03IfStatement01 {

    public static void main(String[] args) {
        // Initialize Scanner for user input
        Scanner input = new Scanner(System.in);

        // Check for divisibility by 2
        System.out.println("Enter a number to check its divisibility by 2...");
        int a = input.nextInt();
        int b = 2;
        if (a % b == 0) {
            System.out.println("Divisible by 2");
        } else {
            System.out.println("Not divisible by 2");
        }

        // Check if the number is even or odd
        System.out.println("Enter a number to check if it is even or odd...");
        int x = input.nextInt();
        if (x % 2 == 0) {
            System.out.println("Even");
        } else {
            System.out.println("Odd");
        }

        // Check if the number is positive, negative, or zero
        System.out.println("Enter a number to check if it is positive, negative or neutral");
        double y = input.nextDouble();
        if (y > 0) {
            System.out.println("Positive");
        } else if (y == 0) {
            System.out.println("Neutral");
        } else {
            System.out.println("Negative");
        }
    }
}
