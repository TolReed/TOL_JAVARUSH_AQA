package com.javarush.task.task07.task0703;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Scanner;

/* 
Общение одиноких массивов
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        //напишите тут ваш код
        Scanner s = new Scanner(System.in);

        String[] list = new String[10];
        int[] array = new int[10];

        for (int i = 0; i < list.length; i++) {
            list[i] = s.nextLine(); // зчитуємо з екрану строки
            array[i] = list[i].length(); // для кожної строчки в масиві присвоюємо відповідне значення довжини в масив чисел

        }

        for(int i = 0; i < list.length; i++)
            System.out.println(array[i]);

    }
}

/************************************************************************ try this solution with BufferedReader
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String[] list = new String[10];
        int[] array = new int[list.length];

        for(int i = 0; i < list.length; i++)
        {
            list[i] = reader.readLine();
            array[i] = list[i].length();//напишите тут ваш код
        }

        for(int i = 0; i < list.length; i++)
        {
            System.out.println(array[i]);
        }

*******************************************************************************************************************/