package com.javarush.task.task18.task1817;

/* 
Пробелы
*/

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class Solution {
    public static void main(String[] args) throws IOException {

        double countSpace = 0d;
        int symbol = 0;

        FileInputStream fileInputStream = new FileInputStream(args[0]);
        int s;
        while ((s = fileInputStream.read()) != -1) {
            symbol++;
            if (s == 32) {
                countSpace++;
            }
        }

        fileInputStream.close();
        double result = countSpace / symbol * 100;
        String output = String.format("%.2f", result);
        System.out.println(output);

    }
}
