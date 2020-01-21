package com.javarush.task.task15.task1524;

/* 
Порядок загрузки переменных
*/
public class Solution {
    static {
        init(); //bp2
    }


    static {
        System.out.println("Static block"); //bp3
    }

    {
        System.out.println("Non-static block"); //bp5
        printAllFields(this);
    }


    public int i = 6; //bp7
    public String name = "First name"; //bp8



    public Solution() {
        System.out.println("Solution constructor");
        printAllFields(this);
    }

    public static void init() {
        System.out.println("static void init()"); //bp1
    }

    public static void main(String[] args) {
        System.out.println("public static void main"); //bp4
        Solution s = new Solution();
    }

    public static void printAllFields(Solution obj) {
        System.out.println("static void printAllFields"); //bp6

        System.out.println(obj.i); //bp9
        System.out.println(obj.name); //bp10
    }
}
