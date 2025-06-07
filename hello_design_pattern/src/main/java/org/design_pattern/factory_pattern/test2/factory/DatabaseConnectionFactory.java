package org.design_pattern.factory_pattern.test2.factory;

import org.design_pattern.factory_pattern.test2.product.DatabaseConnection;
import org.design_pattern.factory_pattern.test2.product.impl.MySQLConnection;
import org.design_pattern.factory_pattern.test2.product.impl.OracleConnection;
import org.design_pattern.factory_pattern.test2.product.impl.PostgreSQLConnection;

public class DatabaseConnectionFactory {

    public static DatabaseConnection createConnection(DatabaseType type) {
        switch (type) {
            case MYSQL:
                return new MySQLConnection();
            case POSTGRESQL:
                return new PostgreSQLConnection();
            case ORACLE:
                return new OracleConnection();
            default:
                throw new IllegalArgumentException("Unsupported database type: " + type);
        }
    }

    // 配置文件版本（可选）
    public static DatabaseConnection createConnection(String configKey) {
        // 从配置文件读取数据库类型
        String dbType = System.getProperty(configKey, "MYSQL");
        return createConnection(DatabaseType.valueOf(dbType.toUpperCase()));
    }
}
