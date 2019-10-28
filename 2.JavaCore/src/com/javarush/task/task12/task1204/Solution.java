package com.javarush.task.task12.task1204;

/* 
То ли птица, то ли лампа
*/




public class Solution {
    public static void main(String[] args) {
        printObjectType(new Cat());
        printObjectType(new Bird());
        printObjectType(new Lamp());
        printObjectType(new Cat());
        printObjectType(new Dog());
    }

    public static void printObjectType(Object o) {
        //Напишите тут ваше решение
        if (o instanceof Cat) {
            System.out.println("Кошка");
        }
        if (o instanceof Dog) {
            System.out.println("Собака");
        }
        if (o instanceof Bird) {
            System.out.println("Птица");
        }
        if (o instanceof Lamp) {
            System.out.println("Лампа");
        }

    }

    public static class Cat {
    }

    public static class Dog {
    }

    public static class Bird {
    }

    public static class Lamp {
    }
}

/*
Теперь по сути: так как в метод printObjectType не передаётся какой-то определённый тип,
узнать этот тип без всяких if-else можно только с помощью рефлексии. Выглядит это как-то так:

System.out.println(o.getClass().getMethod("toString").invoke(o));


вставляешь этот код в метод printObjectType и он будет превращать в строку и выводить в консоль обьект любого класса,
который ты туда передашь. А toString переопределён нормально, его задача  - просто возвращать строку.
* */