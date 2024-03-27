package com.fengtaisec.variable;

public class VariableDemo2 {
    public static void main(String[] args) {
        // 掌握基本数据类型的使用
        // 1、byte short int long
        byte a = 127; // -128-127 字节型
        short s = 13244;
        //short s1 = 92334; // 短整型
        // 如果希望随便写一个整形字面量默认是long类型的，需要在后面加上L / l
        long lg = 45645645645646546L;
        // 2、float double
        // 随便写小数字面量，默认是doubule，如果需要时加F/ f
        char ch = 'a';
        char ch3 = '中';
        boolean flag = true;
        boolean flag2 = false;
        // String 称之为字符串类型，定义的变量可以用于记住一个字符串数据。
        String name = "张三";
        System.out.println(name);
    }
}
