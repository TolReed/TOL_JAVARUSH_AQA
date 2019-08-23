package com.javarush.task.task09.task0922;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;

/* 
Какое сегодня число?
*/

public class Solution {

    public static void main(String[] args) throws Exception {
        //напишите тут ваш код
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in)); //ініціалізуємо буферрідер
        SimpleDateFormat SimpleDateFormat = new SimpleDateFormat("yyyy-MM-dd", Locale.ENGLISH); //створюємо змінну формату дати
        SimpleDateFormat SimpleDateFormatNew = new SimpleDateFormat("MMM d, yyyy", Locale.ENGLISH); //створюємо нову змінну формату дати
        Date date = SimpleDateFormat.parse(reader.readLine()); //читаємо введену дату з клавуатури

        System.out.println(SimpleDateFormatNew.format(date).toUpperCase()); //приводимо введену дату до формату і виводимо на екран

    }
}
