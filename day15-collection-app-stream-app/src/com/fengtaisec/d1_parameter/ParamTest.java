package com.fengtaisec.d1_parameter;

import java.util.Arrays;

// 可变参数
public class ParamTest {
    public static void main(String[] args) {
        // 特点
        test(); // 不传数据
        test(10); // 传输一个数据给它
        test(10, 20, 30); // 传输多个数据给它
        test(new int[]{10, 20, 30, 40}); // 传输一个数组给可变参数
    }
    // 一个形参列表中只能有一个可变参数
    public static void test(int...nums){
        // 可变参数在方法内部，本质就是一个数组
        // 可变参数必须放在形参列表的最后面
        System.out.println(nums.length);
        System.out.println(Arrays.toString(nums));
        System.out.println("-----------------------------------");
    }
}
