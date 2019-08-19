package com.javarush.task.task07.task0713;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Scanner;

/* 
Играем в Jолушку %3 щк %2
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        //напишите тут ваш код
        ArrayList<Integer> list = new ArrayList<>();
        ArrayList<Integer> listItemDivideBy3 = new ArrayList<>();
        ArrayList<Integer> listItemDivideBy2 = new ArrayList<>();
        ArrayList<Integer> listItemOthers = new ArrayList<>();

        Scanner sc = new Scanner(System.in);

        for (int i = 0; i < 20; i++) {
            int number = sc.nextInt();
            list.add(number);
        }

        for (int i = 0; i < list.size(); i ++) {
            if (list.get(i) % 3 == 0 && list.get(i) % 2 == 0) {
                listItemDivideBy2.add(list.get(i));
                listItemDivideBy3.add(list.get(i));
            }
            else if (list.get(i) % 3 == 0) {
                listItemDivideBy3.add(list.get(i));
            }
            else if (list.get(i) % 2 == 0) {
                listItemDivideBy2.add(list.get(i));
            }
            else {
                listItemOthers.add(list.get(i));
            }

        }

        printList(listItemDivideBy3);
        printList(listItemDivideBy2);
        printList(listItemOthers);
    }

    public static void printList(ArrayList<Integer> list) {
        //напишите тут ваш код
        for (int i = 0; i < list.size(); i ++) {
            System.out.println(list.get(i));
        }
    }
}
