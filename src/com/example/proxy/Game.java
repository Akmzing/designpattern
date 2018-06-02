package com.example.proxy;

/**
 * @author amzing
 * 比赛开始
 */
public class Game {
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
