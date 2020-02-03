package com.javarush.task.task18.task1821;

/* 
Встречаемость символов
*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws IOException {

        int[] symbols = new int[128];

        FileInputStream fis = new FileInputStream(new File(args[0]));

        while (fis.available() > 0) {
            char c = (char) fis.read();
            symbols[c] ++;
        }
        fis.close();

        for (int i = 0; i < symbols.length; i++) {
            if (symbols[i] != 0) {
                System.out.println((char) i + " " + symbols[i]);
            }
        }

    }
}
