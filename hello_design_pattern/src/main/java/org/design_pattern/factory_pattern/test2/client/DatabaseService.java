package org.design_pattern.factory_pattern.test2.client;

import org.design_pattern.factory_pattern.test2.factory.DatabaseConnectionFactory;
import org.design_pattern.factory_pattern.test2.factory.DatabaseType;
import org.design_pattern.factory_pattern.test2.product.DatabaseConnection;

public class DatabaseService {
    private DatabaseConnection connection;

    public void initializeDatabase(DatabaseType dbType) {
        this.connection = DatabaseConnectionFactory.createConnection(dbType);
        connection.connect();
    }

    public void executeQuery(String sql) {
        if (connection != null) {
            connection.executeQuery(sql);
        }
    }

    public void shutdown() {
        if (connection != null) {
            connection.close();
        }
    }
}

