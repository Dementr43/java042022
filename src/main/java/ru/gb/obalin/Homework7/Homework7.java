package ru.gb.obalin.Homework7;
import java.util.Arrays;
public class Homework7 {
    public static void main(String[] args) {
        Cat[] allCats = new Cat[4];
        allCats[0] = new Cat("Вася", 15, false);
        allCats[1] = new Cat("Тимон", 10, false);
        allCats[2] = new Cat("Филя", 20, false);
        allCats[3] = new Cat("Стеша", 25, false);
        Plate plate = new Plate(30);
        plate.increaseFood(50);
        Arrays.stream(allCats).forEach(p -> p.info());
        Arrays.stream(allCats).forEach(p -> p.setFull(p.eat(plate)));
        Arrays.stream(allCats).forEach(p -> p.info());
        plate.info();
    }
}

