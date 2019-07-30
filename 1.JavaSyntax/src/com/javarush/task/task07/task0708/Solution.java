package com.javarush.task.task07.task0708;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Scanner;

/* 
Самая длинная строка
*/

public class Solution {
    private static ArrayList<String> strings;

    public static void main(String[] args) throws Exception {
        //напишите тут ваш код
        strings = new ArrayList<>();
        Scanner sc = new Scanner(System.in);

        for (int i = 0; i < 5; i++) {
            String s = sc.nextLine();
            strings.add(s);
        }


        int maxString = 0;
        for (int i = 0; i < strings.size(); i++) {
            if (strings.get(i).length() > maxString) {
                maxString = strings.get(i).length();
                if (maxString > strings.get(i).length()) {
                    System.out.println(maxString);
                }
            }
        }


        for (int i = 0; i <strings.size(); i++) {
            if (maxString == strings.get(i).length()) {
                System.out.println(strings.get(i));
            }

        }

    }
}
