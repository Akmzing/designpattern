package com.example.template;

/**
 * @author Akmzing
 * 具体模版类
 */
public class ImplClass2 extends AbstractClass{
    @Override
    protected void doSomething() {
        System.out.println("doSomething2");
    }

    @Override
    protected void doAnything() {
        System.out.println("doAnything2");
    }
}
