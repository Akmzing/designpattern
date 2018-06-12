package com.example.decorator;

/**
 * @author Akmzing
 * java jvm技能
 */
public class JvmJavaSkill extends Decorator {
    public JvmJavaSkill(JavaSkill js) {
        super(js);
    }

    public void jvmSkill(){
        System.out.println("我会java jvm知识");
    }

    @Override
    public void mySkill(){
        jvmSkill();
        super.mySkill();
    }
}
