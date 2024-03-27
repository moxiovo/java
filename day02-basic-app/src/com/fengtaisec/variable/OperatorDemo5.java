package com.fengtaisec.variable;

public class OperatorDemo5 {
    public static void main(String[] args) {
        // 掌握逻辑运算符的使用
        // 要求手机必须满足>=6.95，且运行内存>=8GB
        double size = 6.8;
        int storage = 16;
        // & 前后的条件的结果都是true，结果才为true
        boolean rs = size >= 6.95 & storage >= 8;
        System.out.println(rs);

        // 要求手机要么>=6.95，且运行内存要么>=8GB
        boolean rs2 = size >= 6.95 | storage >= 8;
        System.out.println(rs2);
        // | 只要多个条件中有一个是true，那么结果就为true

        // ! 取反的意思
        System.out.println(!true);
        System.out.println(!false);
        System.out.println(!(2 > 1));

        // ^ 前后条件的结果相同时false 不同时true
        System.out.println(true ^ true); // false
        System.out.println(false ^ false);// false
        System.out.println(true ^ false);// true
        System.out.println(false ^ true);// true
        // && ||,左边为false 右边不执行
        int i = 10;
        int j = 20;
        System.out.println(i > 100 && ++j > 99);// 左边为false 右边不执行
        System.out.println(j);
        System.out.println(i > 100 & ++j > 99);// 左边为false 右边不执行
        System.out.println(j);

        int m = 10;
        int n = 30;
//        System.out.println(m > 3 || ++n > 40);
        System.out.println(m > 3 | ++n > 40);
        System.out.println(n);
        // 逻辑运算符
        /*& 有一个为false、结果是false
        && 不执行*/

    }
}
