package com.fengtaisec.d1_polymorphism;

public class Test {
    public static void main(String[] args) {
        // 对象多态和行为多态
        People p1 = new Teacher();
        p1.run(); // 识别技巧 编译看左边 运行看右边 存在方法重写
        System.out.println(p1.name); // 对于变量 编译看左边 运行看左边
        // 在多态形式下，右边对象是解耦合的，更便于扩展和维护

        People p2 = new Student();
        p2.run(); // 识别技巧 编译看左边 运行看右边
        System.out.println(p2.name);
    }
}
