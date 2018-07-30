package com.example.prototype;

import java.util.ArrayList;

/**
 * prototype class, it should be implements Cloneable, and override clone()
 * @author Akmzing
 */
public class PrototypeClass implements Cloneable {
    private ArrayList<Integer> list = new ArrayList<>();

    public PrototypeClass(){
        System.out.println("can not use when clone");
    }

    public ArrayList<Integer> getList() {
        return this.list;
    }

    @Override
    public PrototypeClass clone() {
        PrototypeClass prototypeClass = null;
        try {
            prototypeClass = (PrototypeClass) super.clone();

            /**
             * deep copy, otherwise, shallow copy
             */
            prototypeClass.list = (ArrayList<Integer>) this.list.clone();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return prototypeClass;
    }

}
