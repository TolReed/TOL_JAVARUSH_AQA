package com.javarush.task.task20.task2028;

import java.io.Serializable;
import java.util.*;

/*
Построй дерево(1) https://javarush.ru/help/19629 && https://javarush.ru/help/30724 && https://javarush.ru/help/20057
*/

public class CustomTree extends AbstractList<String> implements Cloneable, Serializable {
    Entry<String> root;
    public ArrayList<Entry> entries = new ArrayList<>();

    public CustomTree() {
        root = new Entry<>("0");
        entries.add(root);
    }

    @Override
    public boolean add(String s) {
        Entry<String> newEntry = new Entry<>(s);
        boolean flag = false;

        for (Entry entry : entries) {

            if (entry.availableToAddLeftChildren) {
                entry.leftChild = newEntry;
                entry.availableToAddLeftChildren = false;
                newEntry.parent = entry;
                entries.add(newEntry);
                flag = true;
                break;
            }
            else if (entry.availableToAddRightChildren) {
                entry.rightChild = newEntry;
                entry.availableToAddRightChildren = false;
                newEntry.parent = entry;
                entries.add(newEntry);
                flag = true;
                break;
            }
        }

        if (!flag) {
            for (Entry entry : entries) {
                if (entry.leftChild == null) {
                    entry.availableToAddLeftChildren = true;
                    entry.availableToAddRightChildren = true;
                }
            }
            add(s);
        }

        return true;
    }

    public boolean remove(Object o) {
        String s;
        try {
            s = (String) o;
        } catch (Exception e) {
            throw new UnsupportedOperationException();
        }

        //Find entry and set null
        for (Entry entry : entries) {
            if (entry.elementName.equals(s)) {
                if (entry.parent.leftChild == entry) {
                    entry.parent.leftChild = null;
                }
                else
                    entry.parent.rightChild = null;


                entries.remove(entry);
                break;
            }
        }

        //Remove entries
        ArrayList<Entry> toRemove = new ArrayList<>();
        for (Entry entry : entries) {
            if (entry != root && !entries.contains(entry.parent)) {
                toRemove.add(entry);
            }
        }
        entries.removeAll(toRemove);


        return true;
    }
    static class Entry<T> implements Serializable{
        String elementName;
        boolean availableToAddLeftChildren, availableToAddRightChildren;

        Entry<T> parent, leftChild, rightChild;

        public Entry(String elementName) {
            this.elementName = elementName;
            availableToAddLeftChildren = true;
            availableToAddRightChildren = true;

        }
        public boolean isAvailableToAddChildren() {
            return availableToAddLeftChildren || availableToAddRightChildren;
        }

    }

    @Override
    public String get(int index) {
        throw new UnsupportedOperationException();
    }

    @Override
    public boolean addAll(int index, Collection<? extends String> c) {
        throw new UnsupportedOperationException();
    }

    @Override
    protected void removeRange(int fromIndex, int toIndex) {
        throw new UnsupportedOperationException();
    }

    @Override
    public List<String> subList(int fromIndex, int toIndex) {
        throw new UnsupportedOperationException();
    }

    @Override
    public String set(int index, String element) {
        throw new UnsupportedOperationException();
    }

    @Override
    public void add(int index, String element) {
        throw new UnsupportedOperationException();
    }

    @Override
    public String remove(int index) {
        throw new UnsupportedOperationException();
    }

    @Override
    public int size() {
        int size = -1;
        ArrayList<Entry<String>> intQueue = new ArrayList<Entry<String>>();
        intQueue.add(root);

        while (! intQueue.isEmpty()){
            Entry<String> current = intQueue.remove(0);
            size++;
            if (current.leftChild != null){ intQueue.add(current.leftChild); }

            if (current.rightChild != null){ intQueue.add(current.rightChild); }
        }
        return size;
    }

    public String getParent(String s) {
        final String[] result = new String[1];
        entries.forEach(k -> {
            if (k.elementName.equals(s)) {
                result[0] = k.parent.elementName;
            }
        });
        return result[0];
    }
}
