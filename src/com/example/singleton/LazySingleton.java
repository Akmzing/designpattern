package com.example.singleton;

/**
 * @author Akmzing
 * 懒汉模式
 */
public class LazySingleton {
    /** 防止指令重排序 **/
    private volatile static LazySingleton SINGLETON = null;
    public static LazySingleton getSingleton(){
        /** 双重检查 **/
        if(SINGLETON==null){
            synchronized (LazySingleton.class){
                return new LazySingleton();
            }
        }
        return SINGLETON;
    }

    /** 单例做其他事情 **/
    public void doSomething(){
    }
}
