package com.fengtaisec.parameter;

public class MethodDemo1 {
    public static void main(String[] args) {
        int a = 10; // 实参
        change(a); // change(10); // 把a中的数据拷贝（副本）一份给change方法 形参a
        System.out.println(a); // 10
    }
    public static void change(int a){
        System.out.println(a); // 20
        a = 20;
        System.out.println(a); // 10
    }

}

