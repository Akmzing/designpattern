package com.example.observer;

import java.util.Observable;

/**
 * @author amzing
 * 闹钟
 */
public class Alarm extends Observable{
    public void sevenClock(){
        System.out.println("7:00 到了");
        this.setChanged();
        this.notifyObservers("起床啦，再懒以下");
    }

    public void eightClock(){
        System.out.println("8:00 到了");
        this.setChanged();
        this.notifyObservers("起床啦，要不迟到了");
    }
}
