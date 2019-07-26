package com.javarush.task.task06.task0609;

/* 
Расстояние между двумя точками
*/

public class Util {
    public static double getDistance(int x1, int y1, int x2, int y2) {
        //напишите тут ваш код
        double dx = x2 - x1;
        double dy = y2 - y1;
        double result = Math.sqrt(dx * dx + dy * dy);
        return result;
    }

    public static void main(String[] args) {
        //System.out.println(getDistance(5, 6, 7, 3));

    }
}
/**************************************************************Использование метода hypot() из модуля Math.
    double dx = x1 - x2
    double dy = y1 - y2

    double res  = Math.hypot(dx, dy);

    Вроде о чудо - Sun создали очень хороший и грамотный метод для вычисления подобных вещей.

    Но как оказалось - есть не слабая ложка дёгтя в этой бочке мёда. Это просто колоссальные временные затраты.

    Ниже приведу результаты работы программы, которая оценивала время работы алгоритма для вычисления расстояний между точек:

    (Тестовая машина  и софт такие же, как и в предыдущем посте.)

     ---With Hypot---
    N Points = 1000
    RunTime=1125 (millsec)
    ---With Sqrt---
    N Points = 1000
    RunTime=15 (millsec)

    ---With Hypot---
    N Points = 3000
    RunTime=13578 (millsec)
    ---With Sqrt---
    N Points = 3000
    RunTime=47 (millsec)

    ---With Hypot---
    N Points = 6000
    RunTime=61063 (millsec)
    ---With Sqrt---
    N Points = 6000
    RunTime=406 (millsec)


 */
