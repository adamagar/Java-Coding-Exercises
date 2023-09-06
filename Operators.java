package day03scannerclass;

public class Operators {
    public static void main(String[] args) {
        // "=" is the Assignment Operator.
        // It takes the value from the right and assigns it to the variable on the left.

        // "==" is the Equality Operator.
        // It checks if the value on the left is equal to the value on the right.
        // It returns a boolean value (true/false).

        // ASCII values are used when char data type is involved in arithmetic operations.
        System.out.println('A' == 65);  // true because ASCII value of 'A' is 65
        System.out.println('A' + 'a');  // 162 (ASCII values are used in addition)

        // Unary "!" is the Not Operator.
        // It reverses the boolean value (true to false, false to true).

        // "!=" is the Not Equal Operator.
        // It returns true if the two values are not equal.

        // Relational operators like "<", ">", "<=", ">=" return boolean results.

        // Using "==" with Strings:
        // "==" checks both value and memory address.
        // Use "equals()" to compare String values as it checks only the content.

        String s1 = "Tom";
        String s2 = "Hanks";
        String s3 = "Tom";
        String s4 = new String("Tom");

        System.out.println(s1 == s2);  // false, different values
        System.out.println(s1 == s3);  // true, same values and memory address
        System.out.println(s1 == s4);  // false, same value but different memory address

        System.out.println(s1.equals(s4));  // true, as both have the same content
    }
}
