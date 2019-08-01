package com.javarush.task.task07.task0716;

import java.util.ArrayList;

/* 
Р или Л
*/

public class Solution {
    public static void main(String[] args) {
        ArrayList<String> strings = new ArrayList<String>();
        strings.add("роза");
        strings.add("лоза");
        strings.add("лира");
        strings = fix(strings);

        for (String string : strings) {
            System.out.println(string);
        }
    }

    public static ArrayList<String> fix(ArrayList<String> strings) {
        //напишите тут ваш код
        boolean isContainR;
        boolean isContainL;

        for (int i = 0; i < strings.size();) {
            isContainR = strings.get(i).contains("р");
            isContainL = strings.get(i).contains("л");
            if (isContainR && !isContainL) {
                strings.remove(i);
            } else if (isContainL && !isContainR) {
                strings.add(i, strings.get(i));
                i += 2;
            } else {
                i++;
            }
        }
        return strings;
    }
}

/*********************************************************************************** и тай сойдЕт
 public static ArrayList<String> fix(ArrayList<String> strings) {
    String s;
    int deletedArrays = 0;
    for (int i = 0; i < arraylenght - deletedArrays; i++) {
        s = strings.get(i);
        if (s.contains("р") && s.contains("л")){
            continue;
            }
         else if (s.contains("р") && !s.contains("л")) {
            strings.remove(i);
            i--;
            deletedArrays ++;
            }
        else if (s.contains("л") && !s.contains("р")){
            strings.add(0,s);
            }
        }
    return strings;
    }
 }
 *///////////////////////////////////////////////////////////////////////////////////////////////