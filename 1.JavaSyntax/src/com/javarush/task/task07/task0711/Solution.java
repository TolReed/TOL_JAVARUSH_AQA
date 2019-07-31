package com.javarush.task.task07.task0711;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

/* 
Удалить и вставить
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        //напишите тут ваш код
        ArrayList<String> strings = new ArrayList<>();

        Scanner sc = new Scanner(System.in);

        for (int i = 0; i < 5; i++) {
            String s = sc.nextLine();
            strings.add(s);
        }


        for (int i =0; i < 13; i++) {
            strings.add(0, strings.remove(strings.size() - 1));    // оказалось list.remove() возвращает значение которое он убрал из списка,
                                                                                // то есть можно не возится с временным хранением ячейки,
                                                                                // просто убрал и вставил list.add(0,list.remove(list.size()-1));
        }

        for (int i = 0; i < strings.size(); i++) {
            System.out.println(strings.get(i));

        }
    }
}



/******************************************************************************** можна було і так рішити це завдання
* for (int i = 0; i < 13; i++) {
 *     list.add(0, list.get(4)); - додаємо на початок списку останній його елемент
 *     list.remove(5); - видаляємо ПЯТИЙ елемент списку, не ЧЕТВЕРТИЙ, тому що у попередньому кроці додали 1 елемент
 * }
*********************************************************************************************************************/



/*******************************************************************************************іТератор - приклад запису
 *
 * Iterator<String> StringsItherator = strings.iterator();
 *
 *   String lastElement = strings.get(strings.size() - 1);
 *    while (StringsItherator.hasNext()) {
 *     String nextString = StringsItherator.next();
 *     if (nextString == lastElement) {
 *     StringsItherator.remove();
 }
*
*
*********************************************************************************************************************/
