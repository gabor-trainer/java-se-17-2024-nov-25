package com.example;

import java.io.Serializable;

public class House implements Cloneable, Serializable {
    private String address;
    private int yearBuilt;
    private double price;

    public House(String address, int yearBuilt, double price) {
        this.address = address;
        this.yearBuilt = yearBuilt;
        this.price = price;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public int getYearBuilt() {
        return yearBuilt;
    }

    public void setYearBuilt(int yearBuilt) {
        this.yearBuilt = yearBuilt;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    @Override
    public House clone() {
        try {
            return (House) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new AssertionError(); // Can't happen
        }
    }

}
