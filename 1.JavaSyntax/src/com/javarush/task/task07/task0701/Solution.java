package com.javarush.task.task07.task0701;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

/* 
Массивный максимум
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        int[] array = initializeArray();
        int max = max(array);
        System.out.println(max);
    }

    public static int[] initializeArray() throws IOException {
        // создай и заполни массив
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int [] numbers = new int[20];

        for (int i = 0; i < numbers.length; i ++) {
            numbers[i] = Integer.parseInt(reader.readLine()); //зчитуємо дані з клавіатури і заносимо їх у масив
        }
        return numbers;
    }

    public static int max(int[] array) throws IOException {
        // найди максимальное значение
        Arrays.sort(array);
        return array[array.length - 1]; // повертаємо максимальний елемент масиву, після того як відсортували
    }
}

/******************************************************************** we can use Scanner, not only bufferReader
Scanner.

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in); // Объявляем Scanner
        System.out.println("Enter array length: ");
        int size = input.nextInt(); // Читаем с клавиатуры размер массива и записываем в size
        int array[] = new int[size]; // Создаём массив int размером в size
        System.out.println("Insert array elements:");

        /*Пройдёмся по всему массиву, заполняя его*//*
        for (int i = 0; i < size; i++) {
        array[i] = input.nextInt(); // Заполняем массив элементами, введёнными с клавиатуры
        }
        System.out.print ("Inserted array elements:");
        for (int i = 0; i < size; i++) {
        System.out.print (" " + array[i]); // Выводим на экран, полученный массив
        }
        System.out.println();
        }
        А дальше работайте с массивом так же, как работали раньше с массивом, заполненным случайными числами.
*****************************************************************************************************************/



/*********************************************************************************** this way, also with Scanner
 *   public static void main(String[] agrs) {
        int[] a = new int[7];
        int i = 0;
        Scanner in = new Scanner(System.in);

        for (int element : a) {

            System.out.print("Введите " + (i + 1) + "-й элемент массива: ");
            a[i] = in.nextInt();

            System.out.println(a[i] + " - ");

            i++;
        }

        for (int element : a)

            System.out.print(element + " ");


 }
************************************************************************************************************** */



/*********************************************************************************** another way to solve it
    //Identifying min and max elements of array
    int minElement = integers[0];
        for (int i = 0; i < integers.length; i++) {
            if (integers[i] < minElement) {
            minElement = integers[i];
        }
    }
    System.out.println("Minimum element of array: " + minElement);
 ************************************************************************************************************** */
