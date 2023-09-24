package day05ternarystatement_stringmanipulations;

public class C02TernaryOperator {

    public static void main(String[] args) {

        // This block checks if the integer 'a' is odd,
        // if it is even, it also checks its divisibility by 3
        int a = 14;
        String s = a % 2 != 0 ? "Odd" : (a % 3 == 0 ? "Even and divisible by 3" : "Even but not divisible by 3");
        System.out.println(s);

        // This block checks if a given year is a leap year or not.
        // If the year is divisible by 100, it must also be divisible by 400 to be a leap year.
        // If it's not divisible by 100, then it should be divisible by 4 to be a leap year.
        int year = 2024;
        String s1 = (year % 100 == 0)
                ? (year % 400 == 0 ? "Leap Year" : "Not Leap year")
                : (year % 4 == 0 ? "Leap Year" : "Not Leap Year");
        System.out.println(s1);
    }
}
