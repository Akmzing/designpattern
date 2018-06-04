package com.example.singleton;

/**
 * @author amzing
 * 饿汉模式
 */
public class HungerSingleton {
    private HungerSingleton(){}
    private final static HungerSingleton singleton = new HungerSingleton();
    public static HungerSingleton getSingleton(){
        return singleton;
    }

    /** 单例做其他事情 **/
    public void doSomething(){

    }
}
