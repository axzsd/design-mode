package com.wl.structure.bridge.creational.datasource;

import com.wl.structure.bridge.framework.DataSource;

public class MysqlDataSource extends DataSource {
    @Override
    public String queryData() {
        return converter.convert("mysql 查询出来的数据");
    }
}
