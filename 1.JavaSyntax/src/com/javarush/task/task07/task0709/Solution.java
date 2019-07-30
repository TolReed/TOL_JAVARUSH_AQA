package com.javarush.task.task07.task0709;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Scanner;

/* 
Выражаемся покороче
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        //напишите тут ваш код
        ArrayList<String> strings = new ArrayList<>();
        Scanner sc = new Scanner(System.in);

        for (int i = 0; i < 5; i++) {
            String s = sc.nextLine();
            strings.add(s);
        }

        int minString = strings.get(0).length();

        for (int i = 0; i < strings.size(); i++) {
            if (strings.get(i).length() < minString) {
                minString = strings.get(i).length();
                if (minString > strings.get(i).length()) {
                    System.out.println(minString);
                }
            }
        }


        for (int i = 0; i <strings.size(); i++) {
            if (minString == strings.get(i).length()) {
                System.out.println(strings.get(i));
            }

        }
    }
}
