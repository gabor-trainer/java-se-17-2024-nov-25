package com.example;

/**
 * Hello world!
 *
 */
public class App {
    public static void main(String[] args) {
        int a = 10;
        // Integer b = new Integer(20);
        Integer b = 20;

        // boxing
        b = a;

        // unboxing
        a = b;

        if (a < 0) {
            System.out.println("a is negative");
        } else if (a == 0) {
            System.out.println("a is zero");
        } else {
            System.out.println("a is positive");
        }

        int[] numbers = new int[5];
        zeroArrayWithFor(numbers);
        FillArrayWith10WithForEach(numbers);
        printArray(numbers);
    }

    public static void zeroArray(int[] numbers) {
        int i = 0;
        while (i < numbers.length) {
            numbers[i] = 0;
            i = i + 1;
        }
    }

    public static void zeroArrayWithFor(int[] numbers) {
        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = 0;
        }
    }

    // will not work
    public static void FillArrayWith10WithForEach(int[] numbers) {
        for (int number : numbers) {
            number = 10;
        }
    }

    public static void printArray(int[] numbers) {
        // foreach number in numbers
        for (int number : numbers) {
            System.out.println(number);
        }
    }
}
