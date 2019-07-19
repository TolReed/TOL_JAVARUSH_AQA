package com.javarush.task.task05.task0510;

/* 
Кошкоинициация
*/

public class Cat {
    //напишите тут ваш код

    String name;
    int age;
    int weight;
    String color;
    String address;

    public void initialize (String name) {
        this.name = name;
        this.color = "Yellow";
        this.age = 77;
        this.weight = 123;
    }

    public void initialize (String name, int weight, int age) {
        this.name = name;
        this.weight = weight;
        this.age = age;
        this.color = "Coral";
    }

    public void initialize (String name, int age) {
        this.name = name;
        this.age = age;
        this.weight = 10;
    }

    public void initialize (int weight, String color) {
        this.weight = weight;
        this.color = color;
        this.name = null;
        this.address = null;
        int a = 10;
        this.age = a;
    }

    public void initialize (int weight, String color, String address) {
        this.name = null;
        this.weight = weight;
        this.color = color;
        this.address = address;
        int a = 10;
        this.age = a;
    }

    public static void main(String[] args) {

    }
}
