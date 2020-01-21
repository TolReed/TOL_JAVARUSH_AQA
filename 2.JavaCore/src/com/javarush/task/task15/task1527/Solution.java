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

        int index1 = url.indexOf("?"); //определяем индекс начала параметров
        String s1 = url.substring(index1 + 1); //отрезаем все до ? включительно

        ArrayList<String> list = new ArrayList<>(); // записываем в массив все параметры со значениями
        for (String r : s1.split("&")) {
            list.add(r);
        }

        String result = "";

        for (int i = 0; i < list.size(); i++) { //пробегаемся по массиву и отделяем значения от параметров выводим параметры в консоль
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
                            alert(list.get(i).substring(list.get(i).indexOf("=")+1, list.get(i).length())); // works now, +1 to String
                        }
                }

            }
        } catch (IndexOutOfBoundsException e) {
            e.printStackTrace();

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


a new solution below:
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String str = reader.readLine();
        String param = str.substring(str.indexOf("?") + 1);
        String[] mass = param.split("&");
        ArrayList<String> list = new ArrayList<>();
        ArrayList<String> secondList = new ArrayList<>();
        String line;
        for (int i = 0; i < mass.length; i++){
            if (mass[i].contains("=")){
                list.add(mass[i].substring(0, mass[i].lastIndexOf("=")));
            } if (mass[i].contains("obj")) {
                line = param.substring(param.indexOf("=") + 1, param.indexOf("&"));
                secondList.add(line);
            }
            else if (!(mass[i].contains("=")) && !(mass[i].contains("obj"))){
                list.add(mass[i]);
            }

        }
        String result = "";
        for (String s : list){
            result = result + s + " ";
        }
        System.out.println(result);
        for (String s : list){
            try {
                if (s.equals("obj") && param.contains("=")) {
                    alert(Double.parseDouble(secondList.get(0)));
                }
            } catch (RuntimeException e) {
                alert(s);
            }
        }

        //add your code here
    }

    public static void alert(double value) {
        System.out.println("double " + value);
    }

    public static void alert(String value) {
        System.out.println("String " + value);
    }
}

a new solution here is:

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String s = "";

        try {
            s = br.readLine();  // http://javarush.ru/alpha/index.html?obj=3.14&name=Amigo
        } catch (IOException e) {  //    http://javarush.ru/alpha/index.html?lvl=15&view&name=Amigo
            e.printStackTrace();
        }

        String[] split = s.split("\\?");  // Оставляем часть после ?
        String[] split2 = split[1].split("&");  // разделяем & lvl=15  view  name=Amigo

        String[] split3;
        for (String spl : split2) {
            split3 = spl.split("=.+");  // Убираем = и все что за ним
            System.out.print(split3[0] + " "); // выводим lvl view name
        }

        System.out.println();

        String[] split4;
        for (int i = 0; i < split2.length; i++) {
            if (split2[i].contains("obj")) {     // проверяем наличие obj

                split4 = split2[i].split("=");  // оставляем то что после равно ,,  3.14

                try {
                    alert(Double.parseDouble(split4[1]));  // вызываем алерт если это дабл, иначе ошибка намбер формат эксепшн и вызов алерт стринговый
                } catch (NumberFormatException e) {
                    alert(split4[1]);
                }


            }
        }
    }

    public static void alert(double value) {
        System.out.println("double: " + value);
    }

    public static void alert(String value) {
        System.out.println("String: " + value);
    }
}

*/