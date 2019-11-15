package com.javarush.task.task13.task1326;

/* 
Сортировка четных чисел из файла
*/

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Solution {
    public static void main(String[] args) throws IOException {
        // напишите тут ваш код
        // Строки и числа мы читаем так:
            BufferedReader consoleReader = new BufferedReader(new InputStreamReader(System.in));
            String fileName = consoleReader.readLine();

            List<Integer> numbers = new ArrayList<>();
            FileInputStream inputStream = new FileInputStream(fileName);
            BufferedReader reader = new BufferedReader(new InputStreamReader(inputStream));

            String str;
            while ((str = reader.readLine()) != null) {
                int number = Integer.parseInt(str);
                numbers.add(number);
            }

            Collections.sort(numbers);

            for(int i =0; i<numbers.size(); i++){
                if (numbers.get(i)%2==0){
                    System.out.println(numbers.get(i));
                }
        }

            reader.close();
            consoleReader.close();
        }
    }



/*
Запиши себе в тетрадку.
Если мы хотим считать байты. Либо это копирование файла или работа с байтами, мы считываем байты через метод read(),
который возвращает значение 0..255. В это значение влезет английская раскладка, цифры и спецзнаки.
Но твой код к примеру, файл
-34
100
прочитает как:
45
51
52
10
49
48
48
То есть шесть байт, первый байт, это знак минус, потом байты отвечающие за 3, и за 4,
потом 10 - это байт перевода строки, потом 49 это байт отвечающий за единицу, и два ноля.

Байты мы читаем:

public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String fileName = reader.readLine();

        List<Integer> list = new ArrayList<>();
        FileInputStream inputStream = new FileInputStream(fileName);

        while (inputStream.available() > 0) {
            int b = inputStream.read();
            list.add(b);
        }

        reader.close();
    }
}

*/
