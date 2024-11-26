package com.example;

public class App {
    public static void main(String[] args) {
        var processor = new DemoStreamProcessor();
        var fileStream = new FileDemoStream();
        var cryptoService = new AesCryptoService();
        var cryptoStream = new CryptoDemoStream(fileStream, cryptoService);

        processor.process(cryptoStream, "file:///example.txt");
    }
}
