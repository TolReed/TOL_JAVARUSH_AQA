package com.javarush.task.task21.task2102;

import java.lang.reflect.Method;
import java.lang.reflect.Modifier;

/* 
Сравниваем модификаторы
*/
public class Solution {
    public static void main(String[] args) {
        int modifiersOfThisClass = Solution.class.getModifiers();
        System.out.println(isModifierSet(modifiersOfThisClass, Modifier.PUBLIC));   //true
        System.out.println(isModifierSet(modifiersOfThisClass, Modifier.STATIC));   //false

        int modifiersOfMethod = getMainMethod().getModifiers();
        System.out.println(isModifierSet(modifiersOfMethod, Modifier.STATIC));      //true
    }

    public static boolean isModifierSet(int allModifiers, int specificModifier) {
        boolean result = false;
        switch (specificModifier) {
            case Modifier.PUBLIC: {
                result = Modifier.isPublic(allModifiers);
            }
            break;
            case Modifier.STATIC: {
                result = Modifier.isStatic(allModifiers);
            }
        }
        return result;
    }

    private static Method getMainMethod() {
        Method[] methods = Solution.class.getDeclaredMethods();
        for (Method method : methods) {
            if (method.getName().equalsIgnoreCase("main")) return method;
        }

        return null;
    }
}

