package com.wl.structure.flyweight.framework.concrete;

import com.wl.structure.flyweight.framework.DataAbstract;
import com.wl.structure.flyweight.framework.TextExternal;

import java.util.HashMap;
import java.util.Map;

public class Text implements DataAbstract {
    private String md5Coding;

    public Text(String md5Coding) {
        this.md5Coding = md5Coding;
    }

    @Override
    public void show(TextExternal textExternal) {
        System.out.println("文本 " + md5Coding + " 显示在 " + textExternal.toString());
    }
}
