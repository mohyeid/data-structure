package com.data.arrays;

import java.util.Arrays;

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
        if (isFull() || item == null) {
            return false;
        } else {
            items[count] = item;
            count++;
        }
        return true;
    }

    @Override
    public boolean remove(T item) {
        int index = indexOf(item);
        T removedItem = removeAt(index);
        return item.equals(removedItem);
    }

    @Override
    public T remove() {
        return removeAt(count - 1);
        /*
        T result = null;
        if (!isEmpty()) {
            count--;
            result = items[count];
            items[count] = null;
        }
        return  result;*/
    }

    @Override
    public T removeAt(int index) {
        T result = null;
        if (!isEmpty() && index > -1) {
            count--;
            result = items[index];
            if(count > 0) {
                items[index] = items[count];
            }
            items[count] = null;
        }
        return result;
    }

    @Override
    public void clear() {
        while (remove() != null);
    }




    @Override
    public int size() {
        return count;
    }

    @Override
    public int length() {
        return  items.length;
    }

    @Override
    public boolean isFull() {
        return count == items.length;
    }

    @Override
    public boolean isEmpty() {
        return size() == 0;
    }

    @Override
    public int indexOf(T item) {
        int index = -1;
        for (int i = 0; index > -1 && i < count; i ++) {
            if(items[i].equals(item)){
                index = i;
            }
        }
        return index;
    }
    
    @Override
    public boolean contains(T item) {
        return (indexOf(item)) > -1;
        /*
        boolean found = false;
        if (!isEmpty()) {
            for(int i = 0; !found && i < this.size(); i++) {
                if (item.equals(items[i])){
                    found = true;
                }
            }
        }
        return found;*/
    }

    @Override
    public int getFrequencyOf(T item) {
        int frequency = 0;
        if (!isEmpty()) {
            for(int i = 0; i < this.size(); i++) {
                if (item.equals(items[i])){
                    frequency++;
                }
            }
        }
        return frequency;
    }

    @Override
    public T[] toArray() {
        /*
        T[] newArray = (T[]) new Object[count];
        for (int i = 0; i < count; i++) {
            newArray[i] = items[i];
        }
        return newArray;*/
        return Arrays.copyOf(items, count);
    }
}
