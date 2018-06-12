package com.example.abstractfactory;

/**
 * @author Akmzing
 * 抽象工厂接口
 */
public abstract class AbstractCreator {
    public abstract AbstractComputerBook createComputer();
    public abstract AbstractNovelBook createNovel();
}
