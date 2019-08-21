package com.javarush.task.task08.task0803;

import java.util.HashMap;
import java.util.Map;

/* 
Коллекция Map из котов
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        String[] cats = new String[]{"васька", "мурка", "дымка", "рыжик", "серый", "снежок", "босс", "борис", "визя", "гарфи"}; //Коллекция Map из котов
        
        Map<String, Cat> map = addCatsToMap(cats);

        for (Map.Entry<String, Cat> pair : map.entrySet()) {
            System.out.println(pair.getKey() + " - " + pair.getValue());
        }
    }

    public static Map<String, Cat> addCatsToMap(String[] cats) {
        //напишите тут ваш код
        Map<String, Cat> catMap = new HashMap<String, Cat>();
        for (int i = 0; i < cats.length; i++) {
            String j = cats[i];
            catMap.put(j, new Cat(j));
        }

        return catMap;

    }

    public static class Cat {
        String name;

        public Cat(String name) {
            this.name = name;
        }

        @Override
        public String toString() {
            return name != null ? name.toUpperCase() : null;
        }
    }
}
/************************************************* WOOOOOOOOOOW, MultiMap

Multimap<Integer, String> multimap = ArrayListMultimap.create();

multimap.put(1, "A");
multimap.put(1, "B");
multimap.put(1, "C");
multimap.put(1, "A");

multimap.put(2, "A");
multimap.put(2, "B");
multimap.put(2, "C");

multimap.put(3, "A");

System.out.println(multimap.get(1));
System.out.println(multimap.get(2));
System.out.println(multimap.get(3));

Выход:

[A,B,C,A]
[A,B,C]
[A]



 *********************************************************************************/