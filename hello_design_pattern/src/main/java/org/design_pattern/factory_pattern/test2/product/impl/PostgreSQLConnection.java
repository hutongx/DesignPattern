package org.design_pattern.factory_pattern.test2.product.impl;

import org.design_pattern.factory_pattern.test2.product.DatabaseConnection;

public class PostgreSQLConnection implements DatabaseConnection {
    @Override
    public void connect() {
        System.out.println("Connected to PostgreSQL");
    }

    @Override
    public void executeQuery(String sql) {
        System.out.println("PostgreSQL executing: " + sql);
    }

    @Override
    public void close() {
        System.out.println("PostgreSQL connection closed");
    }
}
