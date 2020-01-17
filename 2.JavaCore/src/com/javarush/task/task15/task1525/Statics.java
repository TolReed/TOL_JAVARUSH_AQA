package com.javarush.task.task15.task1525;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class Statics {
    public static String FILE_NAME = "/Users/anatolii.dudochkin/Desktop/Tol/tol.txt";/* add the path to your source file here */



    ;
}
/* Тоже интересные варианты:

1. Files.lines(Paths.get(Statics.FILE_NAME)).forEach(line -> lines.add(line));
2. lines = Files.readAllLines(Paths.get(Statics.FILE_NAME)));
Comment: В первом с каждой строкой отдельно работает, а во втором варианте сразу отдаёт в виде List<String>
3. вариации на тему collect
lines = new BufferedReader(new FileReader(Statics.FILE_NAME)).lines().collect(Collectors.toList());

> Полина22 уровень
    я до сих пор не понимаю, для чего нужен статический блок. Объясните кто-нибудь своими словами, пожалуйста

> Иван Ганжа20 уровень, Москва
    Нет проблем проинициализировать статическую переменную при написания класса
    public static counter = 0;
    Но если надо проинициализировать статическую переменную "на лету", то есть мы при написании класса не знаем чему переменная будет равна.
    Синтетический пример: Тот же counter только начинатся он должен не с 0, а с числа которое рассчитывается исходя из температуры за окном на момент загрузки класса.
    Вот тогда и нужен блок статик, что бы загрузиться температуру из интернета и проинициализировать каунтер.

> Denis Sabinin26 уровень, Москва
    Для удобства, простоты, гибкости, вариативности и скорости написания кода
    по- сути это неименованный static private void метод без параметров, который тут-же описан и тут-же вызывается.
*/