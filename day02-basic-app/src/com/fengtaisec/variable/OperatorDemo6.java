package com.fengtaisec.variable;

public class OperatorDemo6 {
    public static void main(String[] args) {
        // 掌握三元运算符的基本使用
        double score = 58.5;
        String rs = score >= 60 ? "成绩及格" : "成绩不及格";
        System.out.println(rs);

        // 需求2:找出两个整数中的较大值，并输出
        int a = 99;
        int b = 99;
        int max = a > b ? a : b;
        System.out.println(max);

        int i = 10;
        int j = 45;
        int k = 34;

        int temp = i > j ? i : j;
        int temp2 = temp > k ? temp : k;
        System.out.println(temp2);
        // 条件表达式 ? 1 2
        System.out.println(10 > 3 || 10 > 3 && 10 < 3);// &&优先级高
        System.out.println((10 > 3 || 10 > 3) && 10 < 3);// false
    }
}
