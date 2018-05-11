package com.wl.structure.adapter;

import com.wl.structure.adapter.adapter.EncryptAdapter;
import com.wl.structure.adapter.framework.Target;

public class Main {
    public static void main(String [] args) {
        Target target = new EncryptAdapter();
        System.out.println("base64 加密：" + target.base64("123456"));
        System.out.println("md5 加密：" + target.md5hex("123456"));
    }
}
