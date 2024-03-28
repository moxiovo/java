package com.fengtaisec.define;

public class ArrayDemo5 {
    public static void main(String[] args) {
        // 先定义，后赋值
        // 定义不存入值，定义长度和类型
        // 元素默认值规则 byte short int char long
        // float double 0.0
        // boolean false string null
        // 动态初始化一开始不确定具体的元素值，只知道元素个数的业务场景
        // 静态初始化 一开始就知道要存入哪些元素值的业务场景
        // for是知道有多少循环，while是不知道有多少个循环
        // 掌握定义数组的方式，动态初始化数组。
        // 数据类型[] 数组名 = new 数据类型[长度]
        int[] ages = new int[3]; // ages = [0, 0, 0]

        ages[0] = 10;
        ages[1] = 11;
        ages[2] = 12;

        System.out.println(ages[0]);
        System.out.println(ages[1]);
        System.out.println(ages[2]);

//        int[] arr = new int[3];{12, 24, 36}; 错误写法，不要使用。

        System.out.println("-------------------------------");

        char[] chars = new char[3]; // {0, 0, 0}
        System.out.println(chars[0] + 1); // 验证为 0
        System.out.println((int)chars[2]);

        double[] doubles = new double[80]; // 0.0
        System.out.println(doubles[0]);
        System.out.println(doubles[79]);

        boolean[] flags = new boolean[100]; // false
        System.out.println(flags[0]);
        System.out.println(flags[99]);

        String[] names = new String[10]; // null
        System.out.println(names[0]);
        System.out.println(names[9]);
    }
}
