package com.example;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

// POJO: Plain Old Java Object
public class Person implements Cloneable, Serializable {
    private String name;
    private int age;
    private House house;

    // public Person() {
    // this("John Doe", 30);
    // }

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
        this.house = new House("123 Main St", 2000, 1000000);
    }

    public House getHouse() {
        return house;
    }

    public void setHouse(House house) {
        this.house = house;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void sayHello() {
        System.out.println("Hello, my name is " + name + " and I am " + age + " years old.");
    }

    public void sayHello(String message) {
        System.out.println(message + " " + name + "!");
    }

    // @Override
    // public Person clone() {
    // try {
    // return (Person) super.clone();
    // } catch (CloneNotSupportedException e) {
    // throw new AssertionError(); // Can't happen
    // }
    // }

    @Override
    public Person clone() {
        return deepCopy(this);
    }

    public static Person deepCopy(Person object) {
        try {
            ByteArrayOutputStream byteOut = new ByteArrayOutputStream();
            ObjectOutputStream out = new ObjectOutputStream(byteOut);
            out.writeObject(object);
            out.flush();
            ByteArrayInputStream byteIn = new ByteArrayInputStream(byteOut.toByteArray());
            ObjectInputStream in = new ObjectInputStream(byteIn);
            return (Person) in.readObject();
        } catch (IOException | ClassNotFoundException e) {
            throw new RuntimeException("Deep copy failed", e);
        }
    }

}
