package com.javarush.task.task09.task0921;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

/* 
Метод в try..catch
*/

public class Solution {
    public static void main(String[] args) {
        readData();
    }

    public static void readData() {
        //напишите тут ваш код
        ArrayList<Integer> numbers = new ArrayList<Integer>();
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        try {
            while (true) {
                numbers.add(Integer.parseInt(reader.readLine()));
                }
            } catch (Exception e) {
            e.printStackTrace();

            for (int i: numbers) {
                System.out.println(i);
            }
        }

    }

}
/*
future improvements:
1.  Так как list никак не чистится, то если в main запустить readData() несколько раз - каждый раз list будет увеличиваться,
    и выводить результаты еще и предыдущих вызовов метода readData().
    Лучше сделать его локальной переменной метода.
2.  Change 101 in order to input was much as I want numbers and add them to the array > done, changed to WHILE
*/