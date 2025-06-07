package org.design_pattern.singleton_pattern;

import java.text.SimpleDateFormat;
import java.util.Date;

// =============== 3. 枚举单例（最安全） ===============
// 防止反序列化破坏单例，防止反射攻击
public enum Logger {
    INSTANCE;

    private final SimpleDateFormat dateFormat;

    Logger() {
        this.dateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
    }

    public void log(String message) {
        String timestamp = dateFormat.format(new Date());
        System.out.println("[" + timestamp + "] " + message);
    }

    public void error(String message) {
        String timestamp = dateFormat.format(new Date());
        System.err.println("[" + timestamp + "] ERROR: " + message);
    }
}
