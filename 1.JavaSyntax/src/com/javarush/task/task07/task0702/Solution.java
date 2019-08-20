package com.javarush.task.task07.task0702;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Scanner;

/* 
Массив из строчек в обратном порядке
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        //напишите тут ваш код
        Scanner s = new Scanner(System.in);
        /*********************** Якщо хочемо аби кількість елементів у масиві була така яку введемо з клавіатури
        System.out.println("введите количество элементов");

        int num = s.nextInt();
        int a[] = new int[num];

         System.out.println("введите элементы");
        ********************************************************************************************************/
        String a[] = new String[10];
        for (int i = 0; i < 8; i++) {
            a[i] = s.nextLine();
        }
        //System.out.println("Элементы в обратном порядке");
        for (int i = a.length - 1; i >= 0; i--) { //проходимо масив з останнього елемента до першого
            System.out.println(a[i]);
        }

    }
}

/********************************************************************************another solution
 1. Если цель вывести введенные данные в обратном порядке:

 System.out.println("введите элементы");
 for (int i = num; i > 0; i--) {
 a[i-1] = s.nextInt();
 }
 Соответственно вывод можно сделать просто:

 System.out.println("Элементы в обратном порядке");
 for (int i : a) {
 System.out.println(i);
 }
 2. Если массив трогать нельзя, а вывести надо в обратном порядке:

 Код вывода после наполнения массива:

 String result = "";
 for (int i : a) {
 result = i + "\r\n" + result;
 }

 System.out.println(result);

 *************************************************************************************************/