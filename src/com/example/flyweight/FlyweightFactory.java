package com.example.flyweight;

import java.util.HashMap;

/**
 * @author Akmzing
 * 亨元工厂
 */
public class FlyweightFactory {
    private static HashMap<String, Flyweight> pool = new HashMap<>();

    public static Flyweight getFlyweight(String condition) {
        Flyweight flyweight = null;
        if (pool.containsKey(condition)) {
            flyweight = pool.get(condition);
        } else {
            flyweight = new FlyweightImpl(condition);
            pool.put(condition, flyweight);
        }
        return flyweight;
    }
}
