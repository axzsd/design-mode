package com.wl.structure.bridge.creational.converter;

import com.wl.structure.bridge.framework.Converter;

/**
 * 说明：转换为xml
 * */
public class ConverterXml implements Converter {
    @Override
    public String convert(String str) {
        return str + " convert xml";
    }
}
