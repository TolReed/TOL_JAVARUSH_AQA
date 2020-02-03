package com.javarush.task.task18.task1822;

/* 
Поиск данных внутри файла
*/

import java.io.*;
import java.util.Scanner;

public class Solution {
    public static void main(String[] args) throws IOException {

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        BufferedReader file = new BufferedReader(new FileReader(reader.readLine()));

        while (file.ready()){
            String s = file.readLine();
            String[] str  = s.split(" ");
            if (str[0].equals(args[0])){
                System.out.println(s);
            }
        }
        file.close();
        reader.close();
    }
}