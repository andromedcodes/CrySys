package com.github.andromedcodes.crysys.engine.algorithms;

/**
 * Created by mohamed on 04/09/2017.
 */

public class XOR {

    /**
     * Encrypts a given string message with XOR encryption algorithm
     *
     * @param plainMessage : original plain message
     * @return encrypted message
     */
    public String encrypt(String plainMessage) {
        return xorEncrypt(plainMessage);
    }

    /**
     * decrypts a given string message with XOR encryption algorithm
     *
     * @param encryptedMessage : encrypted message
     * @return plain original message
     */
    public String decrypt(String encryptedMessage) {
        return xorDecrypt(encryptedMessage);
    }

    private native String xorEncrypt(String message);

    private native String xorDecrypt(String message);
}
