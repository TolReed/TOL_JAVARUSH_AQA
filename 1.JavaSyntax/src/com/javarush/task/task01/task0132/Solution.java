package com.javarush.task.task01.task0132;

/* 
Сумма цифр трехзначного числа
*/

public class Solution {
    public static void main(String[] args) {

        System.out.println(sumDigitsInNumber(777));
    }

    public static int sumDigitsInNumber(int number) {
        //напишите тут ваш код
        int sum = 0;
        while (number != 0) {
            sum += number % 10;
            number /= 10;
        }
        return sum;
    }

    /*******************************************************
     or code below works good
     public static int sumDigitsInNumber(int number) {
        //напишите тут ваш код
        String numberS = Integer.toString(number);
        String[] a = numberS.split("");
        int sum = 0;
        for(int i=0;i<a.length;i++){
            sum+=Integer.parseInt(a[i]);
        }
        return sum;
    }*///////////////////////////////////////////////////////


    /*******************************************************
     or code below works good
     public static int sumDigitsInNumber(int number) {
        int result = 0;

        while (number > 0) {
            result = result + number % 10;
            number = number / 10;
        }
        return result;
    }
    *///////////////////////////////////////////////////////
}




