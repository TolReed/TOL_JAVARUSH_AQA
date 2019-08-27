package com.javarush.task.task10.task1004;

/* Задача №4 на преобразование целых типов*/

public class Solution {
    public static void main(String[] args) {
        short number = 9;
        char zero = '0';
        int nine = (zero + number);
        System.out.println((char) nine); //add (char) here, result = 57 and this is 9 in char
    }
}
