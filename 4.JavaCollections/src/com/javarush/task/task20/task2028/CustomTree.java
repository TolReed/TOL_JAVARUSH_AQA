package com.javarush.task.task20.task2028;

import java.util.List;

/* 
Построй дерево(1)
*/


import java.io.Serializable;
import java.util.AbstractList;
import java.util.Collection;
import java.util.List;
import java.util.Spliterator;
import java.util.function.Consumer;
import java.util.function.Predicate;
import java.util.function.UnaryOperator;
import java.util.stream.Stream;


public class CustomTree extends AbstractList<String> implements Cloneable, Serializable{

    Entry<String> root;

    @Override
    public String get(int index){
        throw new UnsupportedOperationException("Method is not supported!!!");
    }

    @Override
    public String set(int index, String element){
        throw new UnsupportedOperationException("Method is not supported!!!");
    }

    @Override
    public void add(int index, String element){
        throw new UnsupportedOperationException("Method is not supported!!!");
    }

    @Override
    public String remove(int index){
        throw new UnsupportedOperationException("Method is not supported!!!");
    }

    @Override
    public boolean addAll(int index, Collection<? extends String> c){
        throw new UnsupportedOperationException("Method is not supported!!!");
    }

    @Override
    public List<String> subList(int fromIndex, int toIndex){
        throw new UnsupportedOperationException("Method is not supported!!!");
    }

    @Override
    protected void removeRange(int fromIndex, int toIndex){
        throw new UnsupportedOperationException("Method is not supported!!!");
    }

    @Override
    public int size(){
        return 0;
    }

    @Override
    public void replaceAll(UnaryOperator<String> operator){

    }

    @Override
    public Spliterator<String> spliterator(){
        return null;
    }

    @Override
    public boolean removeIf(Predicate<? super String> filter){
        return false;
    }

    @Override
    public Stream<String> stream(){
        return null;
    }

    @Override
    public Stream<String> parallelStream(){
        return null;
    }

    @Override
    public void forEach(Consumer<? super String> action){

    }

    static class Entry<T> implements Serializable{
        private String elementName;
        private int lineNumber;
        private boolean availableToAddLeftChildren, availableToAddRightChildren;
        private Entry<T> parent, leftChild, rightChild;

        public Entry(String elementName) {
            this.elementName = elementName;
            this.availableToAddLeftChildren = true;
            this.availableToAddRightChildren = true;
        }

        public void checkChildren(){
            if (rightChild != null) {
                availableToAddRightChildren = false;
            }
            if (leftChild != null) {
                this.availableToAddLeftChildren = false;
            }
        }

        public boolean isAvailableToAddChildren(){
            return availableToAddLeftChildren||availableToAddRightChildren;
        }
    }
}
