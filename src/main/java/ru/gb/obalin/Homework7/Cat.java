package ru.gb.obalin.Homework7;

public class Cat {
    private String name;
    private int appetite;
    private boolean fullness;
    public Cat(String name, int appetite, boolean fullness) {
        this.name = name;
        this.appetite = appetite;
        this.fullness = fullness;
    }
    public void setFull(boolean fullness) {
        this.fullness = fullness;
    }
    public boolean  eat(Plate p) {
        return p.decreaseFood(appetite);
    }
    public String toString() {
        return name + ", Аппетит= " + appetite + ", Покушал? " + fullness;
    }
    public void info() {
        System.out.println(this);
    }
}
