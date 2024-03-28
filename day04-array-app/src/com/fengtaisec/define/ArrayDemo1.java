package com.fengtaisec.define;

public class ArrayDemo1 {
    public static void main(String[] args) {
        // 静态初始化数组
        // 数据类型[] 数组名 = new 数据类型[]{元素1, 元素2, 元素3......}
        int[] age = new int[]{18, 20, 21};
        double[] scores = new double[]{99.5, 59.5, 89.5, 88};
        System.out.println(age);
        System.out.println(scores); // [I@4eec7777 [数组 I int @指向内存地址

        // 简化写法 // 数据类型[] 数组名
        int[] age2 = {18, 20, 21};
        double[] scores2 = {99.5, 59.5, 89.5, 88};
        // 数据类型[] 数组名 也可写成 数据类型 数组名[]
        int age3[] = {18, 20, 21};
        double scores3[] = {99.5, 59.5, 89.5, 88};
        // 对象（数组对象） = 东西
        // 数组存储在内存中的地址，数组是一种引用数据类型。
        System.out.println(scores3[0]);
        System.out.println(scores3.length);
    }
}
