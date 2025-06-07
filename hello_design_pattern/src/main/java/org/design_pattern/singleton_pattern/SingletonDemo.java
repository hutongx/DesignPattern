package org.design_pattern.singleton_pattern;

// =============== 使用示例 ===============
public class SingletonDemo {
    public static void main(String[] args) {
        // 1. 饿汉式使用
        DatabaseConfig config = DatabaseConfig.getInstance();
        System.out.println("DB URL: " + config.getUrl());

        // 2. 懒汉式使用
        CacheManager cache = CacheManager.getInstance();
        cache.put("user:123", "John Doe");
        System.out.println("User: " + cache.get("user:123"));

        // 3. 枚举单例使用
        Logger.INSTANCE.log("Application started");
        Logger.INSTANCE.error("Something went wrong");

        // 4. 静态内部类使用
        ConnectionPool pool = ConnectionPool.getInstance();
        Connection conn = pool.getConnection();
        System.out.println("Got connection: " + conn);
        pool.returnConnection(conn);

        // 验证单例性质
        System.out.println("Same instance: " +
                (DatabaseConfig.getInstance() == DatabaseConfig.getInstance()));
    }
}
