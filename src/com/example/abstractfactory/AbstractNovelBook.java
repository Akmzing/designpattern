package com.example.abstractfactory;

/**
 * @author Akmzing
 * 小说书籍分类
 */
public abstract class AbstractNovelBook implements Book {
    @Override
    public void getBookName() {
        System.out.println("小说书本");
    }
}
