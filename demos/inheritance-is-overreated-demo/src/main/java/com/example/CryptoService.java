package com.example;

public interface CryptoService {

    public byte[] encrypt(byte[] data);

    public byte[] decrypt(byte[] data);
}