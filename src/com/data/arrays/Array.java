package com.data.arrays;

public class Array<T> implements IArray<T> {
    private final T[] items;
    int count = 0;
    private static final int DEFAULT_CAPACITY = 4;
    public  Array() {
        this(DEFAULT_CAPACITY);
    }

    public  Array(int capacity) {
        items = (T[]) new Object[capacity];
    }

    @Override
    public boolean add(T item) {
        if (isFull()) {
            return false;
        } else {
            items[count] = item;
            count++;
        }
        return true;
    }

    @Override
    public boolean isFull() {
        return count == items.length;
    }

    @Override
    public T[] toArray() {
        T[] newArray = (T[]) new Object[count];
        for (int i = 0; i < count; i++) {
            newArray[i] = items[i];
        }
        return newArray;
    }
}
