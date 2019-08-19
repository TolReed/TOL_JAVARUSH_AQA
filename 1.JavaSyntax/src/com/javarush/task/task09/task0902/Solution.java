package com.javarush.task.task09.task0902;

/* 
И снова StackTrace
*/

public class Solution {
    public static void main(String[] args) {
        method1();
    }

    public static String method1() {
        method2();
        //напишите тут ваш код
        StackTraceElement[] stackTraceElements = Thread.currentThread().getStackTrace();
        return  stackTraceElements[2].getMethodName();
    }

    public static String method2() {
        method3();
        //напишите тут ваш код
        StackTraceElement[] stackTraceElements = Thread.currentThread().getStackTrace();
        return  stackTraceElements[2].getMethodName();
    }

    public static String method3() {
        method4();
        //напишите тут ваш код
        StackTraceElement[] stackTraceElements = Thread.currentThread().getStackTrace();
        return  stackTraceElements[2].getMethodName();
    }

    public static String method4() {
        method5();
        //напишите тут ваш код
        StackTraceElement[] stackTraceElements = Thread.currentThread().getStackTrace();
        return  stackTraceElements[2].getMethodName();
    }

    public static String method5() {
        //напишите тут ваш код
        StackTraceElement[] stackTraceElements = Thread.currentThread().getStackTrace();
        return  stackTraceElements[2].getMethodName();
    }
}
/*

В стек записываются все вызовы функций. Когда вызывается какой-то метод, он попадает в стек.
Когда метод завершается, он удаляется из стека. Т.е. стек вызовов по ходу работы программы постоянно меняется, какие-то функции вызываются, потом завершаются.

Именно поэтому мы и создаем в каждом методе новый массив для того, чтобы в него записать актуальную информацию, т.е. состояние стека в данный момент.
Когда мы вызываем getStackTrace() в методе 5, стек выглядит таким образом:

getStackTrace
method5
method4
method3
method2
method1
main

Т.е. сначала вызывается main, он вызывает method1, ... , method5 вызывает getStackTrace()
Поэтому для получения вызвавшего метода и берется элемент 2, т.к. 0 - это getStackTrace, 1 - это текущий метод, 2 - метод, из которого он был вызван.

Когда мы вызываем getStackTrace() в методе 4, стек уже будет другим, поскольку к этому моменту method5 уже завершился и был убран из стека вызовов:

getStackTrace
method4
method3
method2
method1
main

Ну а в самом конце вызывается метод getStackTrace в method1 и тогда он уже будет таким:

getStackTrace
method1
main




*/