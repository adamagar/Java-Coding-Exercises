package day24lambda;

import java.util.stream.IntStream;

public class C03Lambda {

    public static void main(String[] args) {

        System.out.println(getSum(9, 7));
        System.out.println(getMultiplication(4, 2));
        System.out.println(getFactorial(5));

    }
    //Example 1: Create a method to find the sum of integers from 7 to 100
    public static int getSum(int starting, int ending){
        if(starting>ending){
            int temp = starting;
            starting = ending;
            ending = temp;
        }
        return IntStream.rangeClosed(starting, ending).sum();
    }

    //Example 2: Create a method to find the multiplication of the integers from 2(inc) to 11(inc)
    public static int getMultiplication(int starting, int ending){
        if(starting>ending){
            ending = starting + ending;
            starting = ending - starting;
            ending = ending - starting;
        }
        return IntStream.rangeClosed(starting, ending).reduce(1, (t,u)->t*u);
    }

    //Example 3: Create a method to find the factorial of a given number(5! = 1*2*3*4*5)
    public static int getFactorial(int e){
        if(e<0){
            System.out.println("Negative numbers cannot be used in factorial operation");
        }
        //return IntStream.rangeClosed(1, e).reduce(1, (t,u)->t*u);
        return IntStream.rangeClosed(1, e).reduce(Math::multiplyExact).getAsInt();
    }

    /*
        Lambda Expression: "Variable(s) --> Operations" structure is called "Lambda Expression"
        Method Reference: "Class Name :: Method Name without parenthesis" is called "Method Reference"
     */
}
