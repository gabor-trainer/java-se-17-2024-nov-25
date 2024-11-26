package com.example;

// Decorator design pattern
public class CryptoDemoStream implements DemoStream {

    private final DemoStream stream;
    private final CryptoService cryptoService;

    public CryptoDemoStream(DemoStream stream, CryptoService cryptoService) {
        this.stream = stream;
        this.cryptoService = cryptoService;
    }

    @Override
    public void open(String uri) {
        // delegate to the contained object
        stream.open(uri);
    }

    @Override
    public void close() {
        // delegate to the contained object
        stream.close();
    }

    @Override
    public byte[] read() {
        byte[] result = stream.read();
        result = cryptoService.decrypt(result);
        return result;
    }

    @Override
    public void write(byte[] data) {
        data = cryptoService.encrypt(data);
        stream.write(data);
    }
}
