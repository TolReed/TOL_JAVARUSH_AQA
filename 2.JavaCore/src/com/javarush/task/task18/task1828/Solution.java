package com.javarush.task.task18.task1828;

/* 
Прайсы 2
*/

import java.io.*;
import java.util.Scanner;

public class Solution {
    public static void main(String[] args) throws Exception {
        String crudFile = new Scanner(System.in).nextLine();

        String line = null;
        StringBuffer stringBuffer = new StringBuffer();

        if (args.length == 0) {
            System.out.println("No arguments");
        } else if (args[0].equals("-u") && args.length == 5) {
            String idString = args[1];
            String productName = args[2];
            String price = args[3];
            String quantity = args[4];

            try (
//                FileReader fileReader = new FileReader("/home/pavel/JavaRushTasks/2.JavaCore/src/com/javarush/task/task18/task1828/"
//                    + crudFile);
                    FileReader fileReader = new FileReader(crudFile);
                    BufferedReader bufferedReader = new BufferedReader(fileReader)) {
                while ((line = bufferedReader.readLine()) != null) {
                    if (line.length() == 0) {
                        break;
                    } else {
                        if (idString.equals(line.substring(0, 8).trim())) {
                            String oldProductName = line.substring(8, 38);
                            String oldPrice = line.substring(38, 46);
                            String oldQuantity = line.substring(46, 50);
                            String newProductName = oldProductName.replace(oldProductName, formatAsPerTask(productName, 30));
                            String newPrice = oldPrice.replace(oldPrice, formatAsPerTask(price, 8));
                            String newQuantity = oldQuantity.replace(oldQuantity, formatAsPerTask(quantity, 4));
                            String newIdString = idString.replace(idString, formatAsPerTask(idString, 8));
                            line = newIdString + newProductName + newPrice + newQuantity;
                        }
                    }
                    stringBuffer.append(line);
                    stringBuffer.append(System.lineSeparator());
                }
            } catch (IOException ex) {
                System.out.println(ex.getMessage());
            }
            try (
//                FileWriter fileWriter = new FileWriter("/home/pavel/JavaRushTasks/2.JavaCore/src/com/javarush/task/task18/task1828/"
//                    + crudFile);
                    FileWriter fileWriter = new FileWriter(crudFile);
                    BufferedWriter bufferedWriter = new BufferedWriter(fileWriter)) {
                String inputString = stringBuffer.toString();
                bufferedWriter.write(inputString);
            } catch (IOException ex) {
                System.out.println(ex.getMessage());
            }
        } else if (args[0].equals("-d") && args.length == 2) {
            String idString = args[1];
            try (
//                FileReader fileReader = new FileReader("/home/pavel/JavaRushTasks/2.JavaCore/src/com/javarush/task/task18/task1828/"
//                    + crudFile);
                    FileReader fileReader = new FileReader(crudFile);
                    BufferedReader bufferedReader = new BufferedReader(fileReader)) {
                while ((line = bufferedReader.readLine()) != null) {
                    if (line.length() == 0) {
                        break;
                    } else if (idString.equals(line.substring(0, 8).trim())) {
                        line = "";
                    }
                    if (!line.equals("")) {
                        stringBuffer.append(line);
                        stringBuffer.append(System.lineSeparator());
                    }
                }
            } catch (IOException ex) {
                System.out.println(ex.getMessage());
            }

            try (
//                FileWriter fileWriter = new FileWriter("/home/pavel/JavaRushTasks/2.JavaCore/src/com/javarush/task/task18/task1828/"
//                    + crudFile);
                    FileWriter fileWriter = new FileWriter(crudFile);
                    BufferedWriter bufferedWriter = new BufferedWriter(fileWriter)) {
                String inputString = stringBuffer.toString();
                bufferedWriter.write(inputString);
            } catch (IOException ex) {
                System.out.println(ex.getMessage());
            }
        } else {
            System.out.println("Entered invalid arguments");
        }
    }

    public static String formatAsPerTask(String inputString, int lengthOfString) {
        String outputString;
        if (inputString.length() > lengthOfString) {
            outputString = inputString.substring(0, lengthOfString);
        } else if (inputString.length() < lengthOfString) {
            outputString = inputString;
            for (int i = 0; i < lengthOfString - inputString.length(); i++) {
                outputString += " ";
            }
        } else {
            outputString = inputString;
        }
        return outputString;
    }
}
