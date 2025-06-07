package org.design_pattern.factory_pattern.test1.factory;

import org.design_pattern.factory_pattern.test1.impl.MySQLConnection;
import org.design_pattern.factory_pattern.test1.impl.OracleConnection;
import org.design_pattern.factory_pattern.test1.impl.PostgreSQLConnection;
import org.design_pattern.factory_pattern.test1.interface_.DatabaseConnection;

// 工厂类
public class DatabaseConnectionFactory {
    public static DatabaseConnection createConnection(String dbType) {
        switch (dbType.toLowerCase()) {
            case "mysql":
                return new MySQLConnection();
            case "postgresql":
                return new PostgreSQLConnection();
            case "oracle":
                return new OracleConnection();
            default:
                throw new IllegalArgumentException("不支持的数据库类型: " + dbType);
        }
    }
}
