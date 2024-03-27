package com.fengtaisec.variable;

public class TypeConversionDemo2 {
    public static void main(String[] args) {
        // 掌握表达式的自动转换机制 在表达式中byte short char 转换为int类型
        byte a = 10;
        int b = 20;
        long c = 30;
        long rs = a + b + c;
        System.out.println(rs);

        double rs2 = a + b + 1.0;
        System.out.println(rs2);

        byte i = 10;
        short j = 30;
        int rs3 = i + j; // 在表达式中byte short char 转换为int类型
        System.out.println(rs3);

        // 面试笔试题
        byte b1 = 110;
        byte b2 = 80;
        int b3 = b1 + b2;
        System.out.println(b3);
    }
}
