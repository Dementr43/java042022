package ru.gb.obalin.Homework3;

import java.util.Arrays;

public class Homework3 {
    public static void main(String[] args) {
        massiveNo1();
        massiveNo2();
        massiveNo3();
        massiveNo4();
        massiveNo5();
        massiveNo6();
        massiveNo7();
        massiveNo8();

    }

    public static void massiveNo1() {
        int[] num = { 1, 1, 0, 0, 1, 0, 1, 1, 0, 0 };
        for (int i = 0; i < num.length; i++) {
            if (num[i] == 1) {
                num[i] = 0;
            }else num[i] = 1;
            System.out.print(num[i]+", ");
        }

    }
    public static void massiveNo2() {
        System.out.println();
            int[] num = new int[100];
            for (int i = 0; i < num.length; i++) {
                num[i] = i + 1;
                System.out.print(num[i]+", ");

            }

        }
    public static void massiveNo3() {
        System.out.println();
        int[] num = { 1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1 };
        for (int i = 0; i < num.length; i++) {
            if (num[i] < 6) {
                num[i] = num[i] * 2;
            }
            System.out.print(num[i]+", ");
        }
    }
    public static void massiveNo4() {
        System.out.println();
        System.out.println();
        int x = 5;
        int[][] num = new int[x][x];
        for (int i = 0; i < num.length; i++) {
            for (int j = 0; j < num.length; j++) {
                num [i][j] = 0;
                if ((i == j) || (i == x - j - 1)) {
                    num [i][j] = 1;
                }
                System.out.print(num[i][j] + " ");
            }
            System.out.println();
        }
    }
    public static void massiveNo5() {
        System.out.println();
        int len = 8;
        int initialValue = 1;
        System.out.println(Arrays.toString(massive(len, initialValue)));
    }
    public static int[] massive(int len, int initialValue) {
        int[] num = new int[len];
        for (int i = 0; i < num.length; i++) {  // он предлагает сменить на Arrays.fill(num, initialValue)  Почему ему не нравится? Все работает
            num[i] = initialValue;

        }
        return num;
    }


    public static void massiveNo6() {
        System.out.println();
        int[] num = { 3, 5, 3, 2, 11, 4, 5, 21, 4, 8, 9, 10 };
        System.out.println(maxNum(num));
        System.out.println(minNum(num));
    }
    public static int maxNum(int[] num) {
        int max = num[0];
        for (int j : num) {
            if (max < j) {
                max = j;
            }
        }
        return max;
    }
    public static int minNum(int[] num) {
        int min = num[0];
        for (int j : num) {
            if (min > j) {
                min = j;
            }
        }
        return min;
    }

    public static void massiveNo7() {
        System.out.println();
        int[] num = {8, 3, 8, 4, 3, 5, 5, 3, 4, 8, 3, 8};
        System.out.println(result(num));
    }
    public static boolean result(int[] num) {
        int left = 0;
        for(int i = 0; i < num.length; i++){
            left += num[i];
            int right = 0;
            for (int j = 0; j < num.length; j++){
                right += (j > i)? num[j] : 0;
            }
            if(left == right){
                return true;
            }
        }
        return false;
    }
    public static void massiveNo8() {
        int n = 3;
        int[] num = {1, 2, 3, 4, 5, 6};
        System.out.println(Arrays.toString(leftOrRight(num, n)));
    }
    public static int[] leftOrRight(int[] num, int n) {
        if (n > 0) {
            for (int s = 1; s <= n; s++) {
                int nom = num[num.length - 1];
                for (int i = num.length - 2; i >= 0; i--) {
                    num[i + 1] = num[i];
                }
                num[0] = nom;
            }
        } else if (n < 0) {
            for (int s = n; s <= -1; s++) {
                int nom = num[0];
                for (int i = 1; i < num.length; i++) {
                    num[i - 1] = num[i];
                }
                num[num.length - 1] = nom;
            }
        }
        return num;
    }
}
