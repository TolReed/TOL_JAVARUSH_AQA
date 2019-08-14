package com.javarush.task.task08.task0817;

import java.util.*;

/* 
Нам повторы не нужны
*/

public class Solution {
    public static Map<String, String> createMap() {
        //напишите тут ваш код
        Map<String, String> bio = new HashMap<>();
        bio.put("Абрамович", "Василь");
        bio.put("Шевченко", "Андрій");
        bio.put("Кличко", "Володимир");
        bio.put("Спілберг", "Петро");
        bio.put("Афанасенко", "Володимир");
        bio.put("Порошенко", "Василь");
        bio.put("Зеленський", "Володимир");
        bio.put("Бойко", "Артем");
        bio.put("Федорович", "Афанасій");
        bio.put("Франко", "Іванко");

        return bio;

    }

    public static void removeTheFirstNameDuplicates(Map<String, String> bio) {
        //напишите тут ваш код
        List<String> list = new ArrayList<>();

        for (Map.Entry<String, String> pair : bio.entrySet()){
            if(Collections.frequency(bio.values(), pair.getValue()) > 1){
                // метод frequency - возвращает количество одинаковых значений
                list.add(pair.getValue());
            }
        }

        for (String name : list) {
            removeItemFromMapByValue(bio, name);
        }
    }

    public static void removeItemFromMapByValue(Map<String, String> bio, String value) {
        Map<String, String> copy = new HashMap<>(bio);
        for (Map.Entry<String, String> pair : copy.entrySet()) {
            if (pair.getValue().equals(value)) {
                bio.remove(pair.getKey());
            }
        }
    }

    public static void main(String[] args) {

    }
}


/******************************************************************************************* ЕнозЕЕр сольюШинс

 for(int i = 0; i < list.size() - 1 ; i++) {
      for(int j = i + 1; j < list.size(); j++) {
        if (list.get(i).equals(list.get(j))) {
          removeItemFromMapByValue(map, (String) list.get(i));
        }
      }
    }

 *************************************************************************************************************/


/*********************************************************************************** Гів мі бебі ван мо сольюШинс

Первый метод принимает мапу и ищет в ней повторы. Вот так я это реализовал

Set<String> duplicates = new HashSet<>();
    for(Map.Entry<String,String> mapEntry:
    map.entrySet()) {
        for(Map.Entry<String,String> value: entryArrayList) {
            if(mapEntry.getValue().equals(value.getValue()) &&
                !mapEntry.getKey().equals(value.getKey())) {
                    duplicates.add(mapEntry.getValue());
        }
    }
}


После того - имеем в сете values, которые повторяются.
В ифе исключаем сравнение ентри с самим собой(если ключ равен - не сравниваем)
иначе как дубликаты будут помечены просто все ентри.

После того, как получили в сет value всех дубликатов -
передаем их все по очереди в цикле второму методу вместе с ссылкой на оригинальную мапу

for(String s:duplicates) {
    removeItemFromMapByValue(map,s);
}

Второй метод создает копию оригинальной мапы, чтобы не модифицировать оригинал
при итерации и ищет в ней пары с полученым value и удаляет по ключу все дубликаты в оригинале.


***************************************************************************************************************/


/******************************************************************************************* сольюШинс намбер фрі

public static void removeTheFirstNameDuplicates(Map<String, String> map) {
        ArrayList<String> list = new ArrayList<>(map.values());
        Collections.sort(list);
        ArrayList<String> newList = new ArrayList<>();
        for (int i = 0; i < list.size()-1; i++) {
            if (list.get(i).equals(list.get(i+1))) newList.add(list.get(i));
        }
        while (newList.size() != 0) {
            removeItemFromMapByValue(map, newList.get(0));
            newList.remove(0);
        }
    }

 ****************************************************************************************************************/

/*************************************************************************************************one more solution

        Map<String,String> map2 = map;
        Iterator <Map.Entry<String, String>> iterator = map2.entrySet().iterator();
        while (iterator.hasNext()){
            Map.Entry<String, String> pair = iterator.next();
            String name = pair.getValue();
            Iterator <Map.Entry<String, String>> iterator2 = map2.entrySet().iterator();
            Integer count = 0;
            while (iterator2.hasNext()){
                Map.Entry<String,String> pair2 = iterator2.next();
                String name2 = pair2.getValue();
                if (name.equals(name2))
                    count++;
            }
            if (count>0){
                removeItemFromMapByValue(map, name);
                count = 0;
            }
        }

 *****************************************************************************************************************/


/********************************************************************************************************** another

String[] array = new String[10];
        map.values().toArray(array);
        int count = 1; //количество повторов
        for (int i = 0; i < array.length-1; i++) {
            for (int j = i+1; j < array.length; j++) {
                if(array[i].equals(array[j])){
                    count++;
                }
            }
            if(count > 1){
                String val = array[i];
                while (true) {
                    if (map.containsValue(val)) {
                        removeItemFromMapByValue(map, val);
                    }
                    else{
                        break;
                    }
                }
                count = 1;
            }
        }


 ****************************************************************************************************************/