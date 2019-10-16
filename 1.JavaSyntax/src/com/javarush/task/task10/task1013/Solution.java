package com.javarush.task.task10.task1013;

/* 
Конструкторы класса Human
*/

public class Solution {
    public static void main(String[] args) {
    }

    public static class Human {
        // Напишите тут ваши переменные и конструкторы
        private String firstName;
        private String secondName;
        private int age;
        private Boolean sex;
        private String address;
        private int phoneNumber;


        public Human () {
        }

        public Human (String firstName) {
            this.firstName = firstName;
        }

        public Human (String firstName, String secondName) {
            this.firstName = firstName;
            this.secondName = secondName;
        }

        public Human (String firstName, String secondName, int age) {
            this.firstName = firstName;
            this.secondName = secondName;
            this.age = age;
        }

        public Human (String firstName, String secondName, int age, Boolean sex) {
            this.firstName = firstName;
            this.secondName = secondName;
            this.age = age;
            this.sex = sex;
        }

        public Human (String firstName, String secondName, int age, Boolean sex, String address) {
            this.firstName = firstName;
            this.secondName = secondName;
            this.age = age;
            this.sex = sex;
            this.address = address;
        }

        public Human (String firstName, String secondName, int age, Boolean sex, String address, int phoneNumber) {
            this.firstName = firstName;
            this.secondName = secondName;
            this.age = age;
            this.sex = sex;
            this.address = address;
            this.phoneNumber = phoneNumber;
        }

        public Human (String address, int phoneNumber) {
            this.address = address;
            this.phoneNumber = phoneNumber;
        }

        public Human (int age, Boolean sex, String address, int phoneNumber) {
            this.age = age;
            this.sex = sex;
            this.address = address;
            this.phoneNumber = phoneNumber;
        }

        public Human (String firstName, String secondName, Boolean sex, String address, int phoneNumber) {
            this.firstName = firstName;
            this.secondName = secondName;
            this.sex = sex;
            this.address = address;
            this.phoneNumber = phoneNumber;
        }
    }


}
