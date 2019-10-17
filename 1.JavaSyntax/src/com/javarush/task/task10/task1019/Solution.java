package com.javarush.task.task10.task1019;

import java.io.*;
import java.util.HashMap;
import java.util.Map;

/* 
Функциональности маловато!
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        HashMap<Integer, String> map = new HashMap<Integer, String>();

        while (true) {
            int id = Integer.parseInt(reader.readLine());
            String name = reader.readLine();
            map.put(id, name);

            if (name.isEmpty()) {
                //map.put(id, "");
                break;

            }
        }

        for (Map.Entry<Integer, String> pair: map.entrySet()) {
            System.out.println(pair.getKey() + " " + pair.getValue());
        }

        //System.out.println("Id=" + id + " Name=" + name); <- old
    }
}
