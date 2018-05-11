package com.wl.structure.bridge.creational.datasource;

import com.wl.structure.bridge.framework.DataSource;

public class OracleDataSource extends DataSource {
    @Override
    public String queryData() {
        return converter.convert("Oracle 查询的数据");
    }
}
