package day04logical_operators_if_switch_statements;

import java.util.Scanner;

public class C07IfStatement05 {

    public static void main(String[] args) {

        // Initializing the scanner to capture user input
        Scanner input = new Scanner(System.in);

        // Prompting the user to enter an integer
        System.out.println("Enter an integer");
        int num = input.nextInt();

        // Check if the number is even
        if(num % 2 == 0) {
            // Nested if to check divisibility by 3 for even numbers
            if(num % 3 == 0) {
                System.out.println("Perfect Even Number");
            } else {
                System.out.println("Good Even Number");
            }
        } else { // Case where the number is odd
            // Nested if to check divisibility by 3 for odd numbers
            if(num % 3 == 0) {
                System.out.println("Perfect Odd Number");
            } else {
                System.out.println("Good Odd Number");
            }
        }

        // Note: Nested structures take more time to execute
        //       It's not generally preferred to use nested structures in Java
        //       Structures that take more time to execute are said to have "time complexity"
    }
}
