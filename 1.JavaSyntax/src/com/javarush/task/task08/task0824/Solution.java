package com.javarush.task.task08.task0824;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/* 
Собираем семейство
*/

public class Solution {
    public static void main(String[] args) {
        //напишите тут ваш код
        Human childBoyFirst = new Human("Son", true, 37);
        Human childBoySecond = new Human("Sonnn", true, 55);
        Human childGirlPrincess = new Human("Sonya", false, 30);
        ArrayList<Human> kinders = new ArrayList<>(Arrays.asList(childBoyFirst, childBoySecond, childGirlPrincess));

        Human father = new Human("Фезеер", true, 77, childBoyFirst, childBoySecond, childGirlPrincess);
        Human mother = new Human("мазеер", false, 78, childBoyFirst, childBoySecond, childGirlPrincess);
        ArrayList<Human> parents = new ArrayList<>(Arrays.asList(father, mother));

        Human grandFather1 = new Human("DED", true, 101, father);
        Human grandFather2 = new Human("DEDUWKA", true, 102, mother);
        Human grandMother1 = new Human("NeZvernulaUvagy", false, 105, father);
        Human grandMother2 = new Human("JaSpokoynaya", false, 117, mother);
        ArrayList<Human> respectus = new ArrayList<>(Arrays.asList(grandFather1, grandFather2, grandMother1, grandMother2));

        ArrayList<Human> family = new ArrayList<>();
        family.addAll(kinders);
        family.addAll(parents);
        family.addAll(respectus);

        for (Human x: family) {
            System.out.println(x.toString());
        }

    }

    public static class Human {
        //напишите тут ваш код
        String name;
        Boolean sex;
        int age;
        ArrayList<Human> children = new ArrayList<>();

        Human (String name, boolean sex, int age, Human ... x) {
            this.name = name;
            this.sex = sex;
            this.age = age;
            Collections.addAll(this.children, x);

        }

        public String toString() {
            String text = "";
            text += "Имя: " + this.name;
            text += ", пол: " + (this.sex ? "мужской" : "женский");
            text += ", возраст: " + this.age;

            int childCount = this.children.size();
            if (childCount > 0) {
                text += ", дети: " + this.children.get(0).name;

                for (int i = 1; i < childCount; i++) {
                    Human child = this.children.get(i);
                    text += ", " + child.name;
                }
            }
            return text;
        }

    }
}

/*

Human... x
Это почти тоже самое что и Human[] x, только позволяет отправлять данные в конструктор не так:

Human[] humans = new Human()[100];
humans[0] = new Human();
humans[1] = new Human();
humans[2] = new Human();
...
humans[99] = new Human();
new Human ("name", true, 15, humans)


А сразу так:
Human ("name", true, 15, new Human(), new Human(), new Human(), new Human(), new Human() ...)

Т.е. это значит что может быть передан ноль, один или несколько экземпляров класса Human
Например, если мы хотим передать только один экземпляр, нам не придётся создавать массив,
туда класть new Human и уже этот массив отправлять в конструктор, мы можем сделать так:

new Human ("name", true, 15, new Human())

*/
