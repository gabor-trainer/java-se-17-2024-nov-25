package com.example;

public class MemoryDemoStream extends DemoStream {

    @Override
    public void open(String uri) {
        // Imagine here: OS memory API calls
        System.out.println("Opening memory stream...");
    }

    @Override
    public void close() {
        // Imagine here: OS memory API calls
        System.out.println("Closing memory stream...");
    }

    @Override
    public void write(byte[] data) {
        // Imagine here: OS memory API calls
        System.out.println("Writing data to memory...");
    }

    @Override
    public byte[] read() {
        // Imagine here: OS memory API calls
        System.out.println("Reading data from memory...");
        return new byte[0];
    }

}
