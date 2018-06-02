package com.example.proxy;

/**
 * @author amzing
 * 库里
 */
public class Curry implements Basketballer{

    /** 库里投两分 **/
    @Override
    public void twoPoint() {
        System.out.println("库里大神投两分");
    }

    /** 库里投三分 **/
    @Override
    public void threePoint() {
        System.out.println("库里大神投三分！！！");
    }
}
