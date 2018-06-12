package com.example.adapter;

/**
 * @author Akmzing
 * 开启http请求
 */
public class DoHttpRequest {
    public static void main(String[] args){
        /** 原生http请求 **/
        HttpI http = new HttpImpl();
        /** 原生http只有post请求 **/
        http.doRequest();
        /** http适配器，适配了get请求 **/
        http = new HttpGetAdapter();
        /** http适配器的get请求 **/
        http.doRequest();
    }
}
