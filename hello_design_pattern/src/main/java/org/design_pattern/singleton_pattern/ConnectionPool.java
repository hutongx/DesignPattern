package org.design_pattern.singleton_pattern;

import java.util.ArrayList;
import java.util.List;

// =============== 4. 静态内部类（推荐） ===============
// 延迟加载，线程安全，无性能损耗
public class ConnectionPool {
    private final List<Connection> connections;
    private final int maxSize = 10;

    private ConnectionPool() {
        connections = new ArrayList<>();
        initializeConnections();
    }

    private static class Holder {
        private static final ConnectionPool INSTANCE = new ConnectionPool();
    }

    public static ConnectionPool getInstance() {
        return Holder.INSTANCE;
    }

    private void initializeConnections() {
        for (int i = 0; i < maxSize; i++) {
            // 创建数据库连接（伪代码）
            connections.add(createConnection());
        }
    }

    public Connection getConnection() {
        // 获取连接逻辑
        return connections.isEmpty() ? null : connections.remove(0);
    }

    public void returnConnection(Connection conn) {
        if (connections.size() < maxSize) {
            connections.add(conn);
        }
    }

    private Connection createConnection() {
        // 模拟创建连接
        return new Connection() {
            @Override
            public String toString() { return "DB Connection"; }
        };
    }
}
