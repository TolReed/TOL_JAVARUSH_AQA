package com.javarush.task.task18.task1801;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;

/* 
Максимальный байт
*/

public class Solution {
    public static void main(String[] args) throws Exception {


        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String name = reader.readLine();
        FileInputStream fileInputStream = new FileInputStream(name);

        ArrayList<Integer> bytes = new ArrayList<>();

        while (fileInputStream.available() > 0) {
            bytes.add(fileInputStream.read());
        }

        fileInputStream.close();

        System.out.println(Collections.max(bytes));

    }
}
