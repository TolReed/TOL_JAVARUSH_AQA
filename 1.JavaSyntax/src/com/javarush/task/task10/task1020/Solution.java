package com.javarush.task.task10.task1020;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/* 
Задача по алгоритмам
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int[] array = new int[30];
        for (int i = 0; i < 30; i++) {
            array[i] = Integer.parseInt(reader.readLine());
        }

        sort(array);

        /*
        for (int e: array) {
            System.out.println("This is " + e + " number");
        }
        System.out.println("this is just for testing purposes, please, compare result of two lines below");*/

        System.out.println(array[9]);
        System.out.println(array[10]);
    }

    public static void sort(int[] array) {
        //напишите тут ваш код
        int buffer = 0;

        for (int i = 0; i < array.length; i++) {
            for (int j = 1; j < (array.length - i); j++) {
                if (array[j-1] > array[j]) {
                    //swap elements
                    buffer = array[j-1];
                    array[j-1] = array[j];
                    array[j] = buffer;
                }
            }
        }
    }
}
