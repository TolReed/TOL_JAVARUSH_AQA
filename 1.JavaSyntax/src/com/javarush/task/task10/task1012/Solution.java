package com.javarush.task.task10.task1012;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.*;

/* 
Количество букв
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        // Алфавит
        List<Character> alphabet = Arrays.asList(
                'а','б','в','г','д','е','ё','ж',
                'з','и','й','к','л','м','н','о',
                'п','р','с','т','у','ф','х','ц',
                'ч','ш','щ','ъ','ы','ь','э','ю','я');

        // Ввод строк
        ArrayList<String> list = new ArrayList<String>();
        for (int i = 0; i < 10; i++) {
            String s = reader.readLine();
            list.add(s.toLowerCase());
        }

        // напишите тут ваш код
        HashMap<Character,Integer> charsFrequency = new HashMap<>();

        for (Character leter:
                alphabet) {
            int frequency = 0;
            for (String string:
                    list) {
                char[] chars = string.toCharArray();
                for (Character symbol:
                        chars) {
                    if(symbol.equals(leter))
                    {
                        frequency++;
                    }
                }
            }
            charsFrequency.put(leter,frequency);
        }


        for(Character alphabetLetter: alphabet) {
            for (Map.Entry<Character, Integer> pair :
                    charsFrequency.entrySet()) {
                if(pair.getKey().equals(alphabetLetter))
                    System.out.println(pair.getKey() + " " + pair.getValue());
            }
        }
    }
}
