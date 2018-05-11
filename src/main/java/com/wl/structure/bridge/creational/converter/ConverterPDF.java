package com.wl.structure.bridge.creational.converter;

import com.wl.structure.bridge.framework.Converter;

/**
 * 说明：转换为PDF
 * */
public class ConverterPDF implements Converter {
    @Override
    public String convert(String str) {
        return str + " convert PDF";
    }
}
