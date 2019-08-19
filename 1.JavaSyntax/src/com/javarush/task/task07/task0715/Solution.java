package com.javarush.task.task07.task0715;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;

/* 
Продолжаем мыть раму - добавляєм ИМЕННО
*/

public class Solution {
    public static void main(String[] args) {
        //напишите тут ваш код
        ArrayList<String> list = new ArrayList<>();
        list.add("мама");
        list.add("мыла");
        list.add("раму");

        for (int i = 0; i < list.size(); i = i + 2) {
            list.add(i+1, "именно");
        }

        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i));
        }
    }
}

/******************************************************************** or, try this solution, please
 * list.add("мама");list.add("мыла");list.add("раму");
 * list.add(list.indexOf("мама")+1,"именно"); *
 *
 */
