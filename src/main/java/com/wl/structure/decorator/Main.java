package com.wl.structure.decorator;

import com.wl.structure.decorator.framework.Encryption;
import com.wl.structure.decorator.framework.concrete.BasicEncrypt;
import com.wl.structure.decorator.framework.concrete.ReverseEncrypt;

public class Main {
    public static void main(String [] args) {
        BasicEncrypt basicEncrypt = new BasicEncrypt();
        Encryption reverseEncrypt = new ReverseEncrypt(basicEncrypt);

        String temp = reverseEncrypt.encrypt("abcd");
        System.out.println(temp);
        System.out.println(basicEncrypt.decode(temp));
        System.out.println(reverseEncrypt.decode(temp));
    }
}
