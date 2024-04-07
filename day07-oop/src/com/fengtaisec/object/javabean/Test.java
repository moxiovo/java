package com.fengtaisec.object.javabean;

public class Test {
    public static void main(String[] args) {
        // 在 main 方法中实例化 Student 对象，并设置其属性值
        Student s1 = new Student();
        s1.setName("播妞");
        s1.setScore(99);
        System.out.println(s1.getName());
        System.out.println(s1.getScore());

        StudentOperator operator = new StudentOperator(s1);
        operator.printPass();
    }
}
