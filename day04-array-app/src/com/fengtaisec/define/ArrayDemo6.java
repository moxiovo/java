package com.fengtaisec.define;

public class ArrayDemo6 {
    public static void main(String[] args) {
        // 掌握普通变量、数组在计算机的执行原理，jaba程序在计算机中的执行过程。
        int a = 20;
        System.out.println(a);

        int[] arr = new int[]{11, 22, 33};
        System.out.println(arr);

        System.out.println(arr[1]);

        arr[0] = 44;
        arr[1] = 55;
        arr[2] = 66;

        System.out.println(arr[0]);
        System.out.println(arr[1]);
        System.out.println(arr[2]);
        // 基本类型变量 存储的为值 数组类型 为地址值

    }
}
