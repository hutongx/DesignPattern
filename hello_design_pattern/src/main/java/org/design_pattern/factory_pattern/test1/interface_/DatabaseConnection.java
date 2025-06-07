package org.design_pattern.factory_pattern.test1.interface_;

// 抽象产品接口
public interface DatabaseConnection {
    void connect();

    void executeQuery(String sql);

    void close();
}
