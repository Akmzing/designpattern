package com.example.composite;

/**
 * @author Akmzing
 * 使用场景
 */
public class Main {
    public static void main(String[] args) {
        /** 根结点 **/
        Composite root = new Composite();
        root.doSomething();
        /** 树枝构件 **/
        Composite branch = new Composite();
        /** 叶子结点 **/
        Leaf leaf = new Leaf();

        root.add(branch);
        branch.add(leaf);
    }

    /** 遍历 **/
    public static void display(Composite root) {
        for (Component c: root.getChildren()) {
            if (c instanceof Leaf) {
                c.doSomething();
            }else {
                display((Composite) c);
            }
        }
    }
}
