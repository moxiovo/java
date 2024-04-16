package com.fengtaisec.d2_static_method;

public class Test {
    public static void main(String[] args) {
        // 1、类方法的用法
        // 类名.类方法
        Student.printHelloWorld();

        // 对象.类方法 (不推荐此方法)
        Student s = new Student();
        s.printHelloWorld();

        // 2、实例方法的用法
        s.score = 70;
//        Student.printPass(); 报错
        s.printPass();
    }
}
