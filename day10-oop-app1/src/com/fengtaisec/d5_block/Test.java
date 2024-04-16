package com.fengtaisec.d5_block;

import java.net.Socket;

public class Test {
    public static void main(String[] args) {
        // 认识两种代码块，了解他们的特点和基本作用
        System.out.println(Student.number);
        System.out.println(Student.number);
        System.out.println(Student.number);
        System.out.println(Student.schoolName);

        System.out.println("----------------------");

        Student s1 = new Student();
        Student s2 = new Student("张三");
        System.out.println(s1.age);
        System.out.println(s2.age);


    }
}
