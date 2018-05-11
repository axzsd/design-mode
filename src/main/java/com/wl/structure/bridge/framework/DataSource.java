package com.wl.structure.bridge.framework;

/**
 * 说明：模拟数据库抽象
 * */
public abstract class DataSource {
    protected Converter converter;

    public void setConverter(Converter converter) {
        this.converter = converter;
    }

    public abstract String queryData();
}
