package day04logical_operators_if_switch_statements;

public class C02LogicalOperators {

    public static void main(String[] args) {

        // Demonstrating the "AND" Logical Operator: &&
        int i = 10;
        int k = 5;
        // This will be true only if all conditions are true.
        System.out.println((i > k) && (i == 2 * k) && (i / k == 2) && (i % k == 2));

        // If the first condition is false, the remaining conditions are not evaluated (Short-circuit).
        System.out.println((i < k) && (i == 2 * k) && (i / k == 2) && (i % k == 2));

        // Using single "&" will make Java evaluate all conditions regardless of the result.
        System.out.println((i < k) & (i == 2 * k) & (i / k == 2) & (i % k == 2));

        // Demonstrating the "OR" Logical Operator: ||
        int a = 6;
        int b = 2;
        // This will be true if any of the conditions is true.
        System.out.println((a >= b) || (a % b != 0) || (a <= 3 * b));

        // All conditions need to be false for the result to be false.
        System.out.println((a == b) || (a % b != 0) || (a > 3 * b));

        // Demonstrating combinations of "&&" and "||"
        System.out.println(((a >= b) || (a % b != 0)) && (a <= 3 * b));
        System.out.println((a >= b) || ((a % b != 0) && (a <= 3 * b)));
    }
}
