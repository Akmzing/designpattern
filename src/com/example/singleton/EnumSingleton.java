package com.example.singleton;

/**
 * @author amzing
 * 枚举模式
 * 枚举类型最终编译为类
 * 外部调用单例的例子:eg:
 * EnumSingleton singleton = EnumSingleton.SINGLETON;
 * singleton.doSomething();
 */
public enum EnumSingleton {
    SINGLETON;

    /** 单例做其他事情 **/
    public void doSomething(){

    }
}
