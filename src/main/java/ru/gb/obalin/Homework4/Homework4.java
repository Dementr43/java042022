package ru.gb.obalin.Homework4;


import java.util.Scanner;
import java.util.concurrent.ScheduledExecutorService;

public class Homework4 {
    public static char[][] MAP;
    private static boolean isInGame;
    private static int SIZE;
    private static final char UZER = 'X';
    private static final char PC = 'O';
    private static final char DEFAULT = '_';
    static void fillMap(int size) {
        isInGame = true;
        MAP = new char[size][size];
        SIZE = size;
        for (int i = 0; i < SIZE; i++) {
            for (int j = 0; j < SIZE; j++) {
                MAP[i][j] = DEFAULT;
            }
        }
    }
    static void printMap() {
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
    }
    static boolean move (int x, int y, char player) {
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
    } //выход за пределы карты
    private static void moveAI() {
        for (int i = 0; i < SIZE; i++) {
            for (int j = 0; j < SIZE; j++) {
                if (MAP[i][j] == DEFAULT) {
                    MAP[i][j] = PC;
                    return;
                }
            }
        }
        throw new IllegalArgumentException();
    }
    static boolean isVictory(char  player) {

        return false;
    }
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        fillMap(3);
        printMap();
        System.out.println("Крестики-Нолики");
        System.out.println("Вы игрете за X");
        System.out.println("Нужно указать ячейку через пробел. Например: 1 2");
        System.out.println("Первое число - строка. Второе - столбец.");
        while (isInGame) {
            System.out.println("Ваш ход:");
            int x, y;
            try {
                x = in.nextInt();
                y = in.nextInt();
            } catch (Exception e) {
                System.out.println("Некорректные данные! Укажите ячейку.");
                in.nextLine();
                continue;
            }
            x--;
            y--;
            if (move(x, y, UZER)) {
                if (isVictory(UZER)) {
                    System.out.println("Вы победили !");
                    break;
                }
                try {
                    moveAI();
                    printMap();
                } catch (Exception e) {
                    printMap();
                    System.out.println("Ничья.");
                    break;
                }
                if (isVictory(PC)) {
                    System.out.println("Вы проиграли!");
                    break;
                }
            } else {
                System.out.println("Некорректные данные! Укажите ячейку.");
            }
        }
    }
}