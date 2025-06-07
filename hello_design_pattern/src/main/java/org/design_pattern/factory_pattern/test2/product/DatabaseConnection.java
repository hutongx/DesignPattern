package org.design_pattern.factory_pattern.test2.product;

public interface DatabaseConnection {
    void connect();
    void executeQuery(String sql);
    void close();
}
