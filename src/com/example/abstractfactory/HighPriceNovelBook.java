package com.example.abstractfactory;

/**
 * @author Akmzing
 * 高价书
 */
public class HighPriceNovelBook extends AbstractNovelBook {
    @Override
    public void getPrice() {
        System.out.println("小说书价 100 元");
    }
}
