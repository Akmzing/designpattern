package com.example.strategy;

/**
 * @author Akmzing
 * 策略控制台
 */
public class Context {
    private IStrategy strategy;
    public Context(IStrategy strategy){
        this.strategy = strategy;
    }
    public void operate(){
        this.strategy.operate();
    }
}
