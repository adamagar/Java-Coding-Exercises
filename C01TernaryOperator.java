package day05ternarystatement_stringmanipulations;

import java.util.Scanner;

public class C01TernaryOperator {

    public static void main(String[] args) {

        // Initialize Scanner
        Scanner input = new Scanner(System.in);

        // Check if an integer is even or odd
        System.out.println("Type an integer");
        int num = input.nextInt();
        String result = num % 2 == 0 ? "Even" : "Odd";
        System.out.println(result);

        // Check if an integer has 3 digits or not
        System.out.println("Type an integer");
        int num2 = input.nextInt();
        String numberOfDigits = num2 > 99 && num2 < 1000 ? "has 3 digits" : "not";
        System.out.println(numberOfDigits);

        // Calculate the absolute value of a number
        System.out.println("Type an integer");
        double num3 = input.nextDouble();
        double absoluteValue = num3 >= 0 ? num3 : num3 * -1;
        System.out.println(absoluteValue);

        // Multiply two integers if their signs are the same
        System.out.println("Type two integers");
        int num4 = input.nextInt();
        int num5 = input.nextInt();
        Object result2 = num4 * num5 > 0 ? num4 * num5 : "I do not know how to multiply";
        System.out.println(result2);

        // Close scanner
        input.close();
    }
}
