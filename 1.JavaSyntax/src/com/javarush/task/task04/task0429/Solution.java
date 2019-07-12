package com.javarush.task.task04.task0429;

/* 
Положительные и отрицательные числа
*/

import java.io.*;
import java.util.*;

public class Solution {
    public static void main(String[] args) throws Exception {
        //напишите тут ваш код
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int a = Integer.parseInt(reader.readLine());
        int b = Integer.parseInt(reader.readLine());
        int c = Integer.parseInt(reader.readLine());
        int np = 0;
        int no = 0;

        if (a > 0) {
            np++;
        } else if (a < 0) {
            no++;
        }

        if (b > 0 ) {
            np++;
        } else if (b < 0) {
            no++;
        }

        if (c > 0) {
            np++;
        } else if (c < 0) {
            no++;
        }

        if (np == 0 && no == 0) {

        } else {
            System.out.println("количество положительных чисел: " + np);
            System.out.println("количество отрицательных чисел: " + no);
        }



    }
}
