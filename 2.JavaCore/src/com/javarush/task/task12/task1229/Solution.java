package com.javarush.task.task12.task1229;

/* 
Родитель класса CTO
*/

public class Solution {

    public static void main(String[] args) {
        CTO cto = new CTO();
        System.out.println(cto);
    }

    public static class Human implements Businessman {
        @Override
        public void workHard() {
        }
    }

    public static interface Businessman {
        public void workHard();
    }

    public static class CTO extends Human implements Businessman {

    }

}

/*

NOTE:   У интерфейса все методы абстрактные всегда, т.к. в интерфесе мы можем только объявить метод, но не можем реализовать.
        Поэтому не нужно добавлять модификатор abstract.
        В абстрактном классе можем реализовать метод, поэтому если хотим сделать метод абстрактным, нужно это указать.

*/