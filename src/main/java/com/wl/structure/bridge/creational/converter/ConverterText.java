package com.wl.structure.bridge.creational.converter;

import com.wl.structure.bridge.framework.Converter;

/**
 * 说明：转换成文本
 * */
public class ConverterText implements Converter {
    @Override
    public String convert(String str) {
        return str + " convert txt";
    }
}
