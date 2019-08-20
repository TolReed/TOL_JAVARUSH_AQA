package com.javarush.task.task09.task0906;

/* 
Логирование стек-трейса
*/

public class Solution {
    public static void main(String[] args) {
        log("In main method");
    }

    public static void log(String s) {
        //напишите тут ваш код
        Thread t = Thread.currentThread();
        String nameOfMethod = t.getStackTrace()[2].getMethodName();
        String nameOfClass = t.getStackTrace()[2].getClassName();
        System.out.println(nameOfClass + ": " + nameOfMethod + ": " + s);
    }
}
/*
comment nambaa 1

stackTraceElements[0] это метод getStackTrace
stackTraceElements[1] это метод из которого мы вызываем наш метод
stackTraceElements[2] это искомый метод

comment nambaa 2
Thread.currentThread().getStackTrace()[2] - это по сути элемент массива, ведь изначально запись была такой: StackTraceElement [] element = Thread.currentThread().getStackTrace();
таким образом мы создали массив под названием element с типом элементов в нем StackTraceElement,
и потом мы можем обращаться к любому элементу массива с помощью такой записи:
element[0] или element[1] или element[2]..... запись Thread.currentThread().getStackTrace()[2] это тоже самое, что element[2]
*/