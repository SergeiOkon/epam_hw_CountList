package com.myarraylist;

public class MyArrayList<T> {
    private final int DEFAULT_SIZE = 16;
    private Object[] array = new Object[DEFAULT_SIZE];
    private int pointer = 0;

    public void add(T item) {
        if (pointer == array.length - 1)
            resize(array.length * 2); // увеличу в 2 раза, если достигли границ
        array[pointer++] = item;
    }

    public int size() {
        return pointer;
    }

    public T get(int index) {
        return (T) array[index];
    }

    private void resize(int newLength) {
        Object[] newArray = new Object[newLength];
        System.arraycopy(array, 0, newArray, 0, pointer);
        array = newArray;
    }
}