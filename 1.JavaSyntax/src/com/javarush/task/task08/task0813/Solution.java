package com.javarush.task.task08.task0813;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

/* 
20 слов на букву «Л»
*/

public class Solution {
    public static Set<String> createSet() {
        //напишите тут ваш код
        Set<String> set = new HashSet<>();
        for (int i = 0; i < 20; i++) {
            set.add("Любоффф" + Math.random());
        }

        return set;

    }

    public static void main(String[] args) {

    }
}


// !!!в множестве не хранятся одинаковые элементы, поэтому и выдает тебе ошибку, ибо дублирующиеся элементы тупо не добавляются
