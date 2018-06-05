package com.example.abstractfactory;

public class LowPriceFactory extends AbstractBookFactory {

    @Override
    public Book createComputerBook() {
        return new LowPriceComputerBook();
    }

    @Override
    public Book createNovelBook() {
        return new LowPriceNovelBook();
    }
}
