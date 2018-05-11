package com.wl.structure.adapter.framework;

/**
 * 说明：系统需要的加密方法接口
 * */
public interface Target {
    public String md5hex(String str);
    public String base64(String str);
}
