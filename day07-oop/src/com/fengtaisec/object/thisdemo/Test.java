package com.fengtaisec.object.thisdemo;

public class Test {
    public static void main(String[] args) {
        // 认识this，掌握this的应用场景
        Student s1 = new Student();
        System.out.println(s1);
        s1.printThis();

        System.out.println("-----------------------------");

        Student s2 = new Student();
        System.out.println(s2);
        s2.printThis();

        Student s3 = new Student();
        s3.score = 325;
        s3.printPass(250);
        // this 就是一个变量，用在方法中，用来拿到那个对象
        // this 用来解决对象的成员变量与方法内部变量的名称一样，导致访问冲突的问题。
    }
}
