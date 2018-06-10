package com.example.observer;

public class Timer {
    public static void main(String[] args){
        /** 懒汉观察时间提醒 **/
        LanHan lanHan = new LanHan();
        /** 闹钟 **/
        Alarm alarm = new Alarm();
        /** 公鸡 **/
        Cock cock = new Cock();
        /** 懒汉观察闹钟提醒 **/
        alarm.addObserver(lanHan);
        /** 懒汉观察公鸡提醒 **/
        cock.addObserver(lanHan);

        /** 公鸡叫了，忽视 **/
        cock.sixClock();
        /** 7点到了，懒一下 **/
        alarm.sevenClock();
        /** 8点到了，赶紧起床 **/
        alarm.eightClock();
    }
}
