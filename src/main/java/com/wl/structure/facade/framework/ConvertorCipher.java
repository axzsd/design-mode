package com.wl.structure.facade.framework;

public class ConvertorCipher {

    public byte[] convertor(byte [] bytes) {
        if (bytes == null)
            return null;
        for (int i = 0; i < bytes.length; i ++) {
            bytes[i] = (byte)(bytes[i] >> i);
        }
        return bytes;
    }

    public byte[] reverseConvertor(byte [] bytes) {
        if (bytes == null)
            return null;
        for (int i = 0; i < bytes.length; i ++) {
            bytes[i] = (byte)(bytes[i] << i);
        }
        return bytes;
    }
}
