package com.javarush.task.task19.task1908;
import java.util.HashMap;
import java.util.Map;
import java.util.*;
import java.io.*;
import java.text.*;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.FileInputStream;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
/*
Выделяем числа - https://javarush.ru/help/31601
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        BufferedReader s = new BufferedReader(new FileReader("D:/2.txt"));
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter("D:/1.txt"));
        ArrayList<Integer> list = new ArrayList<>();
        //    while(s.ready()){
        //       int data = s.read();
        //        list.add(data);
        //     }
        StringBuilder stringBuilder = new StringBuilder();
        while(bufferedReader.ready())
            stringBuilder.append((char)bufferedReader.read());

        Pattern p = Pattern.compile("(\\b|^)\\d+?(\\b|$)");
        Matcher matcher = p.matcher(stringBuilder);
        while(matcher.find()){
            bufferedWriter.write(stringBuilder.substring(matcher.start(),matcher.end())+" ");
        }
        bufferedReader.close();
        bufferedWriter.close();
    }
}
