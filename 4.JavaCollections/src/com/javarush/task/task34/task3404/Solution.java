package com.javarush.task.task34.task3404;

/* 
Рекурсия для мат. выражения
*/
public class Solution {
    public void recursion(int n) {
        int m = 2;
        while (m <= n) {
            if (n % m == 0) {
                System.out.print(m + " ");
                if (m == n)
                    return;
                recursion(n/m);
                break;
            }
            m++;
        }

    }
}