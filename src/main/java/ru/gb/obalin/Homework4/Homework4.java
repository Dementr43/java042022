package ru.gb.obalin.Homework4;


import java.util.Random;
import java.util.Scanner;

public class Homework4 {
    public static int SIZE;
    public static String[][] MAP;
    public static final String USER = "X";
    public static final String PC = "O";
    public static final String DEFAULT = "_";
    private static boolean isInGame;
    public static void fillMap(int size) {
        isInGame = true;
        MAP = new String[size][size];
        SIZE = size;
        for (int i = 0; i < SIZE; i++) {
            for (int j = 0; j < SIZE; j++) {
                MAP[i][j] = DEFAULT;
            }
        }
    } //доска
    public static void printMap() {
        System.out.print("  ");
        for (int i = 0; i < SIZE; i++) {
            System.out.print(i + 1 + " ");
        }
        System.out.println();
        for (int i = 0; i < SIZE; i++) {
            System.out.print(i + 1 + "|");
            for (int j = 0; j < SIZE; j++) {
                System.out.print(MAP[i][j] + "|");
            }
            System.out.println();
        }
    } //Распечатать доску
    public static boolean isCellBusy(int x, int y) {
        if (x < 0 || y < 0 || x > SIZE - 1 || y > SIZE - 1) {
            return false;
        }
        return MAP[x][y] != DEFAULT;
    } // границы карты
    public static boolean isMapFull() {
        for (int i = 0; i < SIZE; i++) {
            for (int j = 0; j < SIZE; j++) {
                if (MAP[i][j] == DEFAULT) {
                    return false;
                }
            }
        }
        return true;
    } //заполненность карты
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        fillMap(5); // Можно поменять клетки 3х3 4х4 5х5...
        printMap();
        System.out.println("Крестики-Нолики!");
        while (isInGame) {
            System.out.println("Ваш ход:");
            int x, y;
            try {
                x = in.nextInt();
                y = in.nextInt();
            } catch (Exception e) {
                System.out.println("Введите корректные данные:");
                in.nextLine();
                continue;
            }
            x--;
            y--;
            if (move(x, y, USER)) {
                if (isVictory(USER)) {
                    System.out.println("Вы Победили!");
                    break;
                }
                if (isMapFull()) {
                    printMap();
                    System.out.println("Ничья...");
                    break;
                }
                moveAI();
                printMap();
                if (isVictory(PC)) {
                    System.out.println("Вы Проиграли!");
                    break;
                }
                if (isMapFull()) {
                    printMap();
                    System.out.println("Ничья...");
                    break;
                }
            } else {
                System.out.println("Введите корректные данные:");
            }
        }
    } // логика
    public static boolean move(int x, int y, String player) {
        try {
            if (MAP[x][y] == DEFAULT) {
                MAP[x][y] = player;
                return true;
            } else {
                return false;
            }
        } catch (ArrayIndexOutOfBoundsException e) {
            return false;
        }
    } //Ход игрока
    public static void moveAI() {
        int x = -1;
        int y = -1;
        boolean ai_win = false;
        boolean user_win = false;
        for (int i = 0; i < SIZE; i++) {
            for (int j = 0; j < SIZE; j++) {
                if (!isCellBusy(i, j)) {
                    MAP[i][j] = PC;
                    if (isVictory(PC)) {
                        x = i;
                        y = j;
                        ai_win = true;
                    }
                    MAP[i][j] = DEFAULT;
                }
            }
        }
        if (!ai_win) {
            for (int i = 0; i < SIZE; i++) {
                for (int j = 0; j < SIZE; j++) {
                    if (!isCellBusy(i, j)) {
                        MAP[i][j] = USER;
                        if (isVictory(USER)) {
                            x = i;
                            y = j;
                            user_win = true;
                        }
                        MAP[i][j] = DEFAULT;
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
        MAP[x][y] = PC;
        System.out.println(" ");
    } // ИИ ПК
    public static boolean isVictory(String player) {
        for (int i = 0; i < SIZE; i++) {
            if (checkLine(i, 0, 0, 1, player)) return true;
            if (checkLine(0, i, 1, 0, player)) return true;
        }
        if (checkLine(0, 0, 1, 1, player)) return true;
        if (checkLine(0, SIZE - 1, 1, -1, player)) return true;
        return false;
    } //Варианты побед.
    public static boolean checkLine(int start_x, int start_y, int dx, int dy, String player) {
        for (int i = 0; i < SIZE; i++) {
            if (MAP[start_x + i * dx][start_y + i * dy] != player)
                return false;
        }
        return true;
    } // Проверка линий
} //Я сидел над ней 18 часов. Интернет перешерстил вдоль и поперек. Осознал больше чем за все предыдущие уроки. Дальше будет так же?