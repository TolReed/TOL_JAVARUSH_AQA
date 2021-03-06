package com.javarush.task.task08.task0801;

/* 
Set из растений
*/

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class Solution {
    public static void main(String[] args) {
        //напишите тут ваш код
        Set<String> set = new HashSet<String>(); //Set из растений - Создать коллекцию Set (реализация HashSet) с типом элементов String.
        set.add("арбуз");
        set.add("банан");
        set.add("вишня");
        set.add("груша");
        set.add("дыня");
        set.add("ежевика");
        set.add("женьшень");
        set.add("земляника");
        set.add("ирис");
        set.add("картофель");

        //получение итератора для множества
        Iterator<String> iterator = set.iterator();

        for (String text : set) {
            System.out.println(text);
        }

        /* or next solution for cycle !!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!

        Iterator<String> iterator = list.iterator();//получение итератора для списка
        while (iterator.hasNext())      //проверка, есть ли ещё элементы
            {
            //получение текущего элемента и переход на следующий
            String text = iterator.next();

            System.out.println(text);
         }

        *******************************************************************************/

    }
}
