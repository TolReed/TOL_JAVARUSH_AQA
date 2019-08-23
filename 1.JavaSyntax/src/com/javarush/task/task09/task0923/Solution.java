package com.javarush.task.task09.task0923;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;

/* 
Гласные и согласные
*/

public class Solution {
    public static char[] vowels = new char[]{'а', 'я', 'у', 'ю', 'и', 'ы', 'э', 'е', 'о', 'ё'};

    public static void main(String[] args) throws Exception {
        //напишите тут ваш код
        ArrayList<Character> vovels = new ArrayList<>(); // голосні
        ArrayList<Character> consostants = new ArrayList<>(); // приголосні
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in)); //ініціалізуємо буфферрідер
        String textLine = reader.readLine(); //зчитуємо з клавіатури

        for (int i = 0; i < textLine.length(); i ++) { //проходимося в циклі по введеному реченню або слову
            char currentChar = textLine.charAt(i); //ініціалізуємо значення поточного символа з прочитаного слова або речення

            if (isVowel(currentChar)) { //робимо перевірку чи є поточний символ такий як у масиві голосних
                vovels.add(currentChar); //у разі ТРУ - додаємо його в масив голосних
            } else if (currentChar != ' ') { //в іншому випадку або якщо поточний символ не дорівнює пробіл ...
                consostants.add(currentChar); //... - додаємо його до масиву приголосних
            }
        }

        for (char vovel: vovels) { //виводимо на екран голосні
            System.out.print(vovel + " ");
        }

        System.out.println(); //переводимо на новий рядочок, щоб вивести туди приголосні - відповідно до завдання

        for (char consostant: consostants) { //виводимо на екран приголосні
            System.out.print(consostant + " ");
        }
    }

    // метод проверяет, гласная ли буква
    public static boolean isVowel(char c) {
        c = Character.toLowerCase(c);  // приводим символ в нижний регистр - от заглавных к строчным буквам
        for (char d : vowels) {  // ищем среди массива гласных
            if (c == d) {
                return true;
            }
        }
        return false;
    }
}