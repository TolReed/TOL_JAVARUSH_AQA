package com.javarush.task.task04.task0441;

/* 
Как-то средненько
*/

import java.io.*;
import java.util.*;

public class Solution {
    public static void main(String[] args) throws Exception {
        //напишите тут ваш код
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int a = Integer.parseInt(reader.readLine());
        int b = Integer.parseInt(reader.readLine());
        int c = Integer.parseInt(reader.readLine());

        int min = Math.min(a, Math.min(b,c));
        int max = Math.max(a, Math.max(b,c));
        int e = a + b + c - min - max;
        System.out.println(e);

        /*
        або способом масиву, виводимо середнє число
        * int[] intArr = {a,b,c};
        Arrays.sort(intArr);
        System.out.println(Arrays.toString(intArr));
        * */

        /*або нижче наведено бульбашкове сортування*/

    }
}

/*

import java.io.*;

public class Solution
{
    public static void main(String[] args) throws Exception
    {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int a = Integer.parseInt(reader.readLine());
        int b = Integer.parseInt(reader.readLine());
        int c = Integer.parseInt(reader.readLine());

        int array[];
        array = new int [] {a, b, c};

        System.out.println(array[1]);
    }

    public static void bubbleSort(int[] array)
    {
        boolean sortet = false;
        int temp;
        while (!sortet)
        {
            sortet = true;
            for (int i = 0; i < array.length - 1; i++)
            {
                if (array[i] > array[i + 1])
                {
                    temp = array[i];
                    array[i] = array[i + 1];
                    array[i + 1] = temp;
                    sortet = false;
                }
            }
        }
    }
} */
