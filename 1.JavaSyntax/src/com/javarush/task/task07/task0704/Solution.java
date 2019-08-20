package com.javarush.task.task07.task0704;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Scanner;

/* 
Переверни массив
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        //напишите тут ваш код
        int[] numbers = new int[10];
        Scanner sc = new Scanner(System.in);

        //заповняємо наш масив числами з клавіатури
        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = sc.nextInt();
        }

        for (int i = numbers.length - 1; i >= 0; i--) { //проходимся п масиву і виводимо числа з зворотньому порядку
            System.out.println(numbers[i]);
        }

    }
}

