package com.javarush.task.task06.task0603;

/* 
По 50 000 объектов Cat и Dog
*/

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class Solution {
    public static void main(String[] args) {
        // напишите тут ваш код
        for (int i = 0; i < 50000; i ++) {
            Cat cat = new Cat();
        }

        for (int j = 0; j < 50000; j ++) {
            Dog dog = new Dog();
        }

        /******************************************************** play with list from the console
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        ArrayList<Integer> list = new ArrayList<Integer>();

        while (true)
        {
            String s = null;
            try {
                s = reader.readLine();
            } catch (IOException e) {
                e.printStackTrace();
            }
            if (s.isEmpty()) break;

            int x = Integer.parseInt(s);
            if (x % 2 == 0)  //проверяем, что остаток от деления на два равен нулю
                list.add(x);          //добавление в конец
            else
                list.add(0, x);      //вставка в начало
        }

        System.out.println(list);
        ********************************************************************************** end */




        /******************************************************************************************** arrays sort
         *  public class Main {
         *  public static void main(String[] args) {
         *  int[] numbers = {167, -2, 16, 99, 26, 92, 43, -234, 35, 80};
         *  Arrays.sort(numbers);
         *  System.out.println(Arrays.toString(numbers));
         *      }
         *  }
         *****************************************************************************************end arrays sort*/

    }
}

class Cat {
    @Override
    protected void finalize() throws Throwable {
        super.finalize();
        System.out.println("A Cat was destroyed");
    }
}

class Dog {
    @Override
    protected void finalize() throws Throwable {
        super.finalize();
        System.out.println("A Dog was destroyed");
    }
}
