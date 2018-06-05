package com.example.abstractfactory;

/**
 * @author amzing
 * 计算机书本分类
 */
public abstract class AbstractComputerBook implements Book {
    @Override
    public void getBookName() {
        System.out.println("计算机书本");
    }
}
