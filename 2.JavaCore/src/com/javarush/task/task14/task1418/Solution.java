package com.javarush.task.task14.task1418;

import java.util.LinkedList;
import java.util.List;

/* 
Исправь четыре ошибки
*/

public class Solution {
    public static void main(String[] args) {
        List<Number> list = new LinkedList<Number>();
        initList(list);
        printListValues(list);
        processCastedObjects(list);
    }

    //3
    static void initList (List<Number> list) { //Создай в классе Solution статические методы initList(List<Number> list)
        list.add(new Double(1000f));
        list.add(new Double("123e-445632"));
        list.add(new Float(-90 / -3));
        list.remove(new Double("123e-445632"));
    }

        //4 - Исправь 2 ошибки
    static void printListValues (List<Number> list) { //Создай в классе Solution статические методы printListValues(List<Number> list)
        for (int i = 0; i < list.size(); i++) { //was <= and --
            System.out.println(list.get(i));
        }
    }

        //5
    static void processCastedObjects (List<Number> list) { //Создай в классе Solution статические методы processCastedObjects(List<Number> list).
        for (Number object : list) {
            //Исправь 2 ошибки
            if (object instanceof Double) { // was Float
                Double a = (Double) object;
                System.out.println("Is double value infinite? " + a.isInfinite());
            } else if (object instanceof Float) { // was Double
                Float a = (Float) object;
                System.out.println("Is float value defined? " + !(a.isNaN()));
            }
        }



    }
}
