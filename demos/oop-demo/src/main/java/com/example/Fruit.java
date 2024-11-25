package com.example;

public class Fruit {
    private String color;
    private int weight;
    private boolean isHarvested = false;

    // Accessor methods (getters and setters)
    // getter:
    public String getColor() {
        return color;
    }

    // setter:
    public void setColor(String color) {
        this.color = color;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public void grow() {
        System.out.println("Growing the fruit...");
    }

    // method (or service (on an API), or operation, or message (on and API))
    public void harvest() {
        isHarvested = true;
        System.out.println("Harvesting the fruit...");
    }

    public void eat() {
        if (!isHarvested) {
            harvest();
        }
        System.out.println("Eating the fruit...");

    }
}
