package com.javarush.task.task03.task0325;

import java.io.*;
import java.util.*;

/* 
Финансовые ожидания
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        //напишите тут ваш код
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String sN = reader.readLine();
        int n = Integer.parseInt(sN);
        System.out.println("Я буду зарабатывать $" + n + " в час");

    }
}
