package com.javarush.task.task08.task0822;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

/* 
Минимальное из N чисел
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        List<Integer> integerList = getIntegerList();
        System.out.println(getMinimum(integerList));
    }

    public static int getMinimum(List<Integer> array) throws IOException {
        // Найти минимум тут
        int minimum = array.get(0);
        for (int i = 0; i < array.size(); i++) {

            if (array.get(i) < minimum) {
                minimum = array.get(i);
            }
        }
        return minimum;
    }

    public static List<Integer> getIntegerList() throws IOException {
        // Создать и заполнить список тут
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        ArrayList<Integer> numbers = new ArrayList<Integer>();
        int N = Integer.parseInt(reader.readLine());
        for (int i = 0; i < N; i++) {
            int number = Integer.parseInt(reader.readLine());
            numbers.add(number);
        }

        return numbers;
    }
}
