package com.javarush.task.task05.task0517;

/* 
Конструируем котиков
*/

public class Cat {
    //напишите тут ваш код

    String name;
    int age;
    int weight;
    String color;
    String address;

    public Cat (String name) {
        this.name = name;
        this.color = "Yellow";
        this.age = 77;
        this.weight = 123;
    }

    public Cat (String name, int weight, int age) {
        this.name = name;
        this.weight = weight;
        this.age = age;
        this.color = "Coral";
    }

    public Cat (String name, int age) {
        this.name = name;
        this.age = age;
        this.weight = 10;
    }

    public Cat (int weight, String color) {
        this.weight = weight;
        this.color = color;
        this.name = null;
        this.address = null;
        int a = 10;
        this.age = a;
    }

    public Cat (int weight, String color, String address) {
        this.name = null;
        this.weight = weight;
        this.color = color;
        this.address = address;
        this.age = 123;
    }



    public static void main(String[] args) {

    }
}
