package com.example.decorator;

public class MySkill {
    public static void main(String[] args){
        /** java基础知识 **/
        JavaSkill js = new FoundationJavaSkill();

        /** 我会基础 ＋ jvm **/
        Decorator decorator = new JvmJavaSkill(js);

        /** 我会基础 ＋ jvm ＋ spring **/
        decorator = new SpringJavaSkill(decorator);
        decorator.mySkill();
    }
}
