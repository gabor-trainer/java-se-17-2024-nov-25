package com.example;

public class AesCryptoService implements CryptoService {

    @Override
    public byte[] encrypt(byte[] data) {
        // Imagine here: crypto API calls
        System.out.println("Encrypting data using AES...");
        return data;
    }

    @Override
    public byte[] decrypt(byte[] data) {
        // Imagine here: crypto API calls
        System.out.println("Decrypting data using AES...");
        return data;
    }

}
