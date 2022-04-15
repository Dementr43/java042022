package ru.gb.obalin.Homework2;

public class Homework2 {

    public static void task1() {
        int a = 5;
        int b = 7;
        boolean sum = sumNo(a, b);
        print(sum);
    }
    public static boolean sumNo(int a, int b) {
        int sum = a + b;
        if (sum >= 10 && sum <= 20) {
            return true;
        } else {
            return false;
        }
    }

    public static void print(boolean a) {
        System.out.println(a);
    }
}
