package com.example.observer;

import java.util.Observable;

/**
 * @author amzing
 * 公鸡
 */
public class Cock extends Observable {
    public void sixClock(){
        System.out.println("6:00 到了");
        this.setChanged();
        this.notifyObservers("起床啦，管公鸡干嘛，继续睡觉");
    }
}
