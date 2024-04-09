package com.fengtaisec.string;

public class StirngDemo3 {
    public static void main(String[] args) {
        String name = "黑马";
        name += "程序员"; // name = name + "程序员"
        name += "播妞";
        System.out.println(name);

        // 只要以双引号给出的字符串对象，存储在常量池中，而且内容相同时只会存储一份
        String s1 = "abc";
        String s2 = "abc";
        System.out.println(s1 == s2);

        // new String创建字符串对象，每次new出来的都是一个新对象，放在堆内存中
        char[] chars = {'a', 'b', 'c'};
        String a1 = new String(chars);
        String a2 = new String(chars);
        System.out.println(a1 == a2);

    }
}
