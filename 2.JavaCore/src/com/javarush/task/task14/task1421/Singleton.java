package com.javarush.task.task14.task1421;

public class Singleton { /* https://habr.com/ru/post/27108/ */

    private static Singleton instance;
    private Singleton () {
    }


    public static Singleton getInstance() {
        if (instance == null) {
            instance = new Singleton();
        }
        return instance;

    }
}


