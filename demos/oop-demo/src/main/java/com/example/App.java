package com.example;

/**
 * Hello world!
 *
 */
public class App {
    public static void main(String[] args) {

        // "new" allocates memory for instances on the heap
        // local variables are stored on the stack (myFruit1, myFruit2)
        Fruit myFruit1 = new Fruit();
        myFruit1.setColor("Red");
        myFruit1.setWeight(100);

        // var is not a jolly joker, it's a type inference
        Fruit myFruit2 = new Fruit();
        myFruit2.setColor("Green");
        myFruit2.setWeight(200);

        // reference assignment:
        myFruit2 = myFruit1;
        myFruit1.setColor("Yellow");
        myFruit1.setWeight(300);

        System.out.println("My fruit 1 is " + myFruit1.getColor() + " and weighs " + myFruit1.getWeight() + " grams.");
        System.out.println("My fruit 2 is " + myFruit2.getColor() + " and weighs " + myFruit2.getWeight() + " grams.");

        Fruit f = new Fruit();
        Apple a = new Apple();
        Peach p = new Peach();

        a.setSize(10);
        System.err.println(a.getSize());

        f = a;
        a = (Apple) f;

        // never becaue a is an Apple and p is a Peach and Peach is not an Apple
        // a = p;

        FruitProcessor fp = new FruitProcessor();
        fp.process(a);
    }
}
