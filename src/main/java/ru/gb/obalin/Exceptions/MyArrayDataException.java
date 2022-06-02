package ru.gb.obalin.Exceptions;

class MyArrayDataException extends RuntimeException {
    MyArrayDataException(String msg) {
        super("Ошибка преобразования элемента массива в целое число.\n" + " " + msg);
    }

}
