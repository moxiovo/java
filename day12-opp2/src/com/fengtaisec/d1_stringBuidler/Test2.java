package com.fengtaisec.d1_stringBuidler;

public class Test2 {
    public static void main(String[] args) {
        // 掌握StringBuilder的好处
        // 拼接100万次abc
        // 用String
//        String rs = "";
//        for (int i = 0; i < 1000000; i++) {
//            rs = rs + "abc";
//        }
//        System.out.println(rs);

        // 使用StringBuilder 效率更高
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < 1000000; i++) {
            sb.append("abc");
        }
        System.out.println(sb);
    }
}
