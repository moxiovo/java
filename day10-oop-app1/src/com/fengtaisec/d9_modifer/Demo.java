package com.fengtaisec.d9_modifer;

public class Demo {
    public static void main(String[] args) {
        // 掌握不同权限修饰符的作用
        Fu f = new Fu();
        // f.privateMethod();
        f.publicMethod();
        f.protectedMethod();
        f.method();

    }
}
