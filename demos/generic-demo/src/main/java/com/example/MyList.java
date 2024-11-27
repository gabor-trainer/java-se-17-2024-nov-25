package com.example;

public interface MyList {
    // var x = myArray[i] -> var = myList.getItem(i);
    public Object get(int index);

    // myArray[i] = x -> myList.setItem(i, x);
    public void set(int index, Object value);

    public int getLength();

    public void insert(int index, Object item);

    public void append(Object item);

    public void remove(int index);

}
