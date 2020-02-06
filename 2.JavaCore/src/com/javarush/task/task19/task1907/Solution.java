package com.javarush.task.task19.task1907;

/* 
Считаем слово
*/

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.InputStreamReader;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Solution {
    public static void main(String[] args) throws Exception{
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String name1 = reader.readLine();
        reader.close();
        String text = "";
        FileReader fr = new FileReader(name1);
        while (fr.ready()) //пока есть непрочитанные байты в потоке ввода
        {

            text = text + (char) fr.read();
        }
        //Pattern p = Pattern.compile("world");
        //Matcher m = p.matcher(text);
        //int i = 0;
        //while (m.find()) {
        //    i++;

        //}
        String str = text.replaceAll("[^A-Za-z]", ",");
        String[] world = str.split(",|\\s");

        int i = 0;
        for (String a : world) {
            //System.out.println(a + a.length());
            if (a.equals("world")) {
                i++;
                //  System.out.println("yes");

            }
        }

        System.out.println(i);
        fr.close();
    }
}
