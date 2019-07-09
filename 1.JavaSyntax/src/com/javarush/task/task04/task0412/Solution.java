package com.javarush.task.task04.task0412;

/* 
Положительное и отрицательное число
*/

import java.io.*;
import java.util.*;

public class Solution {
    public static void main(String[] args) throws Exception {
        //напишите тут ваш код
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String number = reader.readLine();
        int inputN = Integer.parseInt(number);

        if (inputN > 0) {
            System.out.println(inputN * 2);
        }
        else if (inputN < 0) {
            System.out.println(inputN + 1);
        }
        if (inputN == 0) {
            System.out.println(inputN);
        }

    }

}