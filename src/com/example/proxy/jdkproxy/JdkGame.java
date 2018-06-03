package com.example.proxy.jdkproxy;

import com.example.proxy.Basketballer;
import com.example.proxy.Curry;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Proxy;

/**
 * @author amzing
 * jdk动态代理 比赛开始
 */
public class JdkGame {
    public static void main(String[] args){
        Basketballer curry = new Curry();
        InvocationHandler handler = new JdkInvocationHandler(curry);
        /**
         * Curry要实现Basketballer接口，所以jdk动态代理只能代理实现接口的类
         * 利用反射构造代理类
         */
        Basketballer basketballer = (Basketballer) Proxy.newProxyInstance(Curry.class.getClassLoader(),Curry.class.getInterfaces(),handler);
        basketballer.twoPoint();
        basketballer.threePoint();
    }
}
