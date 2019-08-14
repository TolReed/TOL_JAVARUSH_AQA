package com.javarush.task.task08.task0823;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/* 
Омовение Рамы
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String string = reader.readLine();

        //напишите тут ваш код
        String sWithoutExtraEscapes = string.replaceAll("\\s+"," ").trim();
        //Создаем новую строку, в которую помещаем введенную строку,
        // где методом replaceAll() удаляются все лишние пробелы между словами (\\s+ означает любое количество пробелов) и заменяем их на одинарный пробел.
        // А методом trim() удаляем вероятные пробелы в начале или конце строки.
        String[] arr = sWithoutExtraEscapes.split(" ");
        //останется только разбить полученную строку на строковый массив

        for (String s: arr) {
            String first = s.substring(0, 1); // получить первий символ каждого слова
            String after = s.substring(1); // получить оставшийся символ
            String result = first.toUpperCase() + after + " ";

            System.out.print(result);
        }
    }
}
