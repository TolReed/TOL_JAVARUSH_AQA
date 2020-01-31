package com.javarush.task.task18.task1816;

/* 
Английские буквы
*/
// https://javarush.ru/help/33074
import java.io.FileInputStream;
import java.io.IOException;

public class Solution {
    public static void main(String[] args) throws IOException {
        int simbol = 0;
        FileInputStream inFile = new FileInputStream(args[0]);
        int i;
        String stw;
        StringBuilder builder = new StringBuilder();
        while ((i = inFile.read()) != -1) {
            builder.append((char) i);
            stw = builder.toString();
            stw = stw.replaceAll("\\p{Cntrl}", " ");
            if (stw.matches(".*[a-zA-Z]")) simbol++;
        }
        //System.out.print(stw);
        inFile.close();
        System.out.print(simbol);
    }
}
