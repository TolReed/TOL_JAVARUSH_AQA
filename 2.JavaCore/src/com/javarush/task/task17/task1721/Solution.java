package com.javarush.task.task17.task1721;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

/* 
Транзакционность
*/

public class Solution {
    public static List<String> allLines = new ArrayList<String>();
    public static List<String> forRemoveLines = new ArrayList<String>();

    public static void main(String[] args) {
        try ( BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
              BufferedReader fileR1 = new BufferedReader(new FileReader(reader.readLine()));
              BufferedReader fileR2 = new BufferedReader(new FileReader(reader.readLine())) ) {
            reader.close();
            while (fileR1.ready()) {
                allLines.add(fileR1.readLine());
            }
            fileR1.close();
            while (fileR2.ready()) {
                forRemoveLines.add(fileR2.readLine());
            }
            fileR2.close();
            new Solution().joinData();

        } catch (IOException exc) {

        }
    }

    public void joinData() throws CorruptedDataException {
        if (allLines != null && forRemoveLines != null) {
            if (!allLines.containsAll(forRemoveLines)) {
                allLines.clear();
                throw new CorruptedDataException();
            } else {
                allLines.removeAll(forRemoveLines);
            }
        }
    }
}
