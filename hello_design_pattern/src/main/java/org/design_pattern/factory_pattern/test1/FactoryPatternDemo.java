package org.design_pattern.factory_pattern.test1;

import org.design_pattern.factory_pattern.test1.factory.DatabaseConnectionFactory;
import org.design_pattern.factory_pattern.test1.interface_.DatabaseConnection;

// 使用示例
public class FactoryPatternDemo {
    public static void main(String[] args) {
        // 客户端代码不需要知道具体创建哪种数据库连接
        DatabaseConnection connection = DatabaseConnectionFactory.createConnection("mysql");

        connection.connect();
        connection.executeQuery("SELECT * FROM users");
        connection.close();

        // 轻松切换到其他数据库
        DatabaseConnection pgConnection = DatabaseConnectionFactory.createConnection("postgresql");
        pgConnection.connect();
        pgConnection.executeQuery("SELECT * FROM products");
        pgConnection.close();
    }
}
