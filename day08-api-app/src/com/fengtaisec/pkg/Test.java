package com.fengtaisec.pkg;

import com.fengtaisec.itcast.Demo1;
import com.fengtaisec.itcast.Demo2;

import java.util.Random;
import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        // 同一个包下的程序，可以直接访问
        Demo d = new Demo();
        d.print();
        // 访问其他包下的程序，必须导包才可以访问
        Demo1 d2 = new Demo1();
        d2.print();
        // 自己的程序中调用Java提供的程序，也需要导包才可以使用
        Scanner sc = new Scanner(System.in);
        // Java.lang包下的程序是不需要导包的，可以直接使用。
        String s = "测试";
        Random r = new Random();
        // 访问多个其他包，这些程序名又一样的情况下，默认只能导入一个程序，另一个程序必须带包名和类名来访问。
        Demo2 d3 = new Demo2();
        d3.print();
        com.fengtaisec.itcast2.Demo2 d4 = new com.fengtaisec.itcast2.Demo2(); // 带全包名
        d4.print();
    }
}
