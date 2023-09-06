package day03scannerclass;

public class IncrementDecrement {
    public static void main(String[] args) {

        // Increment means to increase the value of a variable
        int age = 13;

        // 1st Way to increment: using addition
        age = age + 2;
        System.out.println(age);  // Output: 15

        // 2nd Way to increment: using shorthand addition
        age += 2;
        System.out.println(age);  // Output: 17

        // Increment can be performed using multiplication
        // 1st Way: using multiplication
        age = age * 2;
        System.out.println(age);  // Output: 34

        // 2nd Way: using shorthand multiplication
        age *= 2;
        System.out.println(age);  // Output: 68

        // Using the post-increment operator to increase by 1
        age++;
        System.out.println(age);  // Output: 69

        // Decrement means to decrease the value of a variable
        // Using subtraction
        age = age - 2;
        System.out.println(age);  // Output: 67

        // Using shorthand subtraction
        age -= 2;
        System.out.println(age);  // Output: 65

        // Decrement can be performed using division
        // Using division
        age = age / 5;
        System.out.println(age);  // Output: 13

        // Using shorthand division
        age /= 13;
        System.out.println(age);  // Output: 1

        // Using the post-decrement operator to decrease by 1
        age--;
        System.out.println(age);  // Output: 0
    }
}
