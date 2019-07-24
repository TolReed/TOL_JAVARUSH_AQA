package com.javarush.task.task05.task0531;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;

/* 
Совершенствуем функциональность
*/

public class Solution {

    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int a = Integer.parseInt(reader.readLine());
        int b = Integer.parseInt(reader.readLine());
        int c = Integer.parseInt(reader.readLine());
        int d = Integer.parseInt(reader.readLine());
        int e = Integer.parseInt(reader.readLine());

        int minimum = min(a, b, c, d, e);

        System.out.println("Minimum = " + minimum);
    }


    public static int min(int a, int b, int c, int d, int e) {
        int[] array = {a, b, c, d, e};
        int min = array[0];
        for(int i = 0; i < array.length; i++) {
            if (array[i] < min)
                min = array[i];
        }
        return min;


    }

}

/* _________________________________________________________________________this code works without min method



    public class Solution {

    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int a = Integer.parseInt(reader.readLine());
        int b = Integer.parseInt(reader.readLine());
        int c = Integer.parseInt(reader.readLine());
        int d = Integer.parseInt(reader.readLine());
        int e = Integer.parseInt(reader.readLine());

        int min =  min(a, min(b, min(c, min(d,e))));

        System.out.println("Minimum = " + min);
    }


_____________________________________________________________________________also works code below

    public static int min(int a, int b, int c, int d, int e) {
        int[] array = {a, b, c, d, e};
        Arrays.sort(array);

        int value = array[0];
        return value;
    }

_____________________________________________________________________________also works code below

private void getMinNum(int... nums) {
        Arrays.stream(nums).min().ifPresent(System.out::println);
    }
_____________________________________________________________________________also works code below
import java.util.Scanner;

public class MinMax
{
  public static void main(String[] args)
  {
   int i = 1;

   while (i <= 5)
   {
    int smallest = 0;
    int largest = 0;

    System.out.println("Enter number: ");
    Scanner input = new Scanner(System.in);
    int number = input.nextInt();

    System.out.println("Amount of numbers entered: " + i);

    System.out.println("Number entered: " + number);

    if (number < min)
    {
      min = number;
    }
    System.out.println("Smallest # so far: " + min);

    if (number > max)
    {
      max = number;
    }
    System.out.println("Largest # so far: " + max);


    i++;

   }
 }
}
             */