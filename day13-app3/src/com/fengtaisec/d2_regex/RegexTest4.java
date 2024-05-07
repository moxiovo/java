package com.fengtaisec.d2_regex;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegexTest4 {
    public static void main(String[] args) {
        method1();
    }

    private static void method1() {
        String data = "来黑马程序员学习Java, \n" +
                "电话：13333333333，13333333334\n" +
                "或者联系邮箱：boniu@itcast.cn，\n" +
                "座机电话：01036517895，010-98951256\n" +
                "邮箱：bonzai@itcast.cn，\n" +
                "邮箱：dlei0009@163.com， \n" +
                "热线电话：400-618-9090，400-618-4000，4006184000，4006189090";
        // 定义爬取规则
        String regex = "(1[3-9]\\d{9})|(0\\d{2,7}-?[1-9]\\d{4,19})|(\\w{2,}@\\w{2,20}(\\.\\w{2,10}){1,2})"
                + "|(400-?\\d{3,7}-?\\d{3,7})";
        // 把正则表达式封装成一个Pattern对象
        Pattern pattern = Pattern.compile(regex);
        // 通过Pattern对象去获取查找
        Matcher matcher = pattern.matcher(data);
        // 定义一个循环开始爬取信息
        while (matcher.find()){
            String rs = matcher.group();
            System.out.println(rs);
        }
    }
}
