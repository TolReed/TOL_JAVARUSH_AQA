package com.javarush.task.task08.task0815;

import java.util.HashMap;
import java.util.Map;

/* 
Перепись населения
*/

public class Solution {
    public static Map<String, String> createMap() {
        //напишите тут ваш код
        Map<String, String> bio = new HashMap<>();
        bio.put("Абрамович", "Василь");
        bio.put("Шевченко", "Андрій");
        bio.put("Кличко", "Володимир");
        bio.put("Спілберг", "Петро");
        bio.put("Афанасенко", "Володимир");
        bio.put("Порошенко", "Василь");
        bio.put("Зеленський", "Володимир");
        bio.put("Бойко", "Артем");
        bio.put("Федорович", "Афанасій");
        bio.put("Франко", "Іванко");

        return bio;
    }

    public static int getCountTheSameFirstName(Map<String, String> bio, String name) {
        //напишите тут ваш код
        int a = 0;

        for (Map.Entry<String, String> key: bio.entrySet()) {
            if (key.getValue().equals(name)) {
                a++;
            }
        }

        return a;
    }

    public static int getCountTheSameLastName(Map<String, String> bio, String lastName) {
        //напишите тут ваш код
        int a = 0;

        for (Map.Entry<String, String> key: bio.entrySet()) {
            if (key.getKey().equals(lastName)) {
                a++;
            }
        }
        return a;
    }

    public static void main(String[] args) {
        //System.out.println(getCountTheSameLastName(createMap(), "Франко"));
        //System.out.println(getCountTheSameFirstName(createMap(), "Володимир"));
    }
}

/* Look, that is an option how to put together first and lastname with for cycle in JAVA, just for information

    HashMap<String, String> map = new HashMap<>();
        String firstName [] = {"Александр", "Петр", "Сергей", "Иван", "Петр", "Владимир", "Константин", "Борис", "Петр", "Евгений"};
        String lastName [] = {"Губарь", "Лобач", "Петров", "Василевский", "Петров", "Черепанов", "Романов", "Мулгачев", "Косыгин", "Петров"};
        for (int i=0; i<10; i++)
            map.put(lastName[i], firstName[i]);

**************************************************************************************************************************/
