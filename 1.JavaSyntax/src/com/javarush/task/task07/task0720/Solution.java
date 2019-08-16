package com.javarush.task.task07.task0720;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

/* 
Перестановочка подоспела
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        //напишите тут ваш код
        //Ввести с клавиатуры 2 числа N и M.
        //Ввести N строк и заполнить ими список.
        //Переставить M первых строк в конец списка.
        ArrayList<String> list = new ArrayList<>();
        int N = Integer.parseInt(reader.readLine());
        int M = Integer.parseInt(reader.readLine());

        for (int i = 0; i < N; i++) {
            String s = reader.readLine();
            list.add(s);
        }

        for (int i = 0; i < M; i++) {
            list.add(list.get(0));
            list.remove(0);
        }

        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i));
        }
    }
}

/********************************************************************************************************************
Переставить начало строки в конец.
Элементы после удаления смещаются в лево на один элемент. По этому удалять и добавлять всегда стоит нулевой элемент
list.add(list.get(i));
list.remove(i);

Тогда и писать надо
list.add(list.get(0));
list.remove(0);
************************************************************************************************************ endЬ*/
