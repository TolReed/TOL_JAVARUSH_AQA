package com.javarush.task.task05.task0507;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/* 
Среднее арифметическое
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        //напишите тут ваш код
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        double sum = 0; //initialize variable to store the sum of all entered digits
        int count = 0; //initialize variable to store number of entered digits
        while (true) {
            double number = Integer.parseInt(reader.readLine()); //read from the console
            if (number == -1) //condition to quite the loop
                break;

            sum = sum + number; // the sum is equals first value + entered digit/s
            count ++; // increment counter after each entered digit

        }
        System.out.println(sum/count); //print average number of entered digits, -1 is not counted
    }
}

