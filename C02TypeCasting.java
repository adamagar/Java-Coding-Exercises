package day02_datatypes;

// Class to demonstrate Type Casting in Java
public class C02TypeCasting {

    // Entry point of the program
    public static void main(String[] args) {

        // Type casting is converting one primitive data type to another

        // Auto-Widening: Automatically converting smaller type to a larger type
        // No explicit cast required
        byte myAge = 34;
        int age = myAge;
        System.out.println("Auto-Widening age: " + age); // Output: 34

        // Explicit Narrowing: Manually converting a larger type to a smaller type
        // Explicit cast required using (type)
        long value1 = 34000000000L;
        short value2 = (short) value1;
        System.out.println("Explicit Narrowing value2: " + value2); // Output may not be as expected

        // When performing math on integers, the result is also an integer
        // Decimal values will be truncated
        int numOfStd = 12;
        int amountOfMoney = 500;
        System.out.println("Int Division: " + (amountOfMoney / numOfStd)); // Output: 41

        // When performing math on mixed types, the result is of the larger type
        // No truncation in this case
        float moneyAmount = 500.0F;
        System.out.println("Mixed Type Division: " + (moneyAmount / numOfStd)); // Output: 41.666668

    }
}
