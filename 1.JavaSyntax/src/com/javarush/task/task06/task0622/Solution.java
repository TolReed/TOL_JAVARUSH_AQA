package com.javarush.task.task06.task0622;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Scanner;

/* 
Числа по возрастанию
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        Scanner input = new Scanner(System.in); // Объявляем Scanner

        int array[] = new int[5]; // Создаём массив int размером в size

        /*Пройдёмся по всему массиву, заполняя его*/
        for (int i = 0; i < 5; i++) {
            array[i] = input.nextInt(); // Заполняем массив элементами, введёнными с клавиатуры
        }

        Arrays.sort(array);
        for (int i: array) {
            System.out.println(i);}
    }




}

/******************************************************************* working solution for this task
 *
 *
 *      public static void main(String[] args) throws Exception {
            Scanner input = new Scanner(System.in); // Объявляем Scanner
            System.out.println("Enter array length: ");

            int size = input.nextInt(); // Читаем с клавиатуры размер массива и записываем в size
            int array[] = new int[size]; // Создаём массив int размером в size

            System.out.println("Insert array elements:");

            Пройдёмся по всему массиву, заполняя его
            for (int i = 0; i < size; i++) {
                array[i] = input.nextInt(); // Заполняем массив элементами, введёнными с клавиатуры
            }
            System.out.print ("Inserted array elements:");

            for (int i = 0; i < size; i++) {
                System.out.print (" " + array[i]); // Выводим на экран, полученный массив
            }
            System.out.println();

            System.out.print ("Sorted array elements:");
            Arrays.sort(array);
            System.out.println(Arrays.toString(array));
        }
 *************************************************************************end working solution for this task*/

/*

***********************************************************************bubble sorting method, enjoy, please
*   public class Main {

        public static void main(String[] args) {
            int [] mas = {11, 3, 14, 16, 7};

            boolean isSorted = false;
            int buf;
            while(!isSorted) {
                isSorted = true;
                for (int i = 0; i < array.length-1; i++) {
                    if(array[i] > array[i+1]){
                        isSorted = false;

                        buf = array[i];
                        array[i] = array[i+1];
                        array[i+1] = buf;
                    }
                }
            }
            System.out.println(Arrays.toString(array));
            }
    }
* *******************************************************************end bubble sorting method, enjoy, please */

