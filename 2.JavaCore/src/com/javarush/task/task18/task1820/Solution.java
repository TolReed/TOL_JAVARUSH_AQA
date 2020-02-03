package com.javarush.task.task18.task1820;

/* 
Округление чисел
*/

import java.io.*;
import java.math.BigDecimal;
import java.math.MathContext;
import java.math.RoundingMode;
import java.util.ArrayList;

public class Solution {
    public static void main(String[] args) throws IOException {

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String name1 = reader.readLine();
        String name2 = reader.readLine();
        reader.close();
        FileInputStream fileInput1 = new FileInputStream(name1);
        FileOutputStream fileOutput = new FileOutputStream(name2);
        BufferedReader reader1 = new BufferedReader (new InputStreamReader (fileInput1));
        String list = reader1.readLine();

        for (String part : list.split(" ")) {

            String tmp = Math.round(Double.parseDouble(part)) + " ";
            fileOutput.write(tmp.getBytes());

        }

        fileInput1.close();
        fileOutput.close();

    }
}
