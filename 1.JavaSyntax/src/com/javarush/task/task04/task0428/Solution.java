package com.javarush.task.task04.task0428;

/* 
Положительное число
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

        if (a > 0)
            np++;

        if (b > 0 )
            np++;

        if (c > 0)
            np++;

        if (np > 0) {
                System.out.println(np);
        } else {
            System.out.println(0);
        }
    }
}

/*
*        int np = 0;
        {
        if (a > 0) np++;
        if (b > 0) np++;
        if (c > 0) np++;
        }
        if (np > 0) System.out.println("количество положительных чисел "+np);
        else System.out.println(0);
    }

* */