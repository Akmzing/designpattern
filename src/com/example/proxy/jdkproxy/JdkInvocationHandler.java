package com.example.proxy.jdkproxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

/**
 * @author amzing
 * jdk动态代理
 */
public class JdkInvocationHandler implements InvocationHandler{
    public Object basketballer;
    public JdkInvocationHandler(Object basketballer){
        this.basketballer = basketballer;
    }
    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        /** 可以在该方法前后实现其他功能 **/
        Object val = method.invoke(basketballer,args);
        return val;
    }
}
