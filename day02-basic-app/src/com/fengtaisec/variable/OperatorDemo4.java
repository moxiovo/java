package com.fengtaisec.variable;

public class OperatorDemo4 {
    public static void main(String[] args) {
        // 掌握关系运算符的基本使用
        int a = 10;
        int b = 5;
        boolean rs = a > b;
        System.out.println(rs);
        System.out.println(a >= b); // 要么a大于b，要么a等于b
        System.out.println(2 >= 2);
        System.out.println(a < b);
        System.out.println(a <= b); //false
        System.out.println(2 <= 2); //true
        System.out.println(a == b); //false
        System.out.println(5 == 5);
        // System.out.println(a = b); // b 赋值给 a，注意判断是否相等要用==号
        System.out.println(a != b);
        System.out.println(10 != 10);

    }
}
