package com.javarush.task.task08.task0818;

import java.util.*;

/*
Только для богачей
*/

public class Solution {
    public static Map<String, Integer> createMap() {
        //напишите тут ваш код
        Map<String, Integer> map = new HashMap<>();
        map.put("Абрамович", 1700);
        map.put("Шевченко", 2900);
        map.put("Кличко", 6700);
        map.put("Спілберг", 7770);
        map.put("Афанасенко", 500);
        map.put("Порошенко", 370);
        map.put("Зеленський", 210);
        map.put("Бойко", 10600);
        map.put("Федорович", 7370);
        map.put("Франко", 20);

        return map;
    }

    public static void removeItemFromMap(Map<String, Integer> map) {
        //напишите тут ваш код
        Iterator<Integer> it = map.values().iterator();
        while (it.hasNext()) {
            if (it.next() < 500) {
                it.remove();
            }
        }

    }

    public static void main(String[] args) {

    }
}