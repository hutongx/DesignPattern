package org.design_pattern.singleton_pattern;

// =============== 1. 饿汉式（推荐） ===============
// 类加载时就创建实例，线程安全，简单可靠
public class DatabaseConfig {
    private static final DatabaseConfig INSTANCE = new DatabaseConfig();

    private String url;
    private String username;
    private String password;

    private DatabaseConfig() {
        // 初始化配置
        this.url = "jdbc:mysql://localhost:3306/mydb";
        this.username = "root";
        this.password = "password";
    }

    public static DatabaseConfig getInstance() {
        return INSTANCE;
    }

    public String getUrl() { return url; }
    public String getUsername() { return username; }
    public String getPassword() { return password; }
}
