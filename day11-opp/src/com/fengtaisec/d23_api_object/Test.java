package com.fengtaisec.d23_api_object;

public class Test {
    public static void main(String[] args) {
        Student s1 = new Student("赵敏", 23);
        // System.out.println(s1.toString());
        // 重写返回对象的内容
        System.out.println(s1);

        // equals 方法，默认判断地址是否相等
        Student s2 = new Student("赵敏", 23);
        System.out.println(s2.equals(s1));
    }
}

