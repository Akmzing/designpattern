package com.example.abstractfactory;

/**
 * @author amizng
 * 低价书
 */
public class LowPriceComputerBook extends AbstractComputerBook {

    @Override
    public void getPrice() {
        System.out.println("计算机书价 20 元");
    }
}
