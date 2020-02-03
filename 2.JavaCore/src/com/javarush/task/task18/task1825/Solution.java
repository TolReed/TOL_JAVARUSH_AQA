package com.javarush.task.task18.task1825;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

/* 
Собираем файл
*/

public class Solution {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String s = "";
        List<String> list = new ArrayList<>();
        do {
            if ((s = br.readLine()).equals("end")) {
                break;
            }
            list.add(s);
        } while (true);
        br.close();

        Collections.sort(list);
        String path = list.get(0).replaceAll("\\.part\\d+$", "");
        FileOutputStream bw = new FileOutputStream(path, true);
        for (String s1 : list) {
            FileInputStream fis = new FileInputStream(s1);
            byte[] tmp = new byte[fis.available()];
            fis.read(tmp);
            bw.write(tmp);
            bw.flush();
            fis.close();
        }
        bw.close();
    }
}
