package com.example.abstractfactory;

/**
 * @author Akmzing
 * 书店
 */
public class BookShop {
    public static void main(String[] args){
        /** 高价书工厂 **/
        AbstractBookFactory highPriceBookFactory = new HighPriceFactory();

        /** 低价书工厂 **/
        AbstractBookFactory lowPriceBookFactory = new LowPriceFactory();

        /** 高价计算机书 **/
        Book highPriceComputerBook = highPriceBookFactory.createComputerBook();

        /** 低价计算机书 **/
        Book lowPriceComputerBook = lowPriceBookFactory.createComputerBook();

        /** 高价书名 **/
        highPriceComputerBook.getBookName();

        /** 高价书价格 **/
        highPriceComputerBook.getPrice();

        /** 低价书名 **/
        lowPriceComputerBook.getBookName();

        /** 低价价格 **/
        lowPriceComputerBook.getPrice();
    }
}
