package org.design_pattern.factory_pattern.test1.impl;

import org.design_pattern.factory_pattern.test1.interface_.DatabaseConnection;

public class PostgreSQLConnection implements DatabaseConnection {

    @Override
    public void connect() {
        System.out.println("连接到PostgreSQL数据库");
    }

    @Override
    public void executeQuery(String sql) {
        System.out.println("在PostgreSQL中执行查询: " + sql);
    }

    @Override
    public void close() {
        System.out.println("关闭PostgreSQL连接");
    }
}
