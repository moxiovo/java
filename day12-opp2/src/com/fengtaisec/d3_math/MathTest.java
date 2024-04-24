package com.fengtaisec.d3_math;

public class MathTest {
    public static void main(String[] args) {
        // 了解math类提供的常见方法
        // abs
        System.out.println(Math.abs(-12)); // abs方法 取绝对值
        System.out.println(Math.abs(123));
        System.out.println(Math.abs(-3.14));
        // ceil 向上取整
        System.out.println(Math.ceil(4.00001)); // 向上取整 5.0
        System.out.println(Math.ceil(4.0)); // 向上取整 4.0
        // floor 向下取整
        System.out.println(Math.floor(4.999)); // 向下取整 4.0
        System.out.println(Math.floor(4.0)); // 向下取整 4.0
        // round 四舍五入
        System.out.println(Math.round(3.4999)); // 3
        System.out.println(Math.round(3.50001)); // 4
        // max 取较大
        System.out.println(Math.max(10, 20));
        System.out.println(Math.min(10, 20));
        // pow 取次方
        System.out.println(Math.pow(2, 3)); // 2的3次方 8.0
        System.out.println(Math.pow(3, 2)); // 3的2次方 9.0
        // random 取随机数
        System.out.println(Math.random()); // [0.0 , 1.0) 左开右闭
    }
}
