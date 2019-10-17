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
        HashMap<String, Integer> map = new HashMap<String, Integer>();

        while (true) {
            try {

                String s = reader.readLine();
                if (s == null || s.isEmpty()) { // check if our entered line is not empty
                    break;
                }

                int id = Integer.parseInt(s);
                String name = reader.readLine();

                if (name.isEmpty()) { // check if our entered line for name is not empty
                    map.put("", id);
                    break;
                }

                map.put(name, id);

            }
            catch (Exception e) {
            }
        }

        for (Map.Entry<String, Integer> pair: map.entrySet()) {
            System.out.println(pair.getValue() + " " + pair.getKey());
        }

        //System.out.println("Id=" + id + " Name=" + name); <- old
    }
}

/* Old code - works but validator doesn't allow it! WHY ????????????????????????????????????



String s = reader.readLine();
            if (s.equals("")) {break;}
            String name = reader.readLine();
            int id = Integer.parseInt(s);
            if (name.equals("")) {break;}
            map.put(name, id);


*/