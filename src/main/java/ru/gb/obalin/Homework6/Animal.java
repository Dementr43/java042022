package ru.gb.obalin.Homework6;

public abstract class Animal {
    private static int amount;
    private String type;
    private final int running;

    public Animal(String type, int running) {
        this.type =type;
        this.running = running;
        amount++;
    }

    public static int getAmount() {
        return amount;
    }
    public static void setAmount(int amount) {
        Animal.amount = amount;
    }

    public String getType() {
        return type;
    }
    public void setType(String type) {
        this.type = type;
    }
    public void run(int length) {
        System.out.print(this.type + " пробежал(а) " + (Math.min(length, running)) + " м. ");
    }
    protected abstract void swim(int length);
    public String toString() {
        return "Животное: " + type + ". ";
    }
}

