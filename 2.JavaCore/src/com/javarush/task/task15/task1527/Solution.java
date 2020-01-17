package com.javarush.task.task15.task1527;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;

/* 
Парсер реквестов - https://javarush.ru/help/29419
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        //add your code here

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String url = reader.readLine();

        int index1 = url.indexOf("?");                  //определяем индекс начала параметров
        String s1 = url.substring(index1 + 1);            //отрезаем все до ? включительно

        ArrayList<String> list = new ArrayList<>();         // записываем в массив все параметры со значениями
        for (String r : s1.split("&")) {
            list.add(r);
        }

        String result = "";

        for (int i = 0; i < list.size(); i++) {         //пробегаемся по массиву и отделяем значения от параметров выводим параметры в консоль
            if (list.get(i).contains("=")) result = result + (list.get(i).substring(0, list.get(i).indexOf("="))) + " ";
            else result = result + (list.get(i)) + " ";
        }
        System.out.print(result.substring(0, result.length() - 1));
        System.out.println();

        //далее понятно если obj проверяем если double, то alert(double value) если нет, то alert(String value)
        try {
            for (int i = 0; i < list.size(); i++) {
                int ind = list.get(i).indexOf("=");
                if (ind > 0) {
                    if (list.get(i).substring(0, list.get(i).indexOf("=")).equals("obj"))
                        try {
                            double d = Double.parseDouble(list.get(i).substring(list.get(i).indexOf("=") + 1, list.get(i).length()));
                            alert(d);
                        } catch (Exception e) {
                            alert(list.get(i).substring(list.get(i).indexOf("="), list.get(i).length()));
                        }
                }

            }
        } catch (IndexOutOfBoundsException e) {

        }
    }

    public static void alert(double value) {
        System.out.println("double: " + value);
    }

    public static void alert(String value) {
        System.out.println("String: " + value);
    }
}
/*

url - массив char
У char (как и у других примитивных типов) нет методов, в том числе toString()
Можно использовать String.valueOf(url[i])
В следующем цикле, где у тебя уже обертка Character, можно использовать toString().
А вот там где список символов

listBigSex.get(i).toString()

toString не имеет смысла, потому что этот метод у ArrayList выводит элементы в скобках через запятую.
В общем, будь внимательней с типами объектов.

Теперь что касается логики.
Во-первых, вложенный цикл while будет выходить за пределы массива - конец строки он не отслеживает.
Во-вторых, даже если ты поделишь исходную строку по &, это еще не конец задачи. Ты получишь куски строки, состоящие из названия параметра и его значения (а иногда только параметр без значения).
Для первого примера это будет

lvl=15
view
name=Amigo

Тебе нужно вывести сначала названия всех параметров, а потом, если среди них есть параметр obj, передать его значение в подходящий метод alert().
*/