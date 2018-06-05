package com.example.factory;

public class BookFactory extends AbstractBookFactory {
    @Override
    public Book createBook(Class c) {
        Book book = null;
        try {
            book = (Book) c.newInstance();
        }catch (Exception e){
            System.out.println("创建失败");
        }
        return book;
    }
}
