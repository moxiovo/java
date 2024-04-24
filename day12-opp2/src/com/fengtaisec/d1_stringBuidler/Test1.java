package com.fengtaisec.d1_stringBuidler;

public class Test1 {
    public static void main(String[] args) {
        // 搞清楚StringBuilder的用法和使用
        // StringBuilder s = new StringBuilder(); // 无参数构造器
        StringBuffer s = new StringBuffer("itheima"); // 有参数构造器

        // 1、拼接内容
        s.append(12);
        s.append("黑马");
        s.append(true);

        // 支持链式编程
        s.append(666).append("黑马2").append(666);
        System.out.println(s);
        System.out.println("-------------------------------");
        s.reverse();
        System.out.println(s); // 将对象的内容进行反转操作

        // 返回字符串的长度
        s.length();

        // toString 方法 把StringBuilder对象又转换成String类型
        String rs = s.toString();
        System.out.println(rs);
    }
}
