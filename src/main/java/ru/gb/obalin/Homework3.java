package ru.gb.obalin;

import java.util.*;

public class Homework3 {
    public static void main(String[] args) {
        String[] words = {"dog", "cat", "home", "mail", "rock", "lock", "home", "cocke", "cat", "man"};

        Map<String, Integer> map = new HashMap<>();
        for (String word : words) {
            map.put(word, map.getOrDefault(word, 0) + 1);
        }
        System.out.println(map);
        System.out.println("");

        Set<String> uniq = new HashSet<>(Arrays.asList(words));
        System.out.println(uniq);
        System.out.println("");

        Phonebook pb = new Phonebook();

        pb.add("Koslov", "8 800-450-42-12");
        pb.add("Maksimov", "8 900-356-56-23");
        pb.add("Antonov", "8 910-450-12-14");

        System.out.println(pb.get("Antonov"));
    }
}
