package com.javarush.task.task15.task1528;

/* 
ООП. Hrivna — тоже деньги
*/

public class Solution {
    public static void main(String[] args) {
        System.out.println(new Hrivna().getAmount());
    }

    public static abstract class Money {
        abstract Money getMoney();

        public Object getAmount() {
            return getMoney().getAmount();
        }
    }

    //add your code below - добавь код ниже
    public static class Hrivna extends Money {
        private Object amount = 123d;

        public Hrivna getMoney() {
            return this;
        }

        @Override
        public Object getAmount() {
            return amount;
        }
    }
}


/*
Comments:
        2. Метод позволяет вернуть объект целиком.
        1. На объекте что возвращает метод из пункта 2 вы можете
        вызвать метод getAmount() , который в свою очередь позволит вернуть значение amount.
        3. Вы можете изменить на любой тип (Integer, Double, String..), задача будет работать, хотя как поведет себя валидатор не известно) .
        Благодаря возвращаемому параметру Object, в абстрактном классе, вы можете переопределить
        метод и указать любой тип возвращаемого значения, так как все классы наследуются от Object.

        ! В обоих методах getAmount замените double на Object.
*/