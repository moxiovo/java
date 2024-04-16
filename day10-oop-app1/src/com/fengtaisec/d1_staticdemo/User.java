package com.fengtaisec.d1_staticdemo;

public class User {
    // 类变量,对外完全公开和暴露
    public static int number;

    public User() {
        // 在同一个类中访问自己类的类变量，才可以省略不写
        User.number++;
    }
}
