package com.javarush.task.task08.task0816;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.*;

/* 
Добрая Зинаида и летние каникулы
*/

public class Solution {
    public static Map<String, Date> createMap() throws ParseException {
        DateFormat dateFormat = new SimpleDateFormat("MMMMM d yyyy", Locale.ENGLISH);
        Map<String, Date> map = new HashMap<>();
        map.put("Сталлоне", dateFormat.parse("MAY 1 2012"));
        map.put("Шварцнегер", dateFormat.parse("FEB 21 2016"));
        map.put("Обама", dateFormat.parse("JUN 13 1987"));
        map.put("Трамп", dateFormat.parse("JUL 31 1966"));
        map.put("Киркоров", dateFormat.parse("OCT 7 1967"));
        map.put("Долгин", dateFormat.parse("APR 16 2001"));
        map.put("Михальчук", dateFormat.parse("MAR 17 2002"));
        map.put("Мейвезер", dateFormat.parse("JAN 6 1977"));
        map.put("Абрамович", dateFormat.parse("JUN 7 1955"));
        map.put("МакГрегор", dateFormat.parse("FEB 23 2003"));

        //напишите тут ваш код
        return map;
    }

    public static void removeAllSummerPeople(Map<String, Date> map) {
        //напишите тут ваш код
        Iterator<Map.Entry<String, Date>> it = map.entrySet().iterator();
        while (it.hasNext()) {
            int month = it.next().getValue().getMonth();
            if (month > 4 && month < 8) {
                it.remove();
            }

        }



    }

    public static void main(String[] args) {
        //only for testing


    }
}


/******************************************************************* another possible solution

Iterator<Map.Entry<String, Date>> iterator = map.entrySet().iterator();
while (iterator.hasNext()) {
    String date = iterator.next().getValue().toString();
    if (date.contains("Aug") ||
            date.contains("Jun") ||
            date.contains("Jul")) {
        iterator.remove();
    }
}
******************************************************************************************/