package com.wl.structure.decorator.framework.concrete;

import com.wl.structure.decorator.framework.Encryption;

public class BasicEncrypt implements Encryption {
    @Override
    public String encrypt(String str) {
        if (str == null || str.length() == 0)
            return str;
        char charAt = 0;
        StringBuilder stringBuilder = new StringBuilder();
        for (int i = 0; i < str.length(); i++) {
            charAt = str.charAt(i);
            charAt = (char) (charAt << i);
            stringBuilder.append(charAt);
        }
        return stringBuilder.toString();
    }

    @Override
    public String decode(String str) {
        if (str == null || str.length() == 0)
            return str;
        char charAt = 0;
        StringBuilder stringBuilder = new StringBuilder();
        for (int i = 0; i < str.length(); i++) {
            charAt = str.charAt(i);
            charAt = (char) (charAt >> i);
            stringBuilder.append(charAt);
        }
        return stringBuilder.toString();
    }
}
