package com.fengtaisec.variable;

public class TypeConversionDemo1 {
    public static void main(String[] args) {
        byte a = 12;
        int b = a; // 发生了自动类型转换
        System.out.println(a);
        System.out.println(b);
        char c = 100; //4
        double d = c; //8 保留小数位100.0
        System.out.println(d);

        char ch = 'a'; // 'a' 97 => 00000000 01100001
        int i = ch; // 发生了自动类型转换 00000000 00000000  00000000 01100001
        System.out.println(i);
        // 为什么要进行类型转换
            //存在不同类型的变量赋值给其他类型变量
        // 什么是自动类型转换
            //小范围的变量，可以赋值给类型范围大的变量
    }
}
