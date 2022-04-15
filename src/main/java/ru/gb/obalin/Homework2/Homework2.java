package ru.gb.obalin.Homework2;

public class Homework2 {
    public static void main(String[] args) {
        task1();
        task2();
        task3();
        task4();
        task5();
    }





    public static void task1() {
        int a = 14;
        int b = 7;
        boolean sum = sumNo(a, b);
        System.out.println(sum);
    }
    public static boolean sumNo(int a, int b) {
        return a + b >= 10 && a + b <= 20;
        }






    public static void task2() {
        positiveOrNegative(-3);

    }
    public static void positiveOrNegative(int code) {
        if (code >= 0) {
            System.out.println("Положительное число!");
        } else {
            System.out.println("Отрицательное число!");
        }

    }



    public static void task3() {
        int z = 0;
        boolean num = number(z);
        System.out.println(num);
    }
    public static boolean number(int z) {
        return z < 0;
    }





    public static void task4() {
        printTheWord(5);
    }
    public static void printTheWord(int times) {   // это задание я не понял как сделать.
        for (int i = 0; i < times; i++) {
            System.out.println("ПамПарам!");
        }

    }






    public static void task5() {
        int year = 196;
        boolean q = season(year);
        System.out.println(q);

    }

    public static boolean season(int year) {
        if (year % 4 != 0) {
            return false;
        } else if (year % 100 == 0) {
            return false;
        } else if (year % 400 == 0) {
            return true;
        } else {
            return true;
        }

    }
}
