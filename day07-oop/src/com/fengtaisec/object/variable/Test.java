package com.fengtaisec.object.variable;

public class Test {
    public static void main(String[] args) {
        // 成员变量和局部变量的区别
        // 类中位置不同：成员变量（类中，方法外）、局部变量（常见于方法中）
        int a = 20;

        int b; // 局部变量没有默认值，使用前必须完成赋值
        b = 20;
        System.out.println(b);
        // 内存位置不同:成员变量（堆内存），局部变量（栈内存）

        String name = "测试";
        // 成员变量（与对象同生共死），局部变量（方法调用而生，方法结束而亡）

    }
}
