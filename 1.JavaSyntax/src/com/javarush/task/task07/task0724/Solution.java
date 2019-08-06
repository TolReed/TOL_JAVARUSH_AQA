package com.javarush.task.task07.task0724;

/* 
Семейная перепись
*/

public class Solution {
    public static void main(String[] args) {
        // напишите тут ваш код
        Human gf1 = new Human("Толянчик", true, 65);
        Human gf2 = new Human("Русланчик", true, 75);

        Human gm1 = new Human("Надежда Хоупівна", false, 75);
        Human gm2 = new Human("НезВернулаУвагівна", false, 85);

        Human father1 = new Human("Матвій", true, 55, gf1, gm1);
        //Human father2 = new Human("Теодор", true, 55, gf2, gm2);
        //Human father3 = new Human("Хоупович", true, 55, gf1, gm2);

        Human mother1 = new Human("Хоупівна", false, 55, gf1, gm1);
        //Human mother2 = new Human("НезВернулаУвагівна", true, 55, gf2, gm2);

        Human child1 = new Human("Теодор", true, 21, father1, mother1);
        Human child2 = new Human("Емма-Еліза-Браунті", false, 19, father1, mother1);
        Human child3 = new Human("Афанасій", true, 16, father1, mother1);

        System.out.println(gf1);
        System.out.println(gf2);
        System.out.println(gm1);
        System.out.println(gm2);
        System.out.println(father1);
        System.out.println(mother1);
        System.out.println(child1);
        System.out.println(child2);
        System.out.println(child3);


    }

    public static class Human {
        // напишите тут ваш код
        String name;
        boolean sex;
        int age;
        Human father;
        Human mother;

        public Human (String name, boolean sex, int age) {
            this.name = name;
            this.sex = sex;
            this.age = age;
        }

        public Human (String name, boolean sex, int age, Human father, Human mother) {
            this.name = name;
            this.sex = sex;
            this.age = age;
            this.father = father;
            this.mother = mother;
        }

        public String toString() {
            String text = "";
            text += "Имя: " + this.name;
            text += ", пол: " + (this.sex ? "мужской" : "женский");
            text += ", возраст: " + this.age;

            if (this.father != null) {
                text += ", отец: " + this.father.name;
            }

            if (this.mother != null) {
                text += ", мать: " + this.mother.name;
            }

            return text;
        }
    }
}