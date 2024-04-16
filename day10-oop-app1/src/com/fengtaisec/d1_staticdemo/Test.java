package com.fengtaisec.d1_staticdemo;

import com.fengtaisec.d1_staticdemo.Student;

public class Test {
    public static void main(String[] args) {
        // 掌握有无static修饰成员变量的用法
        // 类名.类变量（推荐）
        Student.name = "袁华";

        Student s1 = new Student();
        s1.name = "马冬梅"; // 对象访问. 不推荐

        Student s2 = new Student();
        s2.name = "秋雅";

        System.out.println(s1.name); // 秋雅
        System.out.println(Student.name);

        // 实例变量的用法，属于每个对象的变量
        // 对象.实例变量
        s1.age = 23;
        s2.age = 18;
        System.out.println(s1.age); // 23
        // 实例变量属于每个对象
        // System.out.println(Student.age); // 属于每个对象
        // 实例变量只能用对象去访问

    }
}
