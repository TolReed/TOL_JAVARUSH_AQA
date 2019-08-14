package com.javarush.task.task08.task0829;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* 
Модернизация ПО
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        Map<String, String> map = new HashMap<String, String>();
        while (true) {
            //Запускаем программу, вводим город enter, дальше фамилию и опять enter.
            // И так до бесконечности, пока ты вместо города не введёшь пустую строку.
            // А потом надо ввести город из ранние введённых.
            // И программа должна выдать фамилию которую ты ввел в паре с этим городом.
            // Вместо break попробую return.
            String city = reader.readLine();
            if (city.isEmpty()) {
                break;
            }
            String family = reader.readLine();

            map.put(city, family);
        }

        // Read the city
        String city = reader.readLine(); // we can add toLowerCase and other condition to reduce number of defects

        for (Map.Entry<String, String> pair: map.entrySet()) {
            if (city.equals(pair.getKey())) {
                System.out.println(pair.getValue());
                break;
            }
        }
    }
}

/**************************************************************************** було так, а змінилося на те що є

        public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        List<String> list = new ArrayList<>();
        while (true) {
            String family = reader.readLine();
            if (family.isEmpty()) {
                break;
            }

            list.add(family);
        }

        // Read the house number
        int houseNumber = Integer.parseInt(reader.readLine());

        if (0 <= houseNumber && houseNumber < list.size()) {
            String familyName = list.get(houseNumber);
            System.out.println(familyName);
        }
    }

 ****************************************************************************************************************/