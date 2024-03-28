package com.fengtaisec.loop;

public class WhileDemo3 {
    public static void main(String[] args) {
        // 为什么有for 还用while循环书写格式，理解执行流程
        // 迭代语句 is required for和while都能解决，反之亦然
        // 规范：知道循环几次用for，不知道循环几次，建议使用：while
        int i = 0;
        while (i < 5){
            System.out.println("Hello");
            i++; // 死循环
        }

    }
}
