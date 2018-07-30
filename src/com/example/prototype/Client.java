package com.example.prototype;

import java.util.List;

/**
 * test class
 * @author Akmzing
 */
public class Client {
    public static void main(String[] args) {
        PrototypeClass prototypeClass = new PrototypeClass();
        List<Integer> list = prototypeClass.getList();
        list.add(1);
        PrototypeClass clonePrototype = prototypeClass.clone();
        List<Integer> list1 = clonePrototype.getList();
        list1.add(2);
        System.out.println(list.size());
        System.out.println(list1.size());
    }
}
