package com.example.adapter;

/**
 * @author Akmzing
 * http请求实现 POST请求
 */
public class HttpImpl implements HttpI {
    @Override
    public void doRequest() {
        System.out.println("只有Post方法");
    }
}
