package com.fengtaisec.object.constructor;

import com.fengtaisec.object.thisdemo.Teacher;

public class Test {
    public static void main(String[] args) {
        // 创建对象，对象去调用构造器
        Student s = new Student();
        Student s1 = new Student();
        s1.name = "播妞";
        s1.score = 100;

        Student s2 = new Student("小黑", 59);
        // 创建对象的同时对成员变量进行初始化赋值
        System.out.println(s2.name);
        System.out.println(s2.score);

        Teacher t = new Teacher();

    }
}
