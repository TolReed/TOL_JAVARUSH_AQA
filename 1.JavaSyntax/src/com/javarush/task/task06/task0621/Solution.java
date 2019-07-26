package com.javarush.task.task06.task0621;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/* 
Родственные связи кошек
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        String grandDadName = reader.readLine();
        Cat grandDad = new Cat(grandDadName);

        String grannyName = reader.readLine();
        Cat granny = new Cat(grannyName);

        String fatherName = reader.readLine();
        Cat father = new Cat(fatherName, null, grandDad);

        String motherName = reader.readLine();
        Cat catMother = new Cat(motherName, granny, null);

        String sonName = reader.readLine();
        Cat son = new Cat(sonName, catMother, father);

        String daughterName = reader.readLine();
        Cat catDaughter = new Cat(daughterName, catMother, father);


        System.out.println(grandDad);
        System.out.println(granny);
        System.out.println(father);
        System.out.println(catMother);
        System.out.println(son);
        System.out.println(catDaughter);
    }

    public static class Cat {
        private String name;
        private Cat mother;
        private Cat father;

        Cat(String name) {

            this.name = name;
        }

        Cat(String name, Cat mother) {
            this.name = name;
            this.mother = mother;
        }

        Cat(String name, Cat mother, Cat father) {
            this.name = name;
            this.mother = mother;
            this.father = father;
        }

        @Override
        public String toString() {
            if (mother == null && father == null) {
                return "The cat's name is " + name + ", no mother, no father ";
            } else if (mother != null && father == null) {
                return "The cat's name is " + name + ", mother is " + mother.name + ", no father ";
            } else if (mother == null && father != null) {
                return "The cat's name is " + name + ", no mother, father is " + father.name;
            } else {
                return "The cat's name is " + name + ", mother is " + mother.name + ", father is " + father.name;
            }
        }

    }


}


/********************************** not WORKING!!!!!!!!!! aaaaaaaaaaaaaaaaaaaaa KURVA
 BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

 String GrandPaName = reader.readLine();
 Cat catGP = new Cat(GrandPaName);

 String GrandMaName = reader.readLine();
 Cat catGM = new Cat(GrandMaName);

 String FatherName = reader.readLine();
 Cat catFather = new Cat(FatherName, null);

 String motherName = reader.readLine();
 Cat catMother = new Cat(motherName);

 String SonName = reader.readLine();
 Cat catSon = new Cat(SonName, catMother,catFather);

 String daughterName = reader.readLine();
 Cat catDaughter = new Cat(daughterName, catMother,catFather);

 System.out.println(catGP);
 System.out.println(catGM);
 System.out.println(catFather);
 System.out.println(catMother);
 System.out.println(catSon);
 System.out.println(catDaughter);
 }

 public static class Cat {
 private String name;
 private Cat mother;
 private Cat father;

 Cat(String name) {
 this.name = name;
 }

 Cat(String name, Cat mother, Cat father) {
 this.name = name;
 this.mother = mother;
 this.father = father;
 }

 @Override
 public String toString() {
 if (mother == null && father == null)
 return "The cat's name is " + name + ", no mother " + ", no father ";
 else if (mother == null && father != null)
 return "The cat's name is " + name + ", no mother " +  ", father is " + father.name;
 else if (mother != null && father == null)
 return "The cat's name is " + name + ", mother is " + mother.name + ", no father ";
 else
 return "The cat's name is " + name + ", mother is " + mother.name + ", father is " + father.name;
 }
 }
 ********************************************************************************************/