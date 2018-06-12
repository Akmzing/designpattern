package com.example.abstractfactory;

/**
 * @author Akmzing
 * 低价书
 */
public class LowPriceNovelBook extends AbstractNovelBook {
    @Override
    public void getPrice() {
        System.out.println("小说书价 20 元");
    }
}
