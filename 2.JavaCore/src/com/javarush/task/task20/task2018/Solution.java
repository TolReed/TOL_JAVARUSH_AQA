package com.javarush.task.task20.task2018;

import java.io.*;

/* 
Найти ошибки
*/
public class Solution {
    public static class A {

        protected String nameA = "A";

        public A(String nameA) {
            this.nameA += nameA;
        }
    }

    public class B extends A implements Serializable {

        private String nameB;

        public B(String nameA, String nameB) {
            super(nameA);
            this.nameA += nameA;
            this.nameB = nameB;
        }

        /*added this block - https://javarush.ru/help/2322 */
        public void writeObject(ObjectOutputStream out) throws Exception {
            out.defaultWriteObject();
            out.writeObject(nameA);
            out.writeObject(nameB);
        }

        public void readObject(ObjectInputStream in) throws Exception {
            in.defaultReadObject();
            nameA = (String) in.readObject();
            nameB = (String) in.readObject();
        }
        /*added this block*/

    }

    public static void main(String[] args) throws Exception {
        ByteArrayOutputStream arrayOutputStream = new ByteArrayOutputStream();
        ObjectOutputStream oos = new ObjectOutputStream(arrayOutputStream);

        Solution solution = new Solution();
        B b = solution.new B("B2", "C33");
        System.out.println("nameA: " + b.nameA + ", nameB: " + b.nameB);

        oos.writeObject(b);
        b.writeObject(oos);

        ByteArrayInputStream arrayInputStream = new ByteArrayInputStream(arrayOutputStream.toByteArray());
        ObjectInputStream ois = new ObjectInputStream(arrayInputStream);

        B b1 = (B)ois.readObject();
        b1.readObject(ois);

        System.out.println("nameA: " + b1.nameA + ", nameB: " + b1.nameB);
    }
}
