package com.example;

public class NaiveMyList implements MyList {
    private Object[] myArray;
    private int length;

    public NaiveMyList() {
        this(10);
    }

    public NaiveMyList(int initialCapacity) {
        myArray = new Object[initialCapacity];
        length = 0;
    }

    public Object get(int index) {
        validateIndex(index);
        return myArray[index];
    }

    public void set(int index, Object value) {
        validateIndex(index);
        myArray[index] = value;
    }

    public int getLength() {
        return length;
    }

    public void insert(int index, Object item) {
        validateIndex(index);
        if (length == myArray.length) {
            Object[] newArray = new Object[myArray.length * 2];
            for (int i = 0; i < index; i++) {
                newArray[i] = myArray[i];
            }
            newArray[index] = item;
            for (int i = index; i < length; i++) {
                newArray[i + 1] = myArray[i];
            }
            myArray = newArray;
        } else {
            for (int i = length; i > index; i--) {
                myArray[i] = myArray[i - 1];
            }
            myArray[index] = item;
        }
        length++;
    }

    public void append(Object item) {
        if (length == myArray.length) {
            // TODO: Use System.arraycopy() to copy the elements from myArray to newArray
            Object[] newArray = new Object[(int) Math.ceil(myArray.length * 1.1)];
            for (int i = 0; i < length; i++) {
                newArray[i] = myArray[i];
            }
            newArray[length] = item;
            myArray = newArray;
        } else {
            myArray[length] = item;
        }
        length++;
    }

    public void remove(int index) {
        for (int i = index; i < length - 1; i++) {
            myArray[i] = myArray[i + 1];
        }
        length--;
    }

    private void validateIndex(int index) {
        if (index < 0 || index >= length) {
            throw new IndexOutOfBoundsException();
        }
    }

}
