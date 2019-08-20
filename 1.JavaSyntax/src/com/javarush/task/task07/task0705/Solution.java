package com.javarush.task.task07.task0705;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;

/* 
Один большой массив и два маленьких
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        //напишите тут ваш код
        int[] numbers = new int[20];
        Scanner sc = new Scanner(System.in);

        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = sc.nextInt();
        }

        int[] copyFirstHalf = new int[10]; //копіюємо першу пловину масиву
        copyFirstHalf = Arrays.copyOfRange(numbers, 0, 9);
        int[] copySecondHalf = new int[10]; //копіюємо другу половину масиву
        copySecondHalf = Arrays.copyOfRange(numbers, 10, 20);

        for (int i: copySecondHalf) {
            System.out.println(i);
        }
    }
}
