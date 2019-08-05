package com.javarush.task.task07.task0721;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

/* 
Минимаксы в массивах
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        //напишите тут ваш код
        int[] integers = new int[20];
        for (int i = 0; i < 20; i++) {
            integers[i] = Integer.parseInt(reader.readLine());
        }

        int minimum = integers[0];
        int maximum = integers[0];

        for (int i = 0; i < integers.length; i++) {

            if (integers[i] < minimum) {
                minimum = integers[i];
            }
        }

        for (int i = 0; i < integers.length; i++) {
            if (integers[i] > maximum) {
                maximum = integers[i];
            }
        }

        System.out.print(maximum + " " + minimum);
    }
}

/*******************************************************************************************************************
  Надоело вводить цифры в ручную. На время отладки использую такой вариант: Random random = new Random();
        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = random.nextInt(99);
        }
*****************************************************************************************************   endЬ   */

/*******************************************************************************************************************
А я вот такую интересность нагуглил, а теперь пойду читать доку.
int maximum = Arrays.stream(numArray).max().getAsInt();
int minimum = Arrays.stream(numArray).min().getAsInt();
*****************************************************************************************************   endЬ   */

/********************************************************************************************************************
Прошло проверку используя фичи Java 8:
IntSummaryStatistics stat = Arrays.stream(array).summaryStatistics();
        minimum = stat.getMin();
        maximum = stat.getMax();
*****************************************************************************************************   endЬ   */
