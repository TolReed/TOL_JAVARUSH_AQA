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
            String Stringid = reader.readLine();
            int id = Integer.parseInt(Stringid);
            String name = reader.readLine();

            if (name.isEmpty() || Stringid.isEmpty()) {
                map.put(id, "");
                break;
                } else {
                map.put(id, name);
            }
        }

        for (Map.Entry<Integer, String> pair: map.entrySet()) {
            System.out.println(pair.getKey() + " " + pair.getValue());
        }

        //System.out.println("Id=" + id + " Name=" + name); <- old
    }
}
