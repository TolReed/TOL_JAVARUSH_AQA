package com.javarush.task.task18.task1818;

/* 
Два в одном
*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws IOException {

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        String file1 = reader.readLine();
        String file2 = reader.readLine();
        String file3 = reader.readLine();

        reader.close();

        FileOutputStream fileOutputStream = new FileOutputStream(file1);
        FileInputStream fileInputStream1 = new FileInputStream(file2);
        FileInputStream fileInputStream2 = new FileInputStream(file3);

        byte[] buff1 = new  byte[fileInputStream1.available()];
        byte[] buff2 = new  byte[fileInputStream2.available()];

        int count1= fileInputStream1.read(buff1);
        int count2= fileInputStream2.read(buff2);

        fileInputStream1.close();
        fileInputStream2.close();

        try {
            fileOutputStream.write(buff1,0,count1);
            fileOutputStream.write(buff2,0,count2);
        } catch (Exception e) {

        }

        fileOutputStream.close();

    }
}
