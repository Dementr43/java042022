package ru.gb.obalin.Homework7;

public class Cat {
    protected String name;
    protected int appetite;
    public boolean fullness;
    public Cat(String name, int appetite, boolean fullness) {
        this.name = name;
        this.appetite = appetite;
        this.fullness = fullness;
    }
    public void eat(Plate p) {
        p.decreaseFood(appetite);
    }
}
