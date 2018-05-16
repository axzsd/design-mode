package com.wl.structure.flyweight.framework.concrete;

import com.wl.structure.flyweight.framework.DataAbstract;
import com.wl.structure.flyweight.framework.TextExternal;

public class Image implements DataAbstract {

    private String md5Coding;

    public Image(String md5Coding) {
        this.md5Coding = md5Coding;
    }

    @Override
    public void show(TextExternal textExternal) {
        System.out.println("图片 " + md5Coding + " 显示在 " + textExternal.toString());
    }
}
