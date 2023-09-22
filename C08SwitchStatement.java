package day04logical_operators_if_switch_statements;

import java.util.Scanner;

public class C08SwitchStatement {

    public static void main(String[] args) {

        // Initialize the Scanner for user input
        Scanner input = new Scanner(System.in);

        // Prompt the user to enter the number corresponding to a day of the week
        System.out.println("Enter day number to see day name...");
        byte dayNum = input.nextByte();

        // Using if-else if-else statements to display the name of the day based on the number
        if(dayNum == 1) {
            System.out.println("Sunday");
        } else if(dayNum == 2) {
            System.out.println("Monday");
        } else if(dayNum == 3) {
            System.out.println("Tuesday");
        } else if(dayNum == 4) {
            System.out.println("Wednesday");
        } else if(dayNum == 5) {
            System.out.println("Thursday");
        } else if(dayNum == 6) {
            System.out.println("Friday");
        } else if(dayNum == 7) {
            System.out.println("Saturday");
        } else {
            System.out.println("Invalid day number");
        }

        // Using switch-case statements for the same functionality
        // More compact and arguably easier to read for this use-case
        switch(dayNum) {
            case 1:
                System.out.println("Sunday");
                break;
            case 2:
                System.out.println("Monday");
                break;
            case 3:
                System.out.println("Tuesday");
                break;
            case 4:
                System.out.println("Wednesday");
                break;
            case 5:
                System.out.println("Thursday");
                break;
            case 6:
                System.out.println("Friday");
                break;
            case 7:
                System.out.println("Saturday");
                break;
            default:
                System.out.println("Invalid day number");
                break; // Optional as 'default' is the last case
        }

        // Note: Switch statements can work with int, byte, short, char, and String data types.
        // Float, double, long, and boolean are not valid in switch statements.
    }
}
