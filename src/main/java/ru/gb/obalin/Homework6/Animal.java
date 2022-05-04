package ru.gb.obalin.Homework6;

public class Animal {
    private int swims;
    private int run;
    private boolean limited;

    public Animal(int swims, int run, boolean limited) {
        this.swims = swims;
        this.run = run;
        this.limited = limited;
    }


    public int getSwims() {
        return swims;
    }

    public void setSwims(int swims) {
        this.swims = swims;
    }

    public int getRun() {
        return run;
    }

    public void setRun(int run) {
        this.run = run;
    }

    public boolean isLimited() {
        return limited;
    }

    public void setLimited(boolean limited) {
        this.limited = limited;
    }
    public void print() {
        System.out.println("Пробежал: " + run + "м. " + "Проплыл: " + swims + "м.");
    }
}
