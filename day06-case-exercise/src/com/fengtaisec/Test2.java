package com.fengtaisec;

import java.util.Random;

public class Test2 {
    public static void main(String[] args) {
        // 完成生成随机验证码
        System.out.println(createCode(4));


    }
    public static String createCode(int n){
        Random r = new Random();
        // 定义一个String类型变量用于记住产生的每位随机字符
        String code = "";
        // 定义一个for循环用于控制产生多少随机字符
        for (int i = 1; i <= n; i++) {
            // i = 1 2 3 4 5
            // 2、为每一个位置生成一个特殊字符，可能是数字、大小写字符
            // 随机一个0 1 2之间的数字 0代表一个数组字符 12代表随机大写字母小写字母
            int type = r.nextInt(3);
            switch (type){
                case 0:
                    // 数字字符
                    code += r.nextInt(10); // 0 - 9 code = code + 8
                    break;
                case 1:
                    // 大写字符 A 65 Z 65+25
                    char ch1 = (char) (r.nextInt(26) + 65);
                    code += ch1;
                    break;
                case 2:
                    // 小写字符
                    char ch2 = (char) (r.nextInt(26) + 97);
                    code += ch2;
                    break;
            }
        }
        return code;
    }
}
