package com.example.strategy;

/**
 * @author Akmzing
 * 策略使用者
 */
public class StrategyUser {

    public static void main(String[] args){
        Context context;

        /** 操作策略1 **/
        context = new Context(new Strategy1());
        context.operate();
        System.out.println();

        /** 操作策略2 **/
        context = new Context(new Strategy2());
        context.operate();
        System.out.println();

        /** 操作策略3 **/
        context = new Context(new Strategy3());
        context.operate();
        System.out.println();
    }

}
