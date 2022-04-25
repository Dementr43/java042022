package ru.gb.obalin.Homework4;


import java.util.Random;
import java.util.Scanner;

public class Homework4 {
    public static final String USER = "X";
    public static final String PC = "O";
    public static final String DEFAULT = "_";
    public static final int SIZE = 5;
    public static String[][] field = new String[SIZE][SIZE];

    public static void main(String[] args) {
        modeAgainstAI();
    }
    public static void modeAgainstAI() {
        int count = 0;
        initField();
        while (true) {
            printField();
            userShot(USER);
            count++;
            if (checkWin(USER)) {
                printField();
                System.out.println("Вы победили!");
                break;
            }
            aiShot();
            count++;
            if (checkWin(PC)) {
                printField();
                System.out.println("Вы проиграли!");
                break;
            }
            if (count == Math.pow(SIZE, 2)) {
                printField();
                System.out.println("Ничья.");
                break;
            }
        }
    }
    public static void initField() {
        for (int i = 0; i < SIZE; i++) {
            for (int j = 0; j < SIZE; j++) {
                field[i][j] = DEFAULT;
            }
        }
    }

    public static void printField() {
        System.out.print("  ");
        for (int i = 1; i <= SIZE; i++) {
            System.out.print(i + " ");
        }
        System.out.println();
        for (int i = 0; i < SIZE; i++) {
            System.out.print((i + 1) + "|");
            for (int j = 0; j < SIZE; j++) {
                System.out.print(field[i][j] + "|");
            }
            System.out.println();
        }
    }

    public static void userShot(String sign) {
        int x = -1;
        int y = -1;
        do {
            System.out.println("Введите координаты x y");
            Scanner sc = new Scanner(System.in);
            x = sc.nextInt() - 1;
            y = sc.nextInt() - 1;
        }
        while (isCellBusy(x, y));
        field[x][y] = sign;
    }

    public static void aiShot() {
        int x = -1;
        int y = -1;
        boolean ai_win = false;
        boolean user_win = false;
        for (int i = 0; i < SIZE; i++) {
            for (int j = 0; j < SIZE; j++) {
                if (!isCellBusy(i, j)) {
                    field[i][j] = PC;
                    if (checkWin(PC)) {
                        x = i;
                        y = j;
                        ai_win = true;
                    }
                    field[i][j] = DEFAULT;
                }
            }
        }
        if (!ai_win) {
            for (int i = 0; i < SIZE; i++) {
                for (int j = 0; j < SIZE; j++) {
                    if (!isCellBusy(i, j)) {
                        field[i][j] = USER;
                        if (checkWin(USER)) {
                            x = i;
                            y = j;
                            user_win = true;
                        }
                        field[i][j] = DEFAULT;
                    }
                }
            }
        }
        if (!ai_win && !user_win) {
            do {
                Random rnd = new Random();
                x = rnd.nextInt(SIZE);
                y = rnd.nextInt(SIZE);
            }
            while (isCellBusy(x, y));
        }
        field[x][y] = PC;
        System.out.println("x = " + x + "| y = " + y + "| ai_win = " + ai_win + "| user_win = " + user_win);
    }


    public static boolean isCellBusy(int x, int y) {
        if (x < 0 || y < 0 || x > SIZE - 1 || y > SIZE - 1) {
            return false;
        }
        return field[x][y] != DEFAULT;
    }

    public static boolean checkLine(int start_x, int start_y, int dx, int dy, String sign) {
        for (int i = 0; i < SIZE; i++) {
            if (field[start_x + i * dx][start_y + i * dy] != sign)
                return false;
        }
        return true;
    }

    public static boolean checkWin(String sign) {
        for (int i = 0; i < SIZE; i++) {
            // проверяем строки
            if (checkLine(i, 0, 0, 1, sign)) return true;
            // проверяем столбцы
            if (checkLine(0, i, 1, 0, sign)) return true;
        }
        // проверяем диагонали
        if (checkLine(0, 0, 1, 1, sign)) return true;
        if (checkLine(0, SIZE - 1, 1, -1, sign)) return true;
        return false;
    }
}