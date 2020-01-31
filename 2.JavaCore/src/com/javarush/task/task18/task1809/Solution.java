package com.javarush.task.task18.task1809;

/* 
Реверс файла - https://javarush.ru/help/33324
*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws IOException {

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String firstFileName = reader.readLine();
        String secondFileName = reader.readLine();

        FileInputStream inputStream = new FileInputStream(firstFileName);
        FileOutputStream outputStream1 = new FileOutputStream(secondFileName);

        if(inputStream.available() > 0){
            byte[] buff = new byte[inputStream.available()];
            int count = inputStream.read(buff);
            for(int i = buff.length - 1; i >= 0; i--){
                outputStream1.write(buff[i]);
            }
        }

        reader.close();
        inputStream.close();
        outputStream1.close();

    }


}

/* dec sort
static void sort(byte[] buff){
        byte tmp = 0;
        for(int i = buff.length-1; i > 0; i--){
            for(int j = 0; j < i; j++){
                if(buff[j] < buff[j + 1]) {
                    tmp = buff[j];
                    buff[j] = buff[j + 1];
                    buff[j + 1] = tmp;
                }
            }
        }
    }


*/
