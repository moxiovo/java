package com.fengtaisec.variable;

public class TypeConversionDemo3 {
    public static void main(String[] args) {
         // 掌握强制类型转换
        int a = 20;
        byte b = (byte) a; // 强制int转换为byte类型 alt + enter 00000000 00000000 00000000 00010100
        // 00010100
        System.out.println(a);
        System.out.println(b);

        int i = 1500;   // 00000000 0000000 00000101 11011100
        // 11011100 // 1代表第一位结果为负数
        byte j = (byte) i;
        System.out.println(j);

        double d = 99.5; // 8 => 4 浮点转换为整数部分，丢掉了小数部分
        int m = (int) d;
        System.out.println(m);
        // 强制数据转换可能出现数据丢失
        // 小数强制转换成证书是直接截断小数保留整数
    }
}
