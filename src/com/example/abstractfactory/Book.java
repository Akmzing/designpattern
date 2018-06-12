package com.example.abstractfactory;

/**
 * @author Akmzing
 * 抽象工厂模式
 */
public interface Book {
    /** 获取书籍名字 **/
    public void getBookName();
    /** 书本价格 **/
    public void getPrice();
}