package com.javarush.task.task08.task0821;

import java.util.HashMap;
import java.util.Map;

/* 
Однофамильцы и тёзки
*/

public class Solution {
    public static void main(String[] args) {
        Map<String, String> map = createPeopleList();
        printPeopleList(map);
    }

    public static Map<String, String> createPeopleList() {
        //напишите тут ваш код
        Map<String, String> map = new HashMap<>();
        map.put("Абрамович", "Василь");
        map.put("Шевченко", "Андрій");
        map.put("Кличко", "Володимир");
        map.put("Спілберг", "Петро");
        map.put("Абрамович", "Володимир");
        map.put("Порошенко", "Василь");
        map.put("Зеленський", "Володимир");
        map.put("Абрамович", "Артем");
        map.put("Федорович", "Афанасій");
        map.put("Франко", "Іванко");

        return map;

    }

    public static void printPeopleList(Map<String, String> map) {
        for (Map.Entry<String, String> s : map.entrySet()) {
            System.out.println(s.getKey() + " " + s.getValue());
        }
    }
}
