package com.javarush.task.task05.task0529;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/* 
Консоль-копилка
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        //напишите тут ваш код
        BufferedReader buffer = new BufferedReader(new InputStreamReader(System.in));


        int count = 0;
        int sum = 0;
        while (true)
        {
            String s = buffer.readLine();
            if (s.equals("сумма"))
                break;
            int Sn = Integer.parseInt(s);


            sum = sum + Sn;
            count++;
        }
        System.out.println(sum);

    }
}
