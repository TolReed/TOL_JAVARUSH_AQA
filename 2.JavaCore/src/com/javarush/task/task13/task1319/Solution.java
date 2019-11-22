package com.javarush.task.task13.task1319;

import java.io.*;

/* 
Писатель в файл с консоли
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        // напишите тут ваш код

        BufferedReader consoleReader = new BufferedReader(new InputStreamReader(System.in));
        String fileName = consoleReader.readLine();
        FileInputStream inputStream = new FileInputStream(fileName);

        try {

            InputStreamReader inputStreamReader = new InputStreamReader(System.in); // поток чтения с консоли
            BufferedReader bufferedReader = new BufferedReader(inputStreamReader); // соединяем InputStreamReader с BufferedReader

            File file = new File("/Users/anatolii.dudochkin/Desktop/Tol/tol.txt");
            FileWriter fileWriter = new FileWriter(file); // поток, который подключается к текстовому файлу
            BufferedWriter bufferWritter = new BufferedWriter(fileWriter); // соединяем FileWriter с BufferedWriter


            while (true) {
                String line = bufferedReader.readLine();
                bufferWritter.write(line);
                bufferWritter.newLine();

                if (line.equals("exit")) {
                    break;
                }

            }

            bufferedReader.close();
            bufferWritter.close();


        } catch (Exception e) {
           e.printStackTrace();
        }

    }
}
