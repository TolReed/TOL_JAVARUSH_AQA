package com.javarush.task.task05.task0504;


/* 
Трикотаж
*/
public class Solution {
    public static void main(String[] args) {
        //напишите тут ваш код
        Cat first = new Cat("First", 10, 10, 10);
        Cat second = new Cat("Second", 20, 22, 222);
        Cat third = new Cat("Third", 30, 303, 3030);
    }

    public static class Cat {
        private String name;
        private int age;
        private int weight;
        private int strength;

        public Cat(String name, int age, int weight, int strength) {
            this.name = name;
            this.age = age;
            this.weight = weight;
            this.strength = strength;
        }
    }
}