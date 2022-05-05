package ru.gb.obalin.Homework6;

public class Cat extends Animal {
    private static int amount;
    private static final int limitedRun = 200;

    public Cat(String name) {
        super(name, limitedRun);
        amount++;
    }
    public static int getAmount() {
        return amount;
    }
    protected void swim(int length) {
        System.out.println("Боится воды. ");
    }
}
