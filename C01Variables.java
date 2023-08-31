package day02_datatypes;

// Class to demonstrate basic variable types in Java
public class C01Variables {

    // Entry point of the program
    public static void main (String[] args){

        // Using 'byte' data type to store age, suitable for small integers
        byte stdAge = 25;
        System.out.println(stdAge); // Output: 25

        // Using 'short' data type for a relatively small number of students
        short numOfStdInHighSchool = 3245;
        System.out.println(numOfStdInHighSchool); // Output: 3245

        // Using 'int' for population figures in a city
        int populationOfMiami =  1200000;
        System.out.println(populationOfMiami); // Output: 1200000

        // Using 'long' for a large value, use 'L' for literal value
        long populationOfTheWorld = 700000000000000L;
        System.out.println(populationOfTheWorld); // Output: 700000000000000

        // Another example of 'long' for population
        long populationOfChina = 1500000000;
        System.out.println(populationOfChina); // Output: 1500000000

        // Using 'float' for decimal values, use 'F' for literal value
        float shirtPrice = 23.99F;
        System.out.println(shirtPrice); // Output: 23.99

        // Using 'double' for more precise decimal values
        double weightOfACell = 0.00000012;
        System.out.println(weightOfACell); // Output: 1.2E-7

        // Using 'boolean' for true/false values
        boolean isRetired = false;
        System.out.println(isRetired); // Output: false

        // Using 'char' for single characters
        char initial = 'A';
        System.out.println(initial); // Output: A

        // Using 'String' for text
        String stdName = "Mark Twain";
        System.out.println(stdName); // Output: Mark Twain
    }
}
