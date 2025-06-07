package org.design_pattern.factory_pattern.test1.impl;

import org.design_pattern.factory_pattern.test1.interface_.DatabaseConnection;

// 具体产品实现
public class MySQLConnection implements DatabaseConnection {

    @Override
    public void connect() {
        System.out.println("连接到MySQL数据库");
    }

    @Override
    public void executeQuery(String sql) {
        System.out.println("在MySQL中执行查询: " + sql);
    }

    @Override
    public void close() {
        System.out.println("关闭MySQL连接");
    }
}
