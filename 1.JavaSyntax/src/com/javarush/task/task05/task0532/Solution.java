package com.javarush.task.task05.task0532;

import java.io.*;

/* 
Задача по алгоритмам
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(reader.readLine());
        while (n > 0) { // перевіряємо чи введене число є більше нуля, а потім вводимо стільки чисел як n
            int maximum = Integer.MIN_VALUE; // Во всех задачах на минимум и максимум не надо объявлять их изначальное значение нулем:
                                             // либо инициализируй значением первого элемента,
                                             // либо инициализируй значениями Integer.MAX_VALUE для минимума и Integer.MIN_VALUE для максимума
            for (int i = 1; i < (n+1); i++) { //
                int nums = Integer.parseInt(reader.readLine()); // вводимо числа з клавіатури - n чисел
                if (nums > maximum) {
                    maximum = nums; // присвоїти значення максимального числа тому, яке введене з клавіатури (якщо від"ємні, то максимальне з від"ємних чисел)
                }
            }
            System.out.println(maximum); // вивести на екран максимальне число
            break;

        }

    }
}
