package com.example.adapter;

/**
 * @author Akmzing
 * http请求适配器，适配 get、post
 */
public class HttpGetAdapter extends GetRequest implements HttpI {
    @Override
    public void doRequest() {
        super.doGet();
    }
}
