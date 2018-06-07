package com.example.decorator;

/**
 * @author amzing
 * 装饰类抽象类
 */
public abstract class Decorator extends JavaSkill {
    private JavaSkill js;
    public Decorator(JavaSkill js){
        this.js = js;
    }
    @Override
    public void mySkill(){
        this.js.mySkill();
    }
}
