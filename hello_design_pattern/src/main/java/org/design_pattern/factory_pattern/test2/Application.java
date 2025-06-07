package org.design_pattern.factory_pattern.test2;

import org.design_pattern.factory_pattern.test2.factory.DatabaseType;
import org.design_pattern.factory_pattern.test2.client.DatabaseService;

public class Application {
    public static void main(String[] args) {
        DatabaseService service = new DatabaseService();

        // 使用枚举，类型安全
        service.initializeDatabase(DatabaseType.MYSQL);
        service.executeQuery("SELECT * FROM users");
        service.shutdown();

        // 切换数据库
        service.initializeDatabase(DatabaseType.POSTGRESQL);
        service.executeQuery("SELECT * FROM products");
        service.shutdown();
    }
}
