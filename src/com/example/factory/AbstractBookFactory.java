package com.example.factory;

/**
 * @author amizng
 */
public abstract class AbstractBookFactory {
    /** 生产书籍 **/
    public abstract Book createBook(Class c);
}
