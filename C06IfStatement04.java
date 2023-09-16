package day04logical_operators_if_switch_statements;

import java.util.Scanner;

public class C06IfStatement04 {

    public static void main(String[] args) {

        // Initialize scanner object for user input
        Scanner input = new Scanner(System.in);

        // Prompt user to enter the mark
        System.out.println("Enter mark...");
        int mark = input.nextInt();

        // Validate and determine grade based on mark
        if (mark < 0) {
            System.out.println("Negative marks are not valid.");
        } else if (mark < 50) {
            System.out.println("D");
        } else if (mark < 60) {
            System.out.println("C");
        } else if (mark < 80) {
            System.out.println("B");
        } else if (mark < 101) {
            System.out.println("A");
        } else {
            System.out.println("Marks greater than 100 are not valid.");
        }
    }
}
