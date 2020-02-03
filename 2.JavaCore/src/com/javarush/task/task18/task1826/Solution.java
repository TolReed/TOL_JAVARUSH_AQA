package com.javarush.task.task18.task1826;

/* 
Шифровка
*/

import java.io.BufferedInputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.stream.IntStream;

public class Solution {

        public static ArrayList<Integer> simpleArrayToArrayList(int[] arr)
        {
            ArrayList<Integer> result = new ArrayList<>();
            Arrays.stream(arr).forEach(result::add);
            return result;
        }

        public static void cypher(String fileName, String fileOutputName, HashMap<Integer, Integer> cypherMap) throws
        IOException {
            BufferedInputStream bufferedInputStream = new BufferedInputStream(new FileInputStream(fileName));
            FileOutputStream fileOutputStream = new FileOutputStream(fileOutputName);

            while (bufferedInputStream.available() > 0) {
                int tmp = bufferedInputStream.read();
                if (cypherMap.containsKey(tmp)) {
                    fileOutputStream.write(cypherMap.get(tmp));
                } else {
                    break;
                }
            }

            bufferedInputStream.close();
            fileOutputStream.close();
        }

        public static void main(String[] args) throws IOException {

            int[] realBytes = IntStream.rangeClosed(10, 241).toArray(); //https://javarush.ru/help/30700
            ArrayList<Integer> realBytesArray = simpleArrayToArrayList(realBytes);
            ArrayList<Integer> fakeBytesArray = simpleArrayToArrayList(realBytes);

            Collections.reverse(fakeBytesArray);

            HashMap<Integer, Integer> encryptCypher = new HashMap<>();
            HashMap<Integer, Integer> decryptCypher = new HashMap<>();

            for (int i = 0; i < realBytesArray.size(); i++) {
                encryptCypher.put(realBytesArray.get(i), fakeBytesArray.get(i));
                decryptCypher.put(fakeBytesArray.get(i), realBytesArray.get(i));
            }

            if (args[0].equals("-e")) {
                cypher(args[1], args[2], encryptCypher);
            } else if (args[0].equals("-d")) {
                cypher(args[1], args[2], decryptCypher);
            }

    }

}
