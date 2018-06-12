package com.example.decorator;

/**
 * @author Akmzing
 * java spring技能
 */
public class SpringJavaSkill extends Decorator{

    public SpringJavaSkill(JavaSkill js) {
        super(js);
    }

    public void springSkill(){
        System.out.println("我会java spring知识");
    }

    @Override
    public void mySkill(){
        springSkill();
        super.mySkill();
    }
}
