package com.example;

// represents 100 000 lines of client code
public class DemoStreamProcessor {
    public void process(DemoStream stream, String uri) {
        stream.open(uri);
        stream.write(new byte[0]);
        var result = stream.read();
        // do something with result...
        stream.close();
    }
}
