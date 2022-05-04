package ru.gb.obalin.Homework6;

public class Animal {
    private int swims;
    private int run;
    private boolean limited;
    private static int count;

    public Animal() {
        count++;
    }

    public static int getCount() {
        return count;
    }

    protected void run(int distance) {
        if (run >= distance) {
            System.out.println("Cat" + УСПЕШНО пробежал(а) " + distance + "м.");
        } else {
            System.out.println(this.type + " по кличке " + this.name + " ---- сошел(а) с дистанции ---- ");
        }
    }

    protected void swim(int distance) {
        if (swims >= distance) {
            System.out.println(this.type + " по кличке " + this.name + "   - УСПЕШНО проплыл(а) " + distance + "м.");
        } else {
            System.out.println(this.type + " по кличке " + this.name + " ---- не выполнил норматив ---- ");
        }
    }
}
