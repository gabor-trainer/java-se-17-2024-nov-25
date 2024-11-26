package com.example;

public class App {
    public static void main(String[] args) {
        var processor = new DemoStreamProcessor();
        var fileStream = new FileDemoStream();

        processor.process(fileStream, "file:///example.txt");
    }
}
