package com.wl.structure.decorator.framework.concrete;

import com.wl.structure.decorator.framework.Decorator;
import com.wl.structure.decorator.framework.Encryption;

/**
 * 说明：具体的装饰器，将密码进行反序排列
 * */
public class ReverseEncrypt extends Decorator {

    private Encryption encryption;

    public ReverseEncrypt(Encryption encryption) {
        this.encryption = encryption;
    }

    @Override
    public String encrypt(String str) {
        StringBuilder stringBuilder = new StringBuilder(str);
        return encryption.encrypt(stringBuilder.reverse().toString());
    }

    @Override
    public String decode(String str) {
        return new StringBuilder(encryption.decode(str)).reverse().toString();
    }
}
