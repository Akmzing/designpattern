package com.example.proxy.staticproxy;

import com.example.proxy.LuRenJia;
import com.example.proxy.Tompus;

/**
 * @author Akmzing
 * 静态代理 比赛开始
 */
public class StaticGame {
    public static void main(String[] args){
        LuRenJia luRenJia = new LuRenJia();

        /** 使用库里技能 **/
        luRenJia.twoPoint();
        luRenJia.threePoint();

        /** 使用汤神技能 **/
        luRenJia = new LuRenJia(new Tompus());
        luRenJia.twoPoint();
        luRenJia.threePoint();
    }
}
