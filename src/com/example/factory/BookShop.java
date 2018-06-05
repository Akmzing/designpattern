package com.example.factory;

public class BookShop {
    public static void main(String[] args){
        /** 符合依赖倒置原则 **/
        AbstractBookFactory bookFactory = new BookFactory();
        /** 创建数据结构书本 **/
        Book book = bookFactory.createBook(DataStructure.class);
        book.getBookName();
    }
}
