package com.javarush.task.task07.task0718;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Scanner;

/* 
Проверка на упорядоченность
*/
public class Solution {
    public static void main(String[] args) throws IOException {
        //напишите тут ваш код
        ArrayList<String> list = new ArrayList<>();
        Scanner sc = new Scanner(System.in);

        for (int i = 0; i < 10; i++) {
            list.add(i, sc.nextLine());
        }

        int x = 0;

        for (int i = 0; i < list.size() - 1; i++) {
            if (list.get(i).length() < list.get(i+1).length()) {
                continue;
            } else {
                x = i + 1;
                System.out.println(x);
                break;
            }
        }
    }
}

