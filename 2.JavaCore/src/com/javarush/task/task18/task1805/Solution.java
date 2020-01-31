package com.javarush.task.task18.task1805;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.InputStreamReader;
import java.util.TreeSet;

/* 
Сортировка байт - https://javarush.ru/help/34818, https://javarush.ru/help/31747
*/

public class Solution {
    public static void main(String[] args) throws Exception {

        BufferedReader readerOne = new BufferedReader(new InputStreamReader(System.in));
        FileInputStream isOne = new FileInputStream(readerOne.readLine());

        TreeSet<Integer> mySet = new TreeSet<>();

        while (isOne.available() > 0){
            mySet.add(isOne.read());
        }

        for (Integer nextInt : mySet){
            System.out.print(nextInt + " ");
        }

        readerOne.close();
        isOne.close();
    }
}
