package com.example.proxy.cglibproxy;

import net.sf.cglib.proxy.Enhancer;
import net.sf.cglib.proxy.MethodInterceptor;
import net.sf.cglib.proxy.MethodProxy;

import java.lang.reflect.Method;

/**
 * @author amzing
 * cglib动态代理
 * 需要cglib.jar包
 */
public class CglibMethodInterceptor implements MethodInterceptor {
    private Enhancer enhancer = new Enhancer();

    public Object getProxy(Class c){
        enhancer.setSuperclass(c);
        enhancer.setCallback(this);
        /**
         * 利用代理类继承被代理类(eg:Curry)
         * 1.生成代理类字节码
         * 2.加载代理类Class
         * 3.通过反射创建代理类
         */
        return enhancer.create();
    }

    @Override
    public Object intercept(Object o, Method method, Object[] objects, MethodProxy methodProxy) throws Throwable {
        return methodProxy.invokeSuper(o,objects);
    }
}
