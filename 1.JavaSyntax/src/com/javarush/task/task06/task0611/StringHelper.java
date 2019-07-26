package com.javarush.task.task06.task0611;

/* 
Класс StringHelper
*/

public class StringHelper {
    public static String multiply(String s) {
        String result = "";
        for (int i = 0; i < 5; i++) {
            result += s;

        }
        //напишите тут ваш код
        return result;
    }

    public static String multiply(String s, int count) {
        String result = "";
        //напишите тут ваш код
        for (int i = 0; i < count; i++) {
            result += s;

        }
        return result;
    }

    public static void main(String[] args) {
        System.out.println(multiply("TolReed"));
        System.out.println(multiply("TolReed", 10));
    }
}
