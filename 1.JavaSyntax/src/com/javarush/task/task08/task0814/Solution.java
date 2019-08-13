package com.javarush.task.task08.task0814;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

/* 
Больше 10? Вы нам не подходите
*/

public class Solution {
    public static Set<Integer> createSet() {
        // напишите тут ваш код
        Set<Integer> set = new HashSet<Integer>();
        for (int i = 0; i < 20; i++) {
            set.add(i + (int) Math.random() * 3);

        }
        return set;

    }
    //!!! Нельзя изменять коллекции в цикле for each !!! Здесь лучше использовать итератор.
    public static Set<Integer> removeAllNumbersGreaterThan10(Set<Integer> set) {
        // напишите тут ваш код
        /* for (int i: set) {
            if (i > 10) {
                set.remove();   ----------------------- it doesn't work because of LINE21
            }
        }*/

        Iterator<Integer> it = set.iterator();
        while (it.hasNext()) {
            if (it.next() > 10) {
                //метод удаления нужно вызвать у итератора, а не у элемента коллекции
                //it.remove();
                it.remove();
            }
        }
        return set;

    }

    public static void main(String[] args) {

    }
}

/* or this cycle for remove element which are higher then 10
    Iterator<Integer> integerIterator = set.iterator();
        while (integerIterator.hasNext()){
            Integer text = integerIterator.next();
            if (text >= 10){
                integerIterator.remove();
            }
        }
        return set;
**********************************************************/


 /*********************************************************
  *  short construction for remove element higher then 10

      set.removeIf(o -> o > 10);
      return set;

********************************************************/


 /* > or do it via creating new Set,
    > store all values > 10 in this new set
    > delete ALL element in set2 from original set

        Set<Integer> set2 = new HashSet<Integer>();

        Iterator<Integer> iterator = set.iterator();
        while(iterator.hasNext()){
            int n = iterator.next();
            if(n>10){
                set2.add(n);
            }
        }

        set.removeAll(set2);

        return set;
    }
*/