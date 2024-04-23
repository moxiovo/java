package com.fengtaisec.d13_inner_class2;

public class Test {
    public static void main(String[] args) {
        // 了解静态内部类
        Outer.Inner in = new Outer.Inner();
        in.setName("test");
        in.test();


    }
}
