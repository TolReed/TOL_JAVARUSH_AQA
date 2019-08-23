package com.javarush.task.task09.task0926;

import java.util.ArrayList;

/* 
Список из массивов чисел
*/

public class Solution {
    public static void main(String[] args) {
        ArrayList<int[]> list = createList();
        printList(list);
    }

    public static ArrayList<int[]> createList() {
        //напишите тут ваш код
        ArrayList<int[]> array = new ArrayList<>();
        //Добавить в список пять объектов-массивов длиной 5, 2, 4, 7, 0
        int[] array1 = new int[5];
        int[] array2 = new int[2];
        int[] array3 = new int[4];
        int[] array4 = new int[7];
        int[] array5 = new int[0];
        //Добавить в список пять объектов-массивов длиной 5, 2, 4, 7, 0

        //Заполнить массивы любыми данными и вывести их на экран
        for (int i = 0; i < 5; i++) {
            array1[i] = i;
        }

        for (int i = 0; i < 2; i++) {
            array2[i] = i;
        }

        for (int i = 0; i < 4; i++) {
            array3[i] = i;
        }

        for (int i = 0; i < 7; i++) {
            array4[i] = i;
        }

        array.add(0, array1);
        array.add(array2);
        array.add(array3);
        array.add(array4);
        array.add(array5);

        return array;
        //Заполнить массивы любыми данными и вывести их на экран
    }

    public static void printList(ArrayList<int[]> list) {
        for (int[] array : list) {
            for (int x : array) {
                System.out.println(x);
            }
        }
    }
}
