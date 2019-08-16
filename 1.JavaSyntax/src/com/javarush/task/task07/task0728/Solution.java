package com.javarush.task.task07.task0728;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Collections;

/* 
В убывающем порядке
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int[] array = new int[20];
        for (int i = 0; i < 20; i++) {
            array[i] = Integer.parseInt(reader.readLine());
        }

        sort(array);

        for (int x : array) {
            System.out.println(x);
        }
    }

    public static void sort(int[] array) {
        //напишите тут ваш код - Написать программу, которая вводит с клавиатуры 20 чисел и выводит их в убывающем порядке
        for (int i = array.length-1; i > 0; i--) { //проходимося по всім елементам масиву ззаді-наперед
            for (int j = 0; j < i; j++) { // вводимо додаткову змінну для порівняння
                if (array[j] < array[j + 1]) { // якщо попередній елемент більше наступного
                    int a = array[j]; // змінна а присвоюємо значення попереднього елемента
                    array[j] = array[j + 1]; // значення попереднього елемента стає значенням наступного елемента
                    array[j + 1] = a; // значення настуного елемента стає значенням а
                }
            }
        }
        //for (int i = 0; i < array.length; i++) {
        //    System.out.println(array[i]);
        //}
    }
}
/*********************************************************************** Или мы можем создать массив случайных чисел

    int arr[] = new int[10];
    for(int i = 0; i < arr.length; i++) {
    //элементу массива присваивается случайное число от 0 до 99
        arr[i] = (int)(Math.random() * 100);
        System.out.print(arr[i] + "  ");
    }

*******************************************************************************************************************/

/*************************************************************************** Ще один варіант рішення даної задачі
 *
 * public static void sort(int[] array) {
        //напишите тут ваш код
        ArrayList<Integer> list = new ArrayList<>();
        for(int i = 0; i < array.length; i++){
            list.add(array[i]);
        }

        int index = 0;
        for(int i = 0; i < 19; i++) {

            //находим в цикле значение индекса, где расположен максимум
            for (int j = i; j < list.size(); j++) {
                if (j == i) index = j;
                if (list.get(j) > list.get(index)) index = j;
            }

            list.add(i, list.get(index));
            list.remove(index + 1);
        }

        for (int i = 0; i <list.size(); i++){
            array[i] = list.get(i);
        }
    }
}

 ****************************************************************************************************************/