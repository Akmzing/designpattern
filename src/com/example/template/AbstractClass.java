package com.example.template;

/**
 * @author amzing
 * 抽象模版类
 */
public abstract class AbstractClass {
    /** 基本方法 **/
    protected abstract void doSomething();
    /** 基本方法 **/
    protected abstract void doAnything();
    /**
     * 模版方法
     * 为了防止修改，可以设置为 final
     */
    public void templateMethod(){
        /**
         * 调用基本方法实现逻辑
         */
        doSomething();
        doAnything();
    }
}
