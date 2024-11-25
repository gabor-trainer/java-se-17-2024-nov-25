package com.example;

// with extends we are doing two things:
// 1. we are inheriting the state variables (member variables) and methods of the Fruit class
// 2. we are defining the [is a] relationship between Apple and Fruit, 
// namely *** Apple [is a] Fruit ***
// the second is much more important than the first
public class Apple extends Fruit {

    private int size;

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }

    @Override
    public void grow() {
        System.out.println("Growing the apple...");
    }

    @Override
    public void harvest() {
        System.out.println("Harvesting the apple...");
    }
}
