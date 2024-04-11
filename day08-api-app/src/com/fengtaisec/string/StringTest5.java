package com.fengtaisec.string;

import java.util.Random;

public class StringTest5 {
    public static void main(String[] args) {
        System.out.println(createCode(4));
        System.out.println(createCode(4));
        System.out.println(createCode(4));
        System.out.println(createCode(4));
        System.out.println(createCode(4));
        System.out.println(createCode(6));
    }

    public static String createCode(int n){
        String code = ""; // 最后产生的验证码
        String data = "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789"; // 可能用到的全部字符
        Random r = new Random();
        // 开始定义一个循环产生每位随机字符
        for (int i = 0; i < n; i++) {
            // 随机一个字符范围内的索引
            int index = r.nextInt(data.length());
            // 根据索引去全部字符中提取改字符
            code += data.charAt(index);
        }
        // 返回code
        return code;
    }

}
