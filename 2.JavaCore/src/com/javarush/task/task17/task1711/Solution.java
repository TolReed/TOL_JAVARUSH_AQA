package com.javarush.task.task17.task1711;

import java.io.IOException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Locale;
//https://javarush.ru/help/32988
/* 
CRUD 2
*/

public class Solution {
    public static volatile List<Person> allPeople = new ArrayList<Person>();

    static {
        allPeople.add(Person.createMale("Иванов Иван", new Date()));  //сегодня родился    id=0
        allPeople.add(Person.createMale("Петров Петр", new Date()));  //сегодня родился    id=1
    }


    public static void main(String[] args) throws IOException, ParseException {
        SimpleDateFormat formatter = new SimpleDateFormat("dd/MM/yyyy", Locale.ENGLISH);
        SimpleDateFormat dateOut = new SimpleDateFormat("dd-MMM-yyyy", Locale.ENGLISH);

        switch (args[0]) {

            case "-c":
                synchronized (allPeople) {
                    for (int i = 1, j = 0; j < (args.length - 1) / 3; i += 3, j++) {
                            if (args[i+1].equals("м")) {
                            allPeople.add(Person.createMale(args[i], formatter.parse(args[i + 2])));
                            System.out.println(allPeople.size() - 1);
                        } else {
                            allPeople.add(Person.createFemale(args[i], formatter.parse(args[i + 2])));
                            System.out.println(allPeople.size() - 1);
                        }
                    }
                    break;
                }
            case "-u":
                synchronized (allPeople) {
                    for (int i = 1, j = 0; j < (args.length - 1) / 4; i += 4, j++) {
                        allPeople.get(Integer.parseInt(args[i])).setName(args[i + 1]);
                        if (args[i+2].equals("м")) {
                            allPeople.get(Integer.parseInt(args[i])).setSex(Sex.MALE);
                        } else {
                            allPeople.get(Integer.parseInt(args[i])).setSex(Sex.FEMALE);
                        }
                        allPeople.get(Integer.parseInt(args[i])).setBirthDate(formatter.parse(args[i + 3]));
                    }
                    break;
                }
            case "-d":
                synchronized (allPeople) {
                    for (int i = 1; i < args.length; i++) {
                        allPeople.get(Integer.parseInt(args[i])).setName(null);
                        allPeople.get(Integer.parseInt(args[i])).setBirthDate(null);
                        allPeople.get(Integer.parseInt(args[i])).setSex(null);
                    }
                    break;
                }
            case "-i":
                synchronized (allPeople) {
                    for (int i = 1; i < args.length; i++) {
                        if (allPeople.get(Integer.parseInt(args[i])).getSex().equals(Sex.MALE)) {
                            System.out.println(allPeople.get(Integer.parseInt(args[i])).getName() + " м " + dateOut.format(allPeople.get(Integer.parseInt(args[i])).getBirthDate()));
                        } else {
                            System.out.println(allPeople.get(Integer.parseInt(args[i])).getName() + " ж " + dateOut.format(allPeople.get(Integer.parseInt(args[i])).getBirthDate()));
                        }
                    }
                    break;
                }
        }
    }
}

