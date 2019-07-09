package com.javarush.task.task04.task0414;

/* 
Количество дней в году
*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws Exception {
        //напишите тут ваш код
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String year = reader.readLine();

        int y = Integer.parseInt(year);

        int ALeapYear = 366;
        int AStandardYear = 365;

        if (y % 400 == 0) {
            System.out.println("количество дней в году: " + ALeapYear);
        } else if (y % 100 == 0) {
            System.out.println("количество дней в году: " + AStandardYear);
        } else if ((y % 4 == 0)) {
            System.out.println("количество дней в году: " + ALeapYear);
        } else {
            System.out.println("количество дней в году: " + AStandardYear);
        }
    }
}