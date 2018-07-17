package com.example.flyweight;

/**
 * @author Akmzing
 * 抽象亨元角色
 */
public abstract class Flyweight {

    protected final String sharedCondition;

    public Flyweight(String sharedCondition) {
        this.sharedCondition = sharedCondition;
    }

    public void operate() {

    }

}
