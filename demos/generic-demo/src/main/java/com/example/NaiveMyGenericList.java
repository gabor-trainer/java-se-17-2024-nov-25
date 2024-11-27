package com.example;

public class NaiveMyGenericList<T> implements MyGenericList<T> {
    private Object[] myArray;
    private int length;

    public NaiveMyGenericList() {
        this(10);
    }

    public NaiveMyGenericList(int initialCapacity) {
        myArray = new Object[initialCapacity];
        length = 0;
    }

    public T get(int index) {
        validateIndex(index);

        return (T) myArray[index];
    }

    public void set(int index, T value) {
        validateIndex(index);
        myArray[index] = value;
    }

    public int getLength() {
        return length;
    }

    public void insert(int index, T item) {
        validateIndex(index);
        if (length == myArray.length) {
            // TODO: Use System.arraycopy() to copy the elements from myArray to newArray
            // TODO: refactor resize logic into a separate method
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

    public void append(T item) {
        if (length == myArray.length) {
            // TODO: Use System.arraycopy() to copy the elements from myArray to newArray
            // TODO: refactor resize logic into a separate method
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
