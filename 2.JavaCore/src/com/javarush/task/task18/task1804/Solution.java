package com.javarush.task.task18.task1804;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/* 
Самые редкие байты
*/

public class Solution {
    public static void main(String[] args) throws Exception {


        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String fReader = reader.readLine();

        FileInputStream fileInputStream = new FileInputStream(fReader);
        ArrayList<Integer> list = new ArrayList<>();

        while (fileInputStream.available() > 0) {
            list.add(fileInputStream.read());
        }
        fileInputStream.close();

//        for (int i = 0; i < list.size(); i++) {
//            System.out.print(list.get(i) + " ");
//        }

        HashMap<Integer, Integer> map = new HashMap<>();

        for (int i = 0; i < list.size(); i++) {
            map.put(list.get(i), Collections.frequency(list, list.get(i)));
        }

        int min = map.size();
        //System.out.println(min);
        for (Integer value : map.values()) {
            if (min > value) {
                min = value;
            }
        }

        //System.out.println(min);

        for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
            if (entry.getValue() == min) {
                System.out.print(entry.getKey() + " ");
            }
        }
    }
}