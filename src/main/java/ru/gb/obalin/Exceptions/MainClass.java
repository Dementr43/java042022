package ru.gb.obalin.Exceptions;

import static java.lang.Integer.valueOf;

public class MainClass {

    public static void main(String[] args) {

        String[][] stringArray0 = new String[][] {
                {"7", "e", "5", "2"},
                {"6", "5", "4", "3"},
                {"5", "2", "3", "4"},
                {"4", "3", "2", "5"}
        };
        String[][] stringArray1 = new String[][] {
                {"1", "2", "3", "4"},
                {"2", "3", "4", "3"},
                {"3", "4", "3", "2"},
                {"4", "3", "2", "1"}
        };
        String[][] stringArray2 = new String[][] {
                {"2", "k", "3"},
                {"2", "3", "4", "5"},
                {"3", "4", "5", "6"},
                {"4", "5", "6", "7"}
        };
        String[][] stringArray3 = new String[][] {
                {"1", "2", "3", "4"},
                {"5", "6", "7", "8"},
                {"9", "0", "1", "2"}
        };

        try {
            System.out.println("Общая сумма в массиве равна: " + transformAndSum(stringArray0));
        } catch (MyArraySizeException | MyArrayDataException e) {
            System.out.println(e);
        }
        try {
            System.out.println("Общая сумма в массиве равна: " + transformAndSum(stringArray1));
        } catch (MyArraySizeException | MyArrayDataException e) {
            System.out.println(e);
        }
        try {
            System.out.println("Общая сумма в массиве равна: " + transformAndSum(stringArray2));
        } catch (MyArraySizeException | MyArrayDataException e) {
            System.out.println(e);
        }
        try {
            System.out.println("Общая сумма в массиве равна: " + transformAndSum(stringArray3));
        } catch (MyArraySizeException | MyArrayDataException e) {
            System.out.println(e);
        }
    }

    private static int transformAndSum (String[][] in) throws MyArraySizeException, MyArrayDataException {
        int arrDim = 4;
        int sum = 0;

        if (in.length != 4) {
            throw new MyArraySizeException(String.format("Массива должен быть %dх%d.", arrDim, arrDim));
        }
        for (int i = 0; i < in.length; i++) {
            if (in[i].length != 4) {
                throw new MyArraySizeException(String.format("Массива должен быть %dх%d.", arrDim, arrDim));
            }
        }

        for (int i = 0; i < in.length; i++) {
            for (int j = 0; j < in[i].length; j++) {
                try {
                    sum += valueOf(in[i][j]);
                } catch (NumberFormatException e) {
                    throw new MyArrayDataException(String.format("Тут: [%d][%d], находится не целое число %s.", i, j, in[i][j]));
                }
            }
        }

        return sum;
    }

}
