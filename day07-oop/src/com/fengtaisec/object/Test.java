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

        System.out.println(s1);
        System.out.println(s2);

        s1 = null;
        s2 = null; // 一旦是null，就会发生空指针异常，堆内存中的对象，没有被任何变量引用，就会判断为内存中的垃圾
        // java存在自动垃圾回收机制，会自动清除掉垃圾对象。
        System.out.println(s1.name);
    }
}
