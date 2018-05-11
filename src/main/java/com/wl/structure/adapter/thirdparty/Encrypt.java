package com.wl.structure.adapter.thirdparty;

import sun.misc.BASE64Encoder;

import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

/**
 * 说明：假设这个是第三方的加密包，没有源码等
 * */
public class Encrypt {
    /**
     * 说明：md5 加密
     * */
    public static String md5Encrypt(String str) throws NoSuchAlgorithmException, UnsupportedEncodingException {
        //确定计算方法
        MessageDigest md5 = MessageDigest.getInstance("MD5");
        BASE64Encoder base64en = new BASE64Encoder();
        //加密后的字符串
        String newstr = base64en.encode(md5.digest(str.getBytes("utf-8")));
        return newstr;
    }

    public static String base64Encrypt(String str) throws IOException {
        BASE64Encoder encoder = new BASE64Encoder();
        String encode = encoder.encode(str.getBytes("utf-8"));//编码
        return encode;
    }
}
