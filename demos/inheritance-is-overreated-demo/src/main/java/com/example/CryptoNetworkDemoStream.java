package com.example;

public class CryptoNetworkDemoStream extends NetworkDemoStream {

    private CryptoService cryptoService;

    // DRY: Don't Repeat Yourself
    // violation of DRY: the same code is repeated with copy and paste
    // in CryptoNetworkDemoStream and CryptoMemoryDemoStream and
    // CryptoFileDemoStream

    public CryptoNetworkDemoStream(CryptoService cryptoService) {
        this.cryptoService = cryptoService;
    }

    @Override
    public byte[] read() {
        byte[] data = super.read();
        System.out.println("Decrypting data...");
        return cryptoService.decrypt(data);
    }

    @Override
    public void write(byte[] data) {
        System.out.println("Encrypting data...");
        super.write(cryptoService.encrypt(data));
    }

}
