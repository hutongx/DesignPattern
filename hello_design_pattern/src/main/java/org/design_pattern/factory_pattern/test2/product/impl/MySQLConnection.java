package org.design_pattern.factory_pattern.test2.product.impl;

import org.design_pattern.factory_pattern.test2.product.DatabaseConnection;

public class MySQLConnection implements DatabaseConnection {
    @Override
    public void connect() {
        System.out.println("Connected to MySQL");
    }

    @Override
    public void executeQuery(String sql) {
        System.out.println("MySQL executing: " + sql);
    }

    @Override
    public void close() {
        System.out.println("MySQL connection closed");
    }
}
