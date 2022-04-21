package ru.gb.obalin.Homework3;

public class Homework3 {
    public static void main() {
        massiveNo1();
    }

    public static void massiveNo1() {
        int[] num = { 1, 1, 0, 0, 1, 0, 1, 1, 0, 0 };
        for (int i = 0; i < num.length; i++) {
           num [i] = (num[i] == 0)? 1 : 0;
        }
        System.out.println();

    }
}
