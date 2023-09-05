package day03scannerclass;

// Demonstrates the use of string concatenation in Java
public class Concatenation {
    public static void main(String[] args) {

        String name = "Tom";
        String lastName = "Hanks";
        int i = 12;
        int k = 5;
        char c = 'A';

        // Using the + operator to concatenate strings
        System.out.println(name + " " + lastName);

        // Using the concat method for string concatenation
        System.out.println(name.concat(lastName));

        // Using multiple concat methods for complex concatenation
        System.out.println(name.concat(" ").concat(lastName));

        // String and integer concatenation
        System.out.println(name + i + k);

        // Parentheses to influence order of operations in concatenation
        System.out.println(name + (i + k));

        // Concatenation of integer before string
        System.out.println(i + k + name);

        // Concatenation of string and result of integer multiplication
        System.out.println(name + i * k);
    }
}
