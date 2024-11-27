package com.example;

import java.util.ArrayList;

/**
 * Hello world!
 *
 */
public class App {
    public static void main(String[] args) {

        var myList = new NaiveMyList();
        myList.append("Hello");
        myList.append("World");
        // Box! Box!
        myList.append(1);
        System.out.println(myList.get(0));
        System.out.println(myList.get(1));
        System.out.println(myList.get(2).getClass().getName());

        int x = (int) myList.get(2);

        var myGenericList = new NaiveMyGenericList<String>();
        myGenericList.append("Hello");

    }
}
