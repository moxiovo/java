package com.fengtaisec.object;

public class Test {
    public static void main(String[] args) {
        // 面向对象编程快速入门
        // 创建一个学生对象，封装数据
        Student s1 = new Student();
        s1.name = "播妞";
        s1.chinese = 100;
        s1.math = 100;
        s1.printTotalScore();
        s1.printAverageScore();

        Student s2 = new Student();
        s2.name = "播仔";
        s2.chinese = 59;
        s2.math = 100;
        s2.printTotalScore();
        s2.printAverageScore();
    }
}
