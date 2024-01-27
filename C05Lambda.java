package day23iterators_lambda;


import java.util.ArrayList;
import java.util.List;

public class C05Lambda {

    public static void main(String[] args) {

        List<Integer> nums = new ArrayList<Integer>();
        nums.add(12);
        nums.add(9);
        nums.add(131);
        nums.add(14);
        nums.add(9);
        nums.add(10);
        nums.add(4);
        nums.add(12);
        nums.add(15);

        printElements2(nums);

    }

    public static void printElements2(List<Integer> list)
    {
        list.stream().forEach(t-> System.out.print(t + " "));
        System.out.println();
        list.stream().filter(t->t%2==0).forEach(t-> System.out.print(t + " "));
        System.out.println();
        list.stream().filter(t->t%2!=0).forEach(t-> System.out.print((t*t) + " "));
        System.out.println();
        list.stream().filter(t->t%2!=0).map(t->t*t).forEach(t-> System.out.print(t + " "));
        System.out.println();
        list.stream().distinct().filter(t->t%2==0).map(t->t*t*t).forEach(t-> System.out.print(t + " "));
    }
}
