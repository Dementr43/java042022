package ru.gb.obalin.Homework6;
import java.util.Random;
public class Homework6 {
    public static void main(String[] args) {
        Animal[] animals = {
                new Dog("Мотя"),
                new Dog("Чопа"),
                new Cat("Вася"),
                new Cat("Филя"),
        };
        for (Animal animal: animals) {
            animal.run(new Random().nextInt(1000));
            animal.swim(new Random().nextInt(100));
        }
        System.out.println("Колличество животных:  " + Animal.getAmount());
    }
}
