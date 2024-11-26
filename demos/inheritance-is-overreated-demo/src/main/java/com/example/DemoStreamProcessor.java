package com.example;

// represents 100 000 lines of client code
public class DemoStreamProcessor {
    public void process(DemoStream stream, String uri) {
        stream.open(uri);
        stream.write(new byte[0]);
        stream.read();
        stream.close();
    }
}

// // bad
// public class DemoStreamProcessor {
// public void process(DemoStream stream, String uri, boolean isEncrypted) {
// var CryptoService = new CryptoService();
// stream.open(uri);
// var data = new byte[0];
// data = CryptoService.encrypt(data);
// stream.write(data);
// var result = stream.read();
// result = CryptoService.decrypt(result);
// // do something with result...
// stream.close();
// }
// }
