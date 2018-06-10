package com.example.observer;

import java.util.Observable;
import java.util.Observer;

/**
 * @author amzing
 * 懒汉在睡觉，监听闹钟
 */
public class LanHan implements Observer{
    @Override
    public void update(Observable o, Object arg) {
        if(o instanceof Alarm){
            System.out.println("对于这个闹钟的想法 ：" + arg.toString());
        }else{
            System.out.println("完全忽视其他影响 ："+arg.toString());
        }
    }
}
