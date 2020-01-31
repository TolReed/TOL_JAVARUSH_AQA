package com.javarush.task.task18.task1803;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.InputStreamReader;
import java.util.ArrayList;

/* 
Самые частые байты
*/

public class Solution {
    public static void main(String[] args) throws Exception {


        int[] bytes = new int[255];
        BufferedReader filename = new BufferedReader(new InputStreamReader(System.in));
        FileInputStream is = new FileInputStream(filename.readLine());
        byte b;
        while (is.available() > 0) {
            b = (byte)is.read();
            bytes[b]++;
        }
        ArrayList<Integer> maxBytes = new ArrayList<>();
        int max = 1;
        for (int i = 0; i < bytes.length; i++){
            if (bytes[i] > max){
                max = bytes[i];
            }
        }
        for (int i = 0; i < bytes.length; i++){
            if (bytes[i] == max){
                maxBytes.add(i);
            }
        }
        for (Integer maxByte : maxBytes) {
            System.out.print(maxByte + " ");
        }
        filename.close();
        is.close();
    }
}
