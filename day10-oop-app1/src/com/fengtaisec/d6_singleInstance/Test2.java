package com.fengtaisec.d6_singleInstance;

public class Test2 {
    public static void main(String[] args) {
        B b1 = B.getInstance(); // 第一次拿对象
        B b2 = B.getInstance(); // 第一次拿对象
        System.out.println(b1 == b2);
    }
}
