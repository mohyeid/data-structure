package com.data.test;

import com.data.arrays.Array;
import com.data.arrays.IArray;
import org.junit.Assert;
import org.junit.Test;

public class ArrayTest {
    @Test()
    public void testAdd() {
        IArray<Integer> array = new Array<Integer>(5);
        boolean addded = array.add(5);
        Assert.assertTrue(addded);
    }

    @Test()
    public void testAddDoesNotAdd() {
        IArray<Integer> array = new Array<Integer>(1);
        array.add(5);
        boolean addded = array.add(5);
        Assert.assertFalse(addded);
    }

    @Test()
    public void testIsFullFalse() {
        IArray<Integer> array = new Array<Integer>(2);
        array.add(5);
        Assert.assertFalse(array.isFull());
    }

    @Test()
    public void testIsFullTrue() {
        IArray<Integer> array = new Array<Integer>(2);
        array.add(5);
        array.add(5);
        Assert.assertTrue(array.isFull());
    }

    @Test()
    public void testIsEmptyTrue() {
        IArray<Integer> array = new Array<Integer>(2);
        Assert.assertTrue(array.isEmpty());
    }

    @Test()
    public void testIsEmptyFalse() {
        IArray<Integer> array = new Array<Integer>(2);
        array.add(5);
        Assert.assertFalse(array.isEmpty());
    }

    @Test()
    public void testFrequencyOfHaveValue() {
        IArray<Integer> array = new Array<Integer>(2);
        array.add(5);
        array.add(5);
        Assert.assertEquals(array.getFrequencyOf(5), 2);
    }

    @Test()
    public void testFrequencyOfIsZero() {
        IArray<Integer> array = new Array<Integer>(2);
        array.add(5);
        array.add(5);
        Assert.assertEquals(array.getFrequencyOf(6), 0);
    }

    @Test()
    public void testContainsTrue() {
        IArray<Integer> array = new Array<Integer>(2);
        array.add(5);
        array.add(5);
        Assert.assertTrue(array.contains(5));
    }

    @Test()
    public void testContainsFalse() {
        IArray<Integer> array = new Array<Integer>(2);
        array.add(5);
        array.add(6);
        Assert.assertFalse(array.contains(7));
    }

    @Test()
    public void testRemove() {
        IArray<Integer> array = new Array<Integer>(2);
        array.add(5);
        array.add(6);
        array.remove();
        Assert.assertEquals(array.size(), 1);
    }

    @Test()
    public void testClear() {
        IArray<Integer> array = new Array<Integer>(2);
        array.add(5);
        array.add(6);
        array.clear();
        Assert.assertEquals(array.size(), 0);
    }
}

