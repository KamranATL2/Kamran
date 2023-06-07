package Lesson02;

public class OperatorsApp {
    public static void main(String[] args) {
        int a = 5;
        int b = 6;
        int d= 7;


        System.out.println(a == b);
        System.out.println(a = b);
        System.out.println(a = d);

        b = a;

        System.out.println(b != 6);
        System.out.println(b != 5);

        boolean c = b == a;
        System.out.println(c);
    }
}
