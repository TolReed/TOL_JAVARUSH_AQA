package com.javarush.task.task13.task1324;

import java.awt.*;

/* 
Один метод в классе
*/

public class Solution {
    public static void main(String[] args) throws Exception {
    }

    public interface Animal {
        Color getColor();

        Integer getAge();
    }

    public abstract class Fox implements Animal { // changed static to abstract - Поменяй код так, чтобы в классе Fox был только один метод - getName.
        public String getName() {
            return "Fox";
        }

        }
}
