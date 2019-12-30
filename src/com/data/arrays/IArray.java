package com.data.arrays;

public interface IArray<T> {
    boolean add(T item);
    boolean isFull();
    T[] toArray();
}
