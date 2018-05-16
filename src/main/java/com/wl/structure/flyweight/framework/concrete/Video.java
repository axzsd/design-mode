package com.wl.structure.flyweight.framework.concrete;

import com.wl.structure.flyweight.framework.DataAbstract;
import com.wl.structure.flyweight.framework.TextExternal;

public class Video implements DataAbstract {

    private String md5Coding;

    public Video(String md5Coding) {
        this.md5Coding = md5Coding;
    }

    @Override
    public void show(TextExternal textExternal) {
        System.out.println("视频 " + md5Coding + " 显示在 " + textExternal.toString());
    }
}
