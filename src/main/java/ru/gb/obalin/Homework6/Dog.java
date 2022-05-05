package ru.gb.obalin.Homework6;

public class Dog extends Animal {
    private static int amount;
    private static final int limitedRun = 500;
    private static final int limitedSwim = 10;

    public Dog(String name) {
        super(name, limitedRun);
        amount++;
    }
    public static int getAmount() {
        return amount;
    }
    @Override
    protected void swim(int length) {
        System.out.println(getType() + " проплыл(а)  " + (Math.min(length, limitedSwim)) + " м. ");
    }
}
