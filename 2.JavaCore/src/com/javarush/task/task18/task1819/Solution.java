package com.javarush.task.task18.task1819;

/* 
Объединение файлов
*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws IOException {

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String file1 = reader.readLine();
        String file2 = reader.readLine();
        reader.close();

        InputStream input_file1 = new FileInputStream(file1);
        byte[] bytes_file1 = new byte[input_file1.available()];
        input_file1.read(bytes_file1);
        input_file1.close();

        InputStream input_file2 = new FileInputStream(file2);
        byte[] bytes_file2 = new byte[input_file2.available()];
        input_file2.read(bytes_file2);
        input_file2.close();

        OutputStream output_file1 = new FileOutputStream(file1);
        output_file1.write(bytes_file2);
        output_file1.write(bytes_file1);

        output_file1.close();

    }
}
