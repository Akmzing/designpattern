package com.example.abstractfactory;

public class HighPriceFactory extends AbstractBookFactory {

    @Override
    public Book createComputerBook() {
        return new HighPriceComputerBook();
    }

    @Override
    public Book createNovelBook() {
        return new HighPriceNovelBook();
    }
}
