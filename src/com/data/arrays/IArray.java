package com.data.arrays;

public interface IArray<T> {
    boolean add(T item);

    int size();
    int length();
    int indexOf(T item);
    boolean remove(T item);
    T remove();
    T removeAt(int index);
    void clear();

    boolean isFull();
    boolean isEmpty();
    boolean contains(T item);
    int getFrequencyOf(T item);
    T[] toArray();
}
