package com.example.template;

/**
 * @author amzing
 * 具体模版类
 */
public class ImplClass1 extends AbstractClass {

    @Override
    protected void doSomething() {
        System.out.println("doSomething1");
    }

    @Override
    protected void doAnything() {
        System.out.println("doAnything1");
    }
}
