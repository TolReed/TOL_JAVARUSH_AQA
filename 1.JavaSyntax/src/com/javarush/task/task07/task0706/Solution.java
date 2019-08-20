package com.javarush.task.task07.task0706;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/* 
Улицы и дома
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        //напишите тут ваш код
        int[] numbers = new int[15];
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int even = 0;
        int odd = 0;

        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = Integer.parseInt(reader.readLine());

            if (i % 2 == 0 || i == 0) {
              even = even + numbers[i];
                //System.out.println(even); - для перевірки
            } else {
              odd = odd + numbers[i];
                //System.out.println(odd); - для перевірки
            }
        }

        if (even > odd) {
            System.out.println("В домах с четными номерами проживает больше жителей.");
        } else {
            System.out.println("В домах с нечетными номерами проживает больше жителей.");
        }

        //System.out.println("Чет " + odd);//сумма НЕчетных
        //System.out.println("Нечет " + even);//псумма четных

        /* наша постійна рубрика АБО - лук ет зе інший варіант розв"язання виводу на екран
        *
        * String res = even > odd ? "четными" : "нечетными";
        * System.out.println("В домах с " + res + " номерами проживает больше жителей.");
        *
        * ******************************************************************Хеппі Ендінгс*/

    }
}
/* наша постійна рубрика АБО - лук ет зе інший варіант розв"язання виводу на екран
        *

        int[] numbers = arrayInitialize(15);
        if (summOfEven(numbers) > summOfOdd(numbers)){
                System.out.println("В домах с четными номерами проживает больше жителей.");
                }
                else System.out.println("В домах с нечетными номерами проживает больше жителей.");
        }

        public static int[] arrayInitialize(int size){
        Scanner scanner = new Scanner(System.in);
        int[] numbers = new int[size];
        for(int i=0; i<size; i++) numbers[i]=scanner.nextInt();
        return numbers;
        }

        public static int summOfEven(int[] numbers)
        {
        int summ = 0;
        for(int i=0; i<numbers.length; i++)
        {
        if(i %2 == 0) summ+=numbers[i];
        }
        return summ;
        }

        public static int summOfOdd(int[] numbers)
        {
        int summ = 0;
        for(int i=0; i<numbers.length; i++)
        {
        if(i %2 != 0) summ+=numbers[i];
        }
        return summ;

        }
        }
*
        * ******************************************************************Хеппі Ендінгс*/