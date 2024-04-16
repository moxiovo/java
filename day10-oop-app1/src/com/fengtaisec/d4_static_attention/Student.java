package com.fengtaisec.d4_static_attention;

public class Student {
    static String schoolName; // 类变量
    double score;

    public static void printHelloWorld(){
        // 同一个类中，访问类成员，可以省略不写。
        schoolName = "黑马";
        printHelloWorld2();

        /* System.out.println(score); // 不能在类方法中访问实例变量
        printPass(); */

        /* System.out.println(this); // 类方法不能出现this关键字*/
    }

    public static void printHelloWorld2(){

    }

    public void printPass(){
        // 实例方法可以直接访问类成员也可访问实例成员
        schoolName = "test";
        printHelloWorld2();

        System.out.println(score);
        printPass2();
        System.out.println(this);
    }

    public void printPass2(){
        printPass();
    }
}
