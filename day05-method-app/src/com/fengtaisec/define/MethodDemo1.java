package com.fengtaisec.define;

public class MethodDemo1 {
    public static void main(String[] args) {
        // 掌握定义方法的完整格式，搞清楚使用方法的好处。
        // 需求：很多程序员需要进行两个整数求和的操作。

        // li
        int sum2 = sum(2,3);
        System.out.println(sum2);

        // zhang
        int sum3 = sum(20,30);
        System.out.println(sum3);
    }
    // 方法的修饰符 返回值类型 方法名称 形参列表
    // 形参列表 不要给初始化值，方法的形参为接收数据
    // 使用方法的好处
    // 提高了代码的复用性，提高了开发效率，让程序的逻辑更加的清晰
    public static int sum(int a, int b){ // 形参
        int c = a + b;
        return c;
    }
}
