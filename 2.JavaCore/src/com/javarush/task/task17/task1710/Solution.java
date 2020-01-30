package com.javarush.task.task17.task1710;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Locale;
// https://javarush.ru/help/34279
/* 
CRUD
*/

public class Solution { //https://javarush.ru/help/29258 & https://javarush.ru/help/33027
    public static List<Person> allPeople = new ArrayList<Person>();

    static {
        allPeople.add(Person.createMale("Иванов Иван", new Date()));  //сегодня родился    id=0
        allPeople.add(Person.createMale("Петров Петр", new Date()));  //сегодня родился    id=1
    }

    public static void main(String[] args) throws ParseException {
        //start here - начни тут
        SimpleDateFormat oldFormat = new SimpleDateFormat("dd/mm/yyyy");
        SimpleDateFormat newFormat = new SimpleDateFormat("dd-MMM-yyyy", Locale.ENGLISH);

        System.out.println(args[0] + " " + args[1] + " " + args[2] + " " + args[3]);

        if(args[0].equals("-c")) {
            Person person;
            System.out.println(args[3]);
            if(args[2].equals("м")) {
                person = Person.createMale(args[1],oldFormat.parse(args[3]));
            }else {
                person = Person.createFemale(args[1],oldFormat.parse(args[3]));
            }
            allPeople.add(person);
            System.out.println(allPeople.indexOf(person));
        }else if(args[0].equals("-u")) {
            Person person;
            if(args[3].equals("м")) {
                person = Person.createMale(args[2],oldFormat.parse(args[4]));
            }else {
                person = Person.createFemale(args[2],oldFormat.parse(args[4]));
            }
            allPeople.set(Integer.parseInt(args[1]),person);
        }else if(args[0].equals("-d")) {
            int index = Integer.parseInt(args[1]);
            Person person = allPeople.get(index);
            person.setName(null);
            person.setSex(null);
            person.setBirthDate(null);
        }else if(args[0].equals("-i")) {
            int index = Integer.parseInt(args[1]);
            Person person = allPeople.get(index);
            String newDate = newFormat.format(person.getBirthDate());
            System.out.println(person.getName() + " " + person.getSex() + " " + newDate);
        }
    }
}
