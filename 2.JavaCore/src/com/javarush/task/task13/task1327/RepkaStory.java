package com.javarush.task.task13.task1327;

import java.util.List;

public class RepkaStory {
    static void tell(List<Person> items) {
        Person first;
        Person second;
        for (int i = items.size() - 1; i > 0; i--) {
            first = items.get(i); // той кого тягнуть, змінив з (і -1) на (і)
            second = items.get(i - 1); // той хто тягне, змінив з (і) на (і-1)
            first.pull(second);
        }
    }
}
