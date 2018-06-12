package com.example.proxy.cglibproxy;

import com.example.proxy.Curry;

/**
 * @author Akmzing
 * cglib代理 比赛开始
 */
public class CglibGame {
    public static void main(String[] args){
        CglibMethodInterceptor porxy = new CglibMethodInterceptor();
        Curry curry = (Curry)porxy.getProxy(Curry.class);
        curry.twoPoint();
        curry.threePoint();
    }
}