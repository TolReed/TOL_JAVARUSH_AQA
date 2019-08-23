package com.javarush.task.task09.task0927;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

/* 
Десять котов
*/

public class Solution {
    public static void main(String[] args) {
        Map<String, Cat> map = createMap();
        Set<Cat> set = convertMapToSet(map);
        printCatSet(set);
    }

    public static Map<String, Cat> createMap() {
        //напишите тут ваш код
        Map<String, Cat> catMap = new HashMap<>(); //Создать словарь Map<String, Cat>
                                                   // и добавить туда 10 котов в виде "Имя"-"Кот".
        catMap.put("1", new Cat("Alpha"));
        catMap.put("2", new Cat("Bravo"));
        catMap.put("3", new Cat("Celta"));
        catMap.put("4", new Cat("Lucky"));
        catMap.put("5", new Cat("Omega"));
        catMap.put("6", new Cat("Crabsik"));
        catMap.put("7", new Cat("Elephantik"));
        catMap.put("8", new Cat("Hooray"));
        catMap.put("9", new Cat("Woooooow"));
        catMap.put("10", new Cat("Future"));

        return catMap;
    }

    public static Set<Cat> convertMapToSet(Map<String, Cat> map) {
        //напишите тут ваш код
        HashSet<Cat> catSet = new HashSet<Cat>(map.values()); //Получить из Map множество(Set) всех котов и вывести его на экран.
        return catSet;
    }

    public static void printCatSet(Set<Cat> set) {
        for (Cat cat : set) {
            System.out.println(cat);
        }
    }

    public static class Cat {
        private String name;

        public Cat(String name) {
            this.name = name;
        }

        public String toString() {
            return "Cat " + this.name;
        }
    }


}
