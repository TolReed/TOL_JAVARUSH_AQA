package com.javarush.task.task15.task1516;

/* 
Значения по умолчанию
*/

public class Solution {


    public int intVar;
    public double doubleVar;
    public Double DoubleVar;
    public boolean booleanVar;
    public Object ObjectVar;
    public Exception ExceptionVar;
    public String StringVar;

    public static void main(String[] args) {

        Solution solution = new Solution();
        System.out.println(solution.intVar);
        System.out.println(solution.doubleVar);
        System.out.println(solution.DoubleVar);
        System.out.println(solution.booleanVar);
        System.out.println(solution.ObjectVar);
        System.out.println(solution.ExceptionVar);
        System.out.println(solution.StringVar);


    }
}

/* FYI
double, int, float и.т.д - это примитивы, Double и все остальные типы с большой буквы - это так называемые "классы-оболочки",
сделаны для того, чтобы можно было представить примитив как  объект,
плюс эти классы имеют дополнительные функции  (parse(), compare() и всякие иные, можете в доках посмотреть)

Вопрос: зачем примитив представлять в виде объекта? Используется в коллекциях, так как коллекции не работают с примитивами, а только классами оболочками, в этом состоит ценность оболочек

Углубленное изучение коллекций будет на высших уровнях)
Еще могу посоветовать познакомится с autoboxing и unboxing
*
*
*
* */
