package com.fengtaisec.object.quickstart;

import com.fengtaisec.object.quickstart.Student;

public class Test2 {
    public static void main(String[] args) {
        // 掌握类与对象的注意事项
        // 驼峰模式 如 Student Car
        Student s = new Student(); // 引用类型的变量
        System.out.println(s.name);
        System.out.println(s.chinese);
        System.out.println(s.math);

        Student s1 = new Student();
        s1.name = "张三";

//        Student s2 = new Student();
//        s2.name = "李四";
        // 把s1变量中存储的学生对象的地址赋值给的S2变量
        Student s2 = s1;
        s2.name = "李四";

        System.out.println(s1.name);
    }
}
