package com.javarush.task.task20.task2016;

/* 
Минимум изменений
*/
public class Solution { //https://javarush.ru/help/10267 https://javarush.ru/help/3995
    public class A {
        String name = "A";

        public A(String name) {
            this.name += name;
        }

        @Override
        public String toString() {
            return name;
        }
    }

    public class B extends A {
        String name = "B";

        public B(String name) {
            super(name);
            this.name += name;
        }
    }

    public class C extends B {
        String name = "C";

        public C(String name) {
            super(name);
            this.name = name;
        }
    }

    public static void main(String[] args) {

    }
}
