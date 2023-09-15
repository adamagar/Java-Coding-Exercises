package day04logical_operators_if_switch_statements;

import java.util.Scanner;

public class C04IfStatement02 {

    public static void main(String[] args) {

        // Example 3: Ask user to enter initial of the day names, then print all possible day names on the console.
        // S ==> Sunday, Saturday     T ==> Tuesday, Thursday
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the initial of the day name...");
        String dayNameInitial = input.next().toUpperCase();

        if ("S".equals(dayNameInitial)) {
            System.out.println("Sunday, Saturday");
        } else if ("T".equals(dayNameInitial)) {
            System.out.println("Tuesday, Thursday");
        } else if ("M".equals(dayNameInitial)) {
            System.out.println("Monday");
        } else if ("W".equals(dayNameInitial)) {
            System.out.println("Wednesday");
        } else if ("F".equals(dayNameInitial)) {
            System.out.println("Friday");
        } else {
            System.out.println("Invalid day name initial");
        }
    }
}
