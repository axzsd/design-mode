package com.wl.structure.adapter.adapter;

import com.wl.structure.adapter.framework.Target;
import com.wl.structure.adapter.thirdparty.Encrypt;

import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.security.NoSuchAlgorithmException;

public class EncryptAdapter implements Target {
    @Override
    public String md5hex(String str) {
        try {
            return Encrypt.md5Encrypt(str);
        } catch (NoSuchAlgorithmException e) {
            e.printStackTrace();
        } catch (UnsupportedEncodingException e) {
            e.printStackTrace();
        }
        return null;
    }

    @Override
    public String base64(String str) {
        try {
            return Encrypt.base64Encrypt(str);
        } catch (IOException e) {
            e.printStackTrace();
        }
        return null;
    }
}
