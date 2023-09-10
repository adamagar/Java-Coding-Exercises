package day04logical_operators_if_switch_statements;

public class C01PostPreIncrement {

    public static void main(String[] args) {
        // Post Increment example
        int a = 12;
        int b = a++;
        System.out.println("Post Increment a: " + a + ", b: " + b);

        // Post Increment example for double type
        double x = 11.5;
        double y = x++;
        System.out.println("Post Increment x: " + x + ", y: " + y);

        // Pre Increment example
        int t = 10;
        int u = ++t;
        System.out.println("Pre Increment t: " + t + ", u: " + u);

        // Post Decrement example
        int c = 15;
        int d = c--;
        System.out.println("Post Decrement c: " + c + ", d: " + d);

        // Pre Decrement example
        int e = 20;
        int f = --e;
        System.out.println("Pre Decrement e: " + e + ", f: " + f);
    }
}
