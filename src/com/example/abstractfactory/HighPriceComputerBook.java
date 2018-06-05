package com.example.abstractfactory;
/**
 * @author amizng
 * 高价书
 */
public class HighPriceComputerBook extends AbstractComputerBook {

    @Override
    public void getPrice() {
        System.out.println("计算机书价 100 元");
    }
}
