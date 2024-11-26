package com.example;

// DemoStream is the superclass, and NetworkDemoStream and FileDemoStream are subclasses
public interface DemoStream {

    // uri is a Uniform Resource Identifier
    // for example, it could be a file path or TCP socket address
    // for file: file:// /path/to/file
    // for TCP: tcp://localhost:5432
    public void open(String uri);

    public void close();

    public void write(byte[] data);

    public byte[] read();
}

// public abstract class DemoStream {
// // uri is a Uniform Resource Identifier
// // for example, it could be a file path or TCP socket address
// // for file: file:// /path/to/file
// // for TCP: tcp://localhost:5432
// public abstract void open(String uri);

// public abstract void close();

// public abstract void write(byte[] data);

// public abstract byte[] read();
// }
