package com.wl.structure.bridge;

import com.wl.structure.bridge.creational.converter.ConverterXml;
import com.wl.structure.bridge.creational.datasource.MysqlDataSource;
import com.wl.structure.bridge.framework.DataSource;

public class Main {
    public static void main(String [] args) {
        DataSource dataSource = new MysqlDataSource();
        dataSource.setConverter(new ConverterXml());
        System.out.println(dataSource.queryData());
    }
}
