package org.design_pattern.factory_pattern.test2.product.impl;

import org.design_pattern.factory_pattern.test2.product.DatabaseConnection;

public class OracleConnection implements DatabaseConnection {
    @Override
    public void connect() {
        System.out.println("Connected to Oracle");
    }

    @Override
    public void executeQuery(String sql) {
        System.out.println("Oracle executing: " + sql);
    }

    @Override
    public void close() {
        System.out.println("Oracle connection closed");
    }
}
