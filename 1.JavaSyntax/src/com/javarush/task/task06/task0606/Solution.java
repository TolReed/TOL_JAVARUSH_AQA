package com.javarush.task.task06.task0606;

import java.io.*;

/* 
Чётные и нечётные циферки
*/

public class Solution {

    public static int even;
    public static int odd;

    public static void main(String[] args) throws IOException {
        //напишите тут ваш код
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String A = reader.readLine();
        int nA = Integer.parseInt(A);

        if (nA != 0) {
            for (int i = 0; i <= A.length(); i++) {
                if (nA % 2 == 0) {
                    even++;
                } else {
                    odd++;
                }
                nA = nA / 10;

                if (nA == 0)
                    break;
            }

        }
        System.out.println("Even: " + even + " Odd: " + odd);
    }
}
