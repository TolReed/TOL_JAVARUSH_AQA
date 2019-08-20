package com.javarush.task.task07.task0707;

import java.util.ArrayList;

/* 
Что за список такой?
*/

public class Solution {
    public static void main(String[] args) {
        //напишите тут ваш код

        ArrayList<String> list = new ArrayList<>();

        list.add("аррайЛіст и список строк");
        list.add("ойй, і ЯВА, ой, і ЯВА");
        list.add("третій - мідл як не як");
        list.add("майже фініш, але залишився ще один доуповнітєльний");
        list.add("фуууууууууух! дай пятішку, пятушанчик, пятачок");

        int listSize = list.size(); //визначаємо розмір масиву
        System.out.println(listSize);

        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i));
        }


        /**************************** або
        * for (String s: list) {
        * System.out.println(list.get(i));
        * }
        * кінець або *******************/
    }
}
