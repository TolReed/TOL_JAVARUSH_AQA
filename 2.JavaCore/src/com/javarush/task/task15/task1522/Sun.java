package com.javarush.task.task15.task1522;

public class Sun implements Planet {

    /* https://habr.com/ru/post/27108/ */

        private static Sun instance;
        private Sun() {

        }


        public static Sun getInstance() {
            if (instance == null) {
                instance = new Sun();
            }
            return instance;

        }
    }

