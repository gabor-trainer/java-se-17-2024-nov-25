package com.example;

public class FileDemoStream extends DemoStream {

    @Override
    public void open(String uri) {
        // Imagine here: OS file system API calls
        System.out.println("Opening file stream...");
    }

    @Override
    public void close() {
        // Imagine here: OS file system API calls
        System.out.println("Closing file stream...");
    }

    @Override
    public void write(byte[] data) {
        // Imagine here: OS file system API calls
        System.out.println("Writing data to file...");
    }

    @Override
    public byte[] read() {
        // Imagine here: OS file system API calls
        System.out.println("Reading data from file...");
        return new byte[0];
    }

}
