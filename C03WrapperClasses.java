package day02_datatypes;

// Demonstrates the use of Wrapper Classes in Java
public class C03WrapperClasses {

    public static void main(String[] args) {

        // Wrapper Classes are object-oriented alternatives for primitive data types
        // Java provides a Wrapper Class for every primitive data type

        // Using Integer Wrapper Class, which comes with additional methods
        Integer age = 35;

        // Using primitive int, which does not have additional methods
        int weight = 25;

        // Example: Using methods from Integer Wrapper Class
        int minValue = Integer.MIN_VALUE;
        System.out.println("Minimum Integer Value: " + minValue);
        int maxValue = Integer.MAX_VALUE;
        System.out.println("Maximum Integer Value: " + maxValue);

        // Example: Using methods from Short Wrapper Class
        short maxValue1 = Short.MAX_VALUE;
        System.out.println("Maximum Short Value: " + maxValue1);

        // Autoboxing: Converting primitive to wrapper class
        char ch = '?';
        Character chWrapper = ch; // Autoboxing
        System.out.println("Char as a wrapper: " + chWrapper);

        // Unboxing: Converting wrapper class to primitive
        Boolean b1 = true;
        boolean b2 = b1; // Unboxing
        System.out.println("Boolean as primitive: " + b2);
    }
}
