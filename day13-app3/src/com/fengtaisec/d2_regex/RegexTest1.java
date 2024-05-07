package com.fengtaisec.d2_regex;

public class RegexTest1 {
    public static void main(String[] args) {
        System.out.println(checkQQ("18686727286"));
        System.out.println(checkQQ("186a6727286"));
        System.out.println(checkQQ(null));
        System.out.println("---------------------------------");

        System.out.println(checkQQ1("18686727286"));
        System.out.println(checkQQ1("186a6727286"));
        System.out.println(checkQQ1(null));

    }

    public static boolean checkQQ1(String qq){
        return qq != null && qq.matches("[1-9]\\d{5,19}"); // 匹配正则表达式
    }

    public static boolean checkQQ(String qq){
        // 1、判断qq号码是否为null
        if (qq == null || qq.startsWith("0") || qq.length() < 6 || qq.length() > 20){
            return false;
        }

        // qq号码至少不是null 不是0开头 6-20之间的长度
        // 判断qq号码中是否都是数字
        for (int i = 0; i < qq.length(); i++) {
            char ch = qq.charAt(i);
            // 判断ch记住的字符如果不是数字就不合法
            if (ch < '0' || ch > '9'){
                return false;
            }
        }

        // 说明qq号肯定是合法的
        return true;
    }
}
