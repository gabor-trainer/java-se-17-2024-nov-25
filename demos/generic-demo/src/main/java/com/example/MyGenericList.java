package com.example;

public interface MyGenericList<T> {
    // var x = myArray[i] -> var = myList.getItem(i);
    public T get(int index);

    // myArray[i] = x -> myList.setItem(i, x);
    public void set(int index, T value);

    public int getLength();

    public void insert(int index, T item);

    public void append(T item);

    public void remove(int index);

}
