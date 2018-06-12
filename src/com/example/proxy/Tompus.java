package com.example.proxy;

/**
 * @author Akmzing
 * 汤普森
 */
public class Tompus implements Basketballer{

    /** 汤神投两分 **/
    @Override
    public void twoPoint() {
        System.out.println("汤神投两分");
    }

    /** 汤神投三分 **/
    @Override
    public void threePoint() {
        System.out.println("汤神投三分！！！");
    }
}
