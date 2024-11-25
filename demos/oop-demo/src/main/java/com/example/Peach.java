package com.example;

public class Peach extends Fruit {

    private int price;

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    @Override
    public void grow() {
        System.out.println("Growing the peach...");
    }

    @Override
    public void harvest() {
        System.out.println("Harvesting the peach...");
    }
}
