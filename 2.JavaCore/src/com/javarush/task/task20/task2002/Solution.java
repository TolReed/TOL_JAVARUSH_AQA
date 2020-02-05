package com.javarush.task.task20.task2002;

import java.io.*;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Locale;

/* https://javarush.ru/help/32748
Читаем и пишем в файл: JavaRush
*/
public class Solution {
    public static void main(String[] args) {
        //you can find your_file_name.tmp in your TMP directory or adjust outputStream/inputStream according to your file's actual location
        //вы можете найти your_file_name.tmp в папке TMP или исправьте outputStream/inputStream в соответствии с путем к вашему реальному файлу
        try {
            //   File yourFile = File.createTempFile("E:/1.txt", null);
            OutputStream outputStream = new FileOutputStream("E:/1.txt");
            InputStream inputStream = new FileInputStream("E:/1.txt");

            JavaRush javaRush = new JavaRush();
            //initialize users field for the javaRush object here - инициализируйте поле users для объекта javaRush тут
            User user = new User();
            user.setFirstName("O");
            user.setLastName("B");
            String dat = "24.08.2005 22:25:30.24";
            SimpleDateFormat dateFormat = new SimpleDateFormat( "dd.MM.yyyy HH:mm:ss.SSS");
            Date date = dateFormat.parse(dat);
            user.setBirthDate(date);
            user.setMale(true);
            user.setCountry(User.Country.RUSSIA);
            javaRush.users.add(user);

            javaRush.save(outputStream);
            outputStream.flush();

            JavaRush loadedObject = new JavaRush();
            loadedObject.load(inputStream);
            //here check that the javaRush object is equal to the loadedObject object - проверьте тут, что javaRush и loadedObject равны
            if(javaRush.equals(loadedObject))
                System.out.println("равны");

            System.out.println(javaRush.hashCode() + " " + loadedObject.hashCode());

            for(int i=0; i< loadedObject.users.size();i++) {
                System.out.println(loadedObject.users.get(i).getFirstName());
                System.out.println(loadedObject.users.get(i).getLastName());
                System.out.println(loadedObject.users.get(i).getBirthDate());
                System.out.println(loadedObject.users.get(i).isMale());
                System.out.println(loadedObject.users.get(i).getCountry());

            }

            outputStream.close();
            inputStream.close();

        } catch (IOException e) {
            //e.printStackTrace();
            System.out.println("Oops, something is wrong with my file");
        } catch (Exception e) {
            //e.printStackTrace();
            System.out.println("Oops, something is wrong with the save/load method");
        }
    }

    public static class JavaRush {
        public List<User> users = new ArrayList<>();

        public void save(OutputStream outputStream) throws Exception {
            //implement this method - реализуйте этот метод
            PrintWriter writer = new PrintWriter(outputStream);

            if(!this.users.isEmpty()) {
                writer.println("yes");
                for(int i=0;i<this.users.size();i++) {
                    writer.println(users.get(i).getFirstName());
                    writer.println(users.get(i).getLastName());
                    writer.println(users.get(i).getBirthDate());
                    writer.println(users.get(i).isMale());
                    writer.println(users.get(i).getCountry());
                }
            }
            else writer.println("no");
            writer.close();
        }

        public void load(InputStream inputStream) throws Exception {
            //implement this method - реализуйте этот метод
            InputStreamReader inStrRead = new InputStreamReader(inputStream);
            BufferedReader bufRead = new BufferedReader(inStrRead);
            int i=0;
            if(bufRead.readLine().equals("yes")) {
                while (bufRead.ready()) {
                    users.add(new User());
                    users.get(i).setFirstName(bufRead.readLine());
                    users.get(i).setLastName(bufRead.readLine());
                    SimpleDateFormat dateFormat = new SimpleDateFormat( "EEE MMM dd HH:mm:ss z yyyy", Locale.US);
                    Date date = dateFormat.parse(bufRead.readLine());
                    users.get(i).setBirthDate(date);
                    users.get(i).setMale(Boolean.parseBoolean(bufRead.readLine()));
                    User.Country country = User.Country.OTHER;
                    switch (bufRead.readLine()) {
                        case "UKRAINE": country = User.Country.UKRAINE; break;
                        case "RUSSIA" : country = User.Country.RUSSIA; break;
                    }
                    users.get(i).setCountry(country);
                    i++;
                }
            }
            bufRead.close();

        }

        @Override
        public boolean equals(Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;

            JavaRush javaRush = (JavaRush) o;

            return users != null ? users.equals(javaRush.users) : javaRush.users == null;

        }

        @Override
        public int hashCode() {
            return users != null ? users.hashCode() : 0;
        }
    }
}
