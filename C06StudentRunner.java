package day16oop;

public class C06StudentRunner {

    public static void main(String[] args) {

        C05Student std = new C05Student();

        System.out.println(std.getStdId());
        System.out.println(std.getIllness());

        std.setStdId("AC123");
        System.out.println(std.getStdId());

        std.setIllness("Headache");
        System.out.println(std.getIllness());
    }
}
