package com.fengtaisec.d4_abstract;
// 抽象类
public abstract class A {
    private String name;
    public static String schoolName;

    public A(){

    }
    // 抽象类不能创建对象
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    // 抽象方法 必须用abstract修饰 只有方法签名一定不能有方法体
    public abstract void run();

    public A(String name) {
        this.name = name;
    }
}
