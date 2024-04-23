package com.fengtaisec.d16_emum;

public class Test {
    public static void main(String[] args) {
        // 认识枚举
        A a1 = A.X;
        System.out.println(a1);

        // 枚举类的构造器是私有的，不能创建对象

        // 枚举类的第一行都是常量，记住的都是枚举类的对象
        A a2 = A.Y;

        // 枚举类提供一个一些额外的API
        A[] as = A.values(); // 拿到全部对象
        A a3 = A.valueOf("Z");
        System.out.println(a3.name());
        System.out.println(a3.ordinal());

        System.out.println("--------------------");

        B y = B.Y;
        y.go();
    }
}
