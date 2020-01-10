package com.javarush.task.task14.task1419;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

/* 
Нашествие исключений
*/

public class Solution {
    public static List<Exception> exceptions = new ArrayList<Exception>();

    public static void main(String[] args) {
        initExceptions();

        for (Exception exception : exceptions) {
            System.out.println(exception);
        }
    }

    private static void initExceptions() throws TypeNotPresentException {   //the first exception
        try {
            float i = 1 / 0;

        } catch (Exception e) {
            exceptions.add(e);
        }

        //напишите тут ваш код
        try {
            throw new IOException();
        } catch (IOException e) {
            exceptions.add(e);
        }

        try {
            FileInputStream fis = new FileInputStream("");
            BufferedReader bis = new BufferedReader(new InputStreamReader(fis));
            fis.close();
        } catch (Exception e) {
            exceptions.add(e);
        }

        try {
            Integer a = Integer.parseInt("строка");
        } catch (Exception e) {
            exceptions.add(e);
        }

        try {
            throw new RuntimeException();
        } catch (Exception e) {
            exceptions.add(e);
        }

        try {
            throw new UnsupportedOperationException ();
        } catch (UnsupportedOperationException e) {
            exceptions.add(e);
        }

        try {
            Object o[] = new String[3];
            o[0] = new Integer(0);
        } catch (Exception e) {
            exceptions.add(e);
        }

        try {
            Object o = null;
            o.equals("tratata");
        } catch (Exception e) {
            exceptions.add(e);
        }

        try {
            throw new IllegalArgumentException();
        } catch (IllegalArgumentException e) {
            exceptions.add(e);
        }

        try {
            throw new ArrayIndexOutOfBoundsException ();
        } catch (ArrayIndexOutOfBoundsException  e) {
            exceptions.add(e);
        }



    }
}
