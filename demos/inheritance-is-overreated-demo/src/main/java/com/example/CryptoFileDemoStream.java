package com.example;

// CryptoFileDemoStream is in [is a] relationship with FileDemoStream and in turn with DemoStream
// because the is a relationship is transitive 
// a < b and b < c implies a < c
// a [is a] b and b [is a] c implies a [is a] c           
public class CryptoFileDemoStream extends FileDemoStream {

    // DRY: Don't Repeat Yourself
    // violation of DRY: the same code is repeated with copy and paste
    // in CryptoNetworkDemoStream and CryptoMemoryDemoStream and
    // CryptoFileDemoStream

    private CryptoService cryptoService;

    public CryptoFileDemoStream(CryptoService cryptoService) {
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
