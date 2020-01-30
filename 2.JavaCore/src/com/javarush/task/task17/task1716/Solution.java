package com.javarush.task.task17.task1716;

/* 
Синхронизированные методы
*/

public class Solution {
    private double param = Math.random();
    private StringBuilder sb = new StringBuilder();

    private void method0() {
        Double d = method3();
    }

    protected void method1(String param1) {
        Solution solution = new Solution();
        solution.method0();
    }

    public void method2(int param1) {
        param1++;
    }

    synchronized double method3() {
        double random = Math.random();
        param += 40.7;
        return random + param;
    }

    private synchronized void method4() {
        sb.append(1).append(1).append(1).append(1);
    }

    protected void method5(String param2) {
        new StringBuffer().append(param2).append(param2).append(param2);
    }

    public synchronized String method6(int param2) {
        System.out.println("Thinking....");
        method7(5e-2);
        sb = new StringBuilder("Got it!.");
        return sb.toString();
    }

    String method7(double param2) {
        return "" + param2;
    }

    public static void main(String[] args) {

    }

}

/* Синхронизировать нужно только методы изменяющие состояние объекта (или класса).
Т.е. те, которые меняют поля.

метод 1
protected void method1(String param1) {
        Solution solution = new Solution();
        solution.method0();
    }
Каждый раз при вызове этого метода будет создаваться новы объект Solution . У каждого потока при кажом вызове будет создаваться СВОЙ НОВЫЙ ВНУТРЕННИЙ объект Solution .
При завершении этого метода, этот НОВЫЙ  ВНУТРЕННИЙ объект   Solution solution будет выкинут в мусор. Т.к. на него нет внешних ссылок, а значит другие потоки не смогут изменить его состояние.
метод 1 не меняет состояние у текущего объекта Solution (не путать с внутр Solution solution), к которому имеют доступ несколько потоков.
метод solution.method0(); вызывается у ВНУТРЕННОГО  Solution solution который у каждого потока при каждом вызове метода 1 будет свой новый.

метод 2
public void method2(int param1) {
        param1++;
 }
Он меняет не поле param, а свой аргумент (int param1). Т.е. поле объекта не меняет, а значит потокобезопасен.

метод 5
protected void method5(String param2) {
        new StringBuffer().append(param2).append(param2).append(param2);
    }
поле объекта не меняет, а значит потокобезопасен.
При каждом вызове этого метода он возвращает НОВЫЙ объект StringBuffer*/
