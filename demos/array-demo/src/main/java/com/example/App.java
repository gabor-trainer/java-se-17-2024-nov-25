package com.example;

import java.util.Arrays;

public class App {
    public static void main(String[] args) {

        var numbers = new int[] { 1, 2, 3, 4, 5 };

        var persons = new Person[] {
                new Person("Alice", 25),
                new Person("Bob", 30),
                new Person("Charlie", 35)
        };

        // var persons2 = persons;
        // Shallow copy, not deep copy
        // var personsCopy = Arrays.copyOf(persons, persons.length + 1);
        // personsCopy[3] = new Person("David", 40);
        // personsCopy[0].setName("Alice (in Wonderland)");
        // System.out.println(persons[0].getName());

        // clone method is a *** shallow *** copy
        // var personsClone = persons.clone();
        // personsClone[0].setName("Alice (in Wonderland)");
        // System.out.println(persons[0].getName());

        var p1 = new Person("Alice", 25);
        // reference copy
        // var p2 = p1;
        // deep copy
        var p2 = p1.clone();
        p2.setName("Alice (in Wonderland)");
        p2.getHouse().setAddress("changed");
        System.out.println(p1.getHouse().getAddress());

        // Alice (in Wonderland) |
        // Alice ||||

    }
}
