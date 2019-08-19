package com.javarush.task.task07.task0712;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Scanner;

/* 
Самые-самые short or long - try
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        //напишите тут ваш код
        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;

        ArrayList<String> arrayList = new ArrayList<>();
        Scanner sc = new Scanner(System.in);

        for (int i = 0; i < 10; i++) {
            arrayList.add(i, sc.nextLine());
            if (arrayList.get(i).length() < min) { //знаходимо мінільне значення
                min = arrayList.get(i).length();
            }
            if (arrayList.get(i).length() > max) { //знаходимо максимальне значення
                max = arrayList.get(i).length();
            }
        }

        int j = 0;

        while (true) {

            if (arrayList.get(j).length() == min) {
                System.out.println(arrayList.get(j));
                break;
            }
            if (arrayList.get(j).length() == max) {
                System.out.println(arrayList.get(j));
                break;
            }
            j++;
        }
    }
}
