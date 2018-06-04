package com.example.singleton;

/**
 * @author amzing
 * 内部类模式
 */
public class InnerSingleton {
    /**
     * JVM只允许一个类初始化
     * 静态内部类在调用时才初始化
     */
    private static class Singleton{
        private static final InnerSingleton SINGLETON = new InnerSingleton();
    }
    private InnerSingleton(){}
    public static final InnerSingleton getSingleton(){
        return Singleton.SINGLETON;
    }

    /** 单例做其他事情 **/
    public void doSomething(){

    }
}
