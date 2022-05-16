package ru.gb.obalin.Homework7;
import java.util.Scanner;

public class Homework7 {
    public static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        int action;
        Cat[] allCats = new Cat[4];
        allCats[0] = new Cat("Вася", 15, false);
        allCats[1] = new Cat("Тимон", 10, false);
        allCats[2] = new Cat("Филя", 20, false);
        allCats[3] = new Cat("Стеша", 25, false);

        Plate plate = new Plate(50);
        plate.info();
        for (int i = 0; i < allCats.length; i++) {
            if (allCats[i].fullness == false && allCats[i].appetite < plate.food){
                allCats[i].eat(plate);
                allCats[i].fullness = true;
                System.out.println("Котик " + allCats[i].name + " наелся!");
            } else {
                System.out.println("Котик " + allCats[i].name + " хочет кушать!");
            }
        }
        plate.info();
        System.out.println("Сколько корма добавить еще в миску?");
        action = sc.nextInt();
        plate.increaseFood(action);
        plate.info();
    }
}

