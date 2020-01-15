package com.javarush.task.task15.task1518;

/* 
Статики и котики
*/

public class Solution {
    public static Cat cat; //В статическом блоке создай объект типа Cat и присвой его переменной cat (не забудь инициализировать поле name).


    public static void main(String[] args) {

    }

    public static class Cat {
        public String name;
    }

    static {
        cat = new Cat();
        cat.name = "Tol";
        System.out.println(cat.name); //В статическом блоке выведи имя созданного кота на экран.

    }


}

/*
Cat cat; // создание переменной.
cat = new Cat(); // инициализация переменной.
Cat cat = new Cat(); // создание и инициализация сразу.
*/