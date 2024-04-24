package com.fengtaisec.d24_api_objects;

import java.util.Objects;

public class Test {
    public static void main(String[] args) {
        // 掌握Objects类提供的常用方法
        String s1 = null;
        String s2 = "itheima";

        // System.out.println(s1.equals(s2));

        // 比较两个对象是否相等
        System.out.println(Objects.equals(s1, s2)); // 更安全更好的

        System.out.println(Objects.isNull(s1));
        System.out.println(s1 == null);
        System.out.println(Objects.isNull(s2));
        System.out.println(s2 == null);

        System.out.println(Objects.nonNull(s2));
        System.out.println(s1 != null);
    }
}
