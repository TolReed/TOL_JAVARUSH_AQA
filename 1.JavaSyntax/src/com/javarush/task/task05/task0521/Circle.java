package com.javarush.task.task05.task0521;

/* 
Вызов конструктора из конструктора
*/

public class Circle {

    public double x;
    public double y;
    public double radius;

    public Circle(double x, double y, double radius) {
        this.x = x;
        this.y = y;
        this.radius = radius;
    }

    public Circle(double x, double y) {
        //напишите тут ваш код
        this(x, y, 10.0); //визвати конструктор з 3 параметрамми із конструктора з 2ма параметрави,
                                // як реалізовано у визові конструктора в конструкторі нижче (5,5,1)
    }

    public Circle() {
        this(5, 5, 1);
    }

    public static void main(String[] args) {
        Circle circle = new Circle();
        System.out.println(circle.x + " " + circle.y + " " + circle.radius);
        Circle anotherCircle = new Circle(10, 5);
        System.out.println(anotherCircle.x + " " + anotherCircle.y + " " + anotherCircle.radius);
    }
}
