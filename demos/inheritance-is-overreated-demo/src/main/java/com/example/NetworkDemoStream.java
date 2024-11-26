package com.example;

public class NetworkDemoStream extends DemoStream {

    @Override
    public void open(String uri) {
        // Imagine here: OS network API calls
        System.out.println("Opening network stream...");
    }

    @Override
    public void close() {
        // Imagine here: OS network API calls
        System.out.println("Closing network stream...");
    }

    @Override
    public void write(byte[] data) {
        // Imagine here: OS network API calls
        System.out.println("Writing data to network...");
    }

    @Override
    public byte[] read() {
        // Imagine here: OS network API calls
        System.out.println("Reading data from network...");
        return new byte[0];
    }

}
