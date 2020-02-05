package com.javarush.task.task19.task1904;

import java.io.IOException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

/* 
И еще один адаптер
*/

public class Solution {

    public static void main(String[] args) throws IOException {

    }

    public static class PersonScannerAdapter implements PersonScanner {

        private static final String PERSON_REGEXP  = "(.+) (.+) (.+) (\\d+) (\\d+) (\\d+)";
        private static final String DATE_FORMATTER = "dd MM yyyy";
        private Scanner fileScanner;

        public PersonScannerAdapter(Scanner fileScanner) {
            this.fileScanner = fileScanner;
        }

        @Override
        public Person read() throws IOException {

            if (fileScanner.hasNextLine()) {
                String line = fileScanner.nextLine();
                String firstName  = line.replaceFirst(PERSON_REGEXP, "$2");
                String middleName = line.replaceFirst(PERSON_REGEXP, "$3");
                String lastName   = line.replaceFirst(PERSON_REGEXP, "$1");
                SimpleDateFormat sdf = new SimpleDateFormat(DATE_FORMATTER);
                Date birthDate = null;
                try {
                    birthDate = sdf.parse(line.replaceFirst(PERSON_REGEXP, "$4 $5 $6"));
                }
                catch (ParseException e) {e.printStackTrace();}

                return new Person(firstName, middleName, lastName, birthDate);
            }

            return null;

        }

        @Override
        public void close() throws IOException {
            fileScanner.close();
        }


    }
}
