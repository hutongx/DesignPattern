package org.design_pattern.singleton_pattern;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

// =============== 2. 懒汉式 - 双重检查锁（高并发场景） ===============
// 延迟创建，线程安全，性能好
public class CacheManager {
    private static volatile CacheManager instance;
    private Map<String, Object> cache;

    private CacheManager() {
        this.cache = new ConcurrentHashMap<>();
    }

    public static CacheManager getInstance() {
        if (instance == null) {
            synchronized (CacheManager.class) {
                if (instance == null) {
                    instance = new CacheManager();
                }
            }
        }
        return instance;
    }

    public void put(String key, Object value) {
        cache.put(key, value);
    }

    public Object get(String key) {
        return cache.get(key);
    }
}
