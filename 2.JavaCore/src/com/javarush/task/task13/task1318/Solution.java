package com.javarush.task.task13.task1318;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.io.FileInputStream;

/* 
Чтение файла
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        // напишите тут ваш код
        // Строки и числа мы читаем так:
        BufferedReader consoleReader = new BufferedReader(new InputStreamReader(System.in));
        String fileName = consoleReader.readLine();
        FileInputStream inputStream = new FileInputStream(fileName);

        BufferedReader reader = new BufferedReader(new InputStreamReader(inputStream));


        while ( inputStream.available() > 0) {
            System.out.print((char)inputStream.read()); //inputStream.read() читает не строки, а отдельные байты,
                                                    // т.е. ты каждый байт выводишь в виде новой строки
        }

        reader.close();
        consoleReader.close();
        inputStream.close();
    }
}