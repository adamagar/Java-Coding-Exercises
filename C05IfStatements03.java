package day04logical_operators_if_switch_statements;

import java.util.Scanner;

public class C05IfStatements03 {

    public static void main(String[] args) {

        // Initialize Scanner object to capture user input
        Scanner input = new Scanner(System.in);

        // Prompt user to enter a day name
        System.out.println("Enter a day name...");
        String dayName = input.next();

        // Create boolean conditions to distinguish week and weekend days
        boolean isWeekDay = dayName.equalsIgnoreCase("Monday") || dayName.equalsIgnoreCase("Tuesday")
                || dayName.equalsIgnoreCase("Wednesday") || dayName.equalsIgnoreCase("Thursday")
                || dayName.equalsIgnoreCase("Friday");

        boolean isWeekEndDay = dayName.equalsIgnoreCase("Saturday") || dayName.equalsIgnoreCase("Sunday");

        // Determine whether it is a weekday, weekend, or invalid day
        if(isWeekEndDay){
            System.out.println("Weekend Day");
        }else if(isWeekDay){
            System.out.println("Week Day");
        }else{
            System.out.println("Invalid day name...");
        }

        // Close the scanner to avoid resource leak
        input.close();
    }
}
