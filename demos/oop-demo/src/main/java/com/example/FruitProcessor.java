package com.example;

// 100 000 lines client code, which uses the Fruit 
// with other words, dependent on Fruit
// and this was written 10 years ago
public class FruitProcessor {
    public void process(Fruit fruit) {
        fruit.grow();
        fruit.harvest();
        fruit.eat();
    }
}

// grow and harvest
// F:
// A: |||||
// P:

// in eat which harvest will be executed:
// F: ||
// A: ||||
// P:
