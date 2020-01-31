package com.javarush.task.task17.task1710;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Locale;

// https://javarush.ru/help/34279 & https://javarush.ru/help/16735 - bufferreader & https://javarush.ru/help/21035

/* 
CRUD
*/

public class Solution { //https://javarush.ru/help/29258 & https://javarush.ru/help/33027
    public static List<Person> allPeople = new ArrayList<Person>();

    static {
        allPeople.add(Person.createMale("Иванов Иван", new Date()));  //сегодня родился    id=0
        allPeople.add(Person.createMale("Петров Петр", new Date()));  //сегодня родился    id=1
    }

    public static void main(String[] args) {

        try {
            if (args[0].equals("-u")) {
                int i = Integer.parseInt(args[1]);
                allPeople.get(i).setName(args[2]);
                if (args[3].equals("м")) {
                    allPeople.get(i).setSex(Sex.MALE);
                }
                if (args[3].equals("ж")) {
                    allPeople.get(i).setSex(Sex.FEMALE);
                }
                Date date = new SimpleDateFormat("dd/MM/yyyy").parse(args[4]);
                allPeople.get(i).setBirthDate(date);
            }

            if (args[0].equals("-c")) {
                if (args[2].equals("м")) {
                    Person newPerson = Person.createMale(args[1], new SimpleDateFormat("dd/MM/yyyy").parse(args[3]));
                    allPeople.add(newPerson);
                    System.out.println(allPeople.indexOf(newPerson));
                }
                if (args[2].equals("ж")) {
                    Person newPerson = Person.createFemale(args[1], new SimpleDateFormat("dd/MM/yyyy").parse(args[3]));
                    allPeople.add(newPerson);
                    System.out.println(allPeople.indexOf(newPerson));
                }
            }

            if (args[0].equals("-d")) {
                int i = Integer.parseInt(args[1]);
                allPeople.get(i).setName(null);
                allPeople.get(i).setSex(null);
                allPeople.get(i).setBirthDate(null);
            }

            if (args[0].equals("-i")) {
                int i = Integer.parseInt(args[1]);
                SimpleDateFormat dateFormat = new SimpleDateFormat("d-MMM-yyyy", Locale.ENGLISH);
                if (allPeople.get(i).getSex().equals(Sex.MALE)){
                    System.out.println(allPeople.get(i).getName() + " " + "м" + " " + dateFormat.format(allPeople.get(i).getBirthDate()));
                }
                if (allPeople.get(i).getSex().equals(Sex.FEMALE)) {
                    System.out.println(allPeople.get(i).getName() + " " + "ж" + " " + dateFormat.format(allPeople.get(i).getBirthDate()));
                }
            }
        } catch (Exception e) {        }
    }
}
