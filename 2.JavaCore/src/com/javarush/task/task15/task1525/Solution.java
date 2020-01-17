package com.javarush.task.task15.task1525;

import java.io.*;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

/* 
Файл в статическом блоке
*/

public class Solution {
    public static List<String> lines = new ArrayList<String>();

    static { // В статическом блоке считай из файла с именем Statics.FILE_NAME все строки и добавь их по отдельности в List lines

        try {

            BufferedReader reader = new BufferedReader(new InputStreamReader(new FileInputStream(Statics.FILE_NAME))); // < считай из файла с именем Statics.FILE_NAME
            String str;

            while ((str = reader.readLine()) != null) { // < считай из файла с именем Statics.FILE_NAME все строки и добавь их по отдельности в List lines и добавь их по отдельности в List lines
                lines.add(str);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {
        System.out.println(lines);
    }
}
