package ua.artcode.week4.day1.recursion;

public class IntroRecursion {

    public static void main(String[] args) {
//        a1(10);       // StackOverflowError !
        a2(10);
        a3(10);
//        a4(10);       // StackOverflowError !
        System.out.println(a5(10));
    }

    public static void a1(int num) {
        if (num == 0) {
            return;
        }
        System.out.println(num);
        a1(num);
    }

    public static void a2(int num) {
        if (num == 0) {
            return;
        }

        System.out.println(num);

        a2(--num);
    }

    public static void a3(int num) {
        if (num == 0) {
            return;
        }

        a3(--num);

        System.out.println(num);
    }

    public static int a4(int num) {
        return a4(num - 1) + 1;
    }

    public static int a5(int num) {
        if (num == 0) {
            return 1;
        }

        return a5(num - 1) + 1;
    }

}
