package com.javarush.task.task07.task0722;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

/* 
Это конец
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        //напишите тут ваш код - Вводить с клавиатуры строки, пока пользователь не введет строку "end". Саму строку "end" не учитывать.
        ArrayList<String> list = new ArrayList<>();
        for (int i = 0; ; i++) {
            String s = reader.readLine();
            if (s.equals("end")) {
                break;
            } else {
                list.add(s);
            }
        }
        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i));
        }
    }
}