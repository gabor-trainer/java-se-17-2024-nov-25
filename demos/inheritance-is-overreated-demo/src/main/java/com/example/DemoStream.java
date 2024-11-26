package com.example;

// DemoStream is the superclass, and NetworkDemoStream and FileDemoStream are subclasses
public class DemoStream {
    // uri is a Uniform Resource Identifier
    // for example, it could be a file path or TCP socket address
    // for file: file:// /path/to/file
    // for TCP: tcp://localhost:5432
    public void open(String uri) {
        System.out.println("Opening stream...");
    }

    public void close() {
        System.out.println("Closing stream...");
    }

    public void write(byte[] data) {
        System.out.println("Writing data...");
    }

    public byte[] read() {
        System.out.println("Reading data...");
        return new byte[0];
    }

}
